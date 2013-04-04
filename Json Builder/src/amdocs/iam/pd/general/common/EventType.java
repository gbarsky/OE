/*
 * XML Type:  EventType
 * Namespace: http://amdocs/iam/pd/general/Common
 * Java type: amdocs.iam.pd.general.common.EventType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.general.common;


/**
 * An XML EventType(@http://amdocs/iam/pd/general/Common).
 *
 * This is a complex type.
 */
public interface EventType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("eventtype1788type");
    
    /**
     * Gets the "Type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "Type" element
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * Sets the "Type" element
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "Type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Gets the "ID" element
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" element
     */
    org.apache.xmlbeans.XmlString xgetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.apache.xmlbeans.XmlString id);
    
    /**
     * Gets the "CallerID" element
     */
    java.lang.String getCallerID();
    
    /**
     * Gets (as xml) the "CallerID" element
     */
    org.apache.xmlbeans.XmlString xgetCallerID();
    
    /**
     * True if has "CallerID" element
     */
    boolean isSetCallerID();
    
    /**
     * Sets the "CallerID" element
     */
    void setCallerID(java.lang.String callerID);
    
    /**
     * Sets (as xml) the "CallerID" element
     */
    void xsetCallerID(org.apache.xmlbeans.XmlString callerID);
    
    /**
     * Unsets the "CallerID" element
     */
    void unsetCallerID();
    
    /**
     * Gets the "CorrelationID" element
     */
    java.lang.String getCorrelationID();
    
    /**
     * Gets (as xml) the "CorrelationID" element
     */
    org.apache.xmlbeans.XmlString xgetCorrelationID();
    
    /**
     * True if has "CorrelationID" element
     */
    boolean isSetCorrelationID();
    
    /**
     * Sets the "CorrelationID" element
     */
    void setCorrelationID(java.lang.String correlationID);
    
    /**
     * Sets (as xml) the "CorrelationID" element
     */
    void xsetCorrelationID(org.apache.xmlbeans.XmlString correlationID);
    
    /**
     * Unsets the "CorrelationID" element
     */
    void unsetCorrelationID();
    
    /**
     * Gets the "SourceID" element
     */
    java.lang.String getSourceID();
    
    /**
     * Gets (as xml) the "SourceID" element
     */
    org.apache.xmlbeans.XmlString xgetSourceID();
    
    /**
     * True if has "SourceID" element
     */
    boolean isSetSourceID();
    
    /**
     * Sets the "SourceID" element
     */
    void setSourceID(java.lang.String sourceID);
    
    /**
     * Sets (as xml) the "SourceID" element
     */
    void xsetSourceID(org.apache.xmlbeans.XmlString sourceID);
    
    /**
     * Unsets the "SourceID" element
     */
    void unsetSourceID();
    
    /**
     * Gets the "OriginalAppl" element
     */
    java.lang.String getOriginalAppl();
    
    /**
     * Gets (as xml) the "OriginalAppl" element
     */
    org.apache.xmlbeans.XmlString xgetOriginalAppl();
    
    /**
     * True if has "OriginalAppl" element
     */
    boolean isSetOriginalAppl();
    
    /**
     * Sets the "OriginalAppl" element
     */
    void setOriginalAppl(java.lang.String originalAppl);
    
    /**
     * Sets (as xml) the "OriginalAppl" element
     */
    void xsetOriginalAppl(org.apache.xmlbeans.XmlString originalAppl);
    
    /**
     * Unsets the "OriginalAppl" element
     */
    void unsetOriginalAppl();
    
    /**
     * Gets the "OriginalPubID" element
     */
    java.lang.String getOriginalPubID();
    
    /**
     * Gets (as xml) the "OriginalPubID" element
     */
    org.apache.xmlbeans.XmlString xgetOriginalPubID();
    
    /**
     * True if has "OriginalPubID" element
     */
    boolean isSetOriginalPubID();
    
    /**
     * Sets the "OriginalPubID" element
     */
    void setOriginalPubID(java.lang.String originalPubID);
    
    /**
     * Sets (as xml) the "OriginalPubID" element
     */
    void xsetOriginalPubID(org.apache.xmlbeans.XmlString originalPubID);
    
    /**
     * Unsets the "OriginalPubID" element
     */
    void unsetOriginalPubID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.general.common.EventType newInstance() {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.general.common.EventType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.general.common.EventType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.general.common.EventType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.general.common.EventType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.general.common.EventType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.general.common.EventType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.general.common.EventType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.general.common.EventType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.general.common.EventType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.general.common.EventType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.general.common.EventType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.general.common.EventType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.general.common.EventType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.general.common.EventType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.general.common.EventType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.general.common.EventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.general.common.EventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.general.common.EventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
