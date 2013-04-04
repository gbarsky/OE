/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/productRelations/ProductListOutput
 * Java type: amdocs.iam.pd.webservices.productrelations.productlistoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productrelations.productlistoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/productRelations/ProductListOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productrelations.productlistoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTS$0 = 
        new javax.xml.namespace.QName("", "products");
    
    
    /**
     * Gets the "products" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistoutput.Products getProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistoutput.Products target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.Products)get_store().find_element_user(PRODUCTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "products" element
     */
    public void setProducts(amdocs.iam.pd.webservices.productrelations.productlistoutput.Products products)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistoutput.Products target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.Products)get_store().find_element_user(PRODUCTS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.Products)get_store().add_element_user(PRODUCTS$0);
            }
            target.set(products);
        }
    }
    
    /**
     * Appends and returns a new empty "products" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistoutput.Products addNewProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistoutput.Products target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.Products)get_store().add_element_user(PRODUCTS$0);
            return target;
        }
    }
}
