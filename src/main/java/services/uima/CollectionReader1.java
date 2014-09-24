package services.uima;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import org.apache.uima.cas.CAS;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Progress;
/**
 * read input file line by line
 * @author jessyli
 *
 */
public class CollectionReader1 extends CollectionReader_ImplBase {

  public static final String PARAM_INPUT_FILE = "InputFile";

  BufferedReader reader = null;

  String line = null;

  @Override
  public void initialize() throws ResourceInitializationException {
    String filePath = ((String) getConfigParameterValue(PARAM_INPUT_FILE)).trim();
    URL resource = CollectionReader1.class.getResource(filePath);
    try {
      reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(
              resource.getFile())), "utf-8"));
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    super.initialize();
  }

  @Override
  public void getNext(CAS cas) throws IOException, CollectionException {
      cas.setDocumentText(line);
  }

  @Override
  public void close() throws IOException {
    reader.close();
  }

  @Override
  public Progress[] getProgress() {
    return null;
  }

  @Override
  public boolean hasNext() throws IOException, CollectionException {
    line = reader.readLine();
    return line != null;
  }

}
