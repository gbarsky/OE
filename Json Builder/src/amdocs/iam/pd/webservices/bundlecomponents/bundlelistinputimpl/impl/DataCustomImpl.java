/*
 * XML Type:  DataCustom
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleListInputImpl
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.impl;
/**
 * An XML DataCustom(@http://amdocs/iam/pd/webservices/bundleComponents/BundleListInputImpl).
 *
 * This is a complex type.
 */
public class DataCustomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom
{
    
    public DataCustomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCY$0 = 
        new javax.xml.namespace.QName("", "currency");
    private static final javax.xml.namespace.QName CHECKIND$2 = 
        new javax.xml.namespace.QName("", "check_ind");
    
    
    /**
     * Gets the "currency" element
     */
    public java.lang.String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "currency" element
     */
    public org.apache.xmlbeans.XmlString xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "currency" element
     */
    public boolean isSetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCY$0) != 0;
        }
    }
    
    /**
     * Sets the "currency" element
     */
    public void setCurrency(java.lang.String currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$0);
            }
            target.setStringValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "currency" element
     */
    public void xsetCurrency(org.apache.xmlbeans.XmlString currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCY$0);
            }
            target.set(currency);
        }
    }
    
    /**
     * Unsets the "currency" element
     */
    public void unsetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCY$0, 0);
        }
    }
    
    /**
     * Gets the "check_ind" element
     */
    public java.lang.String getCheckInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKIND$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "check_ind" element
     */
    public org.apache.xmlbeans.XmlString xgetCheckInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHECKIND$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "check_ind" element
     */
    public boolean isSetCheckInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKIND$2) != 0;
        }
    }
    
    /**
     * Sets the "check_ind" element
     */
    public void setCheckInd(java.lang.String checkInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKIND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKIND$2);
            }
            target.setStringValue(checkInd);
        }
    }
    
    /**
     * Sets (as xml) the "check_ind" element
     */
    public void xsetCheckInd(org.apache.xmlbeans.XmlString checkInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHECKIND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHECKIND$2);
            }
            target.set(checkInd);
        }
    }
    
    /**
     * Unsets the "check_ind" element
     */
    public void unsetCheckInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKIND$2, 0);
        }
    }
}
