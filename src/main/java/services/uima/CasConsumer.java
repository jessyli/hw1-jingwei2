package services.uima;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceProcessException;
import org.xml.sax.SAXException;

import services.uima.annotator.GeneTag;
/**
 * write CAS to dsign the output format 
 * @author jessyli
 *
 */
public class CasConsumer extends CasConsumer_ImplBase {

  BufferedWriter writer = null;

  @Override
  public void initialize() {
    try {
      File f = new File("hw1-jingwei2.out");
      writer = new BufferedWriter(new FileWriter(f));
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
  public void destroy() {

    try {
      if (writer != null) {
        writer.close();
        writer = null;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  @Override
  public void processCas(CAS aCAS) throws ResourceProcessException {

    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new ResourceProcessException(e);
    }

    FSIterator<Annotation> it = jcas.getAnnotationIndex(GeneTag.type).iterator();
    String geneIdentifier = "";
    String geneName = "";
    int start = -1;
    int end = -1;
    while (it.hasNext()) {
      GeneTag annotation = (GeneTag) it.next();
      geneIdentifier = annotation.getIdentifier();
      geneName = annotation.getName();
      System.out.println("[casConsumer]" + geneName);
      start = annotation.getBegin();
      end = annotation.getEnd();

      // write to output file
      try {
        writeIntoFile(geneIdentifier, geneName, start, end);
      } catch (IOException e) {
        throw new ResourceProcessException(e);
      } catch (SAXException e) {
        throw new ResourceProcessException(e);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  public void writeIntoFile(String geneIdentifier, String geneName, int start, int end)
          throws Exception {
    writer.write(geneIdentifier + "|" + start + " " + end + "|" + geneName);
    writer.newLine();
    writer.flush();
  }

  
  }