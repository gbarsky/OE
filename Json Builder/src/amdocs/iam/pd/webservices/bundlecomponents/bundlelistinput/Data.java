/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput;


/**
 * An XML Data(@http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput).
 *
 * This is a complex type.
 */
public interface Data extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("databe4etype");
    
    /**
     * Gets the "ProductCodeCriterion" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion getProductCodeCriterion();
    
    /**
     * True if has "ProductCodeCriterion" element
     */
    boolean isSetProductCodeCriterion();
    
    /**
     * Sets the "ProductCodeCriterion" element
     */
    void setProductCodeCriterion(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion productCodeCriterion);
    
    /**
     * Appends and returns a new empty "ProductCodeCriterion" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion addNewProductCodeCriterion();
    
    /**
     * Unsets the "ProductCodeCriterion" element
     */
    void unsetProductCodeCriterion();
    
    /**
     * Gets the "ProductTypeCriterion" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion getProductTypeCriterion();
    
    /**
     * True if has "ProductTypeCriterion" element
     */
    boolean isSetProductTypeCriterion();
    
    /**
     * Sets the "ProductTypeCriterion" element
     */
    void setProductTypeCriterion(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion productTypeCriterion);
    
    /**
     * Appends and returns a new empty "ProductTypeCriterion" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion addNewProductTypeCriterion();
    
    /**
     * Unsets the "ProductTypeCriterion" element
     */
    void unsetProductTypeCriterion();
    
    /**
     * Gets the "MediaTypeCriterion" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion getMediaTypeCriterion();
    
    /**
     * True if has "MediaTypeCriterion" element
     */
    boolean isSetMediaTypeCriterion();
    
    /**
     * Sets the "MediaTypeCriterion" element
     */
    void setMediaTypeCriterion(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion mediaTypeCriterion);
    
    /**
     * Appends and returns a new empty "MediaTypeCriterion" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion addNewMediaTypeCriterion();
    
    /**
     * Unsets the "MediaTypeCriterion" element
     */
    void unsetMediaTypeCriterion();
    
    /**
     * Gets the "CustomerParameters" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes getCustomerParameters();
    
    /**
     * True if has "CustomerParameters" element
     */
    boolean isSetCustomerParameters();
    
    /**
     * Sets the "CustomerParameters" element
     */
    void setCustomerParameters(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes customerParameters);
    
    /**
     * Appends and returns a new empty "CustomerParameters" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes addNewCustomerParameters();
    
    /**
     * Unsets the "CustomerParameters" element
     */
    void unsetCustomerParameters();
    
    /**
     * Gets the "DataCustom" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom getDataCustom();
    
    /**
     * True if has "DataCustom" element
     */
    boolean isSetDataCustom();
    
    /**
     * Sets the "DataCustom" element
     */
    void setDataCustom(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom dataCustom);
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom addNewDataCustom();
    
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
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data newInstance() {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
