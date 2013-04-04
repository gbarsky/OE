/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/productRelations/CheckProductEligibilityInput
 * Java type: amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/productRelations/CheckProductEligibilityInput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName PRODUCTVERSION$2 = 
        new javax.xml.namespace.QName("", "productVersion");
    private static final javax.xml.namespace.QName HEADING$4 = 
        new javax.xml.namespace.QName("", "heading");
    private static final javax.xml.namespace.QName CUSTOMERPARAMETERS$6 = 
        new javax.xml.namespace.QName("", "CustomerParameters");
    
    
    /**
     * Gets the "productCode" element
     */
    public java.lang.String getProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCODE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCODE$0);
            }
            target.set(productCode);
        }
    }
    
    /**
     * Gets the "productVersion" element
     */
    public java.lang.String getProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTVERSION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productVersion" element
     */
    public void setProductVersion(java.lang.String productVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTVERSION$2);
            }
            target.setStringValue(productVersion);
        }
    }
    
    /**
     * Sets (as xml) the "productVersion" element
     */
    public void xsetProductVersion(org.apache.xmlbeans.XmlString productVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTVERSION$2);
            }
            target.set(productVersion);
        }
    }
    
    /**
     * Gets the "heading" element
     */
    public java.lang.String getHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "heading" element
     */
    public org.apache.xmlbeans.XmlString xgetHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADING$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "heading" element
     */
    public void setHeading(java.lang.String heading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADING$4);
            }
            target.setStringValue(heading);
        }
    }
    
    /**
     * Sets (as xml) the "heading" element
     */
    public void xsetHeading(org.apache.xmlbeans.XmlString heading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEADING$4);
            }
            target.set(heading);
        }
    }
    
    /**
     * Gets the "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes getCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$6, 0);
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
    public void setCustomerParameters(amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes customerParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$6);
            }
            target.set(customerParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes addNewCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$6);
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
