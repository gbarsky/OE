/*
 * XML Type:  ProductDetailsInput
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsInput
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsinput.ProductDetailsInput
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsinput.impl;
/**
 * An XML ProductDetailsInput(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsInput).
 *
 * This is a complex type.
 */
public class ProductDetailsInputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsinput.ProductDetailsInput
{
    
    public ProductDetailsInputImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("", "Event");
    private static final javax.xml.namespace.QName DATA$2 = 
        new javax.xml.namespace.QName("", "DATA");
    
    
    /**
     * Gets the "Event" element
     */
    public amdocs.iam.pd.general.common.EventType getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.EventType target = null;
            target = (amdocs.iam.pd.general.common.EventType)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Event" element
     */
    public void setEvent(amdocs.iam.pd.general.common.EventType event)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.EventType target = null;
            target = (amdocs.iam.pd.general.common.EventType)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.EventType)get_store().add_element_user(EVENT$0);
            }
            target.set(event);
        }
    }
    
    /**
     * Appends and returns a new empty "Event" element
     */
    public amdocs.iam.pd.general.common.EventType addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.EventType target = null;
            target = (amdocs.iam.pd.general.common.EventType)get_store().add_element_user(EVENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "DATA" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsinput.Data getDATA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsinput.Data target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsinput.Data)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DATA" element
     */
    public void setDATA(amdocs.iam.pd.webservices.productattrrel.productdetailsinput.Data data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsinput.Data target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsinput.Data)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsinput.Data)get_store().add_element_user(DATA$2);
            }
            target.set(data);
        }
    }
    
    /**
     * Appends and returns a new empty "DATA" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsinput.Data addNewDATA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsinput.Data target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsinput.Data)get_store().add_element_user(DATA$2);
            return target;
        }
    }
}
