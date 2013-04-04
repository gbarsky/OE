/*
 * An XML document type.
 * Localname: GetReferenceAttributeValues
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices;


/**
 * A document containing one GetReferenceAttributeValues(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public interface GetReferenceAttributeValuesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetReferenceAttributeValuesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("getreferenceattributevaluesf523doctype");
    
    /**
     * Gets the "GetReferenceAttributeValues" element
     */
    amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues getGetReferenceAttributeValues();
    
    /**
     * Sets the "GetReferenceAttributeValues" element
     */
    void setGetReferenceAttributeValues(amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues getReferenceAttributeValues);
    
    /**
     * Appends and returns a new empty "GetReferenceAttributeValues" element
     */
    amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues addNewGetReferenceAttributeValues();
    
    /**
     * An XML GetReferenceAttributeValues(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public interface GetReferenceAttributeValues extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetReferenceAttributeValues.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("getreferenceattributevalues1deeelemtype");
        
        /**
         * Gets the "ROOT" element
         */
        amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput getROOT();
        
        /**
         * Sets the "ROOT" element
         */
        void setROOT(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput root);
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput addNewROOT();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues newInstance() {
              return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument newInstance() {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
