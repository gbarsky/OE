/*
 * XML Type:  OfferDetail
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteInput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteinput;


/**
 * An XML OfferDetail(@http://amdocs/iam/pd/webservices/quotation/GetQuoteInput).
 *
 * This is a complex type.
 */
public interface OfferDetail extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfferDetail.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("offerdetail6235type");
    
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
     * Gets the "offerType" element
     */
    java.lang.String getOfferType();
    
    /**
     * Gets (as xml) the "offerType" element
     */
    org.apache.xmlbeans.XmlString xgetOfferType();
    
    /**
     * Sets the "offerType" element
     */
    void setOfferType(java.lang.String offerType);
    
    /**
     * Sets (as xml) the "offerType" element
     */
    void xsetOfferType(org.apache.xmlbeans.XmlString offerType);
    
    /**
     * Gets the "offerInstance" element
     */
    java.lang.String getOfferInstance();
    
    /**
     * Gets (as xml) the "offerInstance" element
     */
    org.apache.xmlbeans.XmlString xgetOfferInstance();
    
    /**
     * True if has "offerInstance" element
     */
    boolean isSetOfferInstance();
    
    /**
     * Sets the "offerInstance" element
     */
    void setOfferInstance(java.lang.String offerInstance);
    
    /**
     * Sets (as xml) the "offerInstance" element
     */
    void xsetOfferInstance(org.apache.xmlbeans.XmlString offerInstance);
    
    /**
     * Unsets the "offerInstance" element
     */
    void unsetOfferInstance();
    
    /**
     * Gets the "offerActivityCode" element
     */
    java.lang.String getOfferActivityCode();
    
    /**
     * Gets (as xml) the "offerActivityCode" element
     */
    org.apache.xmlbeans.XmlString xgetOfferActivityCode();
    
    /**
     * Sets the "offerActivityCode" element
     */
    void setOfferActivityCode(java.lang.String offerActivityCode);
    
    /**
     * Sets (as xml) the "offerActivityCode" element
     */
    void xsetOfferActivityCode(org.apache.xmlbeans.XmlString offerActivityCode);
    
    /**
     * Gets the "offerActivityReason" element
     */
    java.lang.String getOfferActivityReason();
    
    /**
     * Gets (as xml) the "offerActivityReason" element
     */
    org.apache.xmlbeans.XmlString xgetOfferActivityReason();
    
    /**
     * Sets the "offerActivityReason" element
     */
    void setOfferActivityReason(java.lang.String offerActivityReason);
    
    /**
     * Sets (as xml) the "offerActivityReason" element
     */
    void xsetOfferActivityReason(org.apache.xmlbeans.XmlString offerActivityReason);
    
    /**
     * Gets the "customerOfferParameters" element
     */
    amdocs.iam.pd.general.common.ParametersDimT getCustomerOfferParameters();
    
    /**
     * True if has "customerOfferParameters" element
     */
    boolean isSetCustomerOfferParameters();
    
    /**
     * Sets the "customerOfferParameters" element
     */
    void setCustomerOfferParameters(amdocs.iam.pd.general.common.ParametersDimT customerOfferParameters);
    
    /**
     * Appends and returns a new empty "customerOfferParameters" element
     */
    amdocs.iam.pd.general.common.ParametersDimT addNewCustomerOfferParameters();
    
    /**
     * Unsets the "customerOfferParameters" element
     */
    void unsetCustomerOfferParameters();
    
    /**
     * Gets the "OfferCustom" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom getOfferCustom();
    
    /**
     * True if has "OfferCustom" element
     */
    boolean isSetOfferCustom();
    
    /**
     * Sets the "OfferCustom" element
     */
    void setOfferCustom(amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom offerCustom);
    
    /**
     * Appends and returns a new empty "OfferCustom" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom addNewOfferCustom();
    
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
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail newInstance() {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
