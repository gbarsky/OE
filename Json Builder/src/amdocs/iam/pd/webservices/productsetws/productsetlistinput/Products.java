/*
 * XML Type:  Products
 * Namespace: http://amdocs/iam/pd/webservices/productSetWS/ProductSetListInput
 * Java type: amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productsetws.productsetlistinput;


/**
 * An XML Products(@http://amdocs/iam/pd/webservices/productSetWS/ProductSetListInput).
 *
 * This is a complex type.
 */
public interface Products extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Products.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("products238etype");
    
    /**
     * Gets array of all "ProductCode" elements
     */
    java.lang.String[] getProductCodeArray();
    
    /**
     * Gets ith "ProductCode" element
     */
    java.lang.String getProductCodeArray(int i);
    
    /**
     * Gets (as xml) array of all "ProductCode" elements
     */
    org.apache.xmlbeans.XmlString[] xgetProductCodeArray();
    
    /**
     * Gets (as xml) ith "ProductCode" element
     */
    org.apache.xmlbeans.XmlString xgetProductCodeArray(int i);
    
    /**
     * Returns number of "ProductCode" element
     */
    int sizeOfProductCodeArray();
    
    /**
     * Sets array of all "ProductCode" element
     */
    void setProductCodeArray(java.lang.String[] productCodeArray);
    
    /**
     * Sets ith "ProductCode" element
     */
    void setProductCodeArray(int i, java.lang.String productCode);
    
    /**
     * Sets (as xml) array of all "ProductCode" element
     */
    void xsetProductCodeArray(org.apache.xmlbeans.XmlString[] productCodeArray);
    
    /**
     * Sets (as xml) ith "ProductCode" element
     */
    void xsetProductCodeArray(int i, org.apache.xmlbeans.XmlString productCode);
    
    /**
     * Inserts the value as the ith "ProductCode" element
     */
    void insertProductCode(int i, java.lang.String productCode);
    
    /**
     * Appends the value as the last "ProductCode" element
     */
    void addProductCode(java.lang.String productCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductCode" element
     */
    org.apache.xmlbeans.XmlString insertNewProductCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductCode" element
     */
    org.apache.xmlbeans.XmlString addNewProductCode();
    
    /**
     * Removes the ith "ProductCode" element
     */
    void removeProductCode(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products newInstance() {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
