/*
 * XML Type:  GlobalPropertiesParameter
 * Namespace: http://amdocs/iam/pd/general/Common
 * Java type: amdocs.iam.pd.general.common.GlobalPropertiesParameter
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.general.common.impl;
/**
 * An XML GlobalPropertiesParameter(@http://amdocs/iam/pd/general/Common).
 *
 * This is a complex type.
 */
public class GlobalPropertiesParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.general.common.GlobalPropertiesParameter
{
    
    public GlobalPropertiesParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERCODE$0 = 
        new javax.xml.namespace.QName("", "parameterCode");
    private static final javax.xml.namespace.QName PARAMETERNAME$2 = 
        new javax.xml.namespace.QName("", "parameterName");
    private static final javax.xml.namespace.QName PRICINGIND$4 = 
        new javax.xml.namespace.QName("", "pricingInd");
    private static final javax.xml.namespace.QName DOMAINCODE$6 = 
        new javax.xml.namespace.QName("", "domainCode");
    private static final javax.xml.namespace.QName TYPECODE$8 = 
        new javax.xml.namespace.QName("", "typeCode");
    private static final javax.xml.namespace.QName PRECISION$10 = 
        new javax.xml.namespace.QName("", "precision");
    private static final javax.xml.namespace.QName DEFAULTVALUE$12 = 
        new javax.xml.namespace.QName("", "defaultValue");
    private static final javax.xml.namespace.QName ISDISPLAY$14 = 
        new javax.xml.namespace.QName("", "isDisplay");
    private static final javax.xml.namespace.QName GLOBALPROPERTIESPARAMETERCUSTOM$16 = 
        new javax.xml.namespace.QName("", "GlobalPropertiesParameterCustom");
    private static final javax.xml.namespace.QName VALIDVALUES$18 = 
        new javax.xml.namespace.QName("", "ValidValues");
    
    
    /**
     * Gets the "parameterCode" element
     */
    public java.lang.String getParameterCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parameterCode" element
     */
    public org.apache.xmlbeans.XmlString xgetParameterCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "parameterCode" element
     */
    public void setParameterCode(java.lang.String parameterCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETERCODE$0);
            }
            target.setStringValue(parameterCode);
        }
    }
    
    /**
     * Sets (as xml) the "parameterCode" element
     */
    public void xsetParameterCode(org.apache.xmlbeans.XmlString parameterCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMETERCODE$0);
            }
            target.set(parameterCode);
        }
    }
    
    /**
     * Gets the "parameterName" element
     */
    public java.lang.String getParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parameterName" element
     */
    public org.apache.xmlbeans.XmlString xgetParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "parameterName" element
     */
    public void setParameterName(java.lang.String parameterName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETERNAME$2);
            }
            target.setStringValue(parameterName);
        }
    }
    
    /**
     * Sets (as xml) the "parameterName" element
     */
    public void xsetParameterName(org.apache.xmlbeans.XmlString parameterName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMETERNAME$2);
            }
            target.set(parameterName);
        }
    }
    
    /**
     * Gets the "pricingInd" element
     */
    public java.lang.String getPricingInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICINGIND$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pricingInd" element
     */
    public org.apache.xmlbeans.XmlString xgetPricingInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICINGIND$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pricingInd" element
     */
    public void setPricingInd(java.lang.String pricingInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICINGIND$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICINGIND$4);
            }
            target.setStringValue(pricingInd);
        }
    }
    
    /**
     * Sets (as xml) the "pricingInd" element
     */
    public void xsetPricingInd(org.apache.xmlbeans.XmlString pricingInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICINGIND$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRICINGIND$4);
            }
            target.set(pricingInd);
        }
    }
    
    /**
     * Gets the "domainCode" element
     */
    public java.lang.String getDomainCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domainCode" element
     */
    public org.apache.xmlbeans.XmlString xgetDomainCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "domainCode" element
     */
    public boolean isSetDomainCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "domainCode" element
     */
    public void setDomainCode(java.lang.String domainCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAINCODE$6);
            }
            target.setStringValue(domainCode);
        }
    }
    
    /**
     * Sets (as xml) the "domainCode" element
     */
    public void xsetDomainCode(org.apache.xmlbeans.XmlString domainCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMAINCODE$6);
            }
            target.set(domainCode);
        }
    }
    
    /**
     * Unsets the "domainCode" element
     */
    public void unsetDomainCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINCODE$6, 0);
        }
    }
    
    /**
     * Gets the "typeCode" element
     */
    public java.lang.String getTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPECODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeCode" element
     */
    public org.apache.xmlbeans.XmlString xgetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPECODE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "typeCode" element
     */
    public boolean isSetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPECODE$8) != 0;
        }
    }
    
    /**
     * Sets the "typeCode" element
     */
    public void setTypeCode(java.lang.String typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPECODE$8);
            }
            target.setStringValue(typeCode);
        }
    }
    
    /**
     * Sets (as xml) the "typeCode" element
     */
    public void xsetTypeCode(org.apache.xmlbeans.XmlString typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPECODE$8);
            }
            target.set(typeCode);
        }
    }
    
    /**
     * Unsets the "typeCode" element
     */
    public void unsetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPECODE$8, 0);
        }
    }
    
    /**
     * Gets the "precision" element
     */
    public java.lang.String getPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECISION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "precision" element
     */
    public org.apache.xmlbeans.XmlString xgetPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRECISION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "precision" element
     */
    public boolean isSetPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRECISION$10) != 0;
        }
    }
    
    /**
     * Sets the "precision" element
     */
    public void setPrecision(java.lang.String precision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECISION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECISION$10);
            }
            target.setStringValue(precision);
        }
    }
    
    /**
     * Sets (as xml) the "precision" element
     */
    public void xsetPrecision(org.apache.xmlbeans.XmlString precision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRECISION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRECISION$10);
            }
            target.set(precision);
        }
    }
    
    /**
     * Unsets the "precision" element
     */
    public void unsetPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRECISION$10, 0);
        }
    }
    
    /**
     * Gets the "defaultValue" element
     */
    public java.lang.String getDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultValue" element
     */
    public org.apache.xmlbeans.XmlString xgetDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "defaultValue" element
     */
    public boolean isSetDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTVALUE$12) != 0;
        }
    }
    
    /**
     * Sets the "defaultValue" element
     */
    public void setDefaultValue(java.lang.String defaultValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTVALUE$12);
            }
            target.setStringValue(defaultValue);
        }
    }
    
    /**
     * Sets (as xml) the "defaultValue" element
     */
    public void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTVALUE$12);
            }
            target.set(defaultValue);
        }
    }
    
    /**
     * Unsets the "defaultValue" element
     */
    public void unsetDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTVALUE$12, 0);
        }
    }
    
    /**
     * Gets the "isDisplay" element
     */
    public java.lang.String getIsDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDISPLAY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isDisplay" element
     */
    public org.apache.xmlbeans.XmlString xgetIsDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISDISPLAY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "isDisplay" element
     */
    public boolean isSetIsDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDISPLAY$14) != 0;
        }
    }
    
    /**
     * Sets the "isDisplay" element
     */
    public void setIsDisplay(java.lang.String isDisplay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDISPLAY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDISPLAY$14);
            }
            target.setStringValue(isDisplay);
        }
    }
    
    /**
     * Sets (as xml) the "isDisplay" element
     */
    public void xsetIsDisplay(org.apache.xmlbeans.XmlString isDisplay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISDISPLAY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISDISPLAY$14);
            }
            target.set(isDisplay);
        }
    }
    
    /**
     * Unsets the "isDisplay" element
     */
    public void unsetIsDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDISPLAY$14, 0);
        }
    }
    
    /**
     * Gets the "GlobalPropertiesParameterCustom" element
     */
    public amdocs.iam.pd.general.commonimpl.GlobalPropertiesParameterCustom getGlobalPropertiesParameterCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.commonimpl.GlobalPropertiesParameterCustom target = null;
            target = (amdocs.iam.pd.general.commonimpl.GlobalPropertiesParameterCustom)get_store().find_element_user(GLOBALPROPERTIESPARAMETERCUSTOM$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GlobalPropertiesParameterCustom" element
     */
    public boolean isSetGlobalPropertiesParameterCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GLOBALPROPERTIESPARAMETERCUSTOM$16) != 0;
        }
    }
    
    /**
     * Sets the "GlobalPropertiesParameterCustom" element
     */
    public void setGlobalPropertiesParameterCustom(amdocs.iam.pd.general.commonimpl.GlobalPropertiesParameterCustom globalPropertiesParameterCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.commonimpl.GlobalPropertiesParameterCustom target = null;
            target = (amdocs.iam.pd.general.commonimpl.GlobalPropertiesParameterCustom)get_store().find_element_user(GLOBALPROPERTIESPARAMETERCUSTOM$16, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.commonimpl.GlobalPropertiesParameterCustom)get_store().add_element_user(GLOBALPROPERTIESPARAMETERCUSTOM$16);
            }
            target.set(globalPropertiesParameterCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "GlobalPropertiesParameterCustom" element
     */
    public amdocs.iam.pd.general.commonimpl.GlobalPropertiesParameterCustom addNewGlobalPropertiesParameterCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.commonimpl.GlobalPropertiesParameterCustom target = null;
            target = (amdocs.iam.pd.general.commonimpl.GlobalPropertiesParameterCustom)get_store().add_element_user(GLOBALPROPERTIESPARAMETERCUSTOM$16);
            return target;
        }
    }
    
    /**
     * Unsets the "GlobalPropertiesParameterCustom" element
     */
    public void unsetGlobalPropertiesParameterCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GLOBALPROPERTIESPARAMETERCUSTOM$16, 0);
        }
    }
    
    /**
     * Gets the "ValidValues" element
     */
    public amdocs.iam.pd.general.common.PropertiesT getValidValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.PropertiesT target = null;
            target = (amdocs.iam.pd.general.common.PropertiesT)get_store().find_element_user(VALIDVALUES$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ValidValues" element
     */
    public boolean isSetValidValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDVALUES$18) != 0;
        }
    }
    
    /**
     * Sets the "ValidValues" element
     */
    public void setValidValues(amdocs.iam.pd.general.common.PropertiesT validValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.PropertiesT target = null;
            target = (amdocs.iam.pd.general.common.PropertiesT)get_store().find_element_user(VALIDVALUES$18, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.PropertiesT)get_store().add_element_user(VALIDVALUES$18);
            }
            target.set(validValues);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidValues" element
     */
    public amdocs.iam.pd.general.common.PropertiesT addNewValidValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.PropertiesT target = null;
            target = (amdocs.iam.pd.general.common.PropertiesT)get_store().add_element_user(VALIDVALUES$18);
            return target;
        }
    }
    
    /**
     * Unsets the "ValidValues" element
     */
    public void unsetValidValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDVALUES$18, 0);
        }
    }
}
