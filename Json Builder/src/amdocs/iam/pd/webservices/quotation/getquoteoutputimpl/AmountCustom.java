/*
 * XML Type:  AmountCustom
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutputimpl;


/**
 * An XML AmountCustom(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl).
 *
 * This is a complex type.
 */
public interface AmountCustom extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AmountCustom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("amountcustom6604type");
    
    /**
     * Gets the "TaxAmounts" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts getTaxAmounts();
    
    /**
     * Sets the "TaxAmounts" element
     */
    void setTaxAmounts(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts taxAmounts);
    
    /**
     * Appends and returns a new empty "TaxAmounts" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts addNewTaxAmounts();
    
    /**
     * Gets the "AmountsAfterTax" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax getAmountsAfterTax();
    
    /**
     * Sets the "AmountsAfterTax" element
     */
    void setAmountsAfterTax(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax amountsAfterTax);
    
    /**
     * Appends and returns a new empty "AmountsAfterTax" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax addNewAmountsAfterTax();
    
    /**
     * An XML TaxAmounts(@).
     *
     * This is a complex type.
     */
    public interface TaxAmounts extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TaxAmounts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("taxamountsb9e8elemtype");
        
        /**
         * Gets the "totalAmount" element
         */
        double getTotalAmount();
        
        /**
         * Gets (as xml) the "totalAmount" element
         */
        org.apache.xmlbeans.XmlDouble xgetTotalAmount();
        
        /**
         * Sets the "totalAmount" element
         */
        void setTotalAmount(double totalAmount);
        
        /**
         * Sets (as xml) the "totalAmount" element
         */
        void xsetTotalAmount(org.apache.xmlbeans.XmlDouble totalAmount);
        
        /**
         * Gets the "discountAmount" element
         */
        double getDiscountAmount();
        
        /**
         * Gets (as xml) the "discountAmount" element
         */
        org.apache.xmlbeans.XmlDouble xgetDiscountAmount();
        
        /**
         * True if has "discountAmount" element
         */
        boolean isSetDiscountAmount();
        
        /**
         * Sets the "discountAmount" element
         */
        void setDiscountAmount(double discountAmount);
        
        /**
         * Sets (as xml) the "discountAmount" element
         */
        void xsetDiscountAmount(org.apache.xmlbeans.XmlDouble discountAmount);
        
        /**
         * Unsets the "discountAmount" element
         */
        void unsetDiscountAmount();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts newInstance() {
              return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML AmountsAfterTax(@).
     *
     * This is a complex type.
     */
    public interface AmountsAfterTax extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AmountsAfterTax.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("amountsaftertaxc2feelemtype");
        
        /**
         * Gets the "grossAmount" element
         */
        double getGrossAmount();
        
        /**
         * Gets (as xml) the "grossAmount" element
         */
        org.apache.xmlbeans.XmlDouble xgetGrossAmount();
        
        /**
         * Sets the "grossAmount" element
         */
        void setGrossAmount(double grossAmount);
        
        /**
         * Sets (as xml) the "grossAmount" element
         */
        void xsetGrossAmount(org.apache.xmlbeans.XmlDouble grossAmount);
        
        /**
         * Gets the "discountAmount" element
         */
        double getDiscountAmount();
        
        /**
         * Gets (as xml) the "discountAmount" element
         */
        org.apache.xmlbeans.XmlDouble xgetDiscountAmount();
        
        /**
         * True if has "discountAmount" element
         */
        boolean isSetDiscountAmount();
        
        /**
         * Sets the "discountAmount" element
         */
        void setDiscountAmount(double discountAmount);
        
        /**
         * Sets (as xml) the "discountAmount" element
         */
        void xsetDiscountAmount(org.apache.xmlbeans.XmlDouble discountAmount);
        
        /**
         * Unsets the "discountAmount" element
         */
        void unsetDiscountAmount();
        
        /**
         * Gets the "netAmount" element
         */
        double getNetAmount();
        
        /**
         * Gets (as xml) the "netAmount" element
         */
        org.apache.xmlbeans.XmlDouble xgetNetAmount();
        
        /**
         * Sets the "netAmount" element
         */
        void setNetAmount(double netAmount);
        
        /**
         * Sets (as xml) the "netAmount" element
         */
        void xsetNetAmount(org.apache.xmlbeans.XmlDouble netAmount);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax newInstance() {
              return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom newInstance() {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
