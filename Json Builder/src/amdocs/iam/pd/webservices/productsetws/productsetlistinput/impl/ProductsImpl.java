/*
 * XML Type:  Products
 * Namespace: http://amdocs/iam/pd/webservices/productSetWS/ProductSetListInput
 * Java type: amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productsetws.productsetlistinput.impl;
/**
 * An XML Products(@http://amdocs/iam/pd/webservices/productSetWS/ProductSetListInput).
 *
 * This is a complex type.
 */
public class ProductsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products
{
    
    public ProductsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "ProductCode");
    
    
    /**
     * Gets array of all "ProductCode" elements
     */
    public java.lang.String[] getProductCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTCODE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ProductCode" element
     */
    public java.lang.String getProductCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ProductCode" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetProductCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTCODE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ProductCode" element
     */
    public org.apache.xmlbeans.XmlString xgetProductCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "ProductCode" element
     */
    public int sizeOfProductCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCODE$0);
        }
    }
    
    /**
     * Sets array of all "ProductCode" element
     */
    public void setProductCodeArray(java.lang.String[] productCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(productCodeArray, PRODUCTCODE$0);
        }
    }
    
    /**
     * Sets ith "ProductCode" element
     */
    public void setProductCodeArray(int i, java.lang.String productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(productCode);
        }
    }
    
    /**
     * Sets (as xml) array of all "ProductCode" element
     */
    public void xsetProductCodeArray(org.apache.xmlbeans.XmlString[]productCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(productCodeArray, PRODUCTCODE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "ProductCode" element
     */
    public void xsetProductCodeArray(int i, org.apache.xmlbeans.XmlString productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(productCode);
        }
    }
    
    /**
     * Inserts the value as the ith "ProductCode" element
     */
    public void insertProductCode(int i, java.lang.String productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PRODUCTCODE$0, i);
            target.setStringValue(productCode);
        }
    }
    
    /**
     * Appends the value as the last "ProductCode" element
     */
    public void addProductCode(java.lang.String productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCODE$0);
            target.setStringValue(productCode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductCode" element
     */
    public org.apache.xmlbeans.XmlString insertNewProductCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PRODUCTCODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductCode" element
     */
    public org.apache.xmlbeans.XmlString addNewProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductCode" element
     */
    public void removeProductCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCODE$0, i);
        }
    }
}
