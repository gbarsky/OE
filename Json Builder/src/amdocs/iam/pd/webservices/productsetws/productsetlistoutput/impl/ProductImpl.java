/*
 * XML Type:  Product
 * Namespace: http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput
 * Java type: amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Product
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productsetws.productsetlistoutput.impl;
/**
 * An XML Product(@http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput).
 *
 * This is a complex type.
 */
public class ProductImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productsetws.productsetlistoutput.Product
{
    
    public ProductImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName INCLUSIONTYPE$2 = 
        new javax.xml.namespace.QName("", "inclusionType");
    
    
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
     * Gets the "inclusionType" element
     */
    public java.lang.String getInclusionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUSIONTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "inclusionType" element
     */
    public org.apache.xmlbeans.XmlString xgetInclusionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCLUSIONTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "inclusionType" element
     */
    public void setInclusionType(java.lang.String inclusionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUSIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUSIONTYPE$2);
            }
            target.setStringValue(inclusionType);
        }
    }
    
    /**
     * Sets (as xml) the "inclusionType" element
     */
    public void xsetInclusionType(org.apache.xmlbeans.XmlString inclusionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCLUSIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCLUSIONTYPE$2);
            }
            target.set(inclusionType);
        }
    }
}
