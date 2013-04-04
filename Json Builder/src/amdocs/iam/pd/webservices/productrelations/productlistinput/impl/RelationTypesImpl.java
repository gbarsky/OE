/*
 * XML Type:  RelationTypes
 * Namespace: http://amdocs/iam/pd/webservices/productRelations/ProductListInput
 * Java type: amdocs.iam.pd.webservices.productrelations.productlistinput.RelationTypes
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productrelations.productlistinput.impl;
/**
 * An XML RelationTypes(@http://amdocs/iam/pd/webservices/productRelations/ProductListInput).
 *
 * This is a complex type.
 */
public class RelationTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productrelations.productlistinput.RelationTypes
{
    
    public RelationTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONTYPE$0 = 
        new javax.xml.namespace.QName("", "relationType");
    
    
    /**
     * Gets array of all "relationType" elements
     */
    public java.lang.String[] getRelationTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIONTYPE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "relationType" element
     */
    public java.lang.String getRelationTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "relationType" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetRelationTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIONTYPE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "relationType" element
     */
    public org.apache.xmlbeans.XmlString xgetRelationTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "relationType" element
     */
    public int sizeOfRelationTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONTYPE$0);
        }
    }
    
    /**
     * Sets array of all "relationType" element
     */
    public void setRelationTypeArray(java.lang.String[] relationTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relationTypeArray, RELATIONTYPE$0);
        }
    }
    
    /**
     * Sets ith "relationType" element
     */
    public void setRelationTypeArray(int i, java.lang.String relationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(relationType);
        }
    }
    
    /**
     * Sets (as xml) array of all "relationType" element
     */
    public void xsetRelationTypeArray(org.apache.xmlbeans.XmlString[]relationTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relationTypeArray, RELATIONTYPE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "relationType" element
     */
    public void xsetRelationTypeArray(int i, org.apache.xmlbeans.XmlString relationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relationType);
        }
    }
    
    /**
     * Inserts the value as the ith "relationType" element
     */
    public void insertRelationType(int i, java.lang.String relationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RELATIONTYPE$0, i);
            target.setStringValue(relationType);
        }
    }
    
    /**
     * Appends the value as the last "relationType" element
     */
    public void addRelationType(java.lang.String relationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONTYPE$0);
            target.setStringValue(relationType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relationType" element
     */
    public org.apache.xmlbeans.XmlString insertNewRelationType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(RELATIONTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relationType" element
     */
    public org.apache.xmlbeans.XmlString addNewRelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "relationType" element
     */
    public void removeRelationType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONTYPE$0, i);
        }
    }
}
