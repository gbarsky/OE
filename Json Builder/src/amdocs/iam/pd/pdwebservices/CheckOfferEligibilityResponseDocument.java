/*
 * An XML document type.
 * Localname: CheckOfferEligibilityResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices;


/**
 * A document containing one CheckOfferEligibilityResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public interface CheckOfferEligibilityResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckOfferEligibilityResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("checkoffereligibilityresponsee2b2doctype");
    
    /**
     * Gets the "CheckOfferEligibilityResponse" element
     */
    amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse getCheckOfferEligibilityResponse();
    
    /**
     * Sets the "CheckOfferEligibilityResponse" element
     */
    void setCheckOfferEligibilityResponse(amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse checkOfferEligibilityResponse);
    
    /**
     * Appends and returns a new empty "CheckOfferEligibilityResponse" element
     */
    amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse addNewCheckOfferEligibilityResponse();
    
    /**
     * An XML CheckOfferEligibilityResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public interface CheckOfferEligibilityResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckOfferEligibilityResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("checkoffereligibilityresponse7a8celemtype");
        
        /**
         * Gets the "ROOT" element
         */
        amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput getROOT();
        
        /**
         * Sets the "ROOT" element
         */
        void setROOT(amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput root);
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput addNewROOT();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse newInstance() {
              return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument newInstance() {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
