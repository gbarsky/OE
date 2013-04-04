/*
 * XML Type:  Parameters
 * Namespace: http://amdocs/iam/pd/webservices/offerAdvPkg/OfferDetailsOutput
 * Java type: amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput;


/**
 * An XML Parameters(@http://amdocs/iam/pd/webservices/offerAdvPkg/OfferDetailsOutput).
 *
 * This is a complex type.
 */
public interface Parameters extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("parameters27dctype");
    
    /**
     * Gets array of all "Parameter" elements
     */
    amdocs.iam.pd.general.common.GlobalPropertiesParameter[] getParameterArray();
    
    /**
     * Gets ith "Parameter" element
     */
    amdocs.iam.pd.general.common.GlobalPropertiesParameter getParameterArray(int i);
    
    /**
     * Returns number of "Parameter" element
     */
    int sizeOfParameterArray();
    
    /**
     * Sets array of all "Parameter" element
     */
    void setParameterArray(amdocs.iam.pd.general.common.GlobalPropertiesParameter[] parameterArray);
    
    /**
     * Sets ith "Parameter" element
     */
    void setParameterArray(int i, amdocs.iam.pd.general.common.GlobalPropertiesParameter parameter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
     */
    amdocs.iam.pd.general.common.GlobalPropertiesParameter insertNewParameter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Parameter" element
     */
    amdocs.iam.pd.general.common.GlobalPropertiesParameter addNewParameter();
    
    /**
     * Removes the ith "Parameter" element
     */
    void removeParameter(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters newInstance() {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
