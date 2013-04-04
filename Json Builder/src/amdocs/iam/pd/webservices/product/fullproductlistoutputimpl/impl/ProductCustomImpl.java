/*
 * XML Type:  ProductCustom
 * Namespace: http://amdocs/iam/pd/webservices/product/FullProductListOutputImpl
 * Java type: amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.ProductCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.impl;
/**
 * An XML ProductCustom(@http://amdocs/iam/pd/webservices/product/FullProductListOutputImpl).
 *
 * This is a complex type.
 */
public class ProductCustomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.ProductCustom
{
    
    public ProductCustomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRANDCODE$0 = 
        new javax.xml.namespace.QName("", "brandCode");
    
    
    /**
     * Gets the "brandCode" element
     */
    public java.lang.String getBrandCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "brandCode" element
     */
    public org.apache.xmlbeans.XmlString xgetBrandCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "brandCode" element
     */
    public void setBrandCode(java.lang.String brandCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANDCODE$0);
            }
            target.setStringValue(brandCode);
        }
    }
    
    /**
     * Sets (as xml) the "brandCode" element
     */
    public void xsetBrandCode(org.apache.xmlbeans.XmlString brandCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANDCODE$0);
            }
            target.set(brandCode);
        }
    }
}
