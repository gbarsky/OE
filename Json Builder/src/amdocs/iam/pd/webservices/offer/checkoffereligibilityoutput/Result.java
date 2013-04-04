/*
 * XML Type:  Result
 * Namespace: http://amdocs/iam/pd/webservices/offer/CheckOfferEligibilityOutput
 * Java type: amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput;


/**
 * An XML Result(@http://amdocs/iam/pd/webservices/offer/CheckOfferEligibilityOutput).
 *
 * This is a complex type.
 */
public interface Result extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Result.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("resultb839type");
    
    /**
     * Gets the "OfferPK" element
     */
    amdocs.iam.pd.general.common.OfferPK getOfferPK();
    
    /**
     * Sets the "OfferPK" element
     */
    void setOfferPK(amdocs.iam.pd.general.common.OfferPK offerPK);
    
    /**
     * Appends and returns a new empty "OfferPK" element
     */
    amdocs.iam.pd.general.common.OfferPK addNewOfferPK();
    
    /**
     * Gets the "productID" element
     */
    java.lang.String getProductID();
    
    /**
     * Gets (as xml) the "productID" element
     */
    org.apache.xmlbeans.XmlString xgetProductID();
    
    /**
     * True if has "productID" element
     */
    boolean isSetProductID();
    
    /**
     * Sets the "productID" element
     */
    void setProductID(java.lang.String productID);
    
    /**
     * Sets (as xml) the "productID" element
     */
    void xsetProductID(org.apache.xmlbeans.XmlString productID);
    
    /**
     * Unsets the "productID" element
     */
    void unsetProductID();
    
    /**
     * Gets the "isOfferEligible" element
     */
    boolean getIsOfferEligible();
    
    /**
     * Gets (as xml) the "isOfferEligible" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsOfferEligible();
    
    /**
     * Sets the "isOfferEligible" element
     */
    void setIsOfferEligible(boolean isOfferEligible);
    
    /**
     * Sets (as xml) the "isOfferEligible" element
     */
    void xsetIsOfferEligible(org.apache.xmlbeans.XmlBoolean isOfferEligible);
    
    /**
     * Gets the "falseReason" element
     */
    java.lang.String getFalseReason();
    
    /**
     * Gets (as xml) the "falseReason" element
     */
    org.apache.xmlbeans.XmlString xgetFalseReason();
    
    /**
     * True if has "falseReason" element
     */
    boolean isSetFalseReason();
    
    /**
     * Sets the "falseReason" element
     */
    void setFalseReason(java.lang.String falseReason);
    
    /**
     * Sets (as xml) the "falseReason" element
     */
    void xsetFalseReason(org.apache.xmlbeans.XmlString falseReason);
    
    /**
     * Unsets the "falseReason" element
     */
    void unsetFalseReason();
    
    /**
     * Gets the "ResultCustom" element
     */
    amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom getResultCustom();
    
    /**
     * True if has "ResultCustom" element
     */
    boolean isSetResultCustom();
    
    /**
     * Sets the "ResultCustom" element
     */
    void setResultCustom(amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom resultCustom);
    
    /**
     * Appends and returns a new empty "ResultCustom" element
     */
    amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom addNewResultCustom();
    
    /**
     * Unsets the "ResultCustom" element
     */
    void unsetResultCustom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result newInstance() {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
