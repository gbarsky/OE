/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/offerAdvPkg/OfferDetailsOutput
 * Java type: amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput;


/**
 * An XML Data(@http://amdocs/iam/pd/webservices/offerAdvPkg/OfferDetailsOutput).
 *
 * This is a complex type.
 */
public interface Data extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("datac05ctype");
    
    /**
     * Gets the "offerEntity" element
     */
    amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity getOfferEntity();
    
    /**
     * Sets the "offerEntity" element
     */
    void setOfferEntity(amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity offerEntity);
    
    /**
     * Appends and returns a new empty "offerEntity" element
     */
    amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity addNewOfferEntity();
    
    /**
     * Gets the "DataCustom" element
     */
    amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom getDataCustom();
    
    /**
     * True if has "DataCustom" element
     */
    boolean isSetDataCustom();
    
    /**
     * Sets the "DataCustom" element
     */
    void setDataCustom(amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom dataCustom);
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom addNewDataCustom();
    
    /**
     * Unsets the "DataCustom" element
     */
    void unsetDataCustom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data newInstance() {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
