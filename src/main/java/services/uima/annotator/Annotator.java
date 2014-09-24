package services.uima.annotator;

import java.util.Map;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

/**
 * annotate sentence and gene, using the PosTagNamedEntityRecognizer to look up gene in the
 * database.
 * 
 * @author jessyli
 *
 */
public class Annotator extends JCasAnnotator_ImplBase {
  PosTagNamedEntityRecognizer tagger = null;
  CSVToHashMap genes = null;
  
  
  @Override
  public void initialize(UimaContext aContext) throws ResourceInitializationException {
    genes = new CSVToHashMap();
    try {
      tagger = new PosTagNamedEntityRecognizer();
    } catch (ResourceInitializationException e) {
      e.printStackTrace();
    }
    // TODO Auto-generated method stub
    super.initialize(aContext);
  }
  
  @Override
  public void process(JCas aJcas) throws AnalysisEngineProcessException {
    String documentText = aJcas.getDocumentText();
    String[] split = documentText.split("\\s+", 2);
//    System.out.println(split[1]);

    Map<Integer, Integer> occurences = tagger.getGeneSpans(split[1]);
    int begin;
    int end;
    String gene;
    for (Map.Entry<Integer, Integer> entry : occurences.entrySet()) {
      begin = entry.getKey();
      end = entry.getValue();
      gene = split[1].substring(begin, end);

      if (genes.findGene(gene) == true) {
        System.out.println("~~~~~~found gene!!!~~~~");
        GeneTag ann = new GeneTag(aJcas);
        ann.setBegin(begin);
        ann.setEnd(end);
        ann.setIdentifier(split[0]);
        ann.setName(gene);
        ann.addToIndexes();
      }
    }
  }

}
