/*
 * XML Type:  Parameter
 * Namespace: http://amdocs/iam/pd/general/Common
 * Java type: amdocs.iam.pd.general.common.Parameter
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.general.common.impl;
/**
 * An XML Parameter(@http://amdocs/iam/pd/general/Common).
 *
 * This is a complex type.
 */
public class ParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.general.common.Parameter
{
    
    public ParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULTVALUE$0 = 
        new javax.xml.namespace.QName("", "defaultValue");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("", "description");
    private static final javax.xml.namespace.QName EMPTYSTRINGALLOWED$4 = 
        new javax.xml.namespace.QName("", "emptyStringAllowed");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName VALUE$8 = 
        new javax.xml.namespace.QName("", "value");
    private static final javax.xml.namespace.QName CUSTOMPARAMETER$10 = 
        new javax.xml.namespace.QName("", "CustomParameter");
    
    
    /**
     * Gets the "defaultValue" element
     */
    public java.lang.String getDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "defaultValue" element
     */
    public boolean isNilDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
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
            return get_store().count_elements(DEFAULTVALUE$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTVALUE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTVALUE$0);
            }
            target.set(defaultValue);
        }
    }
    
    /**
     * Nils the "defaultValue" element
     */
    public void setNilDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTVALUE$0);
            }
            target.setNil();
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
            get_store().remove_element(DEFAULTVALUE$0, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "description" element
     */
    public boolean isNilDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Nils the "description" element
     */
    public void setNilDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "emptyStringAllowed" element
     */
    public boolean getEmptyStringAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPTYSTRINGALLOWED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "emptyStringAllowed" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEmptyStringAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EMPTYSTRINGALLOWED$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "emptyStringAllowed" element
     */
    public boolean isNilEmptyStringAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EMPTYSTRINGALLOWED$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "emptyStringAllowed" element
     */
    public boolean isSetEmptyStringAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMPTYSTRINGALLOWED$4) != 0;
        }
    }
    
    /**
     * Sets the "emptyStringAllowed" element
     */
    public void setEmptyStringAllowed(boolean emptyStringAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPTYSTRINGALLOWED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPTYSTRINGALLOWED$4);
            }
            target.setBooleanValue(emptyStringAllowed);
        }
    }
    
    /**
     * Sets (as xml) the "emptyStringAllowed" element
     */
    public void xsetEmptyStringAllowed(org.apache.xmlbeans.XmlBoolean emptyStringAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EMPTYSTRINGALLOWED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EMPTYSTRINGALLOWED$4);
            }
            target.set(emptyStringAllowed);
        }
    }
    
    /**
     * Nils the "emptyStringAllowed" element
     */
    public void setNilEmptyStringAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EMPTYSTRINGALLOWED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EMPTYSTRINGALLOWED$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "emptyStringAllowed" element
     */
    public void unsetEmptyStringAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMPTYSTRINGALLOWED$4, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "name" element
     */
    public boolean isNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Nils the "name" element
     */
    public void setNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "value" element
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" element
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "value" element
     */
    public boolean isNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$8);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" element
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$8);
            }
            target.set(value);
        }
    }
    
    /**
     * Nils the "value" element
     */
    public void setNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "CustomParameter" element
     */
    public amdocs.iam.pd.general.commonimpl.CustomParameter getCustomParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.commonimpl.CustomParameter target = null;
            target = (amdocs.iam.pd.general.commonimpl.CustomParameter)get_store().find_element_user(CUSTOMPARAMETER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CustomParameter" element
     */
    public boolean isNilCustomParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.commonimpl.CustomParameter target = null;
            target = (amdocs.iam.pd.general.commonimpl.CustomParameter)get_store().find_element_user(CUSTOMPARAMETER$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CustomParameter" element
     */
    public boolean isSetCustomParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMPARAMETER$10) != 0;
        }
    }
    
    /**
     * Sets the "CustomParameter" element
     */
    public void setCustomParameter(amdocs.iam.pd.general.commonimpl.CustomParameter customParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.commonimpl.CustomParameter target = null;
            target = (amdocs.iam.pd.general.commonimpl.CustomParameter)get_store().find_element_user(CUSTOMPARAMETER$10, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.commonimpl.CustomParameter)get_store().add_element_user(CUSTOMPARAMETER$10);
            }
            target.set(customParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomParameter" element
     */
    public amdocs.iam.pd.general.commonimpl.CustomParameter addNewCustomParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.commonimpl.CustomParameter target = null;
            target = (amdocs.iam.pd.general.commonimpl.CustomParameter)get_store().add_element_user(CUSTOMPARAMETER$10);
            return target;
        }
    }
    
    /**
     * Nils the "CustomParameter" element
     */
    public void setNilCustomParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.commonimpl.CustomParameter target = null;
            target = (amdocs.iam.pd.general.commonimpl.CustomParameter)get_store().find_element_user(CUSTOMPARAMETER$10, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.commonimpl.CustomParameter)get_store().add_element_user(CUSTOMPARAMETER$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CustomParameter" element
     */
    public void unsetCustomParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMPARAMETER$10, 0);
        }
    }
}
