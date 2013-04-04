/*
 * XML Type:  Attributes
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsOutput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Attributes
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.impl;
/**
 * An XML Attributes(@http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsOutput).
 *
 * This is a complex type.
 */
public class AttributesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Attributes
{
    
    public AttributesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTECODE$0 = 
        new javax.xml.namespace.QName("", "attributeCode");
    private static final javax.xml.namespace.QName ATTRIBUTECUSTOM$2 = 
        new javax.xml.namespace.QName("", "AttributeCustom");
    
    
    /**
     * Gets the "attributeCode" element
     */
    public java.lang.String getAttributeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attributeCode" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "attributeCode" element
     */
    public void setAttributeCode(java.lang.String attributeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTECODE$0);
            }
            target.setStringValue(attributeCode);
        }
    }
    
    /**
     * Sets (as xml) the "attributeCode" element
     */
    public void xsetAttributeCode(org.apache.xmlbeans.XmlString attributeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTECODE$0);
            }
            target.set(attributeCode);
        }
    }
    
    /**
     * Gets the "AttributeCustom" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.AttributeCustom getAttributeCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.AttributeCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.AttributeCustom)get_store().find_element_user(ATTRIBUTECUSTOM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AttributeCustom" element
     */
    public boolean isSetAttributeCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTECUSTOM$2) != 0;
        }
    }
    
    /**
     * Sets the "AttributeCustom" element
     */
    public void setAttributeCustom(amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.AttributeCustom attributeCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.AttributeCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.AttributeCustom)get_store().find_element_user(ATTRIBUTECUSTOM$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.AttributeCustom)get_store().add_element_user(ATTRIBUTECUSTOM$2);
            }
            target.set(attributeCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "AttributeCustom" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.AttributeCustom addNewAttributeCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.AttributeCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.AttributeCustom)get_store().add_element_user(ATTRIBUTECUSTOM$2);
            return target;
        }
    }
    
    /**
     * Unsets the "AttributeCustom" element
     */
    public void unsetAttributeCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTECUSTOM$2, 0);
        }
    }
}
