/*
 * XML Type:  Slaves
 * Namespace: http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput
 * Java type: amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.impl;
/**
 * An XML Slaves(@http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput).
 *
 * This is a complex type.
 */
public class SlavesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves
{
    
    public SlavesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONALSLAVE$0 = 
        new javax.xml.namespace.QName("", "optionalSlave");
    private static final javax.xml.namespace.QName MANDATORYSLAVE$2 = 
        new javax.xml.namespace.QName("", "mandatorySlave");
    
    
    /**
     * Gets array of all "optionalSlave" elements
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave[] getOptionalSlaveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPTIONALSLAVE$0, targetList);
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave[] result = new amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "optionalSlave" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave getOptionalSlaveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave)get_store().find_element_user(OPTIONALSLAVE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "optionalSlave" element
     */
    public int sizeOfOptionalSlaveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONALSLAVE$0);
        }
    }
    
    /**
     * Sets array of all "optionalSlave" element
     */
    public void setOptionalSlaveArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave[] optionalSlaveArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(optionalSlaveArray, OPTIONALSLAVE$0);
        }
    }
    
    /**
     * Sets ith "optionalSlave" element
     */
    public void setOptionalSlaveArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave optionalSlave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave)get_store().find_element_user(OPTIONALSLAVE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(optionalSlave);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "optionalSlave" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave insertNewOptionalSlave(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave)get_store().insert_element_user(OPTIONALSLAVE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "optionalSlave" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave addNewOptionalSlave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave)get_store().add_element_user(OPTIONALSLAVE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "optionalSlave" element
     */
    public void removeOptionalSlave(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONALSLAVE$0, i);
        }
    }
    
    /**
     * Gets array of all "mandatorySlave" elements
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave[] getMandatorySlaveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MANDATORYSLAVE$2, targetList);
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave[] result = new amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mandatorySlave" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave getMandatorySlaveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave)get_store().find_element_user(MANDATORYSLAVE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mandatorySlave" element
     */
    public int sizeOfMandatorySlaveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANDATORYSLAVE$2);
        }
    }
    
    /**
     * Sets array of all "mandatorySlave" element
     */
    public void setMandatorySlaveArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave[] mandatorySlaveArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mandatorySlaveArray, MANDATORYSLAVE$2);
        }
    }
    
    /**
     * Sets ith "mandatorySlave" element
     */
    public void setMandatorySlaveArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave mandatorySlave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave)get_store().find_element_user(MANDATORYSLAVE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mandatorySlave);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mandatorySlave" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave insertNewMandatorySlave(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave)get_store().insert_element_user(MANDATORYSLAVE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mandatorySlave" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave addNewMandatorySlave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave)get_store().add_element_user(MANDATORYSLAVE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "mandatorySlave" element
     */
    public void removeMandatorySlave(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANDATORYSLAVE$2, i);
        }
    }
}
