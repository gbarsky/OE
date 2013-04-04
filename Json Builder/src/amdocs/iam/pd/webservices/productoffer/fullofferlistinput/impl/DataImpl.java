/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/FullOfferListInput
 * Java type: amdocs.iam.pd.webservices.productoffer.fullofferlistinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.fullofferlistinput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/productOffer/FullOfferListInput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.fullofferlistinput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName SELFSERVICEIND$2 = 
        new javax.xml.namespace.QName("", "selfServiceInd");
    private static final javax.xml.namespace.QName DATACUSTOM$4 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
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
     * True if has "productCode" element
     */
    public boolean isSetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCODE$0) != 0;
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
     * Unsets the "productCode" element
     */
    public void unsetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCODE$0, 0);
        }
    }
    
    /**
     * Gets the "selfServiceInd" element
     */
    public java.lang.String getSelfServiceInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELFSERVICEIND$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "selfServiceInd" element
     */
    public org.apache.xmlbeans.XmlString xgetSelfServiceInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELFSERVICEIND$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "selfServiceInd" element
     */
    public boolean isSetSelfServiceInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELFSERVICEIND$2) != 0;
        }
    }
    
    /**
     * Sets the "selfServiceInd" element
     */
    public void setSelfServiceInd(java.lang.String selfServiceInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELFSERVICEIND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELFSERVICEIND$2);
            }
            target.setStringValue(selfServiceInd);
        }
    }
    
    /**
     * Sets (as xml) the "selfServiceInd" element
     */
    public void xsetSelfServiceInd(org.apache.xmlbeans.XmlString selfServiceInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELFSERVICEIND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELFSERVICEIND$2);
            }
            target.set(selfServiceInd);
        }
    }
    
    /**
     * Unsets the "selfServiceInd" element
     */
    public void unsetSelfServiceInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELFSERVICEIND$2, 0);
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.productoffer.fullofferlistinputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.fullofferlistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.fullofferlistinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataCustom" element
     */
    public boolean isSetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACUSTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.productoffer.fullofferlistinputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.fullofferlistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.fullofferlistinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productoffer.fullofferlistinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$4);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.productoffer.fullofferlistinputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.fullofferlistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.fullofferlistinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DataCustom" element
     */
    public void unsetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACUSTOM$4, 0);
        }
    }
}
