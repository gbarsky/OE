/*
 * XML Type:  DataType
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/ProductTypeListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.producttypelistoutput;


/**
 * An XML DataType(@http://amdocs/iam/pd/webservices/productOffer/ProductTypeListOutput).
 *
 * This is a complex type.
 */
public interface DataType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("datatype2edbtype");
    
    /**
     * Gets array of all "products" elements
     */
    amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product[] getProductsArray();
    
    /**
     * Gets ith "products" element
     */
    amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product getProductsArray(int i);
    
    /**
     * Returns number of "products" element
     */
    int sizeOfProductsArray();
    
    /**
     * Sets array of all "products" element
     */
    void setProductsArray(amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product[] productsArray);
    
    /**
     * Sets ith "products" element
     */
    void setProductsArray(int i, amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product products);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "products" element
     */
    amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product insertNewProducts(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "products" element
     */
    amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product addNewProducts();
    
    /**
     * Removes the ith "products" element
     */
    void removeProducts(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType newInstance() {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
