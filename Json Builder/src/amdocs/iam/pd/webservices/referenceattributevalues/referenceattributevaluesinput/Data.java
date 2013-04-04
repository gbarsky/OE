/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput;


/**
 * An XML Data(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput).
 *
 * This is a complex type.
 */
public interface Data extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("data3df6type");
    
    /**
     * Gets the "productCode" element
     */
    java.lang.String getProductCode();
    
    /**
     * Gets (as xml) the "productCode" element
     */
    org.apache.xmlbeans.XmlString xgetProductCode();
    
    /**
     * Sets the "productCode" element
     */
    void setProductCode(java.lang.String productCode);
    
    /**
     * Sets (as xml) the "productCode" element
     */
    void xsetProductCode(org.apache.xmlbeans.XmlString productCode);
    
    /**
     * Gets the "productVersion" element
     */
    java.lang.String getProductVersion();
    
    /**
     * Gets (as xml) the "productVersion" element
     */
    org.apache.xmlbeans.XmlString xgetProductVersion();
    
    /**
     * Sets the "productVersion" element
     */
    void setProductVersion(java.lang.String productVersion);
    
    /**
     * Sets (as xml) the "productVersion" element
     */
    void xsetProductVersion(org.apache.xmlbeans.XmlString productVersion);
    
    /**
     * Gets the "attributeCode" element
     */
    java.lang.String getAttributeCode();
    
    /**
     * Gets (as xml) the "attributeCode" element
     */
    org.apache.xmlbeans.XmlString xgetAttributeCode();
    
    /**
     * Sets the "attributeCode" element
     */
    void setAttributeCode(java.lang.String attributeCode);
    
    /**
     * Sets (as xml) the "attributeCode" element
     */
    void xsetAttributeCode(org.apache.xmlbeans.XmlString attributeCode);
    
    /**
     * Gets the "attributeValue" element
     */
    java.lang.String getAttributeValue();
    
    /**
     * Gets (as xml) the "attributeValue" element
     */
    org.apache.xmlbeans.XmlString xgetAttributeValue();
    
    /**
     * True if has "attributeValue" element
     */
    boolean isSetAttributeValue();
    
    /**
     * Sets the "attributeValue" element
     */
    void setAttributeValue(java.lang.String attributeValue);
    
    /**
     * Sets (as xml) the "attributeValue" element
     */
    void xsetAttributeValue(org.apache.xmlbeans.XmlString attributeValue);
    
    /**
     * Unsets the "attributeValue" element
     */
    void unsetAttributeValue();
    
    /**
     * Gets the "AttributeValues" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues getAttributeValues();
    
    /**
     * True if has "AttributeValues" element
     */
    boolean isSetAttributeValues();
    
    /**
     * Sets the "AttributeValues" element
     */
    void setAttributeValues(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues attributeValues);
    
    /**
     * Appends and returns a new empty "AttributeValues" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues addNewAttributeValues();
    
    /**
     * Unsets the "AttributeValues" element
     */
    void unsetAttributeValues();
    
    /**
     * Gets the "criteriaAttributes" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes getCriteriaAttributes();
    
    /**
     * True if has "criteriaAttributes" element
     */
    boolean isSetCriteriaAttributes();
    
    /**
     * Sets the "criteriaAttributes" element
     */
    void setCriteriaAttributes(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes criteriaAttributes);
    
    /**
     * Appends and returns a new empty "criteriaAttributes" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes addNewCriteriaAttributes();
    
    /**
     * Unsets the "criteriaAttributes" element
     */
    void unsetCriteriaAttributes();
    
    /**
     * Gets the "initialSearchString" element
     */
    java.lang.String getInitialSearchString();
    
    /**
     * Gets (as xml) the "initialSearchString" element
     */
    org.apache.xmlbeans.XmlString xgetInitialSearchString();
    
    /**
     * True if has "initialSearchString" element
     */
    boolean isSetInitialSearchString();
    
    /**
     * Sets the "initialSearchString" element
     */
    void setInitialSearchString(java.lang.String initialSearchString);
    
    /**
     * Sets (as xml) the "initialSearchString" element
     */
    void xsetInitialSearchString(org.apache.xmlbeans.XmlString initialSearchString);
    
    /**
     * Unsets the "initialSearchString" element
     */
    void unsetInitialSearchString();
    
    /**
     * Gets the "allResultsInd" element
     */
    java.lang.String getAllResultsInd();
    
    /**
     * Gets (as xml) the "allResultsInd" element
     */
    org.apache.xmlbeans.XmlString xgetAllResultsInd();
    
    /**
     * True if has "allResultsInd" element
     */
    boolean isSetAllResultsInd();
    
    /**
     * Sets the "allResultsInd" element
     */
    void setAllResultsInd(java.lang.String allResultsInd);
    
    /**
     * Sets (as xml) the "allResultsInd" element
     */
    void xsetAllResultsInd(org.apache.xmlbeans.XmlString allResultsInd);
    
    /**
     * Unsets the "allResultsInd" element
     */
    void unsetAllResultsInd();
    
    /**
     * Gets the "language" element
     */
    java.lang.String getLanguage();
    
    /**
     * Gets (as xml) the "language" element
     */
    org.apache.xmlbeans.XmlString xgetLanguage();
    
    /**
     * True if has "language" element
     */
    boolean isSetLanguage();
    
    /**
     * Sets the "language" element
     */
    void setLanguage(java.lang.String language);
    
    /**
     * Sets (as xml) the "language" element
     */
    void xsetLanguage(org.apache.xmlbeans.XmlString language);
    
    /**
     * Unsets the "language" element
     */
    void unsetLanguage();
    
    /**
     * Gets the "DataCustom" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom getDataCustom();
    
    /**
     * True if has "DataCustom" element
     */
    boolean isSetDataCustom();
    
    /**
     * Sets the "DataCustom" element
     */
    void setDataCustom(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom dataCustom);
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom addNewDataCustom();
    
    /**
     * Unsets the "DataCustom" element
     */
    void unsetDataCustom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data newInstance() {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
