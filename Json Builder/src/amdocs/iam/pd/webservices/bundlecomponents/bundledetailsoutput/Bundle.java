/*
 * XML Type:  Bundle
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsOutput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput;


/**
 * An XML Bundle(@http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsOutput).
 *
 * This is a complex type.
 */
public interface Bundle extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bundle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("bundled1fdtype");
    
    /**
     * Gets the "bundleCode" element
     */
    java.lang.String getBundleCode();
    
    /**
     * Gets (as xml) the "bundleCode" element
     */
    org.apache.xmlbeans.XmlString xgetBundleCode();
    
    /**
     * Sets the "bundleCode" element
     */
    void setBundleCode(java.lang.String bundleCode);
    
    /**
     * Sets (as xml) the "bundleCode" element
     */
    void xsetBundleCode(org.apache.xmlbeans.XmlString bundleCode);
    
    /**
     * Gets the "bundleName" element
     */
    java.lang.String getBundleName();
    
    /**
     * Gets (as xml) the "bundleName" element
     */
    org.apache.xmlbeans.XmlString xgetBundleName();
    
    /**
     * Sets the "bundleName" element
     */
    void setBundleName(java.lang.String bundleName);
    
    /**
     * Sets (as xml) the "bundleName" element
     */
    void xsetBundleName(org.apache.xmlbeans.XmlString bundleName);
    
    /**
     * Gets the "bundleDescription" element
     */
    java.lang.String getBundleDescription();
    
    /**
     * Gets (as xml) the "bundleDescription" element
     */
    org.apache.xmlbeans.XmlString xgetBundleDescription();
    
    /**
     * Sets the "bundleDescription" element
     */
    void setBundleDescription(java.lang.String bundleDescription);
    
    /**
     * Sets (as xml) the "bundleDescription" element
     */
    void xsetBundleDescription(org.apache.xmlbeans.XmlString bundleDescription);
    
    /**
     * Gets the "effectiveDate" element
     */
    java.lang.String getEffectiveDate();
    
    /**
     * Gets (as xml) the "effectiveDate" element
     */
    org.apache.xmlbeans.XmlString xgetEffectiveDate();
    
    /**
     * Sets the "effectiveDate" element
     */
    void setEffectiveDate(java.lang.String effectiveDate);
    
    /**
     * Sets (as xml) the "effectiveDate" element
     */
    void xsetEffectiveDate(org.apache.xmlbeans.XmlString effectiveDate);
    
    /**
     * Gets the "expirationDate" element
     */
    java.lang.String getExpirationDate();
    
    /**
     * Gets (as xml) the "expirationDate" element
     */
    org.apache.xmlbeans.XmlString xgetExpirationDate();
    
    /**
     * Sets the "expirationDate" element
     */
    void setExpirationDate(java.lang.String expirationDate);
    
    /**
     * Sets (as xml) the "expirationDate" element
     */
    void xsetExpirationDate(org.apache.xmlbeans.XmlString expirationDate);
    
    /**
     * Gets the "minComponentsNum" element
     */
    java.lang.String getMinComponentsNum();
    
    /**
     * Gets (as xml) the "minComponentsNum" element
     */
    amdocs.iam.pd.general.common.Long xgetMinComponentsNum();
    
    /**
     * Sets the "minComponentsNum" element
     */
    void setMinComponentsNum(java.lang.String minComponentsNum);
    
    /**
     * Sets (as xml) the "minComponentsNum" element
     */
    void xsetMinComponentsNum(amdocs.iam.pd.general.common.Long minComponentsNum);
    
    /**
     * Gets the "maxComponentsNum" element
     */
    java.lang.String getMaxComponentsNum();
    
    /**
     * Gets (as xml) the "maxComponentsNum" element
     */
    amdocs.iam.pd.general.common.Long xgetMaxComponentsNum();
    
    /**
     * Sets the "maxComponentsNum" element
     */
    void setMaxComponentsNum(java.lang.String maxComponentsNum);
    
    /**
     * Sets (as xml) the "maxComponentsNum" element
     */
    void xsetMaxComponentsNum(amdocs.iam.pd.general.common.Long maxComponentsNum);
    
    /**
     * Gets the "fixedPackageInd" element
     */
    java.lang.String getFixedPackageInd();
    
    /**
     * Gets (as xml) the "fixedPackageInd" element
     */
    org.apache.xmlbeans.XmlString xgetFixedPackageInd();
    
    /**
     * Sets the "fixedPackageInd" element
     */
    void setFixedPackageInd(java.lang.String fixedPackageInd);
    
    /**
     * Sets (as xml) the "fixedPackageInd" element
     */
    void xsetFixedPackageInd(org.apache.xmlbeans.XmlString fixedPackageInd);
    
    /**
     * Gets the "BundleCustom" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.BundleCustom getBundleCustom();
    
    /**
     * True if has "BundleCustom" element
     */
    boolean isSetBundleCustom();
    
    /**
     * Sets the "BundleCustom" element
     */
    void setBundleCustom(amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.BundleCustom bundleCustom);
    
    /**
     * Appends and returns a new empty "BundleCustom" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.BundleCustom addNewBundleCustom();
    
    /**
     * Unsets the "BundleCustom" element
     */
    void unsetBundleCustom();
    
    /**
     * Gets array of all "Components" elements
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Components[] getComponentsArray();
    
    /**
     * Gets ith "Components" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Components getComponentsArray(int i);
    
    /**
     * Returns number of "Components" element
     */
    int sizeOfComponentsArray();
    
    /**
     * Sets array of all "Components" element
     */
    void setComponentsArray(amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Components[] componentsArray);
    
    /**
     * Sets ith "Components" element
     */
    void setComponentsArray(int i, amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Components components);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Components" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Components insertNewComponents(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Components" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Components addNewComponents();
    
    /**
     * Removes the ith "Components" element
     */
    void removeComponents(int i);
    
    /**
     * Gets array of all "Attributes" elements
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Attributes[] getAttributesArray();
    
    /**
     * Gets ith "Attributes" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Attributes getAttributesArray(int i);
    
    /**
     * Returns number of "Attributes" element
     */
    int sizeOfAttributesArray();
    
    /**
     * Sets array of all "Attributes" element
     */
    void setAttributesArray(amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Attributes[] attributesArray);
    
    /**
     * Sets ith "Attributes" element
     */
    void setAttributesArray(int i, amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Attributes attributes);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attributes" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Attributes insertNewAttributes(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Attributes" element
     */
    amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Attributes addNewAttributes();
    
    /**
     * Removes the ith "Attributes" element
     */
    void removeAttributes(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle newInstance() {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
