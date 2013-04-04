/*
 * XML Type:  DataType
 * Namespace: http://amdocs/iam/pd/webservices/heading/HeadingListInput
 * Java type: amdocs.iam.pd.webservices.heading.headinglistinput.DataType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.heading.headinglistinput.impl;
/**
 * An XML DataType(@http://amdocs/iam/pd/webservices/heading/HeadingListInput).
 *
 * This is a complex type.
 */
public class DataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.heading.headinglistinput.DataType
{
    
    public DataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGE$0 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName PRODUCTCODE$2 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName BRAND$4 = 
        new javax.xml.namespace.QName("", "brand");
    private static final javax.xml.namespace.QName CUSTOMERPARAMETERS$6 = 
        new javax.xml.namespace.QName("", "CustomerParameters");
    
    
    /**
     * Gets the "language" element
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" element
     */
    public org.apache.xmlbeans.XmlString xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "language" element
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$0);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" element
     */
    public void xsetLanguage(org.apache.xmlbeans.XmlString language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGE$0);
            }
            target.set(language);
        }
    }
    
    /**
     * Gets the "productCode" element
     */
    public java.lang.String getProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productCode" element
     */
    public org.apache.xmlbeans.XmlString xgetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "productCode" element
     */
    public boolean isNilProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "productCode" element
     */
    public boolean isSetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "productCode" element
     */
    public void setProductCode(java.lang.String productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCODE$2);
            }
            target.setStringValue(productCode);
        }
    }
    
    /**
     * Sets (as xml) the "productCode" element
     */
    public void xsetProductCode(org.apache.xmlbeans.XmlString productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCODE$2);
            }
            target.set(productCode);
        }
    }
    
    /**
     * Nils the "productCode" element
     */
    public void setNilProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCODE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "productCode" element
     */
    public void unsetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCODE$2, 0);
        }
    }
    
    /**
     * Gets the "brand" element
     */
    public java.lang.String getBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRAND$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "brand" element
     */
    public org.apache.xmlbeans.XmlString xgetBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRAND$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "brand" element
     */
    public boolean isNilBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRAND$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "brand" element
     */
    public boolean isSetBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRAND$4) != 0;
        }
    }
    
    /**
     * Sets the "brand" element
     */
    public void setBrand(java.lang.String brand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRAND$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRAND$4);
            }
            target.setStringValue(brand);
        }
    }
    
    /**
     * Sets (as xml) the "brand" element
     */
    public void xsetBrand(org.apache.xmlbeans.XmlString brand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRAND$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRAND$4);
            }
            target.set(brand);
        }
    }
    
    /**
     * Nils the "brand" element
     */
    public void setNilBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRAND$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRAND$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "brand" element
     */
    public void unsetBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRAND$4, 0);
        }
    }
    
    /**
     * Gets the "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes getCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomerParameters" element
     */
    public boolean isSetCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERPARAMETERS$6) != 0;
        }
    }
    
    /**
     * Sets the "CustomerParameters" element
     */
    public void setCustomerParameters(amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes customerParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$6);
            }
            target.set(customerParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes addNewCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomerParameters" element
     */
    public void unsetCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERPARAMETERS$6, 0);
        }
    }
}
