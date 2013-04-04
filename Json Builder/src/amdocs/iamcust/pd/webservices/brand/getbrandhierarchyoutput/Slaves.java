/*
 * XML Type:  Slaves
 * Namespace: http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput
 * Java type: amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput;


/**
 * An XML Slaves(@http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput).
 *
 * This is a complex type.
 */
public interface Slaves extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Slaves.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("slaves9b9dtype");
    
    /**
     * Gets array of all "optionalSlave" elements
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave[] getOptionalSlaveArray();
    
    /**
     * Gets ith "optionalSlave" element
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave getOptionalSlaveArray(int i);
    
    /**
     * Returns number of "optionalSlave" element
     */
    int sizeOfOptionalSlaveArray();
    
    /**
     * Sets array of all "optionalSlave" element
     */
    void setOptionalSlaveArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave[] optionalSlaveArray);
    
    /**
     * Sets ith "optionalSlave" element
     */
    void setOptionalSlaveArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave optionalSlave);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "optionalSlave" element
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave insertNewOptionalSlave(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "optionalSlave" element
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave addNewOptionalSlave();
    
    /**
     * Removes the ith "optionalSlave" element
     */
    void removeOptionalSlave(int i);
    
    /**
     * Gets array of all "mandatorySlave" elements
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave[] getMandatorySlaveArray();
    
    /**
     * Gets ith "mandatorySlave" element
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave getMandatorySlaveArray(int i);
    
    /**
     * Returns number of "mandatorySlave" element
     */
    int sizeOfMandatorySlaveArray();
    
    /**
     * Sets array of all "mandatorySlave" element
     */
    void setMandatorySlaveArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave[] mandatorySlaveArray);
    
    /**
     * Sets ith "mandatorySlave" element
     */
    void setMandatorySlaveArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave mandatorySlave);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mandatorySlave" element
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave insertNewMandatorySlave(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mandatorySlave" element
     */
    amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave addNewMandatorySlave();
    
    /**
     * Removes the ith "mandatorySlave" element
     */
    void removeMandatorySlave(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves newInstance() {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
