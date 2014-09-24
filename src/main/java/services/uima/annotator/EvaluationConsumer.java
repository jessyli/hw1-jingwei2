package services.uima.annotator;

import org.apache.uima.cas.CAS;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;

public class EvaluationConsumer extends CasConsumer_ImplBase {

  @Override
  public void initialize() throws ResourceInitializationException {
    
    super.initialize();
  }
  
  @Override
  public void processCas(CAS aCAS) throws ResourceProcessException {
    
  }

}