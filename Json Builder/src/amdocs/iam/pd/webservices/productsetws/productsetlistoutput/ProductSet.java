/*
 * XML Type:  ProductSet
 * Namespace: http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput
 * Java type: amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productsetws.productsetlistoutput;


/**
 * An XML ProductSet(@http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput).
 *
 * This is a complex type.
 */
public interface ProductSet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("productsetfa0etype");
    
    /**
     * Gets the "productSetCode" element
     */
    java.lang.String getProductSetCode();
    
    /**
     * Gets (as xml) the "productSetCode" element
     */
    org.apache.xmlbeans.XmlString xgetProductSetCode();
    
    /**
     * Sets the "productSetCode" element
     */
    void setProductSetCode(java.lang.String productSetCode);
    
    /**
     * Sets (as xml) the "productSetCode" element
     */
    void xsetProductSetCode(org.apache.xmlbeans.XmlString productSetCode);
    
    /**
     * Gets the "productSetName" element
     */
    java.lang.String getProductSetName();
    
    /**
     * Gets (as xml) the "productSetName" element
     */
    org.apache.xmlbeans.XmlString xgetProductSetName();
    
    /**
     * Sets the "productSetName" element
     */
    void setProductSetName(java.lang.String productSetName);
    
    /**
     * Sets (as xml) the "productSetName" element
     */
    void xsetProductSetName(org.apache.xmlbeans.XmlString productSetName);
    
    /**
     * Gets the "productSetDescription" element
     */
    java.lang.String getProductSetDescription();
    
    /**
     * Gets (as xml) the "productSetDescription" element
     */
    org.apache.xmlbeans.XmlString xgetProductSetDescription();
    
    /**
     * Sets the "productSetDescription" element
     */
    void setProductSetDescription(java.lang.String productSetDescription);
    
    /**
     * Sets (as xml) the "productSetDescription" element
     */
    void xsetProductSetDescription(org.apache.xmlbeans.XmlString productSetDescription);
    
    /**
     * Gets the "effectiveDate" element
     */
    java.lang.String getEffectiveDate();
    
    /**
     * Gets (as xml) the "effectiveDate" element
     */
    org.apache.xmlbeans.XmlString xgetEffectiveDate();
    
    /**
     * Sets the "effectiveDate" element
     */
    void setEffectiveDate(java.lang.String effectiveDate);
    
    /**
     * Sets (as xml) the "effectiveDate" element
     */
    void xsetEffectiveDate(org.apache.xmlbeans.XmlString effectiveDate);
    
    /**
     * Gets the "expirationDate" element
     */
    java.lang.String getExpirationDate();
    
    /**
     * Gets (as xml) the "expirationDate" element
     */
    org.apache.xmlbeans.XmlString xgetExpirationDate();
    
    /**
     * Sets the "expirationDate" element
     */
    void setExpirationDate(java.lang.String expirationDate);
    
    /**
     * Sets (as xml) the "expirationDate" element
     */
    void xsetExpirationDate(org.apache.xmlbeans.XmlString expirationDate);
    
    /**
     * Gets the "Products" element
     */
    amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products getProducts();
    
    /**
     * Sets the "Products" element
     */
    void setProducts(amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products products);
    
    /**
     * Appends and returns a new empty "Products" element
     */
    amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products addNewProducts();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet newInstance() {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
