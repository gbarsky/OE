/*
 * XML Type:  ChargeAttributes
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutput;


/**
 * An XML ChargeAttributes(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput).
 *
 * This is a complex type.
 */
public interface ChargeAttributes extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ChargeAttributes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("chargeattributes4006type");
    
    /**
     * Gets array of all "discount" elements
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge[] getDiscountArray();
    
    /**
     * Gets ith "discount" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge getDiscountArray(int i);
    
    /**
     * Returns number of "discount" element
     */
    int sizeOfDiscountArray();
    
    /**
     * Sets array of all "discount" element
     */
    void setDiscountArray(amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge[] discountArray);
    
    /**
     * Sets ith "discount" element
     */
    void setDiscountArray(int i, amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge discount);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "discount" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge insertNewDiscount(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "discount" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge addNewDiscount();
    
    /**
     * Removes the ith "discount" element
     */
    void removeDiscount(int i);
    
    /**
     * Gets array of all "regular" elements
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge[] getRegularArray();
    
    /**
     * Gets ith "regular" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge getRegularArray(int i);
    
    /**
     * Returns number of "regular" element
     */
    int sizeOfRegularArray();
    
    /**
     * Sets array of all "regular" element
     */
    void setRegularArray(amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge[] regularArray);
    
    /**
     * Sets ith "regular" element
     */
    void setRegularArray(int i, amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge regular);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "regular" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge insertNewRegular(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "regular" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge addNewRegular();
    
    /**
     * Removes the ith "regular" element
     */
    void removeRegular(int i);
    
    /**
     * Gets the "chargeFrequency" element
     */
    double getChargeFrequency();
    
    /**
     * Gets (as xml) the "chargeFrequency" element
     */
    org.apache.xmlbeans.XmlDouble xgetChargeFrequency();
    
    /**
     * True if has "chargeFrequency" element
     */
    boolean isSetChargeFrequency();
    
    /**
     * Sets the "chargeFrequency" element
     */
    void setChargeFrequency(double chargeFrequency);
    
    /**
     * Sets (as xml) the "chargeFrequency" element
     */
    void xsetChargeFrequency(org.apache.xmlbeans.XmlDouble chargeFrequency);
    
    /**
     * Unsets the "chargeFrequency" element
     */
    void unsetChargeFrequency();
    
    /**
     * Gets the "chargesCustom" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom getChargesCustom();
    
    /**
     * True if has "chargesCustom" element
     */
    boolean isSetChargesCustom();
    
    /**
     * Sets the "chargesCustom" element
     */
    void setChargesCustom(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom chargesCustom);
    
    /**
     * Appends and returns a new empty "chargesCustom" element
     */
    amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom addNewChargesCustom();
    
    /**
     * Unsets the "chargesCustom" element
     */
    void unsetChargesCustom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes newInstance() {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
