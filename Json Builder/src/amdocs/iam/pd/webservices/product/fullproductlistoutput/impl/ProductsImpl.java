/*
 * XML Type:  Products
 * Namespace: http://amdocs/iam/pd/webservices/product/FullProductListOutput
 * Java type: amdocs.iam.pd.webservices.product.fullproductlistoutput.Products
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.product.fullproductlistoutput.impl;
/**
 * An XML Products(@http://amdocs/iam/pd/webservices/product/FullProductListOutput).
 *
 * This is a complex type.
 */
public class ProductsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.product.fullproductlistoutput.Products
{
    
    public ProductsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCT$0 = 
        new javax.xml.namespace.QName("", "Product");
    
    
    /**
     * Gets array of all "Product" elements
     */
    public amdocs.iam.pd.webservices.product.fullproductlistoutput.Product[] getProductArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCT$0, targetList);
            amdocs.iam.pd.webservices.product.fullproductlistoutput.Product[] result = new amdocs.iam.pd.webservices.product.fullproductlistoutput.Product[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Product" element
     */
    public amdocs.iam.pd.webservices.product.fullproductlistoutput.Product getProductArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.product.fullproductlistoutput.Product target = null;
            target = (amdocs.iam.pd.webservices.product.fullproductlistoutput.Product)get_store().find_element_user(PRODUCT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Product" element
     */
    public int sizeOfProductArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCT$0);
        }
    }
    
    /**
     * Sets array of all "Product" element
     */
    public void setProductArray(amdocs.iam.pd.webservices.product.fullproductlistoutput.Product[] productArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(productArray, PRODUCT$0);
        }
    }
    
    /**
     * Sets ith "Product" element
     */
    public void setProductArray(int i, amdocs.iam.pd.webservices.product.fullproductlistoutput.Product product)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.product.fullproductlistoutput.Product target = null;
            target = (amdocs.iam.pd.webservices.product.fullproductlistoutput.Product)get_store().find_element_user(PRODUCT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(product);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Product" element
     */
    public amdocs.iam.pd.webservices.product.fullproductlistoutput.Product insertNewProduct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.product.fullproductlistoutput.Product target = null;
            target = (amdocs.iam.pd.webservices.product.fullproductlistoutput.Product)get_store().insert_element_user(PRODUCT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Product" element
     */
    public amdocs.iam.pd.webservices.product.fullproductlistoutput.Product addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.product.fullproductlistoutput.Product target = null;
            target = (amdocs.iam.pd.webservices.product.fullproductlistoutput.Product)get_store().add_element_user(PRODUCT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Product" element
     */
    public void removeProduct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCT$0, i);
        }
    }
}
