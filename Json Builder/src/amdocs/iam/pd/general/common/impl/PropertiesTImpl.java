/*
 * XML Type:  Properties_t
 * Namespace: http://amdocs/iam/pd/general/Common
 * Java type: amdocs.iam.pd.general.common.PropertiesT
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.general.common.impl;
/**
 * An XML Properties_t(@http://amdocs/iam/pd/general/Common).
 *
 * This is a complex type.
 */
public class PropertiesTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.general.common.PropertiesT
{
    
    public PropertiesTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("", "Property");
    
    
    /**
     * Gets array of all "Property" elements
     */
    public amdocs.iam.pd.general.common.PropertiesT.Property[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$0, targetList);
            amdocs.iam.pd.general.common.PropertiesT.Property[] result = new amdocs.iam.pd.general.common.PropertiesT.Property[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Property" element
     */
    public amdocs.iam.pd.general.common.PropertiesT.Property getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.PropertiesT.Property target = null;
            target = (amdocs.iam.pd.general.common.PropertiesT.Property)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$0);
        }
    }
    
    /**
     * Sets array of all "Property" element
     */
    public void setPropertyArray(amdocs.iam.pd.general.common.PropertiesT.Property[] propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$0);
        }
    }
    
    /**
     * Sets ith "Property" element
     */
    public void setPropertyArray(int i, amdocs.iam.pd.general.common.PropertiesT.Property property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.PropertiesT.Property target = null;
            target = (amdocs.iam.pd.general.common.PropertiesT.Property)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Property" element
     */
    public amdocs.iam.pd.general.common.PropertiesT.Property insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.PropertiesT.Property target = null;
            target = (amdocs.iam.pd.general.common.PropertiesT.Property)get_store().insert_element_user(PROPERTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Property" element
     */
    public amdocs.iam.pd.general.common.PropertiesT.Property addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.PropertiesT.Property target = null;
            target = (amdocs.iam.pd.general.common.PropertiesT.Property)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$0, i);
        }
    }
    /**
     * An XML Property(@).
     *
     * This is a complex type.
     */
    public static class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.general.common.PropertiesT.Property
    {
        
        public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIMENSION$0 = 
            new javax.xml.namespace.QName("", "Dimension");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets array of all "Dimension" elements
         */
        public amdocs.iam.pd.general.common.PropertiesT.Property.Dimension[] getDimensionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DIMENSION$0, targetList);
                amdocs.iam.pd.general.common.PropertiesT.Property.Dimension[] result = new amdocs.iam.pd.general.common.PropertiesT.Property.Dimension[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Dimension" element
         */
        public amdocs.iam.pd.general.common.PropertiesT.Property.Dimension getDimensionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.general.common.PropertiesT.Property.Dimension target = null;
                target = (amdocs.iam.pd.general.common.PropertiesT.Property.Dimension)get_store().find_element_user(DIMENSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Dimension" element
         */
        public int sizeOfDimensionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIMENSION$0);
            }
        }
        
        /**
         * Sets array of all "Dimension" element
         */
        public void setDimensionArray(amdocs.iam.pd.general.common.PropertiesT.Property.Dimension[] dimensionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dimensionArray, DIMENSION$0);
            }
        }
        
        /**
         * Sets ith "Dimension" element
         */
        public void setDimensionArray(int i, amdocs.iam.pd.general.common.PropertiesT.Property.Dimension dimension)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.general.common.PropertiesT.Property.Dimension target = null;
                target = (amdocs.iam.pd.general.common.PropertiesT.Property.Dimension)get_store().find_element_user(DIMENSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dimension);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
         */
        public amdocs.iam.pd.general.common.PropertiesT.Property.Dimension insertNewDimension(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.general.common.PropertiesT.Property.Dimension target = null;
                target = (amdocs.iam.pd.general.common.PropertiesT.Property.Dimension)get_store().insert_element_user(DIMENSION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Dimension" element
         */
        public amdocs.iam.pd.general.common.PropertiesT.Property.Dimension addNewDimension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.general.common.PropertiesT.Property.Dimension target = null;
                target = (amdocs.iam.pd.general.common.PropertiesT.Property.Dimension)get_store().add_element_user(DIMENSION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Dimension" element
         */
        public void removeDimension(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIMENSION$0, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$4);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$4);
                }
                target.set(value);
            }
        }
        /**
         * An XML Dimension(@).
         *
         * This is an atomic type that is a restriction of amdocs.iam.pd.general.common.PropertiesT$Property$Dimension.
         */
        public static class DimensionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements amdocs.iam.pd.general.common.PropertiesT.Property.Dimension
        {
            
            public DimensionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected DimensionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName NAME$0 = 
                new javax.xml.namespace.QName("", "name");
            private static final javax.xml.namespace.QName INDEX$2 = 
                new javax.xml.namespace.QName("", "index");
            private static final javax.xml.namespace.QName VALUE$4 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "name" attribute
             */
            public java.lang.String getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "name" attribute
             */
            public org.apache.xmlbeans.XmlString xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                    return target;
                }
            }
            
            /**
             * Sets the "name" attribute
             */
            public void setName(java.lang.String name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                    }
                    target.setStringValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "name" attribute
             */
            public void xsetName(org.apache.xmlbeans.XmlString name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                    }
                    target.set(name);
                }
            }
            
            /**
             * Gets the "index" attribute
             */
            public int getIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEX$2);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "index" attribute
             */
            public org.apache.xmlbeans.XmlInt xgetIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(INDEX$2);
                    return target;
                }
            }
            
            /**
             * Sets the "index" attribute
             */
            public void setIndex(int index)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEX$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDEX$2);
                    }
                    target.setIntValue(index);
                }
            }
            
            /**
             * Sets (as xml) the "index" attribute
             */
            public void xsetIndex(org.apache.xmlbeans.XmlInt index)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(INDEX$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(INDEX$2);
                    }
                    target.set(index);
                }
            }
            
            /**
             * Gets the "value" attribute
             */
            public java.lang.String getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public org.apache.xmlbeans.XmlString xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(java.lang.String value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$4);
                    }
                    target.setStringValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(org.apache.xmlbeans.XmlString value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$4);
                    }
                    target.set(value);
                }
            }
        }
    }
}
