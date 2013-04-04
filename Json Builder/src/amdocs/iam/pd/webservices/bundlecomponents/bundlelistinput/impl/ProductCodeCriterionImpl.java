/*
 * XML Type:  ProductCodeCriterion
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.impl;
/**
 * An XML ProductCodeCriterion(@http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput).
 *
 * This is a complex type.
 */
public class ProductCodeCriterionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion
{
    
    public ProductCodeCriterionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODES$0 = 
        new javax.xml.namespace.QName("", "ProductCodes");
    
    
    /**
     * Gets the "ProductCodes" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodes getProductCodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodes target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodes)get_store().find_element_user(PRODUCTCODES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProductCodes" element
     */
    public void setProductCodes(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodes productCodes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodes target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodes)get_store().find_element_user(PRODUCTCODES$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodes)get_store().add_element_user(PRODUCTCODES$0);
            }
            target.set(productCodes);
        }
    }
    
    /**
     * Appends and returns a new empty "ProductCodes" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodes addNewProductCodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodes target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodes)get_store().add_element_user(PRODUCTCODES$0);
            return target;
        }
    }
}
