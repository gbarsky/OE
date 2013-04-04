/*
 * XML Type:  ColumnValues
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.impl;
/**
 * An XML ColumnValues(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput).
 *
 * This is a complex type.
 */
public class ColumnValuesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues
{
    
    public ColumnValuesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNVALUE$0 = 
        new javax.xml.namespace.QName("", "columnValue");
    
    
    /**
     * Gets array of all "columnValue" elements
     */
    public java.lang.String[] getColumnValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLUMNVALUE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "columnValue" element
     */
    public java.lang.String getColumnValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "columnValue" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetColumnValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLUMNVALUE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "columnValue" element
     */
    public org.apache.xmlbeans.XmlString xgetColumnValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "columnValue" element
     */
    public int sizeOfColumnValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNVALUE$0);
        }
    }
    
    /**
     * Sets array of all "columnValue" element
     */
    public void setColumnValueArray(java.lang.String[] columnValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(columnValueArray, COLUMNVALUE$0);
        }
    }
    
    /**
     * Sets ith "columnValue" element
     */
    public void setColumnValueArray(int i, java.lang.String columnValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(columnValue);
        }
    }
    
    /**
     * Sets (as xml) array of all "columnValue" element
     */
    public void xsetColumnValueArray(org.apache.xmlbeans.XmlString[]columnValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(columnValueArray, COLUMNVALUE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "columnValue" element
     */
    public void xsetColumnValueArray(int i, org.apache.xmlbeans.XmlString columnValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(columnValue);
        }
    }
    
    /**
     * Inserts the value as the ith "columnValue" element
     */
    public void insertColumnValue(int i, java.lang.String columnValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COLUMNVALUE$0, i);
            target.setStringValue(columnValue);
        }
    }
    
    /**
     * Appends the value as the last "columnValue" element
     */
    public void addColumnValue(java.lang.String columnValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNVALUE$0);
            target.setStringValue(columnValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "columnValue" element
     */
    public org.apache.xmlbeans.XmlString insertNewColumnValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COLUMNVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "columnValue" element
     */
    public org.apache.xmlbeans.XmlString addNewColumnValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLUMNVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "columnValue" element
     */
    public void removeColumnValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNVALUE$0, i);
        }
    }
}
