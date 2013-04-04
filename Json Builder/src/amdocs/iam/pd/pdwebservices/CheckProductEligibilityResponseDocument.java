/*
 * An XML document type.
 * Localname: CheckProductEligibilityResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices;


/**
 * A document containing one CheckProductEligibilityResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public interface CheckProductEligibilityResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckProductEligibilityResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("checkproducteligibilityresponse30c5doctype");
    
    /**
     * Gets the "CheckProductEligibilityResponse" element
     */
    amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse getCheckProductEligibilityResponse();
    
    /**
     * Sets the "CheckProductEligibilityResponse" element
     */
    void setCheckProductEligibilityResponse(amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse checkProductEligibilityResponse);
    
    /**
     * Appends and returns a new empty "CheckProductEligibilityResponse" element
     */
    amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse addNewCheckProductEligibilityResponse();
    
    /**
     * An XML CheckProductEligibilityResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public interface CheckProductEligibilityResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckProductEligibilityResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("checkproducteligibilityresponsea7b2elemtype");
        
        /**
         * Gets the "ROOT" element
         */
        amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput getROOT();
        
        /**
         * Sets the "ROOT" element
         */
        void setROOT(amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput root);
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput addNewROOT();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse newInstance() {
              return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument newInstance() {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
