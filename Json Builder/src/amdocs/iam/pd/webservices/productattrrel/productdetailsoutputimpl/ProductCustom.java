/*
 * XML Type:  ProductCustom
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutputImpl
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl;


/**
 * An XML ProductCustom(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutputImpl).
 *
 * This is a complex type.
 */
public interface ProductCustom extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductCustom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("productcustom1c8btype");
    
    /**
     * Gets the "brandCode" element
     */
    java.lang.String getBrandCode();
    
    /**
     * Gets (as xml) the "brandCode" element
     */
    org.apache.xmlbeans.XmlString xgetBrandCode();
    
    /**
     * True if has "brandCode" element
     */
    boolean isSetBrandCode();
    
    /**
     * Sets the "brandCode" element
     */
    void setBrandCode(java.lang.String brandCode);
    
    /**
     * Sets (as xml) the "brandCode" element
     */
    void xsetBrandCode(org.apache.xmlbeans.XmlString brandCode);
    
    /**
     * Unsets the "brandCode" element
     */
    void unsetBrandCode();
    
    /**
     * Gets the "productBrandSets" element
     */
    amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets getProductBrandSets();
    
    /**
     * True if has "productBrandSets" element
     */
    boolean isSetProductBrandSets();
    
    /**
     * Sets the "productBrandSets" element
     */
    void setProductBrandSets(amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets productBrandSets);
    
    /**
     * Appends and returns a new empty "productBrandSets" element
     */
    amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets addNewProductBrandSets();
    
    /**
     * Unsets the "productBrandSets" element
     */
    void unsetProductBrandSets();
    
    /**
     * Gets the "defaultOfferCode" element
     */
    java.lang.String getDefaultOfferCode();
    
    /**
     * Gets (as xml) the "defaultOfferCode" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultOfferCode();
    
    /**
     * True if has "defaultOfferCode" element
     */
    boolean isSetDefaultOfferCode();
    
    /**
     * Sets the "defaultOfferCode" element
     */
    void setDefaultOfferCode(java.lang.String defaultOfferCode);
    
    /**
     * Sets (as xml) the "defaultOfferCode" element
     */
    void xsetDefaultOfferCode(org.apache.xmlbeans.XmlString defaultOfferCode);
    
    /**
     * Unsets the "defaultOfferCode" element
     */
    void unsetDefaultOfferCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom newInstance() {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
