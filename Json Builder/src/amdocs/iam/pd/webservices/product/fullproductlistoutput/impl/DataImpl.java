/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/product/FullProductListOutput
 * Java type: amdocs.iam.pd.webservices.product.fullproductlistoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.product.fullproductlistoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/product/FullProductListOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.product.fullproductlistoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTS$0 = 
        new javax.xml.namespace.QName("", "Products");
    
    
    /**
     * Gets the "Products" element
     */
    public amdocs.iam.pd.webservices.product.fullproductlistoutput.Products getProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.product.fullproductlistoutput.Products target = null;
            target = (amdocs.iam.pd.webservices.product.fullproductlistoutput.Products)get_store().find_element_user(PRODUCTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Products" element
     */
    public void setProducts(amdocs.iam.pd.webservices.product.fullproductlistoutput.Products products)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.product.fullproductlistoutput.Products target = null;
            target = (amdocs.iam.pd.webservices.product.fullproductlistoutput.Products)get_store().find_element_user(PRODUCTS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.product.fullproductlistoutput.Products)get_store().add_element_user(PRODUCTS$0);
            }
            target.set(products);
        }
    }
    
    /**
     * Appends and returns a new empty "Products" element
     */
    public amdocs.iam.pd.webservices.product.fullproductlistoutput.Products addNewProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.product.fullproductlistoutput.Products target = null;
            target = (amdocs.iam.pd.webservices.product.fullproductlistoutput.Products)get_store().add_element_user(PRODUCTS$0);
            return target;
        }
    }
}
