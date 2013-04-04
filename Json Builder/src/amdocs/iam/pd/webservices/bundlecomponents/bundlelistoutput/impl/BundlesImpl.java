/*
 * XML Type:  Bundles
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleListOutput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundles
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.impl;
/**
 * An XML Bundles(@http://amdocs/iam/pd/webservices/bundleComponents/BundleListOutput).
 *
 * This is a complex type.
 */
public class BundlesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundles
{
    
    public BundlesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUNDLE$0 = 
        new javax.xml.namespace.QName("", "Bundle");
    
    
    /**
     * Gets array of all "Bundle" elements
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle[] getBundleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUNDLE$0, targetList);
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle[] result = new amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Bundle" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle getBundleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle)get_store().find_element_user(BUNDLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Bundle" element
     */
    public int sizeOfBundleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUNDLE$0);
        }
    }
    
    /**
     * Sets array of all "Bundle" element
     */
    public void setBundleArray(amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle[] bundleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bundleArray, BUNDLE$0);
        }
    }
    
    /**
     * Sets ith "Bundle" element
     */
    public void setBundleArray(int i, amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle bundle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle)get_store().find_element_user(BUNDLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bundle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Bundle" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle insertNewBundle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle)get_store().insert_element_user(BUNDLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Bundle" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle addNewBundle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle)get_store().add_element_user(BUNDLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Bundle" element
     */
    public void removeBundle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUNDLE$0, i);
        }
    }
}
