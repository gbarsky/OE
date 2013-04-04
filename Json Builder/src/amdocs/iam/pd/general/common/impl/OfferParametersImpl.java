/*
 * XML Type:  OfferParameters
 * Namespace: http://amdocs/iam/pd/general/Common
 * Java type: amdocs.iam.pd.general.common.OfferParameters
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.general.common.impl;
/**
 * An XML OfferParameters(@http://amdocs/iam/pd/general/Common).
 *
 * This is a complex type.
 */
public class OfferParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.general.common.OfferParameters
{
    
    public OfferParametersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERS$0 = 
        new javax.xml.namespace.QName("", "parameters");
    
    
    /**
     * Gets array of all "parameters" elements
     */
    public amdocs.iam.pd.general.common.Parameter[] getParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETERS$0, targetList);
            amdocs.iam.pd.general.common.Parameter[] result = new amdocs.iam.pd.general.common.Parameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameters" element
     */
    public amdocs.iam.pd.general.common.Parameter getParametersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Parameter target = null;
            target = (amdocs.iam.pd.general.common.Parameter)get_store().find_element_user(PARAMETERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameters" element
     */
    public int sizeOfParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERS$0);
        }
    }
    
    /**
     * Sets array of all "parameters" element
     */
    public void setParametersArray(amdocs.iam.pd.general.common.Parameter[] parametersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parametersArray, PARAMETERS$0);
        }
    }
    
    /**
     * Sets ith "parameters" element
     */
    public void setParametersArray(int i, amdocs.iam.pd.general.common.Parameter parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Parameter target = null;
            target = (amdocs.iam.pd.general.common.Parameter)get_store().find_element_user(PARAMETERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameters);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameters" element
     */
    public amdocs.iam.pd.general.common.Parameter insertNewParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Parameter target = null;
            target = (amdocs.iam.pd.general.common.Parameter)get_store().insert_element_user(PARAMETERS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameters" element
     */
    public amdocs.iam.pd.general.common.Parameter addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Parameter target = null;
            target = (amdocs.iam.pd.general.common.Parameter)get_store().add_element_user(PARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameters" element
     */
    public void removeParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERS$0, i);
        }
    }
}
