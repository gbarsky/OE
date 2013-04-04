/*
 * XML Type:  DataType
 * Namespace: http://amdocs/iam/pd/webservices/heading/HeadingListInput
 * Java type: amdocs.iam.pd.webservices.heading.headinglistinput.DataType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.heading.headinglistinput;


/**
 * An XML DataType(@http://amdocs/iam/pd/webservices/heading/HeadingListInput).
 *
 * This is a complex type.
 */
public interface DataType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("datatype6cactype");
    
    /**
     * Gets the "language" element
     */
    java.lang.String getLanguage();
    
    /**
     * Gets (as xml) the "language" element
     */
    org.apache.xmlbeans.XmlString xgetLanguage();
    
    /**
     * Sets the "language" element
     */
    void setLanguage(java.lang.String language);
    
    /**
     * Sets (as xml) the "language" element
     */
    void xsetLanguage(org.apache.xmlbeans.XmlString language);
    
    /**
     * Gets the "productCode" element
     */
    java.lang.String getProductCode();
    
    /**
     * Gets (as xml) the "productCode" element
     */
    org.apache.xmlbeans.XmlString xgetProductCode();
    
    /**
     * Tests for nil "productCode" element
     */
    boolean isNilProductCode();
    
    /**
     * True if has "productCode" element
     */
    boolean isSetProductCode();
    
    /**
     * Sets the "productCode" element
     */
    void setProductCode(java.lang.String productCode);
    
    /**
     * Sets (as xml) the "productCode" element
     */
    void xsetProductCode(org.apache.xmlbeans.XmlString productCode);
    
    /**
     * Nils the "productCode" element
     */
    void setNilProductCode();
    
    /**
     * Unsets the "productCode" element
     */
    void unsetProductCode();
    
    /**
     * Gets the "brand" element
     */
    java.lang.String getBrand();
    
    /**
     * Gets (as xml) the "brand" element
     */
    org.apache.xmlbeans.XmlString xgetBrand();
    
    /**
     * Tests for nil "brand" element
     */
    boolean isNilBrand();
    
    /**
     * True if has "brand" element
     */
    boolean isSetBrand();
    
    /**
     * Sets the "brand" element
     */
    void setBrand(java.lang.String brand);
    
    /**
     * Sets (as xml) the "brand" element
     */
    void xsetBrand(org.apache.xmlbeans.XmlString brand);
    
    /**
     * Nils the "brand" element
     */
    void setNilBrand();
    
    /**
     * Unsets the "brand" element
     */
    void unsetBrand();
    
    /**
     * Gets the "CustomerParameters" element
     */
    amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes getCustomerParameters();
    
    /**
     * True if has "CustomerParameters" element
     */
    boolean isSetCustomerParameters();
    
    /**
     * Sets the "CustomerParameters" element
     */
    void setCustomerParameters(amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes customerParameters);
    
    /**
     * Appends and returns a new empty "CustomerParameters" element
     */
    amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes addNewCustomerParameters();
    
    /**
     * Unsets the "CustomerParameters" element
     */
    void unsetCustomerParameters();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType newInstance() {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.heading.headinglistinput.DataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.heading.headinglistinput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
