/*
 * XML Type:  DiscountCustom
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutputimpl;


/**
 * An XML DiscountCustom(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl).
 *
 * This is a complex type.
 */
public interface DiscountCustom extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiscountCustom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("discountcustom782dtype");
    
    /**
     * Gets array of all "billingAccountAmounts" elements
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts[] getBillingAccountAmountsArray();
    
    /**
     * Gets ith "billingAccountAmounts" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts getBillingAccountAmountsArray(int i);
    
    /**
     * Returns number of "billingAccountAmounts" element
     */
    int sizeOfBillingAccountAmountsArray();
    
    /**
     * Sets array of all "billingAccountAmounts" element
     */
    void setBillingAccountAmountsArray(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts[] billingAccountAmountsArray);
    
    /**
     * Sets ith "billingAccountAmounts" element
     */
    void setBillingAccountAmountsArray(int i, amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts billingAccountAmounts);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "billingAccountAmounts" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts insertNewBillingAccountAmounts(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "billingAccountAmounts" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts addNewBillingAccountAmounts();
    
    /**
     * Removes the ith "billingAccountAmounts" element
     */
    void removeBillingAccountAmounts(int i);
    
    /**
     * Gets the "totalChargeAmounts" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts getTotalChargeAmounts();
    
    /**
     * Sets the "totalChargeAmounts" element
     */
    void setTotalChargeAmounts(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts totalChargeAmounts);
    
    /**
     * Appends and returns a new empty "totalChargeAmounts" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts addNewTotalChargeAmounts();
    
    /**
     * Gets the "chargeRole" element
     */
    java.lang.String getChargeRole();
    
    /**
     * Gets (as xml) the "chargeRole" element
     */
    org.apache.xmlbeans.XmlString xgetChargeRole();
    
    /**
     * Sets the "chargeRole" element
     */
    void setChargeRole(java.lang.String chargeRole);
    
    /**
     * Sets (as xml) the "chargeRole" element
     */
    void xsetChargeRole(org.apache.xmlbeans.XmlString chargeRole);
    
    /**
     * Gets array of all "dynamicElements" elements
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement[] getDynamicElementsArray();
    
    /**
     * Gets ith "dynamicElements" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement getDynamicElementsArray(int i);
    
    /**
     * Returns number of "dynamicElements" element
     */
    int sizeOfDynamicElementsArray();
    
    /**
     * Sets array of all "dynamicElements" element
     */
    void setDynamicElementsArray(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement[] dynamicElementsArray);
    
    /**
     * Sets ith "dynamicElements" element
     */
    void setDynamicElementsArray(int i, amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement dynamicElements);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dynamicElements" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement insertNewDynamicElements(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dynamicElements" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement addNewDynamicElements();
    
    /**
     * Removes the ith "dynamicElements" element
     */
    void removeDynamicElements(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom newInstance() {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
