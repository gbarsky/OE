/*
 * XML Type:  DataType
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/ProductTypeListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.producttypelistoutput.impl;
/**
 * An XML DataType(@http://amdocs/iam/pd/webservices/productOffer/ProductTypeListOutput).
 *
 * This is a complex type.
 */
public class DataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.producttypelistoutput.DataType
{
    
    public DataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTS$0 = 
        new javax.xml.namespace.QName("", "products");
    
    
    /**
     * Gets array of all "products" elements
     */
    public amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product[] getProductsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTS$0, targetList);
            amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product[] result = new amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "products" element
     */
    public amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product getProductsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product)get_store().find_element_user(PRODUCTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "products" element
     */
    public int sizeOfProductsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTS$0);
        }
    }
    
    /**
     * Sets array of all "products" element
     */
    public void setProductsArray(amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product[] productsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(productsArray, PRODUCTS$0);
        }
    }
    
    /**
     * Sets ith "products" element
     */
    public void setProductsArray(int i, amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product products)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product)get_store().find_element_user(PRODUCTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(products);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "products" element
     */
    public amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product insertNewProducts(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product)get_store().insert_element_user(PRODUCTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "products" element
     */
    public amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product addNewProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product)get_store().add_element_user(PRODUCTS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "products" element
     */
    public void removeProducts(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTS$0, i);
        }
    }
}
