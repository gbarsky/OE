/*
 * XML Type:  Parameter
 * Namespace: http://amdocs/iam/pd/general/Common
 * Java type: amdocs.iam.pd.general.common.Parameter
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.general.common;


/**
 * An XML Parameter(@http://amdocs/iam/pd/general/Common).
 *
 * This is a complex type.
 */
public interface Parameter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parameter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("parameterbbbdtype");
    
    /**
     * Gets the "defaultValue" element
     */
    java.lang.String getDefaultValue();
    
    /**
     * Gets (as xml) the "defaultValue" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultValue();
    
    /**
     * Tests for nil "defaultValue" element
     */
    boolean isNilDefaultValue();
    
    /**
     * True if has "defaultValue" element
     */
    boolean isSetDefaultValue();
    
    /**
     * Sets the "defaultValue" element
     */
    void setDefaultValue(java.lang.String defaultValue);
    
    /**
     * Sets (as xml) the "defaultValue" element
     */
    void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue);
    
    /**
     * Nils the "defaultValue" element
     */
    void setNilDefaultValue();
    
    /**
     * Unsets the "defaultValue" element
     */
    void unsetDefaultValue();
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Tests for nil "description" element
     */
    boolean isNilDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Nils the "description" element
     */
    void setNilDescription();
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "emptyStringAllowed" element
     */
    boolean getEmptyStringAllowed();
    
    /**
     * Gets (as xml) the "emptyStringAllowed" element
     */
    org.apache.xmlbeans.XmlBoolean xgetEmptyStringAllowed();
    
    /**
     * Tests for nil "emptyStringAllowed" element
     */
    boolean isNilEmptyStringAllowed();
    
    /**
     * True if has "emptyStringAllowed" element
     */
    boolean isSetEmptyStringAllowed();
    
    /**
     * Sets the "emptyStringAllowed" element
     */
    void setEmptyStringAllowed(boolean emptyStringAllowed);
    
    /**
     * Sets (as xml) the "emptyStringAllowed" element
     */
    void xsetEmptyStringAllowed(org.apache.xmlbeans.XmlBoolean emptyStringAllowed);
    
    /**
     * Nils the "emptyStringAllowed" element
     */
    void setNilEmptyStringAllowed();
    
    /**
     * Unsets the "emptyStringAllowed" element
     */
    void unsetEmptyStringAllowed();
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Tests for nil "name" element
     */
    boolean isNilName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Nils the "name" element
     */
    void setNilName();
    
    /**
     * Gets the "value" element
     */
    java.lang.String getValue();
    
    /**
     * Gets (as xml) the "value" element
     */
    org.apache.xmlbeans.XmlString xgetValue();
    
    /**
     * Tests for nil "value" element
     */
    boolean isNilValue();
    
    /**
     * Sets the "value" element
     */
    void setValue(java.lang.String value);
    
    /**
     * Sets (as xml) the "value" element
     */
    void xsetValue(org.apache.xmlbeans.XmlString value);
    
    /**
     * Nils the "value" element
     */
    void setNilValue();
    
    /**
     * Gets the "CustomParameter" element
     */
    amdocs.iam.pd.general.commonimpl.CustomParameter getCustomParameter();
    
    /**
     * Tests for nil "CustomParameter" element
     */
    boolean isNilCustomParameter();
    
    /**
     * True if has "CustomParameter" element
     */
    boolean isSetCustomParameter();
    
    /**
     * Sets the "CustomParameter" element
     */
    void setCustomParameter(amdocs.iam.pd.general.commonimpl.CustomParameter customParameter);
    
    /**
     * Appends and returns a new empty "CustomParameter" element
     */
    amdocs.iam.pd.general.commonimpl.CustomParameter addNewCustomParameter();
    
    /**
     * Nils the "CustomParameter" element
     */
    void setNilCustomParameter();
    
    /**
     * Unsets the "CustomParameter" element
     */
    void unsetCustomParameter();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.general.common.Parameter newInstance() {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.general.common.Parameter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.general.common.Parameter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.general.common.Parameter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.general.common.Parameter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.general.common.Parameter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.general.common.Parameter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.general.common.Parameter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.general.common.Parameter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.general.common.Parameter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.general.common.Parameter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.general.common.Parameter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.general.common.Parameter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.general.common.Parameter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.general.common.Parameter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.general.common.Parameter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.general.common.Parameter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.general.common.Parameter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.general.common.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
