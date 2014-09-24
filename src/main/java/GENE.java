

/* First created by JCasGen Tue Sep 23 10:21:20 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 23 10:21:20 EDT 2014
 * XML source: /home/jessyli/workspace/hw1-jingwei2/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class GENE extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GENE.class);
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
  protected GENE() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GENE(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GENE(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GENE(JCas jcas, int begin, int end) {
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
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (GENE_Type.featOkTst && ((GENE_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "GENE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GENE_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (GENE_Type.featOkTst && ((GENE_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "GENE");
    jcasType.ll_cas.ll_setStringValue(addr, ((GENE_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets 
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (GENE_Type.featOkTst && ((GENE_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "GENE");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GENE_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (GENE_Type.featOkTst && ((GENE_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "GENE");
    jcasType.ll_cas.ll_setStringValue(addr, ((GENE_Type)jcasType).casFeatCode_text, v);}    
  }

    