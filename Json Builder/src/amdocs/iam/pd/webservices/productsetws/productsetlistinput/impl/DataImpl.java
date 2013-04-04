/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/productSetWS/ProductSetListInput
 * Java type: amdocs.iam.pd.webservices.productsetws.productsetlistinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productsetws.productsetlistinput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/productSetWS/ProductSetListInput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productsetws.productsetlistinput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTS$0 = 
        new javax.xml.namespace.QName("", "Products");
    private static final javax.xml.namespace.QName FULLIND$2 = 
        new javax.xml.namespace.QName("", "fullInd");
    
    
    /**
     * Gets the "Products" element
     */
    public amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products getProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products)get_store().find_element_user(PRODUCTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Products" element
     */
    public void setProducts(amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products products)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products)get_store().find_element_user(PRODUCTS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products)get_store().add_element_user(PRODUCTS$0);
            }
            target.set(products);
        }
    }
    
    /**
     * Appends and returns a new empty "Products" element
     */
    public amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products addNewProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistinput.Products)get_store().add_element_user(PRODUCTS$0);
            return target;
        }
    }
    
    /**
     * Gets the "fullInd" attribute
     */
    public java.lang.String getFullInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLIND$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullInd" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFullInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FULLIND$2);
            return target;
        }
    }
    
    /**
     * Sets the "fullInd" attribute
     */
    public void setFullInd(java.lang.String fullInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLIND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLIND$2);
            }
            target.setStringValue(fullInd);
        }
    }
    
    /**
     * Sets (as xml) the "fullInd" attribute
     */
    public void xsetFullInd(org.apache.xmlbeans.XmlString fullInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FULLIND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FULLIND$2);
            }
            target.set(fullInd);
        }
    }
}
