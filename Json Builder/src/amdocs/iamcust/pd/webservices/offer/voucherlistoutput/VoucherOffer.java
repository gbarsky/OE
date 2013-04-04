/*
 * XML Type:  VoucherOffer
 * Namespace: http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput
 * Java type: amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.offer.voucherlistoutput;


/**
 * An XML VoucherOffer(@http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput).
 *
 * This is a complex type.
 */
public interface VoucherOffer extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VoucherOffer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("voucherofferd168type");
    
    /**
     * Gets the "offerCode" element
     */
    java.lang.String getOfferCode();
    
    /**
     * Gets (as xml) the "offerCode" element
     */
    org.apache.xmlbeans.XmlString xgetOfferCode();
    
    /**
     * Sets the "offerCode" element
     */
    void setOfferCode(java.lang.String offerCode);
    
    /**
     * Sets (as xml) the "offerCode" element
     */
    void xsetOfferCode(org.apache.xmlbeans.XmlString offerCode);
    
    /**
     * Gets the "offerName" element
     */
    java.lang.String getOfferName();
    
    /**
     * Gets (as xml) the "offerName" element
     */
    org.apache.xmlbeans.XmlString xgetOfferName();
    
    /**
     * Sets the "offerName" element
     */
    void setOfferName(java.lang.String offerName);
    
    /**
     * Sets (as xml) the "offerName" element
     */
    void xsetOfferName(org.apache.xmlbeans.XmlString offerName);
    
    /**
     * Gets the "offerDescription" element
     */
    java.lang.String getOfferDescription();
    
    /**
     * Gets (as xml) the "offerDescription" element
     */
    org.apache.xmlbeans.XmlString xgetOfferDescription();
    
    /**
     * Sets the "offerDescription" element
     */
    void setOfferDescription(java.lang.String offerDescription);
    
    /**
     * Sets (as xml) the "offerDescription" element
     */
    void xsetOfferDescription(org.apache.xmlbeans.XmlString offerDescription);
    
    /**
     * Gets the "productCode" element
     */
    java.lang.String getProductCode();
    
    /**
     * Gets (as xml) the "productCode" element
     */
    org.apache.xmlbeans.XmlString xgetProductCode();
    
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
     * Unsets the "productCode" element
     */
    void unsetProductCode();
    
    /**
     * Gets the "voucherAvailability" element
     */
    java.lang.String getVoucherAvailability();
    
    /**
     * Gets (as xml) the "voucherAvailability" element
     */
    org.apache.xmlbeans.XmlString xgetVoucherAvailability();
    
    /**
     * Sets the "voucherAvailability" element
     */
    void setVoucherAvailability(java.lang.String voucherAvailability);
    
    /**
     * Sets (as xml) the "voucherAvailability" element
     */
    void xsetVoucherAvailability(org.apache.xmlbeans.XmlString voucherAvailability);
    
    /**
     * Gets the "voucherExpirationDate" element
     */
    java.lang.String getVoucherExpirationDate();
    
    /**
     * Gets (as xml) the "voucherExpirationDate" element
     */
    org.apache.xmlbeans.XmlString xgetVoucherExpirationDate();
    
    /**
     * Sets the "voucherExpirationDate" element
     */
    void setVoucherExpirationDate(java.lang.String voucherExpirationDate);
    
    /**
     * Sets (as xml) the "voucherExpirationDate" element
     */
    void xsetVoucherExpirationDate(org.apache.xmlbeans.XmlString voucherExpirationDate);
    
    /**
     * Gets the "voucherExpirationPeriod" element
     */
    java.lang.String getVoucherExpirationPeriod();
    
    /**
     * Gets (as xml) the "voucherExpirationPeriod" element
     */
    org.apache.xmlbeans.XmlString xgetVoucherExpirationPeriod();
    
    /**
     * Sets the "voucherExpirationPeriod" element
     */
    void setVoucherExpirationPeriod(java.lang.String voucherExpirationPeriod);
    
    /**
     * Sets (as xml) the "voucherExpirationPeriod" element
     */
    void xsetVoucherExpirationPeriod(org.apache.xmlbeans.XmlString voucherExpirationPeriod);
    
    /**
     * Gets the "voucherAmount" element
     */
    double getVoucherAmount();
    
    /**
     * Gets (as xml) the "voucherAmount" element
     */
    org.apache.xmlbeans.XmlDouble xgetVoucherAmount();
    
    /**
     * Sets the "voucherAmount" element
     */
    void setVoucherAmount(double voucherAmount);
    
    /**
     * Sets (as xml) the "voucherAmount" element
     */
    void xsetVoucherAmount(org.apache.xmlbeans.XmlDouble voucherAmount);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer newInstance() {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
