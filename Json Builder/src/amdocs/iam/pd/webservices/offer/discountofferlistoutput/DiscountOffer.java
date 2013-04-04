/*
 * XML Type:  DiscountOffer
 * Namespace: http://amdocs/iam/pd/webservices/offer/DiscountOfferListOutput
 * Java type: amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.discountofferlistoutput;


/**
 * An XML DiscountOffer(@http://amdocs/iam/pd/webservices/offer/DiscountOfferListOutput).
 *
 * This is a complex type.
 */
public interface DiscountOffer extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiscountOffer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("discountoffer988dtype");
    
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
     * Gets the "discountType" element
     */
    java.lang.String getDiscountType();
    
    /**
     * Gets (as xml) the "discountType" element
     */
    org.apache.xmlbeans.XmlString xgetDiscountType();
    
    /**
     * Sets the "discountType" element
     */
    void setDiscountType(java.lang.String discountType);
    
    /**
     * Sets (as xml) the "discountType" element
     */
    void xsetDiscountType(org.apache.xmlbeans.XmlString discountType);
    
    /**
     * Gets the "OfferCustom" element
     */
    amdocs.iam.pd.webservices.offer.discountofferlistoutputimpl.OfferCustom getOfferCustom();
    
    /**
     * True if has "OfferCustom" element
     */
    boolean isSetOfferCustom();
    
    /**
     * Sets the "OfferCustom" element
     */
    void setOfferCustom(amdocs.iam.pd.webservices.offer.discountofferlistoutputimpl.OfferCustom offerCustom);
    
    /**
     * Appends and returns a new empty "OfferCustom" element
     */
    amdocs.iam.pd.webservices.offer.discountofferlistoutputimpl.OfferCustom addNewOfferCustom();
    
    /**
     * Unsets the "OfferCustom" element
     */
    void unsetOfferCustom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer newInstance() {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
