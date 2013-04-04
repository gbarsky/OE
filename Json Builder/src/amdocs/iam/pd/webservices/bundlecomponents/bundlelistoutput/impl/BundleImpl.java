/*
 * XML Type:  Bundle
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleListOutput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.impl;
/**
 * An XML Bundle(@http://amdocs/iam/pd/webservices/bundleComponents/BundleListOutput).
 *
 * This is a complex type.
 */
public class BundleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Bundle
{
    
    public BundleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUNDLECODE$0 = 
        new javax.xml.namespace.QName("", "bundleCode");
    private static final javax.xml.namespace.QName BUNDLENAME$2 = 
        new javax.xml.namespace.QName("", "bundleName");
    private static final javax.xml.namespace.QName BUNDLEDESCRIPTION$4 = 
        new javax.xml.namespace.QName("", "bundleDescription");
    private static final javax.xml.namespace.QName EFFECTIVEDATE$6 = 
        new javax.xml.namespace.QName("", "effectiveDate");
    private static final javax.xml.namespace.QName EXPIRATIONDATE$8 = 
        new javax.xml.namespace.QName("", "expirationDate");
    private static final javax.xml.namespace.QName MINCOMPONENTSNUM$10 = 
        new javax.xml.namespace.QName("", "minComponentsNum");
    private static final javax.xml.namespace.QName MAXCOMPONENTSNUM$12 = 
        new javax.xml.namespace.QName("", "maxComponentsNum");
    private static final javax.xml.namespace.QName FIXEDPACKAGEIND$14 = 
        new javax.xml.namespace.QName("", "fixedPackageInd");
    private static final javax.xml.namespace.QName BUNDLECUSTOM$16 = 
        new javax.xml.namespace.QName("", "BundleCustom");
    private static final javax.xml.namespace.QName COMPONENTS$18 = 
        new javax.xml.namespace.QName("", "Components");
    
    
    /**
     * Gets the "bundleCode" element
     */
    public java.lang.String getBundleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bundleCode" element
     */
    public org.apache.xmlbeans.XmlString xgetBundleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLECODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bundleCode" element
     */
    public void setBundleCode(java.lang.String bundleCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUNDLECODE$0);
            }
            target.setStringValue(bundleCode);
        }
    }
    
    /**
     * Sets (as xml) the "bundleCode" element
     */
    public void xsetBundleCode(org.apache.xmlbeans.XmlString bundleCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUNDLECODE$0);
            }
            target.set(bundleCode);
        }
    }
    
    /**
     * Gets the "bundleName" element
     */
    public java.lang.String getBundleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bundleName" element
     */
    public org.apache.xmlbeans.XmlString xgetBundleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLENAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bundleName" element
     */
    public void setBundleName(java.lang.String bundleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUNDLENAME$2);
            }
            target.setStringValue(bundleName);
        }
    }
    
    /**
     * Sets (as xml) the "bundleName" element
     */
    public void xsetBundleName(org.apache.xmlbeans.XmlString bundleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUNDLENAME$2);
            }
            target.set(bundleName);
        }
    }
    
    /**
     * Gets the "bundleDescription" element
     */
    public java.lang.String getBundleDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLEDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bundleDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetBundleDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLEDESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bundleDescription" element
     */
    public void setBundleDescription(java.lang.String bundleDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLEDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUNDLEDESCRIPTION$4);
            }
            target.setStringValue(bundleDescription);
        }
    }
    
    /**
     * Sets (as xml) the "bundleDescription" element
     */
    public void xsetBundleDescription(org.apache.xmlbeans.XmlString bundleDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLEDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUNDLEDESCRIPTION$4);
            }
            target.set(bundleDescription);
        }
    }
    
    /**
     * Gets the "effectiveDate" element
     */
    public java.lang.String getEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "effectiveDate" element
     */
    public org.apache.xmlbeans.XmlString xgetEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "effectiveDate" element
     */
    public void setEffectiveDate(java.lang.String effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEDATE$6);
            }
            target.setStringValue(effectiveDate);
        }
    }
    
    /**
     * Sets (as xml) the "effectiveDate" element
     */
    public void xsetEffectiveDate(org.apache.xmlbeans.XmlString effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EFFECTIVEDATE$6);
            }
            target.set(effectiveDate);
        }
    }
    
    /**
     * Gets the "expirationDate" element
     */
    public java.lang.String getExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expirationDate" element
     */
    public org.apache.xmlbeans.XmlString xgetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "expirationDate" element
     */
    public boolean isSetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRATIONDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "expirationDate" element
     */
    public void setExpirationDate(java.lang.String expirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRATIONDATE$8);
            }
            target.setStringValue(expirationDate);
        }
    }
    
    /**
     * Sets (as xml) the "expirationDate" element
     */
    public void xsetExpirationDate(org.apache.xmlbeans.XmlString expirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPIRATIONDATE$8);
            }
            target.set(expirationDate);
        }
    }
    
    /**
     * Unsets the "expirationDate" element
     */
    public void unsetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRATIONDATE$8, 0);
        }
    }
    
    /**
     * Gets the "minComponentsNum" element
     */
    public java.lang.String getMinComponentsNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINCOMPONENTSNUM$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "minComponentsNum" element
     */
    public amdocs.iam.pd.general.common.Long xgetMinComponentsNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(MINCOMPONENTSNUM$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minComponentsNum" element
     */
    public void setMinComponentsNum(java.lang.String minComponentsNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINCOMPONENTSNUM$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINCOMPONENTSNUM$10);
            }
            target.setStringValue(minComponentsNum);
        }
    }
    
    /**
     * Sets (as xml) the "minComponentsNum" element
     */
    public void xsetMinComponentsNum(amdocs.iam.pd.general.common.Long minComponentsNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(MINCOMPONENTSNUM$10, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(MINCOMPONENTSNUM$10);
            }
            target.set(minComponentsNum);
        }
    }
    
    /**
     * Gets the "maxComponentsNum" element
     */
    public java.lang.String getMaxComponentsNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXCOMPONENTSNUM$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxComponentsNum" element
     */
    public amdocs.iam.pd.general.common.Long xgetMaxComponentsNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(MAXCOMPONENTSNUM$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxComponentsNum" element
     */
    public void setMaxComponentsNum(java.lang.String maxComponentsNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXCOMPONENTSNUM$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXCOMPONENTSNUM$12);
            }
            target.setStringValue(maxComponentsNum);
        }
    }
    
    /**
     * Sets (as xml) the "maxComponentsNum" element
     */
    public void xsetMaxComponentsNum(amdocs.iam.pd.general.common.Long maxComponentsNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(MAXCOMPONENTSNUM$12, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(MAXCOMPONENTSNUM$12);
            }
            target.set(maxComponentsNum);
        }
    }
    
    /**
     * Gets the "fixedPackageInd" element
     */
    public java.lang.String getFixedPackageInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIXEDPACKAGEIND$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fixedPackageInd" element
     */
    public org.apache.xmlbeans.XmlString xgetFixedPackageInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIXEDPACKAGEIND$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fixedPackageInd" element
     */
    public void setFixedPackageInd(java.lang.String fixedPackageInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIXEDPACKAGEIND$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIXEDPACKAGEIND$14);
            }
            target.setStringValue(fixedPackageInd);
        }
    }
    
    /**
     * Sets (as xml) the "fixedPackageInd" element
     */
    public void xsetFixedPackageInd(org.apache.xmlbeans.XmlString fixedPackageInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIXEDPACKAGEIND$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIXEDPACKAGEIND$14);
            }
            target.set(fixedPackageInd);
        }
    }
    
    /**
     * Gets the "BundleCustom" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutputimpl.BundleCustom getBundleCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutputimpl.BundleCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutputimpl.BundleCustom)get_store().find_element_user(BUNDLECUSTOM$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BundleCustom" element
     */
    public boolean isSetBundleCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUNDLECUSTOM$16) != 0;
        }
    }
    
    /**
     * Sets the "BundleCustom" element
     */
    public void setBundleCustom(amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutputimpl.BundleCustom bundleCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutputimpl.BundleCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutputimpl.BundleCustom)get_store().find_element_user(BUNDLECUSTOM$16, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutputimpl.BundleCustom)get_store().add_element_user(BUNDLECUSTOM$16);
            }
            target.set(bundleCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "BundleCustom" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutputimpl.BundleCustom addNewBundleCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutputimpl.BundleCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutputimpl.BundleCustom)get_store().add_element_user(BUNDLECUSTOM$16);
            return target;
        }
    }
    
    /**
     * Unsets the "BundleCustom" element
     */
    public void unsetBundleCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUNDLECUSTOM$16, 0);
        }
    }
    
    /**
     * Gets array of all "Components" elements
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components[] getComponentsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENTS$18, targetList);
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components[] result = new amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Components" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components getComponentsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components)get_store().find_element_user(COMPONENTS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Components" element
     */
    public int sizeOfComponentsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTS$18);
        }
    }
    
    /**
     * Sets array of all "Components" element
     */
    public void setComponentsArray(amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components[] componentsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentsArray, COMPONENTS$18);
        }
    }
    
    /**
     * Sets ith "Components" element
     */
    public void setComponentsArray(int i, amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components components)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components)get_store().find_element_user(COMPONENTS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(components);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Components" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components insertNewComponents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components)get_store().insert_element_user(COMPONENTS$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Components" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components addNewComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.Components)get_store().add_element_user(COMPONENTS$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "Components" element
     */
    public void removeComponents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTS$18, i);
        }
    }
}
