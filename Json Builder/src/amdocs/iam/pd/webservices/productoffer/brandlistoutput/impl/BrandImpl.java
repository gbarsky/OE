/*
 * XML Type:  Brand
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/BrandListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.brandlistoutput.impl;
/**
 * An XML Brand(@http://amdocs/iam/pd/webservices/productOffer/BrandListOutput).
 *
 * This is a complex type.
 */
public class BrandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand
{
    
    public BrandImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRANDCODE$0 = 
        new javax.xml.namespace.QName("", "brandCode");
    private static final javax.xml.namespace.QName BRANDNAME$2 = 
        new javax.xml.namespace.QName("", "brandName");
    
    
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
    
    /**
     * Gets the "brandName" element
     */
    public java.lang.String getBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "brandName" element
     */
    public org.apache.xmlbeans.XmlString xgetBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "brandName" element
     */
    public void setBrandName(java.lang.String brandName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANDNAME$2);
            }
            target.setStringValue(brandName);
        }
    }
    
    /**
     * Sets (as xml) the "brandName" element
     */
    public void xsetBrandName(org.apache.xmlbeans.XmlString brandName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANDNAME$2);
            }
            target.set(brandName);
        }
    }
}
