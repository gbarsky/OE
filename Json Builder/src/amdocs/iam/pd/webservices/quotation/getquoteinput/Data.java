/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteInput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteinput;


/**
 * An XML Data(@http://amdocs/iam/pd/webservices/quotation/GetQuoteInput).
 *
 * This is a complex type.
 */
public interface Data extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("data8706type");
    
    /**
     * Gets the "currency" element
     */
    java.lang.String getCurrency();
    
    /**
     * Gets (as xml) the "currency" element
     */
    org.apache.xmlbeans.XmlString xgetCurrency();
    
    /**
     * Sets the "currency" element
     */
    void setCurrency(java.lang.String currency);
    
    /**
     * Sets (as xml) the "currency" element
     */
    void xsetCurrency(org.apache.xmlbeans.XmlString currency);
    
    /**
     * Gets the "activityCode" element
     */
    java.lang.String getActivityCode();
    
    /**
     * Gets (as xml) the "activityCode" element
     */
    org.apache.xmlbeans.XmlString xgetActivityCode();
    
    /**
     * Sets the "activityCode" element
     */
    void setActivityCode(java.lang.String activityCode);
    
    /**
     * Sets (as xml) the "activityCode" element
     */
    void xsetActivityCode(org.apache.xmlbeans.XmlString activityCode);
    
    /**
     * Gets the "language" element
     */
    java.lang.String getLanguage();
    
    /**
     * Gets (as xml) the "language" element
     */
    org.apache.xmlbeans.XmlString xgetLanguage();
    
    /**
     * True if has "language" element
     */
    boolean isSetLanguage();
    
    /**
     * Sets the "language" element
     */
    void setLanguage(java.lang.String language);
    
    /**
     * Sets (as xml) the "language" element
     */
    void xsetLanguage(org.apache.xmlbeans.XmlString language);
    
    /**
     * Unsets the "language" element
     */
    void unsetLanguage();
    
    /**
     * Gets the "omitTax" element
     */
    java.lang.String getOmitTax();
    
    /**
     * Gets (as xml) the "omitTax" element
     */
    org.apache.xmlbeans.XmlString xgetOmitTax();
    
    /**
     * True if has "omitTax" element
     */
    boolean isSetOmitTax();
    
    /**
     * Sets the "omitTax" element
     */
    void setOmitTax(java.lang.String omitTax);
    
    /**
     * Sets (as xml) the "omitTax" element
     */
    void xsetOmitTax(org.apache.xmlbeans.XmlString omitTax);
    
    /**
     * Unsets the "omitTax" element
     */
    void unsetOmitTax();
    
    /**
     * Gets the "customerGlobalParameters" element
     */
    amdocs.iam.pd.general.common.ParametersDimT getCustomerGlobalParameters();
    
    /**
     * True if has "customerGlobalParameters" element
     */
    boolean isSetCustomerGlobalParameters();
    
    /**
     * Sets the "customerGlobalParameters" element
     */
    void setCustomerGlobalParameters(amdocs.iam.pd.general.common.ParametersDimT customerGlobalParameters);
    
    /**
     * Appends and returns a new empty "customerGlobalParameters" element
     */
    amdocs.iam.pd.general.common.ParametersDimT addNewCustomerGlobalParameters();
    
    /**
     * Unsets the "customerGlobalParameters" element
     */
    void unsetCustomerGlobalParameters();
    
    /**
     * Gets the "purchasedProducts" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts getPurchasedProducts();
    
    /**
     * Sets the "purchasedProducts" element
     */
    void setPurchasedProducts(amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts purchasedProducts);
    
    /**
     * Appends and returns a new empty "purchasedProducts" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts addNewPurchasedProducts();
    
    /**
     * Gets the "DataCustom" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom getDataCustom();
    
    /**
     * True if has "DataCustom" element
     */
    boolean isSetDataCustom();
    
    /**
     * Sets the "DataCustom" element
     */
    void setDataCustom(amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom dataCustom);
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom addNewDataCustom();
    
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
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data newInstance() {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.quotation.getquoteinput.Data parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.quotation.getquoteinput.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
