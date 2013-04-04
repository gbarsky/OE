/*
 * XML Type:  BrandSet
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutputImpl
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl;


/**
 * An XML BrandSet(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutputImpl).
 *
 * This is a complex type.
 */
public interface BrandSet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BrandSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("brandset739etype");
    
    /**
     * Gets the "slaveProductCode" element
     */
    java.lang.String getSlaveProductCode();
    
    /**
     * Gets (as xml) the "slaveProductCode" element
     */
    org.apache.xmlbeans.XmlString xgetSlaveProductCode();
    
    /**
     * Sets the "slaveProductCode" element
     */
    void setSlaveProductCode(java.lang.String slaveProductCode);
    
    /**
     * Sets (as xml) the "slaveProductCode" element
     */
    void xsetSlaveProductCode(org.apache.xmlbeans.XmlString slaveProductCode);
    
    /**
     * Gets the "slaveOfferCode" element
     */
    java.lang.String getSlaveOfferCode();
    
    /**
     * Gets (as xml) the "slaveOfferCode" element
     */
    org.apache.xmlbeans.XmlString xgetSlaveOfferCode();
    
    /**
     * Sets the "slaveOfferCode" element
     */
    void setSlaveOfferCode(java.lang.String slaveOfferCode);
    
    /**
     * Sets (as xml) the "slaveOfferCode" element
     */
    void xsetSlaveOfferCode(org.apache.xmlbeans.XmlString slaveOfferCode);
    
    /**
     * Gets the "mandatoryInd" element
     */
    java.lang.String getMandatoryInd();
    
    /**
     * Gets (as xml) the "mandatoryInd" element
     */
    org.apache.xmlbeans.XmlString xgetMandatoryInd();
    
    /**
     * Sets the "mandatoryInd" element
     */
    void setMandatoryInd(java.lang.String mandatoryInd);
    
    /**
     * Sets (as xml) the "mandatoryInd" element
     */
    void xsetMandatoryInd(org.apache.xmlbeans.XmlString mandatoryInd);
    
    /**
     * Gets the "cancelImmInd" element
     */
    java.lang.String getCancelImmInd();
    
    /**
     * Gets (as xml) the "cancelImmInd" element
     */
    org.apache.xmlbeans.XmlString xgetCancelImmInd();
    
    /**
     * Sets the "cancelImmInd" element
     */
    void setCancelImmInd(java.lang.String cancelImmInd);
    
    /**
     * Sets (as xml) the "cancelImmInd" element
     */
    void xsetCancelImmInd(org.apache.xmlbeans.XmlString cancelImmInd);
    
    /**
     * Gets the "startDateInd" element
     */
    java.lang.String getStartDateInd();
    
    /**
     * Gets (as xml) the "startDateInd" element
     */
    org.apache.xmlbeans.XmlString xgetStartDateInd();
    
    /**
     * Sets the "startDateInd" element
     */
    void setStartDateInd(java.lang.String startDateInd);
    
    /**
     * Sets (as xml) the "startDateInd" element
     */
    void xsetStartDateInd(org.apache.xmlbeans.XmlString startDateInd);
    
    /**
     * Gets the "endDateInd" element
     */
    java.lang.String getEndDateInd();
    
    /**
     * Gets (as xml) the "endDateInd" element
     */
    org.apache.xmlbeans.XmlString xgetEndDateInd();
    
    /**
     * Sets the "endDateInd" element
     */
    void setEndDateInd(java.lang.String endDateInd);
    
    /**
     * Sets (as xml) the "endDateInd" element
     */
    void xsetEndDateInd(org.apache.xmlbeans.XmlString endDateInd);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet newInstance() {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
