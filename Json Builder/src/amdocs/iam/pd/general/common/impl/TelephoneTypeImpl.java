/*
 * XML Type:  TelephoneType
 * Namespace: http://amdocs/iam/pd/general/Common
 * Java type: amdocs.iam.pd.general.common.TelephoneType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.general.common.impl;
/**
 * An XML TelephoneType(@http://amdocs/iam/pd/general/Common).
 *
 * This is a complex type.
 */
public class TelephoneTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.general.common.TelephoneType
{
    
    public TelephoneTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NPA$0 = 
        new javax.xml.namespace.QName("", "NPA");
    private static final javax.xml.namespace.QName COP$2 = 
        new javax.xml.namespace.QName("", "COP");
    private static final javax.xml.namespace.QName LINE$4 = 
        new javax.xml.namespace.QName("", "LINE");
    private static final javax.xml.namespace.QName FORMATEDPHONE$6 = 
        new javax.xml.namespace.QName("", "FormatedPhone");
    
    
    /**
     * Gets the "NPA" element
     */
    public java.lang.String getNPA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NPA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NPA" element
     */
    public amdocs.iam.pd.general.common.TelephoneType.NPA xgetNPA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.TelephoneType.NPA target = null;
            target = (amdocs.iam.pd.general.common.TelephoneType.NPA)get_store().find_element_user(NPA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NPA" element
     */
    public void setNPA(java.lang.String npa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NPA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NPA$0);
            }
            target.setStringValue(npa);
        }
    }
    
    /**
     * Sets (as xml) the "NPA" element
     */
    public void xsetNPA(amdocs.iam.pd.general.common.TelephoneType.NPA npa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.TelephoneType.NPA target = null;
            target = (amdocs.iam.pd.general.common.TelephoneType.NPA)get_store().find_element_user(NPA$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.TelephoneType.NPA)get_store().add_element_user(NPA$0);
            }
            target.set(npa);
        }
    }
    
    /**
     * Gets the "COP" element
     */
    public java.lang.String getCOP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "COP" element
     */
    public amdocs.iam.pd.general.common.TelephoneType.COP xgetCOP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.TelephoneType.COP target = null;
            target = (amdocs.iam.pd.general.common.TelephoneType.COP)get_store().find_element_user(COP$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "COP" element
     */
    public void setCOP(java.lang.String cop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COP$2);
            }
            target.setStringValue(cop);
        }
    }
    
    /**
     * Sets (as xml) the "COP" element
     */
    public void xsetCOP(amdocs.iam.pd.general.common.TelephoneType.COP cop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.TelephoneType.COP target = null;
            target = (amdocs.iam.pd.general.common.TelephoneType.COP)get_store().find_element_user(COP$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.TelephoneType.COP)get_store().add_element_user(COP$2);
            }
            target.set(cop);
        }
    }
    
    /**
     * Gets the "LINE" element
     */
    public java.lang.String getLINE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LINE" element
     */
    public amdocs.iam.pd.general.common.TelephoneType.LINE xgetLINE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.TelephoneType.LINE target = null;
            target = (amdocs.iam.pd.general.common.TelephoneType.LINE)get_store().find_element_user(LINE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LINE" element
     */
    public void setLINE(java.lang.String line)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINE$4);
            }
            target.setStringValue(line);
        }
    }
    
    /**
     * Sets (as xml) the "LINE" element
     */
    public void xsetLINE(amdocs.iam.pd.general.common.TelephoneType.LINE line)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.TelephoneType.LINE target = null;
            target = (amdocs.iam.pd.general.common.TelephoneType.LINE)get_store().find_element_user(LINE$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.TelephoneType.LINE)get_store().add_element_user(LINE$4);
            }
            target.set(line);
        }
    }
    
    /**
     * Gets the "FormatedPhone" element
     */
    public java.lang.String getFormatedPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATEDPHONE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FormatedPhone" element
     */
    public org.apache.xmlbeans.XmlString xgetFormatedPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMATEDPHONE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "FormatedPhone" element
     */
    public boolean isSetFormatedPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMATEDPHONE$6) != 0;
        }
    }
    
    /**
     * Sets the "FormatedPhone" element
     */
    public void setFormatedPhone(java.lang.String formatedPhone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATEDPHONE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMATEDPHONE$6);
            }
            target.setStringValue(formatedPhone);
        }
    }
    
    /**
     * Sets (as xml) the "FormatedPhone" element
     */
    public void xsetFormatedPhone(org.apache.xmlbeans.XmlString formatedPhone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMATEDPHONE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMATEDPHONE$6);
            }
            target.set(formatedPhone);
        }
    }
    
    /**
     * Unsets the "FormatedPhone" element
     */
    public void unsetFormatedPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMATEDPHONE$6, 0);
        }
    }
    /**
     * An XML NPA(@).
     *
     * This is an atomic type that is a restriction of amdocs.iam.pd.general.common.TelephoneType$NPA.
     */
    public static class NPAImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements amdocs.iam.pd.general.common.TelephoneType.NPA
    {
        
        public NPAImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NPAImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML COP(@).
     *
     * This is an atomic type that is a restriction of amdocs.iam.pd.general.common.TelephoneType$COP.
     */
    public static class COPImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements amdocs.iam.pd.general.common.TelephoneType.COP
    {
        
        public COPImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected COPImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML LINE(@).
     *
     * This is an atomic type that is a restriction of amdocs.iam.pd.general.common.TelephoneType$LINE.
     */
    public static class LINEImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements amdocs.iam.pd.general.common.TelephoneType.LINE
    {
        
        public LINEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected LINEImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
