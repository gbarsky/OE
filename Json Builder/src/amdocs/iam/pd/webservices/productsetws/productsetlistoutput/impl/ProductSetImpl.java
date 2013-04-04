/*
 * XML Type:  ProductSet
 * Namespace: http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput
 * Java type: amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productsetws.productsetlistoutput.impl;
/**
 * An XML ProductSet(@http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput).
 *
 * This is a complex type.
 */
public class ProductSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSet
{
    
    public ProductSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTSETCODE$0 = 
        new javax.xml.namespace.QName("", "productSetCode");
    private static final javax.xml.namespace.QName PRODUCTSETNAME$2 = 
        new javax.xml.namespace.QName("", "productSetName");
    private static final javax.xml.namespace.QName PRODUCTSETDESCRIPTION$4 = 
        new javax.xml.namespace.QName("", "productSetDescription");
    private static final javax.xml.namespace.QName EFFECTIVEDATE$6 = 
        new javax.xml.namespace.QName("", "effectiveDate");
    private static final javax.xml.namespace.QName EXPIRATIONDATE$8 = 
        new javax.xml.namespace.QName("", "expirationDate");
    private static final javax.xml.namespace.QName PRODUCTS$10 = 
        new javax.xml.namespace.QName("", "Products");
    
    
    /**
     * Gets the "productSetCode" element
     */
    public java.lang.String getProductSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSETCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productSetCode" element
     */
    public org.apache.xmlbeans.XmlString xgetProductSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSETCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productSetCode" element
     */
    public void setProductSetCode(java.lang.String productSetCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSETCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTSETCODE$0);
            }
            target.setStringValue(productSetCode);
        }
    }
    
    /**
     * Sets (as xml) the "productSetCode" element
     */
    public void xsetProductSetCode(org.apache.xmlbeans.XmlString productSetCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSETCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTSETCODE$0);
            }
            target.set(productSetCode);
        }
    }
    
    /**
     * Gets the "productSetName" element
     */
    public java.lang.String getProductSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSETNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productSetName" element
     */
    public org.apache.xmlbeans.XmlString xgetProductSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSETNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productSetName" element
     */
    public void setProductSetName(java.lang.String productSetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSETNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTSETNAME$2);
            }
            target.setStringValue(productSetName);
        }
    }
    
    /**
     * Sets (as xml) the "productSetName" element
     */
    public void xsetProductSetName(org.apache.xmlbeans.XmlString productSetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSETNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTSETNAME$2);
            }
            target.set(productSetName);
        }
    }
    
    /**
     * Gets the "productSetDescription" element
     */
    public java.lang.String getProductSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSETDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productSetDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetProductSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSETDESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productSetDescription" element
     */
    public void setProductSetDescription(java.lang.String productSetDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSETDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTSETDESCRIPTION$4);
            }
            target.setStringValue(productSetDescription);
        }
    }
    
    /**
     * Sets (as xml) the "productSetDescription" element
     */
    public void xsetProductSetDescription(org.apache.xmlbeans.XmlString productSetDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSETDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTSETDESCRIPTION$4);
            }
            target.set(productSetDescription);
        }
    }
    
    /**
     * Gets the "effectiveDate" element
     */
    public java.lang.String getEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "effectiveDate" element
     */
    public org.apache.xmlbeans.XmlString xgetEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "effectiveDate" element
     */
    public void setEffectiveDate(java.lang.String effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEDATE$6);
            }
            target.setStringValue(effectiveDate);
        }
    }
    
    /**
     * Sets (as xml) the "effectiveDate" element
     */
    public void xsetEffectiveDate(org.apache.xmlbeans.XmlString effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EFFECTIVEDATE$6);
            }
            target.set(effectiveDate);
        }
    }
    
    /**
     * Gets the "expirationDate" element
     */
    public java.lang.String getExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expirationDate" element
     */
    public org.apache.xmlbeans.XmlString xgetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "expirationDate" element
     */
    public void setExpirationDate(java.lang.String expirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRATIONDATE$8);
            }
            target.setStringValue(expirationDate);
        }
    }
    
    /**
     * Sets (as xml) the "expirationDate" element
     */
    public void xsetExpirationDate(org.apache.xmlbeans.XmlString expirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPIRATIONDATE$8);
            }
            target.set(expirationDate);
        }
    }
    
    /**
     * Gets the "Products" element
     */
    public amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products getProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products)get_store().find_element_user(PRODUCTS$10, 0);
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
    public void setProducts(amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products products)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products)get_store().find_element_user(PRODUCTS$10, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products)get_store().add_element_user(PRODUCTS$10);
            }
            target.set(products);
        }
    }
    
    /**
     * Appends and returns a new empty "Products" element
     */
    public amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products addNewProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Products)get_store().add_element_user(PRODUCTS$10);
            return target;
        }
    }
}
