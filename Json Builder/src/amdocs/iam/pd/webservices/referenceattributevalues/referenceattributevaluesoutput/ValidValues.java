/*
 * XML Type:  ValidValues
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput;


/**
 * An XML ValidValues(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput).
 *
 * This is a complex type.
 */
public interface ValidValues extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidValues.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("validvalues0e33type");
    
    /**
     * Gets the "codeColumn" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column getCodeColumn();
    
    /**
     * Sets the "codeColumn" element
     */
    void setCodeColumn(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column codeColumn);
    
    /**
     * Appends and returns a new empty "codeColumn" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column addNewCodeColumn();
    
    /**
     * Gets the "decodeColumn" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column getDecodeColumn();
    
    /**
     * True if has "decodeColumn" element
     */
    boolean isSetDecodeColumn();
    
    /**
     * Sets the "decodeColumn" element
     */
    void setDecodeColumn(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column decodeColumn);
    
    /**
     * Appends and returns a new empty "decodeColumn" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column addNewDecodeColumn();
    
    /**
     * Unsets the "decodeColumn" element
     */
    void unsetDecodeColumn();
    
    /**
     * Gets the "populatedFields" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields getPopulatedFields();
    
    /**
     * True if has "populatedFields" element
     */
    boolean isSetPopulatedFields();
    
    /**
     * Sets the "populatedFields" element
     */
    void setPopulatedFields(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields populatedFields);
    
    /**
     * Appends and returns a new empty "populatedFields" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields addNewPopulatedFields();
    
    /**
     * Unsets the "populatedFields" element
     */
    void unsetPopulatedFields();
    
    /**
     * Gets the "moreValuesInd" element
     */
    java.lang.String getMoreValuesInd();
    
    /**
     * Gets (as xml) the "moreValuesInd" element
     */
    org.apache.xmlbeans.XmlString xgetMoreValuesInd();
    
    /**
     * Sets the "moreValuesInd" element
     */
    void setMoreValuesInd(java.lang.String moreValuesInd);
    
    /**
     * Sets (as xml) the "moreValuesInd" element
     */
    void xsetMoreValuesInd(org.apache.xmlbeans.XmlString moreValuesInd);
    
    /**
     * Gets the "ValidValuesCustom" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom getValidValuesCustom();
    
    /**
     * True if has "ValidValuesCustom" element
     */
    boolean isSetValidValuesCustom();
    
    /**
     * Sets the "ValidValuesCustom" element
     */
    void setValidValuesCustom(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom validValuesCustom);
    
    /**
     * Appends and returns a new empty "ValidValuesCustom" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom addNewValidValuesCustom();
    
    /**
     * Unsets the "ValidValuesCustom" element
     */
    void unsetValidValuesCustom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues newInstance() {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
