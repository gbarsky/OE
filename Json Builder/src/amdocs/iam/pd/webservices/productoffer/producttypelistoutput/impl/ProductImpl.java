/*
 * XML Type:  Product
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/ProductTypeListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.producttypelistoutput.impl;
/**
 * An XML Product(@http://amdocs/iam/pd/webservices/productOffer/ProductTypeListOutput).
 *
 * This is a complex type.
 */
public class ProductImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.producttypelistoutput.Product
{
    
    public ProductImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTTYPE$0 = 
        new javax.xml.namespace.QName("", "productType");
    private static final javax.xml.namespace.QName PRODUCTTYPENAME$2 = 
        new javax.xml.namespace.QName("", "productTypeName");
    private static final javax.xml.namespace.QName PRODUCTCUSTOM$4 = 
        new javax.xml.namespace.QName("", "ProductCustom");
    
    
    /**
     * Gets the "productType" element
     */
    public java.lang.String getProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productType" element
     */
    public org.apache.xmlbeans.XmlString xgetProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productType" element
     */
    public void setProductType(java.lang.String productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPE$0);
            }
            target.setStringValue(productType);
        }
    }
    
    /**
     * Sets (as xml) the "productType" element
     */
    public void xsetProductType(org.apache.xmlbeans.XmlString productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTTYPE$0);
            }
            target.set(productType);
        }
    }
    
    /**
     * Gets the "productTypeName" element
     */
    public java.lang.String getProductTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productTypeName" element
     */
    public org.apache.xmlbeans.XmlString xgetProductTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPENAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productTypeName" element
     */
    public void setProductTypeName(java.lang.String productTypeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPENAME$2);
            }
            target.setStringValue(productTypeName);
        }
    }
    
    /**
     * Sets (as xml) the "productTypeName" element
     */
    public void xsetProductTypeName(org.apache.xmlbeans.XmlString productTypeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTTYPENAME$2);
            }
            target.set(productTypeName);
        }
    }
    
    /**
     * Gets the "ProductCustom" element
     */
    public amdocs.iam.pd.webservices.productoffer.producttypelistoutputimpl.ProductCustom getProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistoutputimpl.ProductCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistoutputimpl.ProductCustom)get_store().find_element_user(PRODUCTCUSTOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductCustom" element
     */
    public boolean isSetProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCUSTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "ProductCustom" element
     */
    public void setProductCustom(amdocs.iam.pd.webservices.productoffer.producttypelistoutputimpl.ProductCustom productCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistoutputimpl.ProductCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistoutputimpl.ProductCustom)get_store().find_element_user(PRODUCTCUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productoffer.producttypelistoutputimpl.ProductCustom)get_store().add_element_user(PRODUCTCUSTOM$4);
            }
            target.set(productCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "ProductCustom" element
     */
    public amdocs.iam.pd.webservices.productoffer.producttypelistoutputimpl.ProductCustom addNewProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistoutputimpl.ProductCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistoutputimpl.ProductCustom)get_store().add_element_user(PRODUCTCUSTOM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductCustom" element
     */
    public void unsetProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCUSTOM$4, 0);
        }
    }
}
