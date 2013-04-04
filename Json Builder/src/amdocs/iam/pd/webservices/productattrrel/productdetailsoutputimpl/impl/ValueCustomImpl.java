/*
 * XML Type:  ValueCustom
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutputImpl
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ValueCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.impl;
/**
 * An XML ValueCustom(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutputImpl).
 *
 * This is a complex type.
 */
public class ValueCustomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ValueCustom
{
    
    public ValueCustomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEDESC$0 = 
        new javax.xml.namespace.QName("", "valueDesc");
    
    
    /**
     * Gets the "valueDesc" element
     */
    public java.lang.String getValueDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "valueDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetValueDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUEDESC$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "valueDesc" element
     */
    public boolean isSetValueDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEDESC$0) != 0;
        }
    }
    
    /**
     * Sets the "valueDesc" element
     */
    public void setValueDesc(java.lang.String valueDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUEDESC$0);
            }
            target.setStringValue(valueDesc);
        }
    }
    
    /**
     * Sets (as xml) the "valueDesc" element
     */
    public void xsetValueDesc(org.apache.xmlbeans.XmlString valueDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUEDESC$0);
            }
            target.set(valueDesc);
        }
    }
    
    /**
     * Unsets the "valueDesc" element
     */
    public void unsetValueDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEDESC$0, 0);
        }
    }
}
