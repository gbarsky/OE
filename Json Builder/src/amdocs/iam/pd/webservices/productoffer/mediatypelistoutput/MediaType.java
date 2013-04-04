/*
 * XML Type:  MediaType
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/MediaTypeListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.mediatypelistoutput;


/**
 * An XML MediaType(@http://amdocs/iam/pd/webservices/productOffer/MediaTypeListOutput).
 *
 * This is a complex type.
 */
public interface MediaType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MediaType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("mediatype0918type");
    
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
     * Gets the "mediaTypeName" element
     */
    java.lang.String getMediaTypeName();
    
    /**
     * Gets (as xml) the "mediaTypeName" element
     */
    org.apache.xmlbeans.XmlString xgetMediaTypeName();
    
    /**
     * Sets the "mediaTypeName" element
     */
    void setMediaTypeName(java.lang.String mediaTypeName);
    
    /**
     * Sets (as xml) the "mediaTypeName" element
     */
    void xsetMediaTypeName(org.apache.xmlbeans.XmlString mediaTypeName);
    
    /**
     * Gets the "MediaTypeCustom" element
     */
    amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom getMediaTypeCustom();
    
    /**
     * True if has "MediaTypeCustom" element
     */
    boolean isSetMediaTypeCustom();
    
    /**
     * Sets the "MediaTypeCustom" element
     */
    void setMediaTypeCustom(amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom mediaTypeCustom);
    
    /**
     * Appends and returns a new empty "MediaTypeCustom" element
     */
    amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom addNewMediaTypeCustom();
    
    /**
     * Unsets the "MediaTypeCustom" element
     */
    void unsetMediaTypeCustom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType newInstance() {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
