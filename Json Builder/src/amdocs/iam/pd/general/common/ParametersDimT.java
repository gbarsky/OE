/*
 * XML Type:  ParametersDim_t
 * Namespace: http://amdocs/iam/pd/general/Common
 * Java type: amdocs.iam.pd.general.common.ParametersDimT
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.general.common;


/**
 * An XML ParametersDim_t(@http://amdocs/iam/pd/general/Common).
 *
 * This is a complex type.
 */
public interface ParametersDimT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParametersDimT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("parametersdimt9c87type");
    
    /**
     * Gets array of all "Parameter" elements
     */
    amdocs.iam.pd.general.common.ParametersDimT.Parameter[] getParameterArray();
    
    /**
     * Gets ith "Parameter" element
     */
    amdocs.iam.pd.general.common.ParametersDimT.Parameter getParameterArray(int i);
    
    /**
     * Returns number of "Parameter" element
     */
    int sizeOfParameterArray();
    
    /**
     * Sets array of all "Parameter" element
     */
    void setParameterArray(amdocs.iam.pd.general.common.ParametersDimT.Parameter[] parameterArray);
    
    /**
     * Sets ith "Parameter" element
     */
    void setParameterArray(int i, amdocs.iam.pd.general.common.ParametersDimT.Parameter parameter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
     */
    amdocs.iam.pd.general.common.ParametersDimT.Parameter insertNewParameter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Parameter" element
     */
    amdocs.iam.pd.general.common.ParametersDimT.Parameter addNewParameter();
    
    /**
     * Removes the ith "Parameter" element
     */
    void removeParameter(int i);
    
    /**
     * An XML Parameter(@).
     *
     * This is a complex type.
     */
    public interface Parameter extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parameter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("parametere8ccelemtype");
        
        /**
         * Gets array of all "Dimension" elements
         */
        amdocs.iam.pd.general.common.ParametersDimT.Parameter.Dimension[] getDimensionArray();
        
        /**
         * Gets ith "Dimension" element
         */
        amdocs.iam.pd.general.common.ParametersDimT.Parameter.Dimension getDimensionArray(int i);
        
        /**
         * Returns number of "Dimension" element
         */
        int sizeOfDimensionArray();
        
        /**
         * Sets array of all "Dimension" element
         */
        void setDimensionArray(amdocs.iam.pd.general.common.ParametersDimT.Parameter.Dimension[] dimensionArray);
        
        /**
         * Sets ith "Dimension" element
         */
        void setDimensionArray(int i, amdocs.iam.pd.general.common.ParametersDimT.Parameter.Dimension dimension);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
         */
        amdocs.iam.pd.general.common.ParametersDimT.Parameter.Dimension insertNewDimension(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Dimension" element
         */
        amdocs.iam.pd.general.common.ParametersDimT.Parameter.Dimension addNewDimension();
        
        /**
         * Removes the ith "Dimension" element
         */
        void removeDimension(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "value" attribute
         */
        java.lang.String getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        org.apache.xmlbeans.XmlString xgetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(java.lang.String value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(org.apache.xmlbeans.XmlString value);
        
        /**
         * An XML Dimension(@).
         *
         * This is an atomic type that is a restriction of amdocs.iam.pd.general.common.ParametersDimT$Parameter$Dimension.
         */
        public interface Dimension extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dimension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE25B6F354D94647D4D1C46716B4ED6D5").resolveHandle("dimensioncc0eelemtype");
            
            /**
             * Gets the "name" attribute
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" attribute
             */
            org.apache.xmlbeans.XmlString xgetName();
            
            /**
             * Sets the "name" attribute
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "name" attribute
             */
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Gets the "index" attribute
             */
            int getIndex();
            
            /**
             * Gets (as xml) the "index" attribute
             */
            org.apache.xmlbeans.XmlInt xgetIndex();
            
            /**
             * Sets the "index" attribute
             */
            void setIndex(int index);
            
            /**
             * Sets (as xml) the "index" attribute
             */
            void xsetIndex(org.apache.xmlbeans.XmlInt index);
            
            /**
             * Gets the "value" attribute
             */
            java.lang.String getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            org.apache.xmlbeans.XmlString xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(java.lang.String value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(org.apache.xmlbeans.XmlString value);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static amdocs.iam.pd.general.common.ParametersDimT.Parameter.Dimension newInstance() {
                  return (amdocs.iam.pd.general.common.ParametersDimT.Parameter.Dimension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static amdocs.iam.pd.general.common.ParametersDimT.Parameter.Dimension newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (amdocs.iam.pd.general.common.ParametersDimT.Parameter.Dimension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static amdocs.iam.pd.general.common.ParametersDimT.Parameter newInstance() {
              return (amdocs.iam.pd.general.common.ParametersDimT.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static amdocs.iam.pd.general.common.ParametersDimT.Parameter newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (amdocs.iam.pd.general.common.ParametersDimT.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static amdocs.iam.pd.general.common.ParametersDimT newInstance() {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static amdocs.iam.pd.general.common.ParametersDimT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static amdocs.iam.pd.general.common.ParametersDimT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static amdocs.iam.pd.general.common.ParametersDimT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.general.common.ParametersDimT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static amdocs.iam.pd.general.common.ParametersDimT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (amdocs.iam.pd.general.common.ParametersDimT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
