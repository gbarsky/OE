/*
 * XML Type:  CriteriaAttribute
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput;


/**
 * An XML CriteriaAttribute(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput).
 *
 * This is a complex type.
 */
public interface CriteriaAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CriteriaAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("criteriaattribute4bd7type");
    
    /**
     * Gets the "attributeCode" element
     */
    java.lang.String getAttributeCode();
    
    /**
     * Gets (as xml) the "attributeCode" element
     */
    org.apache.xmlbeans.XmlString xgetAttributeCode();
    
    /**
     * Sets the "attributeCode" element
     */
    void setAttributeCode(java.lang.String attributeCode);
    
    /**
     * Sets (as xml) the "attributeCode" element
     */
    void xsetAttributeCode(org.apache.xmlbeans.XmlString attributeCode);
    
    /**
     * Gets the "attributeValue" element
     */
    java.lang.String getAttributeValue();
    
    /**
     * Gets (as xml) the "attributeValue" element
     */
    org.apache.xmlbeans.XmlString xgetAttributeValue();
    
    /**
     * Sets the "attributeValue" element
     */
    void setAttributeValue(java.lang.String attributeValue);
    
    /**
     * Sets (as xml) the "attributeValue" element
     */
    void xsetAttributeValue(org.apache.xmlbeans.XmlString attributeValue);
    
    /**
     * Gets the "AttributeCustom" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.AttributeCustom getAttributeCustom();
    
    /**
     * True if has "AttributeCustom" element
     */
    boolean isSetAttributeCustom();
    
    /**
     * Sets the "AttributeCustom" element
     */
    void setAttributeCustom(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.AttributeCustom attributeCustom);
    
    /**
     * Appends and returns a new empty "AttributeCustom" element
     */
    amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.AttributeCustom addNewAttributeCustom();
    
    /**
     * Unsets the "AttributeCustom" element
     */
    void unsetAttributeCustom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute newInstance() {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}