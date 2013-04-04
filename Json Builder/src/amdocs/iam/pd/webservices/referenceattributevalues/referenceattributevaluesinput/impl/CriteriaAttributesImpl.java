/*
 * XML Type:  CriteriaAttributes
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.impl;
/**
 * An XML CriteriaAttributes(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput).
 *
 * This is a complex type.
 */
public class CriteriaAttributesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes
{
    
    public CriteriaAttributesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
        new javax.xml.namespace.QName("", "attribute");
    
    
    /**
     * Gets array of all "attribute" elements
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTE$0, targetList);
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute[] result = new amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attribute" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute getAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute)get_store().find_element_user(ATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attribute" element
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
     * Sets array of all "attribute" element
     */
    public void setAttributeArray(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute[] attributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$0);
        }
    }
    
    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute)get_store().find_element_user(ATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute insertNewAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute)get_store().insert_element_user(ATTRIBUTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttribute)get_store().add_element_user(ATTRIBUTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "attribute" element
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
