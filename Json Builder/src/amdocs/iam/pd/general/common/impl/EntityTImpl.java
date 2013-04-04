/*
 * XML Type:  Entity_t
 * Namespace: http://amdocs/iam/pd/general/Common
 * Java type: amdocs.iam.pd.general.common.EntityT
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.general.common.impl;
/**
 * An XML Entity_t(@http://amdocs/iam/pd/general/Common).
 *
 * This is a complex type.
 */
public class EntityTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.general.common.EntityT
{
    
    public EntityTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTES$0 = 
        new javax.xml.namespace.QName("", "Attributes");
    
    
    /**
     * Gets the "Attributes" element
     */
    public amdocs.iam.pd.general.common.EntityT.Attributes getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.EntityT.Attributes target = null;
            target = (amdocs.iam.pd.general.common.EntityT.Attributes)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$0) != 0;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(amdocs.iam.pd.general.common.EntityT.Attributes attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.EntityT.Attributes target = null;
            target = (amdocs.iam.pd.general.common.EntityT.Attributes)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.EntityT.Attributes)get_store().add_element_user(ATTRIBUTES$0);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public amdocs.iam.pd.general.common.EntityT.Attributes addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.EntityT.Attributes target = null;
            target = (amdocs.iam.pd.general.common.EntityT.Attributes)get_store().add_element_user(ATTRIBUTES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$0, 0);
        }
    }
    /**
     * An XML Attributes(@).
     *
     * This is a complex type.
     */
    public static class AttributesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.general.common.EntityT.Attributes
    {
        
        public AttributesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
            new javax.xml.namespace.QName("", "Attribute");
        
        
        /**
         * Gets array of all "Attribute" elements
         */
        public amdocs.iam.pd.general.common.IAttributeT[] getAttributeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ATTRIBUTE$0, targetList);
                amdocs.iam.pd.general.common.IAttributeT[] result = new amdocs.iam.pd.general.common.IAttributeT[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Attribute" element
         */
        public amdocs.iam.pd.general.common.IAttributeT getAttributeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.general.common.IAttributeT target = null;
                target = (amdocs.iam.pd.general.common.IAttributeT)get_store().find_element_user(ATTRIBUTE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Attribute" element
         */
        public int sizeOfAttributeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTRIBUTE$0);
            }
        }
        
        /**
         * Sets array of all "Attribute" element
         */
        public void setAttributeArray(amdocs.iam.pd.general.common.IAttributeT[] attributeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(attributeArray, ATTRIBUTE$0);
            }
        }
        
        /**
         * Sets ith "Attribute" element
         */
        public void setAttributeArray(int i, amdocs.iam.pd.general.common.IAttributeT attribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.general.common.IAttributeT target = null;
                target = (amdocs.iam.pd.general.common.IAttributeT)get_store().find_element_user(ATTRIBUTE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(attribute);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
         */
        public amdocs.iam.pd.general.common.IAttributeT insertNewAttribute(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.general.common.IAttributeT target = null;
                target = (amdocs.iam.pd.general.common.IAttributeT)get_store().insert_element_user(ATTRIBUTE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Attribute" element
         */
        public amdocs.iam.pd.general.common.IAttributeT addNewAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.general.common.IAttributeT target = null;
                target = (amdocs.iam.pd.general.common.IAttributeT)get_store().add_element_user(ATTRIBUTE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Attribute" element
         */
        public void removeAttribute(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTRIBUTE$0, i);
            }
        }
    }
}
