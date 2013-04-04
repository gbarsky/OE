/*
 * XML Type:  BillingAccountAmounts
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutputimpl;


/**
 * An XML BillingAccountAmounts(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl).
 *
 * This is a complex type.
 */
public interface BillingAccountAmounts extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BillingAccountAmounts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("billingaccountamounts5332type");
    
    /**
     * Gets the "billingAccountId" element
     */
    java.lang.String getBillingAccountId();
    
    /**
     * Gets (as xml) the "billingAccountId" element
     */
    org.apache.xmlbeans.XmlString xgetBillingAccountId();
    
    /**
     * Sets the "billingAccountId" element
     */
    void setBillingAccountId(java.lang.String billingAccountId);
    
    /**
     * Sets (as xml) the "billingAccountId" element
     */
    void xsetBillingAccountId(org.apache.xmlbeans.XmlString billingAccountId);
    
    /**
     * Gets the "amount" element
     */
    double getAmount();
    
    /**
     * Gets (as xml) the "amount" element
     */
    org.apache.xmlbeans.XmlDouble xgetAmount();
    
    /**
     * Sets the "amount" element
     */
    void setAmount(double amount);
    
    /**
     * Sets (as xml) the "amount" element
     */
    void xsetAmount(org.apache.xmlbeans.XmlDouble amount);
    
    /**
     * Gets the "taxAmount" element
     */
    double getTaxAmount();
    
    /**
     * Gets (as xml) the "taxAmount" element
     */
    org.apache.xmlbeans.XmlDouble xgetTaxAmount();
    
    /**
     * Sets the "taxAmount" element
     */
    void setTaxAmount(double taxAmount);
    
    /**
     * Sets (as xml) the "taxAmount" element
     */
    void xsetTaxAmount(org.apache.xmlbeans.XmlDouble taxAmount);
    
    /**
     * Gets the "taxRate" element
     */
    double getTaxRate();
    
    /**
     * Gets (as xml) the "taxRate" element
     */
    org.apache.xmlbeans.XmlDouble xgetTaxRate();
    
    /**
     * Sets the "taxRate" element
     */
    void setTaxRate(double taxRate);
    
    /**
     * Sets (as xml) the "taxRate" element
     */
    void xsetTaxRate(org.apache.xmlbeans.XmlDouble taxRate);
    
    /**
     * Gets the "amountsAfterTax" element
     */
    double getAmountsAfterTax();
    
    /**
     * Gets (as xml) the "amountsAfterTax" element
     */
    org.apache.xmlbeans.XmlDouble xgetAmountsAfterTax();
    
    /**
     * Sets the "amountsAfterTax" element
     */
    void setAmountsAfterTax(double amountsAfterTax);
    
    /**
     * Sets (as xml) the "amountsAfterTax" element
     */
    void xsetAmountsAfterTax(org.apache.xmlbeans.XmlDouble amountsAfterTax);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts newInstance() {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
