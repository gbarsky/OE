/*
 * XML Type:  RelationCustom
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutputImpl
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.RelationCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.impl;
/**
 * An XML RelationCustom(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutputImpl).
 *
 * This is a complex type.
 */
public class RelationCustomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.RelationCustom
{
    
    public RelationCustomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETAINSENIORITYIND$0 = 
        new javax.xml.namespace.QName("", "retainSeniorityInd");
    
    
    /**
     * Gets the "retainSeniorityInd" element
     */
    public java.lang.String getRetainSeniorityInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETAINSENIORITYIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "retainSeniorityInd" element
     */
    public org.apache.xmlbeans.XmlString xgetRetainSeniorityInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETAINSENIORITYIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "retainSeniorityInd" element
     */
    public void setRetainSeniorityInd(java.lang.String retainSeniorityInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETAINSENIORITYIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETAINSENIORITYIND$0);
            }
            target.setStringValue(retainSeniorityInd);
        }
    }
    
    /**
     * Sets (as xml) the "retainSeniorityInd" element
     */
    public void xsetRetainSeniorityInd(org.apache.xmlbeans.XmlString retainSeniorityInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETAINSENIORITYIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETAINSENIORITYIND$0);
            }
            target.set(retainSeniorityInd);
        }
    }
}
