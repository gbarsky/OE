/*
 * XML Type:  Parameters
 * Namespace: http://amdocs/iam/pd/webservices/offerAdvPkg/OfferDetailsOutput
 * Java type: amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.impl;
/**
 * An XML Parameters(@http://amdocs/iam/pd/webservices/offerAdvPkg/OfferDetailsOutput).
 *
 * This is a complex type.
 */
public class ParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters
{
    
    public ParametersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETER$0 = 
        new javax.xml.namespace.QName("", "Parameter");
    
    
    /**
     * Gets array of all "Parameter" elements
     */
    public amdocs.iam.pd.general.common.GlobalPropertiesParameter[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETER$0, targetList);
            amdocs.iam.pd.general.common.GlobalPropertiesParameter[] result = new amdocs.iam.pd.general.common.GlobalPropertiesParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Parameter" element
     */
    public amdocs.iam.pd.general.common.GlobalPropertiesParameter getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.GlobalPropertiesParameter target = null;
            target = (amdocs.iam.pd.general.common.GlobalPropertiesParameter)get_store().find_element_user(PARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Parameter" element
     */
    public int sizeOfParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETER$0);
        }
    }
    
    /**
     * Sets array of all "Parameter" element
     */
    public void setParameterArray(amdocs.iam.pd.general.common.GlobalPropertiesParameter[] parameterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterArray, PARAMETER$0);
        }
    }
    
    /**
     * Sets ith "Parameter" element
     */
    public void setParameterArray(int i, amdocs.iam.pd.general.common.GlobalPropertiesParameter parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.GlobalPropertiesParameter target = null;
            target = (amdocs.iam.pd.general.common.GlobalPropertiesParameter)get_store().find_element_user(PARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
     */
    public amdocs.iam.pd.general.common.GlobalPropertiesParameter insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.GlobalPropertiesParameter target = null;
            target = (amdocs.iam.pd.general.common.GlobalPropertiesParameter)get_store().insert_element_user(PARAMETER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Parameter" element
     */
    public amdocs.iam.pd.general.common.GlobalPropertiesParameter addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.GlobalPropertiesParameter target = null;
            target = (amdocs.iam.pd.general.common.GlobalPropertiesParameter)get_store().add_element_user(PARAMETER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Parameter" element
     */
    public void removeParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETER$0, i);
        }
    }
}
