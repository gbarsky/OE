/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/productRelations/ProductListInput
 * Java type: amdocs.iam.pd.webservices.productrelations.productlistinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productrelations.productlistinput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/productRelations/ProductListInput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productrelations.productlistinput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIATYPE$0 = 
        new javax.xml.namespace.QName("", "mediaType");
    private static final javax.xml.namespace.QName PRODUCTTYPE$2 = 
        new javax.xml.namespace.QName("", "productType");
    private static final javax.xml.namespace.QName RELATIONS$4 = 
        new javax.xml.namespace.QName("", "Relations");
    private static final javax.xml.namespace.QName SELFSERVICEIND$6 = 
        new javax.xml.namespace.QName("", "selfServiceInd");
    private static final javax.xml.namespace.QName INVENTORYIND$8 = 
        new javax.xml.namespace.QName("", "inventoryInd");
    private static final javax.xml.namespace.QName LANGUAGE$10 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName HEADING$12 = 
        new javax.xml.namespace.QName("", "heading");
    private static final javax.xml.namespace.QName BRANDCODE$14 = 
        new javax.xml.namespace.QName("", "brandCode");
    private static final javax.xml.namespace.QName CUSTOMERPARAMETERS$16 = 
        new javax.xml.namespace.QName("", "CustomerParameters");
    private static final javax.xml.namespace.QName DATACUSTOM$18 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
    /**
     * Gets the "mediaType" element
     */
    public java.lang.String getMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediaType" element
     */
    public org.apache.xmlbeans.XmlString xgetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "mediaType" element
     */
    public boolean isSetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDIATYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "mediaType" element
     */
    public void setMediaType(java.lang.String mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIATYPE$0);
            }
            target.setStringValue(mediaType);
        }
    }
    
    /**
     * Sets (as xml) the "mediaType" element
     */
    public void xsetMediaType(org.apache.xmlbeans.XmlString mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIATYPE$0);
            }
            target.set(mediaType);
        }
    }
    
    /**
     * Unsets the "mediaType" element
     */
    public void unsetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDIATYPE$0, 0);
        }
    }
    
    /**
     * Gets the "productType" element
     */
    public java.lang.String getProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "productType" element
     */
    public boolean isSetProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTTYPE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTTYPE$2);
            }
            target.set(productType);
        }
    }
    
    /**
     * Unsets the "productType" element
     */
    public void unsetProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTTYPE$2, 0);
        }
    }
    
    /**
     * Gets the "Relations" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistinput.Relations getRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinput.Relations target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinput.Relations)get_store().find_element_user(RELATIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Relations" element
     */
    public boolean isSetRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONS$4) != 0;
        }
    }
    
    /**
     * Sets the "Relations" element
     */
    public void setRelations(amdocs.iam.pd.webservices.productrelations.productlistinput.Relations relations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinput.Relations target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinput.Relations)get_store().find_element_user(RELATIONS$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productrelations.productlistinput.Relations)get_store().add_element_user(RELATIONS$4);
            }
            target.set(relations);
        }
    }
    
    /**
     * Appends and returns a new empty "Relations" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistinput.Relations addNewRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinput.Relations target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinput.Relations)get_store().add_element_user(RELATIONS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Relations" element
     */
    public void unsetRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONS$4, 0);
        }
    }
    
    /**
     * Gets the "selfServiceInd" element
     */
    public java.lang.String getSelfServiceInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELFSERVICEIND$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "selfServiceInd" element
     */
    public org.apache.xmlbeans.XmlString xgetSelfServiceInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELFSERVICEIND$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "selfServiceInd" element
     */
    public boolean isSetSelfServiceInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELFSERVICEIND$6) != 0;
        }
    }
    
    /**
     * Sets the "selfServiceInd" element
     */
    public void setSelfServiceInd(java.lang.String selfServiceInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELFSERVICEIND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELFSERVICEIND$6);
            }
            target.setStringValue(selfServiceInd);
        }
    }
    
    /**
     * Sets (as xml) the "selfServiceInd" element
     */
    public void xsetSelfServiceInd(org.apache.xmlbeans.XmlString selfServiceInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELFSERVICEIND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELFSERVICEIND$6);
            }
            target.set(selfServiceInd);
        }
    }
    
    /**
     * Unsets the "selfServiceInd" element
     */
    public void unsetSelfServiceInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELFSERVICEIND$6, 0);
        }
    }
    
    /**
     * Gets the "inventoryInd" element
     */
    public java.lang.String getInventoryInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVENTORYIND$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "inventoryInd" element
     */
    public org.apache.xmlbeans.XmlString xgetInventoryInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVENTORYIND$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "inventoryInd" element
     */
    public boolean isSetInventoryInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVENTORYIND$8) != 0;
        }
    }
    
    /**
     * Sets the "inventoryInd" element
     */
    public void setInventoryInd(java.lang.String inventoryInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVENTORYIND$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVENTORYIND$8);
            }
            target.setStringValue(inventoryInd);
        }
    }
    
    /**
     * Sets (as xml) the "inventoryInd" element
     */
    public void xsetInventoryInd(org.apache.xmlbeans.XmlString inventoryInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVENTORYIND$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INVENTORYIND$8);
            }
            target.set(inventoryInd);
        }
    }
    
    /**
     * Unsets the "inventoryInd" element
     */
    public void unsetInventoryInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVENTORYIND$8, 0);
        }
    }
    
    /**
     * Gets the "language" element
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" element
     */
    public org.apache.xmlbeans.XmlString xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "language" element
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGE$10) != 0;
        }
    }
    
    /**
     * Sets the "language" element
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$10);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" element
     */
    public void xsetLanguage(org.apache.xmlbeans.XmlString language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGE$10);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "language" element
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGE$10, 0);
        }
    }
    
    /**
     * Gets the "heading" element
     */
    public java.lang.String getHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADING$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "heading" element
     */
    public org.apache.xmlbeans.XmlString xgetHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADING$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "heading" element
     */
    public boolean isSetHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADING$12) != 0;
        }
    }
    
    /**
     * Sets the "heading" element
     */
    public void setHeading(java.lang.String heading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADING$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADING$12);
            }
            target.setStringValue(heading);
        }
    }
    
    /**
     * Sets (as xml) the "heading" element
     */
    public void xsetHeading(org.apache.xmlbeans.XmlString heading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADING$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEADING$12);
            }
            target.set(heading);
        }
    }
    
    /**
     * Unsets the "heading" element
     */
    public void unsetHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADING$12, 0);
        }
    }
    
    /**
     * Gets the "brandCode" element
     */
    public java.lang.String getBrandCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDCODE$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDCODE$14, 0);
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
            return get_store().count_elements(BRANDCODE$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDCODE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANDCODE$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDCODE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANDCODE$14);
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
            get_store().remove_element(BRANDCODE$14, 0);
        }
    }
    
    /**
     * Gets the "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistinput.CustomerParameterTypes getCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomerParameters" element
     */
    public boolean isSetCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERPARAMETERS$16) != 0;
        }
    }
    
    /**
     * Sets the "CustomerParameters" element
     */
    public void setCustomerParameters(amdocs.iam.pd.webservices.productrelations.productlistinput.CustomerParameterTypes customerParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$16, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productrelations.productlistinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$16);
            }
            target.set(customerParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistinput.CustomerParameterTypes addNewCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomerParameters" element
     */
    public void unsetCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERPARAMETERS$16, 0);
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistinputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataCustom" element
     */
    public boolean isSetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACUSTOM$18) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.productrelations.productlistinputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$18, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productrelations.productlistinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$18);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistinputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$18);
            return target;
        }
    }
    
    /**
     * Unsets the "DataCustom" element
     */
    public void unsetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACUSTOM$18, 0);
        }
    }
}
