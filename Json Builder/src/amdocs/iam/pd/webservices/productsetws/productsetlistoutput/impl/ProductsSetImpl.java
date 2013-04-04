/*
 * XML Type:  ProductsSet
 * Namespace: http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput
 * Java type: amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productsetws.productsetlistoutput.impl;
/**
 * An XML ProductsSet(@http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput).
 *
 * This is a complex type.
 */
public class ProductsSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductsSet
{
    
    public ProductsSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTSET$0 = 
        new javax.xml.namespace.QName("", "ProductSet");
    
    
    /**
     * Gets array of all "ProductSet" elements
     */
    public amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet[] getProductSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTSET$0, targetList);
            amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet[] result = new amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductSet" element
     */
    public amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet getProductSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet)get_store().find_element_user(PRODUCTSET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProductSet" element
     */
    public int sizeOfProductSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTSET$0);
        }
    }
    
    /**
     * Sets array of all "ProductSet" element
     */
    public void setProductSetArray(amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet[] productSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(productSetArray, PRODUCTSET$0);
        }
    }
    
    /**
     * Sets ith "ProductSet" element
     */
    public void setProductSetArray(int i, amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet productSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet)get_store().find_element_user(PRODUCTSET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(productSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductSet" element
     */
    public amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet insertNewProductSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet)get_store().insert_element_user(PRODUCTSET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductSet" element
     */
    public amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet addNewProductSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet)get_store().add_element_user(PRODUCTSET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductSet" element
     */
    public void removeProductSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTSET$0, i);
        }
    }
}
