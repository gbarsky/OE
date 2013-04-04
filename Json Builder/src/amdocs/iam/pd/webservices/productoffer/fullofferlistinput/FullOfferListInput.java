/*
 * XML Type:  FullOfferListInput
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/FullOfferListInput
 * Java type: amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.fullofferlistinput;


/**
 * An XML FullOfferListInput(@http://amdocs/iam/pd/webservices/productOffer/FullOfferListInput).
 *
 * This is a complex type.
 */
public interface FullOfferListInput extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FullOfferListInput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("fullofferlistinputc791type");
    
    /**
     * Gets the "Event" element
     */
    amdocs.iam.pd.general.common.EventType getEvent();
    
    /**
     * Sets the "Event" element
     */
    void setEvent(amdocs.iam.pd.general.common.EventType event);
    
    /**
     * Appends and returns a new empty "Event" element
     */
    amdocs.iam.pd.general.common.EventType addNewEvent();
    
    /**
     * Gets the "DATA" element
     */
    amdocs.iam.pd.webservices.productoffer.fullofferlistinput.Data getDATA();
    
    /**
     * Sets the "DATA" element
     */
    void setDATA(amdocs.iam.pd.webservices.productoffer.fullofferlistinput.Data data);
    
    /**
     * Appends and returns a new empty "DATA" element
     */
    amdocs.iam.pd.webservices.productoffer.fullofferlistinput.Data addNewDATA();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput newInstance() {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
