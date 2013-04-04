/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsOutput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUNDLE$0 = 
        new javax.xml.namespace.QName("", "Bundle");
    private static final javax.xml.namespace.QName DATACUSTOM$2 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
    /**
     * Gets the "Bundle" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle getBundle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle)get_store().find_element_user(BUNDLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Bundle" element
     */
    public void setBundle(amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle bundle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle)get_store().find_element_user(BUNDLE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle)get_store().add_element_user(BUNDLE$0);
            }
            target.set(bundle);
        }
    }
    
    /**
     * Appends and returns a new empty "Bundle" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle addNewBundle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Bundle)get_store().add_element_user(BUNDLE$0);
            return target;
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataCustom" element
     */
    public boolean isSetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACUSTOM$2) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$2);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DataCustom" element
     */
    public void unsetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACUSTOM$2, 0);
        }
    }
}
