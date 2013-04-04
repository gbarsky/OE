/*
 * XML Type:  Products
 * Namespace: http://amdocs/iam/pd/webservices/productRelations/ProductListOutput
 * Java type: amdocs.iam.pd.webservices.productrelations.productlistoutput.Products
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productrelations.productlistoutput.impl;
/**
 * An XML Products(@http://amdocs/iam/pd/webservices/productRelations/ProductListOutput).
 *
 * This is a complex type.
 */
public class ProductsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productrelations.productlistoutput.Products
{
    
    public ProductsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCT$0 = 
        new javax.xml.namespace.QName("", "product");
    
    
    /**
     * Gets array of all "product" elements
     */
    public amdocs.iam.pd.webservices.productrelations.productlistoutput.Product[] getProductArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCT$0, targetList);
            amdocs.iam.pd.webservices.productrelations.productlistoutput.Product[] result = new amdocs.iam.pd.webservices.productrelations.productlistoutput.Product[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "product" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistoutput.Product getProductArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistoutput.Product target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product)get_store().find_element_user(PRODUCT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "product" element
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
     * Sets array of all "product" element
     */
    public void setProductArray(amdocs.iam.pd.webservices.productrelations.productlistoutput.Product[] productArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(productArray, PRODUCT$0);
        }
    }
    
    /**
     * Sets ith "product" element
     */
    public void setProductArray(int i, amdocs.iam.pd.webservices.productrelations.productlistoutput.Product product)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistoutput.Product target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product)get_store().find_element_user(PRODUCT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(product);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "product" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistoutput.Product insertNewProduct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistoutput.Product target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product)get_store().insert_element_user(PRODUCT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "product" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistoutput.Product addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistoutput.Product target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.Product)get_store().add_element_user(PRODUCT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "product" element
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
