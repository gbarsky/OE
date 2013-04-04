/*
 * XML Type:  Product
 * Namespace: http://amdocs/iam/pd/webservices/productRelations/ProductListOutput
 * Java type: amdocs.iam.pd.webservices.productrelations.productlistoutput.Product
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productrelations.productlistoutput;


/**
 * An XML Product(@http://amdocs/iam/pd/webservices/productRelations/ProductListOutput).
 *
 * This is a complex type.
 */
public interface Product extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Product.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("productcf15type");
    
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
    amdocs.iam.pd.general.common.Long xgetProductVersion();
    
    /**
     * Sets the "productVersion" element
     */
    void setProductVersion(java.lang.String productVersion);
    
    /**
     * Sets (as xml) the "productVersion" element
     */
    void xsetProductVersion(amdocs.iam.pd.general.common.Long productVersion);
    
    /**
     * Gets the "productType" element
     */
    java.lang.String getProductType();
    
    /**
     * Gets (as xml) the "productType" element
     */
    org.apache.xmlbeans.XmlString xgetProductType();
    
    /**
     * Sets the "productType" element
     */
    void setProductType(java.lang.String productType);
    
    /**
     * Sets (as xml) the "productType" element
     */
    void xsetProductType(org.apache.xmlbeans.XmlString productType);
    
    /**
     * Gets the "mediaType" element
     */
    java.lang.String getMediaType();
    
    /**
     * Gets (as xml) the "mediaType" element
     */
    org.apache.xmlbeans.XmlString xgetMediaType();
    
    /**
     * Sets the "mediaType" element
     */
    void setMediaType(java.lang.String mediaType);
    
    /**
     * Sets (as xml) the "mediaType" element
     */
    void xsetMediaType(org.apache.xmlbeans.XmlString mediaType);
    
    /**
     * Gets the "productName" element
     */
    java.lang.String getProductName();
    
    /**
     * Gets (as xml) the "productName" element
     */
    org.apache.xmlbeans.XmlString xgetProductName();
    
    /**
     * Sets the "productName" element
     */
    void setProductName(java.lang.String productName);
    
    /**
     * Sets (as xml) the "productName" element
     */
    void xsetProductName(org.apache.xmlbeans.XmlString productName);
    
    /**
     * Gets the "productDescription" element
     */
    java.lang.String getProductDescription();
    
    /**
     * Gets (as xml) the "productDescription" element
     */
    org.apache.xmlbeans.XmlString xgetProductDescription();
    
    /**
     * Sets the "productDescription" element
     */
    void setProductDescription(java.lang.String productDescription);
    
    /**
     * Sets (as xml) the "productDescription" element
     */
    void xsetProductDescription(org.apache.xmlbeans.XmlString productDescription);
    
    /**
     * Gets the "defaultOfferCode" element
     */
    java.lang.String getDefaultOfferCode();
    
    /**
     * Gets (as xml) the "defaultOfferCode" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultOfferCode();
    
    /**
     * Sets the "defaultOfferCode" element
     */
    void setDefaultOfferCode(java.lang.String defaultOfferCode);
    
    /**
     * Sets (as xml) the "defaultOfferCode" element
     */
    void xsetDefaultOfferCode(org.apache.xmlbeans.XmlString defaultOfferCode);
    
    /**
     * Gets the "agreementReqInd" element
     */
    java.lang.String getAgreementReqInd();
    
    /**
     * Gets (as xml) the "agreementReqInd" element
     */
    org.apache.xmlbeans.XmlString xgetAgreementReqInd();
    
    /**
     * Sets the "agreementReqInd" element
     */
    void setAgreementReqInd(java.lang.String agreementReqInd);
    
    /**
     * Sets (as xml) the "agreementReqInd" element
     */
    void xsetAgreementReqInd(org.apache.xmlbeans.XmlString agreementReqInd);
    
    /**
     * Gets the "relationType" element
     */
    java.lang.String getRelationType();
    
    /**
     * Gets (as xml) the "relationType" element
     */
    org.apache.xmlbeans.XmlString xgetRelationType();
    
    /**
     * True if has "relationType" element
     */
    boolean isSetRelationType();
    
    /**
     * Sets the "relationType" element
     */
    void setRelationType(java.lang.String relationType);
    
    /**
     * Sets (as xml) the "relationType" element
     */
    void xsetRelationType(org.apache.xmlbeans.XmlString relationType);
    
    /**
     * Unsets the "relationType" element
     */
    void unsetRelationType();
    
    /**
     * Gets the "ProductCustom" element
     */
    amdocs.iam.pd.webservices.productrelations.productlistoutputimpl.ProductCustom getProductCustom();
    
    /**
     * True if has "ProductCustom" element
     */
    boolean isSetProductCustom();
    
    /**
     * Sets the "ProductCustom" element
     */
    void setProductCustom(amdocs.iam.pd.webservices.productrelations.productlistoutputimpl.ProductCustom productCustom);
    
    /**
     * Appends and returns a new empty "ProductCustom" element
     */
    amdocs.iam.pd.webservices.productrelations.productlistoutputimpl.ProductCustom addNewProductCustom();
    
    /**
     * Unsets the "ProductCustom" element
     */
    void unsetProductCustom();
    
    /**
     * Gets the "maxAppearances" element
     */
    java.lang.String getMaxAppearances();
    
    /**
     * Gets (as xml) the "maxAppearances" element
     */
    org.apache.xmlbeans.XmlString xgetMaxAppearances();
    
    /**
     * True if has "maxAppearances" element
     */
    boolean isSetMaxAppearances();
    
    /**
     * Sets the "maxAppearances" element
     */
    void setMaxAppearances(java.lang.String maxAppearances);
    
    /**
     * Sets (as xml) the "maxAppearances" element
     */
    void xsetMaxAppearances(org.apache.xmlbeans.XmlString maxAppearances);
    
    /**
     * Unsets the "maxAppearances" element
     */
    void unsetMaxAppearances();
    
    /**
     * Gets the "daysForFulfillment" element
     */
    java.lang.String getDaysForFulfillment();
    
    /**
     * Gets (as xml) the "daysForFulfillment" element
     */
    org.apache.xmlbeans.XmlString xgetDaysForFulfillment();
    
    /**
     * True if has "daysForFulfillment" element
     */
    boolean isSetDaysForFulfillment();
    
    /**
     * Sets the "daysForFulfillment" element
     */
    void setDaysForFulfillment(java.lang.String daysForFulfillment);
    
    /**
     * Sets (as xml) the "daysForFulfillment" element
     */
    void xsetDaysForFulfillment(org.apache.xmlbeans.XmlString daysForFulfillment);
    
    /**
     * Unsets the "daysForFulfillment" element
     */
    void unsetDaysForFulfillment();
    
    /**
     * Gets the "fileId" element
     */
    java.lang.String getFileId();
    
    /**
     * Gets (as xml) the "fileId" element
     */
    org.apache.xmlbeans.XmlString xgetFileId();
    
    /**
     * True if has "fileId" element
     */
    boolean isSetFileId();
    
    /**
     * Sets the "fileId" element
     */
    void setFileId(java.lang.String fileId);
    
    /**
     * Sets (as xml) the "fileId" element
     */
    void xsetFileId(org.apache.xmlbeans.XmlString fileId);
    
    /**
     * Unsets the "fileId" element
     */
    void unsetFileId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product newInstance() {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productrelations.productlistoutput.Product parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
