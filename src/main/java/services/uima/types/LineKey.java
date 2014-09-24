

/* First created by JCasGen Tue Sep 23 05:56:28 EDT 2014 */
package services.uima.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 23 15:50:06 EDT 2014
 * XML source: /home/jessyli/workspace/hw1-jingwei2/src/main/resources/uimaConfigs/aeDescriptor.xml
 * @generated */
public class LineKey extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LineKey.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected LineKey() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LineKey(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LineKey(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LineKey(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: key

  /** getter for key - gets 
   * @generated
   * @return value of the feature 
   */
  public String getKey() {
    if (LineKey_Type.featOkTst && ((LineKey_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "services.uima.types.LineKey");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LineKey_Type)jcasType).casFeatCode_key);}
    
  /** setter for key - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    if (LineKey_Type.featOkTst && ((LineKey_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "services.uima.types.LineKey");
    jcasType.ll_cas.ll_setStringValue(addr, ((LineKey_Type)jcasType).casFeatCode_key, v);}    
  }

    