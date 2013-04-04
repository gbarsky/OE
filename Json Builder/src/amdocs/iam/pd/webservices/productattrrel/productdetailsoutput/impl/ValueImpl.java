/*
 * XML Type:  Value
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.impl;
/**
 * An XML Value(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput).
 *
 * This is a complex type.
 */
public class ValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value
{
    
    public ValueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEID$0 = 
        new javax.xml.namespace.QName("", "valueID");
    private static final javax.xml.namespace.QName VALUECONTENT$2 = 
        new javax.xml.namespace.QName("", "valueContent");
    private static final javax.xml.namespace.QName VALUECUSTOM$4 = 
        new javax.xml.namespace.QName("", "ValueCustom");
    
    
    /**
     * Gets the "valueID" element
     */
    public java.lang.String getValueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "valueID" element
     */
    public amdocs.iam.pd.general.common.Long xgetValueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(VALUEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "valueID" element
     */
    public void setValueID(java.lang.String valueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUEID$0);
            }
            target.setStringValue(valueID);
        }
    }
    
    /**
     * Sets (as xml) the "valueID" element
     */
    public void xsetValueID(amdocs.iam.pd.general.common.Long valueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(VALUEID$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(VALUEID$0);
            }
            target.set(valueID);
        }
    }
    
    /**
     * Gets the "valueContent" element
     */
    public java.lang.String getValueContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUECONTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "valueContent" element
     */
    public org.apache.xmlbeans.XmlString xgetValueContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUECONTENT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "valueContent" element
     */
    public void setValueContent(java.lang.String valueContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUECONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUECONTENT$2);
            }
            target.setStringValue(valueContent);
        }
    }
    
    /**
     * Sets (as xml) the "valueContent" element
     */
    public void xsetValueContent(org.apache.xmlbeans.XmlString valueContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUECONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUECONTENT$2);
            }
            target.set(valueContent);
        }
    }
    
    /**
     * Gets the "ValueCustom" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ValueCustom getValueCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ValueCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ValueCustom)get_store().find_element_user(VALUECUSTOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ValueCustom" element
     */
    public boolean isSetValueCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECUSTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "ValueCustom" element
     */
    public void setValueCustom(amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ValueCustom valueCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ValueCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ValueCustom)get_store().find_element_user(VALUECUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ValueCustom)get_store().add_element_user(VALUECUSTOM$4);
            }
            target.set(valueCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "ValueCustom" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ValueCustom addNewValueCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ValueCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ValueCustom)get_store().add_element_user(VALUECUSTOM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ValueCustom" element
     */
    public void unsetValueCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECUSTOM$4, 0);
        }
    }
}
