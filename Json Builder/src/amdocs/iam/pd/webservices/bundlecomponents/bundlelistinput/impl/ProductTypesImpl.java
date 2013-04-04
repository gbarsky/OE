/*
 * XML Type:  ProductTypes
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypes
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.impl;
/**
 * An XML ProductTypes(@http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput).
 *
 * This is a complex type.
 */
public class ProductTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypes
{
    
    public ProductTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTTYPE$0 = 
        new javax.xml.namespace.QName("", "ProductType");
    private static final javax.xml.namespace.QName FULLINDICATOR$2 = 
        new javax.xml.namespace.QName("", "fullIndicator");
    
    
    /**
     * Gets array of all "ProductType" elements
     */
    public java.lang.String[] getProductTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTTYPE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ProductType" element
     */
    public java.lang.String getProductTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ProductType" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetProductTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTTYPE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ProductType" element
     */
    public org.apache.xmlbeans.XmlString xgetProductTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "ProductType" element
     */
    public int sizeOfProductTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTTYPE$0);
        }
    }
    
    /**
     * Sets array of all "ProductType" element
     */
    public void setProductTypeArray(java.lang.String[] productTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(productTypeArray, PRODUCTTYPE$0);
        }
    }
    
    /**
     * Sets ith "ProductType" element
     */
    public void setProductTypeArray(int i, java.lang.String productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(productType);
        }
    }
    
    /**
     * Sets (as xml) array of all "ProductType" element
     */
    public void xsetProductTypeArray(org.apache.xmlbeans.XmlString[]productTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(productTypeArray, PRODUCTTYPE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "ProductType" element
     */
    public void xsetProductTypeArray(int i, org.apache.xmlbeans.XmlString productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(productType);
        }
    }
    
    /**
     * Inserts the value as the ith "ProductType" element
     */
    public void insertProductType(int i, java.lang.String productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PRODUCTTYPE$0, i);
            target.setStringValue(productType);
        }
    }
    
    /**
     * Appends the value as the last "ProductType" element
     */
    public void addProductType(java.lang.String productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPE$0);
            target.setStringValue(productType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductType" element
     */
    public org.apache.xmlbeans.XmlString insertNewProductType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PRODUCTTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductType" element
     */
    public org.apache.xmlbeans.XmlString addNewProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductType" element
     */
    public void removeProductType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTTYPE$0, i);
        }
    }
    
    /**
     * Gets the "fullIndicator" attribute
     */
    public boolean getFullIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLINDICATOR$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullIndicator" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFullIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FULLINDICATOR$2);
            return target;
        }
    }
    
    /**
     * Sets the "fullIndicator" attribute
     */
    public void setFullIndicator(boolean fullIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLINDICATOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLINDICATOR$2);
            }
            target.setBooleanValue(fullIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "fullIndicator" attribute
     */
    public void xsetFullIndicator(org.apache.xmlbeans.XmlBoolean fullIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FULLINDICATOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FULLINDICATOR$2);
            }
            target.set(fullIndicator);
        }
    }
}
