/*
 * XML Type:  ProductCustom
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutputImpl
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.impl;
/**
 * An XML ProductCustom(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutputImpl).
 *
 * This is a complex type.
 */
public class ProductCustomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom
{
    
    public ProductCustomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRANDCODE$0 = 
        new javax.xml.namespace.QName("", "brandCode");
    private static final javax.xml.namespace.QName PRODUCTBRANDSETS$2 = 
        new javax.xml.namespace.QName("", "productBrandSets");
    private static final javax.xml.namespace.QName DEFAULTOFFERCODE$4 = 
        new javax.xml.namespace.QName("", "defaultOfferCode");
    
    
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
     * True if has "brandCode" element
     */
    public boolean isSetBrandCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRANDCODE$0) != 0;
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
     * Unsets the "brandCode" element
     */
    public void unsetBrandCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRANDCODE$0, 0);
        }
    }
    
    /**
     * Gets the "productBrandSets" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets getProductBrandSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets)get_store().find_element_user(PRODUCTBRANDSETS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "productBrandSets" element
     */
    public boolean isSetProductBrandSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTBRANDSETS$2) != 0;
        }
    }
    
    /**
     * Sets the "productBrandSets" element
     */
    public void setProductBrandSets(amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets productBrandSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets)get_store().find_element_user(PRODUCTBRANDSETS$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets)get_store().add_element_user(PRODUCTBRANDSETS$2);
            }
            target.set(productBrandSets);
        }
    }
    
    /**
     * Appends and returns a new empty "productBrandSets" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets addNewProductBrandSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets)get_store().add_element_user(PRODUCTBRANDSETS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "productBrandSets" element
     */
    public void unsetProductBrandSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTBRANDSETS$2, 0);
        }
    }
    
    /**
     * Gets the "defaultOfferCode" element
     */
    public java.lang.String getDefaultOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTOFFERCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultOfferCode" element
     */
    public org.apache.xmlbeans.XmlString xgetDefaultOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTOFFERCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "defaultOfferCode" element
     */
    public boolean isSetDefaultOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTOFFERCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "defaultOfferCode" element
     */
    public void setDefaultOfferCode(java.lang.String defaultOfferCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTOFFERCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTOFFERCODE$4);
            }
            target.setStringValue(defaultOfferCode);
        }
    }
    
    /**
     * Sets (as xml) the "defaultOfferCode" element
     */
    public void xsetDefaultOfferCode(org.apache.xmlbeans.XmlString defaultOfferCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTOFFERCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTOFFERCODE$4);
            }
            target.set(defaultOfferCode);
        }
    }
    
    /**
     * Unsets the "defaultOfferCode" element
     */
    public void unsetDefaultOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTOFFERCODE$4, 0);
        }
    }
}
