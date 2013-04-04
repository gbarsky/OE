/*
 * XML Type:  ColumnValues
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput;


/**
 * An XML ColumnValues(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput).
 *
 * This is a complex type.
 */
public interface ColumnValues extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ColumnValues.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("columnvalues84a7type");
    
    /**
     * Gets array of all "columnValue" elements
     */
    java.lang.String[] getColumnValueArray();
    
    /**
     * Gets ith "columnValue" element
     */
    java.lang.String getColumnValueArray(int i);
    
    /**
     * Gets (as xml) array of all "columnValue" elements
     */
    org.apache.xmlbeans.XmlString[] xgetColumnValueArray();
    
    /**
     * Gets (as xml) ith "columnValue" element
     */
    org.apache.xmlbeans.XmlString xgetColumnValueArray(int i);
    
    /**
     * Returns number of "columnValue" element
     */
    int sizeOfColumnValueArray();
    
    /**
     * Sets array of all "columnValue" element
     */
    void setColumnValueArray(java.lang.String[] columnValueArray);
    
    /**
     * Sets ith "columnValue" element
     */
    void setColumnValueArray(int i, java.lang.String columnValue);
    
    /**
     * Sets (as xml) array of all "columnValue" element
     */
    void xsetColumnValueArray(org.apache.xmlbeans.XmlString[] columnValueArray);
    
    /**
     * Sets (as xml) ith "columnValue" element
     */
    void xsetColumnValueArray(int i, org.apache.xmlbeans.XmlString columnValue);
    
    /**
     * Inserts the value as the ith "columnValue" element
     */
    void insertColumnValue(int i, java.lang.String columnValue);
    
    /**
     * Appends the value as the last "columnValue" element
     */
    void addColumnValue(java.lang.String columnValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "columnValue" element
     */
    org.apache.xmlbeans.XmlString insertNewColumnValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "columnValue" element
     */
    org.apache.xmlbeans.XmlString addNewColumnValue();
    
    /**
     * Removes the ith "columnValue" element
     */
    void removeColumnValue(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues newInstance() {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
