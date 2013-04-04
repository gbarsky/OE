/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput
 * Java type: amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productsetws.productsetlistoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTSSET$0 = 
        new javax.xml.namespace.QName("", "ProductsSet");
    
    
    /**
     * Gets the "ProductsSet" element
     */
    public amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet getProductsSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet)get_store().find_element_user(PRODUCTSSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProductsSet" element
     */
    public void setProductsSet(amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet productsSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet)get_store().find_element_user(PRODUCTSSET$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet)get_store().add_element_user(PRODUCTSSET$0);
            }
            target.set(productsSet);
        }
    }
    
    /**
     * Appends and returns a new empty "ProductsSet" element
     */
    public amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet addNewProductsSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet)get_store().add_element_user(PRODUCTSSET$0);
            return target;
        }
    }
}
