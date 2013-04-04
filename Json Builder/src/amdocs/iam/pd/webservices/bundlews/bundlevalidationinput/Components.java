/*
 * XML Type:  Components
 * Namespace: http://amdocs/iam/pd/webservices/bundleWS/BundleValidationInput
 * Java type: amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlews.bundlevalidationinput;


/**
 * An XML Components(@http://amdocs/iam/pd/webservices/bundleWS/BundleValidationInput).
 *
 * This is a complex type.
 */
public interface Components extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Components.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("componentseea5type");
    
    /**
     * Gets array of all "Component" elements
     */
    amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component[] getComponentArray();
    
    /**
     * Gets ith "Component" element
     */
    amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component getComponentArray(int i);
    
    /**
     * Returns number of "Component" element
     */
    int sizeOfComponentArray();
    
    /**
     * Sets array of all "Component" element
     */
    void setComponentArray(amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component[] componentArray);
    
    /**
     * Sets ith "Component" element
     */
    void setComponentArray(int i, amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component component);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Component" element
     */
    amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component insertNewComponent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Component" element
     */
    amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component addNewComponent();
    
    /**
     * Removes the ith "Component" element
     */
    void removeComponent(int i);
    
    /**
     * Gets the "ComponentsCustom" element
     */
    amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom getComponentsCustom();
    
    /**
     * True if has "ComponentsCustom" element
     */
    boolean isSetComponentsCustom();
    
    /**
     * Sets the "ComponentsCustom" element
     */
    void setComponentsCustom(amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom componentsCustom);
    
    /**
     * Appends and returns a new empty "ComponentsCustom" element
     */
    amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom addNewComponentsCustom();
    
    /**
     * Unsets the "ComponentsCustom" element
     */
    void unsetComponentsCustom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components newInstance() {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
