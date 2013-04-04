/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/productRelations/CheckProductEligibilityInput
 * Java type: amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput;


/**
 * An XML Data(@http://amdocs/iam/pd/webservices/productRelations/CheckProductEligibilityInput).
 *
 * This is a complex type.
 */
public interface Data extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("data5a30type");
    
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
     * Gets the "heading" element
     */
    java.lang.String getHeading();
    
    /**
     * Gets (as xml) the "heading" element
     */
    org.apache.xmlbeans.XmlString xgetHeading();
    
    /**
     * Sets the "heading" element
     */
    void setHeading(java.lang.String heading);
    
    /**
     * Sets (as xml) the "heading" element
     */
    void xsetHeading(org.apache.xmlbeans.XmlString heading);
    
    /**
     * Gets the "CustomerParameters" element
     */
    amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes getCustomerParameters();
    
    /**
     * True if has "CustomerParameters" element
     */
    boolean isSetCustomerParameters();
    
    /**
     * Sets the "CustomerParameters" element
     */
    void setCustomerParameters(amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes customerParameters);
    
    /**
     * Appends and returns a new empty "CustomerParameters" element
     */
    amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes addNewCustomerParameters();
    
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
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data newInstance() {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
