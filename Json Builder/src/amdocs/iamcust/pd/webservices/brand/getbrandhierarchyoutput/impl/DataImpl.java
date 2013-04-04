/*
 * XML Type:  Data
 * Namespace: http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput
 * Java type: amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.impl;
/**
 * An XML Data(@http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLAVES$0 = 
        new javax.xml.namespace.QName("", "slaves");
    
    
    /**
     * Gets the "slaves" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves getSlaves()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves)get_store().find_element_user(SLAVES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "slaves" element
     */
    public void setSlaves(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves slaves)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves)get_store().find_element_user(SLAVES$0, 0);
            if (target == null)
            {
                target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves)get_store().add_element_user(SLAVES$0);
            }
            target.set(slaves);
        }
    }
    
    /**
     * Appends and returns a new empty "slaves" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves addNewSlaves()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slaves)get_store().add_element_user(SLAVES$0);
            return target;
        }
    }
}
