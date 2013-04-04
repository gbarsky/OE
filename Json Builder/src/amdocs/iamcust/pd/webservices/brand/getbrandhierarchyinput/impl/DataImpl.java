/*
 * XML Type:  Data
 * Namespace: http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyInput
 * Java type: amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.impl;
/**
 * An XML Data(@http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyInput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName PRODUCTVERSION$2 = 
        new javax.xml.namespace.QName("", "productVersion");
    private static final javax.xml.namespace.QName RELATIONTYPE$4 = 
        new javax.xml.namespace.QName("", "relationType");
    private static final javax.xml.namespace.QName PRODUCTIONINDICATOR$6 = 
        new javax.xml.namespace.QName("", "productionIndicator");
    
    
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
     * Gets the "productVersion" element
     */
    public java.lang.String getProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productVersion" element
     */
    public amdocs.iam.pd.general.common.Long xgetProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(PRODUCTVERSION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productVersion" element
     */
    public void setProductVersion(java.lang.String productVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTVERSION$2);
            }
            target.setStringValue(productVersion);
        }
    }
    
    /**
     * Sets (as xml) the "productVersion" element
     */
    public void xsetProductVersion(amdocs.iam.pd.general.common.Long productVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(PRODUCTVERSION$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(PRODUCTVERSION$2);
            }
            target.set(productVersion);
        }
    }
    
    /**
     * Gets the "relationType" element
     */
    public java.lang.String getRelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relationType" element
     */
    public org.apache.xmlbeans.XmlString xgetRelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "relationType" element
     */
    public boolean isSetRelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "relationType" element
     */
    public void setRelationType(java.lang.String relationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONTYPE$4);
            }
            target.setStringValue(relationType);
        }
    }
    
    /**
     * Sets (as xml) the "relationType" element
     */
    public void xsetRelationType(org.apache.xmlbeans.XmlString relationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONTYPE$4);
            }
            target.set(relationType);
        }
    }
    
    /**
     * Unsets the "relationType" element
     */
    public void unsetRelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "productionIndicator" element
     */
    public java.lang.String getProductionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONINDICATOR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productionIndicator" element
     */
    public org.apache.xmlbeans.XmlString xgetProductionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTIONINDICATOR$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "productionIndicator" element
     */
    public boolean isSetProductionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONINDICATOR$6) != 0;
        }
    }
    
    /**
     * Sets the "productionIndicator" element
     */
    public void setProductionIndicator(java.lang.String productionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONINDICATOR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTIONINDICATOR$6);
            }
            target.setStringValue(productionIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "productionIndicator" element
     */
    public void xsetProductionIndicator(org.apache.xmlbeans.XmlString productionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTIONINDICATOR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTIONINDICATOR$6);
            }
            target.set(productionIndicator);
        }
    }
    
    /**
     * Unsets the "productionIndicator" element
     */
    public void unsetProductionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONINDICATOR$6, 0);
        }
    }
}
