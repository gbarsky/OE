/*
 * XML Type:  AttributeValues
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.impl;
/**
 * An XML AttributeValues(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput).
 *
 * This is a complex type.
 */
public class AttributeValuesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues
{
    
    public AttributeValuesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEVALUE$0 = 
        new javax.xml.namespace.QName("", "attributeValue");
    
    
    /**
     * Gets array of all "attributeValue" elements
     */
    public java.lang.String[] getAttributeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEVALUE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "attributeValue" element
     */
    public java.lang.String getAttributeValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "attributeValue" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetAttributeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEVALUE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "attributeValue" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "attributeValue" element
     */
    public int sizeOfAttributeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEVALUE$0);
        }
    }
    
    /**
     * Sets array of all "attributeValue" element
     */
    public void setAttributeValueArray(java.lang.String[] attributeValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeValueArray, ATTRIBUTEVALUE$0);
        }
    }
    
    /**
     * Sets ith "attributeValue" element
     */
    public void setAttributeValueArray(int i, java.lang.String attributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(attributeValue);
        }
    }
    
    /**
     * Sets (as xml) array of all "attributeValue" element
     */
    public void xsetAttributeValueArray(org.apache.xmlbeans.XmlString[]attributeValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeValueArray, ATTRIBUTEVALUE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "attributeValue" element
     */
    public void xsetAttributeValueArray(int i, org.apache.xmlbeans.XmlString attributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributeValue);
        }
    }
    
    /**
     * Inserts the value as the ith "attributeValue" element
     */
    public void insertAttributeValue(int i, java.lang.String attributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ATTRIBUTEVALUE$0, i);
            target.setStringValue(attributeValue);
        }
    }
    
    /**
     * Appends the value as the last "attributeValue" element
     */
    public void addAttributeValue(java.lang.String attributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEVALUE$0);
            target.setStringValue(attributeValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeValue" element
     */
    public org.apache.xmlbeans.XmlString insertNewAttributeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ATTRIBUTEVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attributeValue" element
     */
    public org.apache.xmlbeans.XmlString addNewAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "attributeValue" element
     */
    public void removeAttributeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEVALUE$0, i);
        }
    }
}
