/*
 * XML Type:  ProductTypeCriterion
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.impl;
/**
 * An XML ProductTypeCriterion(@http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput).
 *
 * This is a complex type.
 */
public class ProductTypeCriterionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion
{
    
    public ProductTypeCriterionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTTYPES$0 = 
        new javax.xml.namespace.QName("", "ProductTypes");
    
    
    /**
     * Gets the "ProductTypes" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypes getProductTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypes target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypes)get_store().find_element_user(PRODUCTTYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProductTypes" element
     */
    public void setProductTypes(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypes productTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypes target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypes)get_store().find_element_user(PRODUCTTYPES$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypes)get_store().add_element_user(PRODUCTTYPES$0);
            }
            target.set(productTypes);
        }
    }
    
    /**
     * Appends and returns a new empty "ProductTypes" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypes addNewProductTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypes target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypes)get_store().add_element_user(PRODUCTTYPES$0);
            return target;
        }
    }
}
