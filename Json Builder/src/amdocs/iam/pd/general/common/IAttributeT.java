/*
 * XML Type:  IAttribute_t
 * Namespace: http://amdocs/iam/pd/general/Common
 * Java type: amdocs.iam.pd.general.common.IAttributeT
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.general.common;


/**
 * An XML IAttribute_t(@http://amdocs/iam/pd/general/Common).
 *
 * This is a complex type.
 */
public interface IAttributeT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IAttributeT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("iattributet4c6etype");
    
    /**
     * Gets the "emptyStringAllowed" attribute
     */
    java.lang.String getEmptyStringAllowed();
    
    /**
     * Gets (as xml) the "emptyStringAllowed" attribute
     */
    org.apache.xmlbeans.XmlString xgetEmptyStringAllowed();
    
    /**
     * True if has "emptyStringAllowed" attribute
     */
    boolean isSetEmptyStringAllowed();
    
    /**
     * Sets the "emptyStringAllowed" attribute
     */
    void setEmptyStringAllowed(java.lang.String emptyStringAllowed);
    
    /**
     * Sets (as xml) the "emptyStringAllowed" attribute
     */
    void xsetEmptyStringAllowed(org.apache.xmlbeans.XmlString emptyStringAllowed);
    
    /**
     * Unsets the "emptyStringAllowed" attribute
     */
    void unsetEmptyStringAllowed();
    
    /**
     * Gets the "defaultValue" attribute
     */
    java.lang.String getDefaultValue();
    
    /**
     * Gets (as xml) the "defaultValue" attribute
     */
    org.apache.xmlbeans.XmlString xgetDefaultValue();
    
    /**
     * True if has "defaultValue" attribute
     */
    boolean isSetDefaultValue();
    
    /**
     * Sets the "defaultValue" attribute
     */
    void setDefaultValue(java.lang.String defaultValue);
    
    /**
     * Sets (as xml) the "defaultValue" attribute
     */
    void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue);
    
    /**
     * Unsets the "defaultValue" attribute
     */
    void unsetDefaultValue();
    
    /**
     * Gets the "value" attribute
     */
    java.lang.String getValue();
    
    /**
     * Gets (as xml) the "value" attribute
     */
    org.apache.xmlbeans.XmlString xgetValue();
    
    /**
     * Sets the "value" attribute
     */
    void setValue(java.lang.String value);
    
    /**
     * Sets (as xml) the "value" attribute
     */
    void xsetValue(org.apache.xmlbeans.XmlString value);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "description" attribute
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" attribute
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" attribute
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" attribute
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" attribute
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" attribute
     */
    void unsetDescription();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.general.common.IAttributeT newInstance() {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.general.common.IAttributeT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.general.common.IAttributeT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.general.common.IAttributeT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.general.common.IAttributeT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.general.common.IAttributeT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.general.common.IAttributeT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
