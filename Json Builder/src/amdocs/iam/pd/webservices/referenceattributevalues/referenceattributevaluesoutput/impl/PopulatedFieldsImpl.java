/*
 * XML Type:  PopulatedFields
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.impl;
/**
 * An XML PopulatedFields(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput).
 *
 * This is a complex type.
 */
public class PopulatedFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields
{
    
    public PopulatedFieldsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POPULATEDFIELD$0 = 
        new javax.xml.namespace.QName("", "populatedField");
    
    
    /**
     * Gets array of all "populatedField" elements
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField[] getPopulatedFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POPULATEDFIELD$0, targetList);
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField[] result = new amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "populatedField" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField getPopulatedFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField)get_store().find_element_user(POPULATEDFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "populatedField" element
     */
    public int sizeOfPopulatedFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POPULATEDFIELD$0);
        }
    }
    
    /**
     * Sets array of all "populatedField" element
     */
    public void setPopulatedFieldArray(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField[] populatedFieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(populatedFieldArray, POPULATEDFIELD$0);
        }
    }
    
    /**
     * Sets ith "populatedField" element
     */
    public void setPopulatedFieldArray(int i, amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField populatedField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField)get_store().find_element_user(POPULATEDFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(populatedField);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "populatedField" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField insertNewPopulatedField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField)get_store().insert_element_user(POPULATEDFIELD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "populatedField" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField addNewPopulatedField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField)get_store().add_element_user(POPULATEDFIELD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "populatedField" element
     */
    public void removePopulatedField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POPULATEDFIELD$0, i);
        }
    }
}
