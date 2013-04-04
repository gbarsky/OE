/*
 * XML Type:  Offer
 * Namespace: http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput
 * Java type: amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput;


/**
 * An XML Offer(@http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput).
 *
 * This is a complex type.
 */
public interface Offer extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Offer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("offer18aftype");
    
    /**
     * Gets the "offerCode" element
     */
    java.lang.String getOfferCode();
    
    /**
     * Gets (as xml) the "offerCode" element
     */
    org.apache.xmlbeans.XmlString xgetOfferCode();
    
    /**
     * Sets the "offerCode" element
     */
    void setOfferCode(java.lang.String offerCode);
    
    /**
     * Sets (as xml) the "offerCode" element
     */
    void xsetOfferCode(org.apache.xmlbeans.XmlString offerCode);
    
    /**
     * Gets array of all "lockedParameters" elements
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter[] getLockedParametersArray();
    
    /**
     * Gets ith "lockedParameters" element
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter getLockedParametersArray(int i);
    
    /**
     * Returns number of "lockedParameters" element
     */
    int sizeOfLockedParametersArray();
    
    /**
     * Sets array of all "lockedParameters" element
     */
    void setLockedParametersArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter[] lockedParametersArray);
    
    /**
     * Sets ith "lockedParameters" element
     */
    void setLockedParametersArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter lockedParameters);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lockedParameters" element
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter insertNewLockedParameters(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lockedParameters" element
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter addNewLockedParameters();
    
    /**
     * Removes the ith "lockedParameters" element
     */
    void removeLockedParameters(int i);
    
    /**
     * Gets array of all "linkedParameters" elements
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter[] getLinkedParametersArray();
    
    /**
     * Gets ith "linkedParameters" element
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter getLinkedParametersArray(int i);
    
    /**
     * Returns number of "linkedParameters" element
     */
    int sizeOfLinkedParametersArray();
    
    /**
     * Sets array of all "linkedParameters" element
     */
    void setLinkedParametersArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter[] linkedParametersArray);
    
    /**
     * Sets ith "linkedParameters" element
     */
    void setLinkedParametersArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter linkedParameters);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "linkedParameters" element
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter insertNewLinkedParameters(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "linkedParameters" element
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter addNewLinkedParameters();
    
    /**
     * Removes the ith "linkedParameters" element
     */
    void removeLinkedParameters(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer newInstance() {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
