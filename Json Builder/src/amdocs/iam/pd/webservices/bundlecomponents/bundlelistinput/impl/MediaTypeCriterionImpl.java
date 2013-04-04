/*
 * XML Type:  MediaTypeCriterion
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.impl;
/**
 * An XML MediaTypeCriterion(@http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput).
 *
 * This is a complex type.
 */
public class MediaTypeCriterionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion
{
    
    public MediaTypeCriterionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIATYPES$0 = 
        new javax.xml.namespace.QName("", "MediaTypes");
    
    
    /**
     * Gets the "MediaTypes" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypes getMediaTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypes target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypes)get_store().find_element_user(MEDIATYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MediaTypes" element
     */
    public void setMediaTypes(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypes mediaTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypes target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypes)get_store().find_element_user(MEDIATYPES$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypes)get_store().add_element_user(MEDIATYPES$0);
            }
            target.set(mediaTypes);
        }
    }
    
    /**
     * Appends and returns a new empty "MediaTypes" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypes addNewMediaTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypes target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypes)get_store().add_element_user(MEDIATYPES$0);
            return target;
        }
    }
}
