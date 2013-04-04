/*
 * XML Type:  PackageElement
 * Namespace: http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListOutput
 * Java type: amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput;


/**
 * An XML PackageElement(@http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListOutput).
 *
 * This is a complex type.
 */
public interface PackageElement extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PackageElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("packageelementb2f9type");
    
    /**
     * Gets the "packageCode" element
     */
    java.lang.String getPackageCode();
    
    /**
     * Gets (as xml) the "packageCode" element
     */
    org.apache.xmlbeans.XmlString xgetPackageCode();
    
    /**
     * Sets the "packageCode" element
     */
    void setPackageCode(java.lang.String packageCode);
    
    /**
     * Sets (as xml) the "packageCode" element
     */
    void xsetPackageCode(org.apache.xmlbeans.XmlString packageCode);
    
    /**
     * Gets the "packageName" element
     */
    java.lang.String getPackageName();
    
    /**
     * Gets (as xml) the "packageName" element
     */
    org.apache.xmlbeans.XmlString xgetPackageName();
    
    /**
     * Sets the "packageName" element
     */
    void setPackageName(java.lang.String packageName);
    
    /**
     * Sets (as xml) the "packageName" element
     */
    void xsetPackageName(org.apache.xmlbeans.XmlString packageName);
    
    /**
     * Gets the "packageDesc" element
     */
    java.lang.String getPackageDesc();
    
    /**
     * Gets (as xml) the "packageDesc" element
     */
    org.apache.xmlbeans.XmlString xgetPackageDesc();
    
    /**
     * Sets the "packageDesc" element
     */
    void setPackageDesc(java.lang.String packageDesc);
    
    /**
     * Sets (as xml) the "packageDesc" element
     */
    void xsetPackageDesc(org.apache.xmlbeans.XmlString packageDesc);
    
    /**
     * Gets the "percentageInd" element
     */
    java.lang.String getPercentageInd();
    
    /**
     * Gets (as xml) the "percentageInd" element
     */
    org.apache.xmlbeans.XmlString xgetPercentageInd();
    
    /**
     * Sets the "percentageInd" element
     */
    void setPercentageInd(java.lang.String percentageInd);
    
    /**
     * Sets (as xml) the "percentageInd" element
     */
    void xsetPercentageInd(org.apache.xmlbeans.XmlString percentageInd);
    
    /**
     * Gets the "quantity" element
     */
    double getQuantity();
    
    /**
     * Gets (as xml) the "quantity" element
     */
    org.apache.xmlbeans.XmlDouble xgetQuantity();
    
    /**
     * Sets the "quantity" element
     */
    void setQuantity(double quantity);
    
    /**
     * Sets (as xml) the "quantity" element
     */
    void xsetQuantity(org.apache.xmlbeans.XmlDouble quantity);
    
    /**
     * Gets the "minQuantity" element
     */
    double getMinQuantity();
    
    /**
     * Gets (as xml) the "minQuantity" element
     */
    org.apache.xmlbeans.XmlDouble xgetMinQuantity();
    
    /**
     * Sets the "minQuantity" element
     */
    void setMinQuantity(double minQuantity);
    
    /**
     * Sets (as xml) the "minQuantity" element
     */
    void xsetMinQuantity(org.apache.xmlbeans.XmlDouble minQuantity);
    
    /**
     * Gets the "maxQuantity" element
     */
    double getMaxQuantity();
    
    /**
     * Gets (as xml) the "maxQuantity" element
     */
    org.apache.xmlbeans.XmlDouble xgetMaxQuantity();
    
    /**
     * Sets the "maxQuantity" element
     */
    void setMaxQuantity(double maxQuantity);
    
    /**
     * Sets (as xml) the "maxQuantity" element
     */
    void xsetMaxQuantity(org.apache.xmlbeans.XmlDouble maxQuantity);
    
    /**
     * Gets the "PackageElementCustom" element
     */
    amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom getPackageElementCustom();
    
    /**
     * True if has "PackageElementCustom" element
     */
    boolean isSetPackageElementCustom();
    
    /**
     * Sets the "PackageElementCustom" element
     */
    void setPackageElementCustom(amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom packageElementCustom);
    
    /**
     * Appends and returns a new empty "PackageElementCustom" element
     */
    amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom addNewPackageElementCustom();
    
    /**
     * Unsets the "PackageElementCustom" element
     */
    void unsetPackageElementCustom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement newInstance() {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
