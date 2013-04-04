/*
 * XML Type:  TelephoneType
 * Namespace: http://amdocs/iam/pd/general/Common
 * Java type: amdocs.iam.pd.general.common.TelephoneType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.general.common;


/**
 * An XML TelephoneType(@http://amdocs/iam/pd/general/Common).
 *
 * This is a complex type.
 */
public interface TelephoneType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TelephoneType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("telephonetype4372type");
    
    /**
     * Gets the "NPA" element
     */
    java.lang.String getNPA();
    
    /**
     * Gets (as xml) the "NPA" element
     */
    amdocs.iam.pd.general.common.TelephoneType.NPA xgetNPA();
    
    /**
     * Sets the "NPA" element
     */
    void setNPA(java.lang.String npa);
    
    /**
     * Sets (as xml) the "NPA" element
     */
    void xsetNPA(amdocs.iam.pd.general.common.TelephoneType.NPA npa);
    
    /**
     * Gets the "COP" element
     */
    java.lang.String getCOP();
    
    /**
     * Gets (as xml) the "COP" element
     */
    amdocs.iam.pd.general.common.TelephoneType.COP xgetCOP();
    
    /**
     * Sets the "COP" element
     */
    void setCOP(java.lang.String cop);
    
    /**
     * Sets (as xml) the "COP" element
     */
    void xsetCOP(amdocs.iam.pd.general.common.TelephoneType.COP cop);
    
    /**
     * Gets the "LINE" element
     */
    java.lang.String getLINE();
    
    /**
     * Gets (as xml) the "LINE" element
     */
    amdocs.iam.pd.general.common.TelephoneType.LINE xgetLINE();
    
    /**
     * Sets the "LINE" element
     */
    void setLINE(java.lang.String line);
    
    /**
     * Sets (as xml) the "LINE" element
     */
    void xsetLINE(amdocs.iam.pd.general.common.TelephoneType.LINE line);
    
    /**
     * Gets the "FormatedPhone" element
     */
    java.lang.String getFormatedPhone();
    
    /**
     * Gets (as xml) the "FormatedPhone" element
     */
    org.apache.xmlbeans.XmlString xgetFormatedPhone();
    
    /**
     * True if has "FormatedPhone" element
     */
    boolean isSetFormatedPhone();
    
    /**
     * Sets the "FormatedPhone" element
     */
    void setFormatedPhone(java.lang.String formatedPhone);
    
    /**
     * Sets (as xml) the "FormatedPhone" element
     */
    void xsetFormatedPhone(org.apache.xmlbeans.XmlString formatedPhone);
    
    /**
     * Unsets the "FormatedPhone" element
     */
    void unsetFormatedPhone();
    
    /**
     * An XML NPA(@).
     *
     * This is an atomic type that is a restriction of amdocs.iam.pd.general.common.TelephoneType$NPA.
     */
    public interface NPA extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NPA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("npa632delemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static amdocs.iam.pd.general.common.TelephoneType.NPA newValue(java.lang.Object obj) {
              return (amdocs.iam.pd.general.common.TelephoneType.NPA) type.newValue( obj ); }
            
            public static amdocs.iam.pd.general.common.TelephoneType.NPA newInstance() {
              return (amdocs.iam.pd.general.common.TelephoneType.NPA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static amdocs.iam.pd.general.common.TelephoneType.NPA newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (amdocs.iam.pd.general.common.TelephoneType.NPA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML COP(@).
     *
     * This is an atomic type that is a restriction of amdocs.iam.pd.general.common.TelephoneType$COP.
     */
    public interface COP extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(COP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("copa152elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static amdocs.iam.pd.general.common.TelephoneType.COP newValue(java.lang.Object obj) {
              return (amdocs.iam.pd.general.common.TelephoneType.COP) type.newValue( obj ); }
            
            public static amdocs.iam.pd.general.common.TelephoneType.COP newInstance() {
              return (amdocs.iam.pd.general.common.TelephoneType.COP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static amdocs.iam.pd.general.common.TelephoneType.COP newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (amdocs.iam.pd.general.common.TelephoneType.COP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML LINE(@).
     *
     * This is an atomic type that is a restriction of amdocs.iam.pd.general.common.TelephoneType$LINE.
     */
    public interface LINE extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LINE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("line31f2elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static amdocs.iam.pd.general.common.TelephoneType.LINE newValue(java.lang.Object obj) {
              return (amdocs.iam.pd.general.common.TelephoneType.LINE) type.newValue( obj ); }
            
            public static amdocs.iam.pd.general.common.TelephoneType.LINE newInstance() {
              return (amdocs.iam.pd.general.common.TelephoneType.LINE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static amdocs.iam.pd.general.common.TelephoneType.LINE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (amdocs.iam.pd.general.common.TelephoneType.LINE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.general.common.TelephoneType newInstance() {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.general.common.TelephoneType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.general.common.TelephoneType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.general.common.TelephoneType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.general.common.TelephoneType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.general.common.TelephoneType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.general.common.TelephoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
