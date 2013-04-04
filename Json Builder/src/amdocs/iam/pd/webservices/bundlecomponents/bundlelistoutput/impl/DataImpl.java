/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleListOutput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/bundleComponents/BundleListOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUNDLES$0 = 
        new javax.xml.namespace.QName("", "Bundles");
    
    
    /**
     * Gets the "Bundles" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundles getBundles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundles target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundles)get_store().find_element_user(BUNDLES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Bundles" element
     */
    public void setBundles(amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundles bundles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundles target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundles)get_store().find_element_user(BUNDLES$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundles)get_store().add_element_user(BUNDLES$0);
            }
            target.set(bundles);
        }
    }
    
    /**
     * Appends and returns a new empty "Bundles" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundles addNewBundles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundles target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundles)get_store().add_element_user(BUNDLES$0);
            return target;
        }
    }
}
