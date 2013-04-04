/*
 * XML Type:  ProductsSet
 * Namespace: http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput
 * Java type: amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productsetws.productsetlistoutput;


/**
 * An XML ProductsSet(@http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput).
 *
 * This is a complex type.
 */
public interface ProductsSet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductsSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("productsset2d75type");
    
    /**
     * Gets array of all "ProductSet" elements
     */
    amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet[] getProductSetArray();
    
    /**
     * Gets ith "ProductSet" element
     */
    amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet getProductSetArray(int i);
    
    /**
     * Returns number of "ProductSet" element
     */
    int sizeOfProductSetArray();
    
    /**
     * Sets array of all "ProductSet" element
     */
    void setProductSetArray(amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet[] productSetArray);
    
    /**
     * Sets ith "ProductSet" element
     */
    void setProductSetArray(int i, amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet productSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductSet" element
     */
    amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet insertNewProductSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductSet" element
     */
    amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet addNewProductSet();
    
    /**
     * Removes the ith "ProductSet" element
     */
    void removeProductSet(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet newInstance() {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
