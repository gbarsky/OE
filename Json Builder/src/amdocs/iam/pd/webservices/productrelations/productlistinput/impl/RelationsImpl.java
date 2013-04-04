/*
 * XML Type:  Relations
 * Namespace: http://amdocs/iam/pd/webservices/productRelations/ProductListInput
 * Java type: amdocs.iam.pd.webservices.productrelations.productlistinput.Relations
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productrelations.productlistinput.impl;
/**
 * An XML Relations(@http://amdocs/iam/pd/webservices/productRelations/ProductListInput).
 *
 * This is a complex type.
 */
public class RelationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productrelations.productlistinput.Relations
{
    
    public RelationsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEPRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "sourceProductCode");
    private static final javax.xml.namespace.QName SOURCEPRODUCTVERSION$2 = 
        new javax.xml.namespace.QName("", "sourceProductVersion");
    private static final javax.xml.namespace.QName RELATIONCUSTOM$4 = 
        new javax.xml.namespace.QName("", "RelationCustom");
    private static final javax.xml.namespace.QName RELATIONTYPES$6 = 
        new javax.xml.namespace.QName("", "RelationTypes");
    
    
    /**
     * Gets the "sourceProductCode" element
     */
    public java.lang.String getSourceProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEPRODUCTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceProductCode" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEPRODUCTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceProductCode" element
     */
    public void setSourceProductCode(java.lang.String sourceProductCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEPRODUCTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEPRODUCTCODE$0);
            }
            target.setStringValue(sourceProductCode);
        }
    }
    
    /**
     * Sets (as xml) the "sourceProductCode" element
     */
    public void xsetSourceProductCode(org.apache.xmlbeans.XmlString sourceProductCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEPRODUCTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEPRODUCTCODE$0);
            }
            target.set(sourceProductCode);
        }
    }
    
    /**
     * Gets the "sourceProductVersion" element
     */
    public int getSourceProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEPRODUCTVERSION$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceProductVersion" element
     */
    public amdocs.iam.pd.general.common.VERSIONType xgetSourceProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.VERSIONType target = null;
            target = (amdocs.iam.pd.general.common.VERSIONType)get_store().find_element_user(SOURCEPRODUCTVERSION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceProductVersion" element
     */
    public void setSourceProductVersion(int sourceProductVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEPRODUCTVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEPRODUCTVERSION$2);
            }
            target.setIntValue(sourceProductVersion);
        }
    }
    
    /**
     * Sets (as xml) the "sourceProductVersion" element
     */
    public void xsetSourceProductVersion(amdocs.iam.pd.general.common.VERSIONType sourceProductVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.VERSIONType target = null;
            target = (amdocs.iam.pd.general.common.VERSIONType)get_store().find_element_user(SOURCEPRODUCTVERSION$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.VERSIONType)get_store().add_element_user(SOURCEPRODUCTVERSION$2);
            }
            target.set(sourceProductVersion);
        }
    }
    
    /**
     * Gets the "RelationCustom" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistinputimpl.RelationCustom getRelationCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinputimpl.RelationCustom target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinputimpl.RelationCustom)get_store().find_element_user(RELATIONCUSTOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RelationCustom" element
     */
    public boolean isSetRelationCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONCUSTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "RelationCustom" element
     */
    public void setRelationCustom(amdocs.iam.pd.webservices.productrelations.productlistinputimpl.RelationCustom relationCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinputimpl.RelationCustom target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinputimpl.RelationCustom)get_store().find_element_user(RELATIONCUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productrelations.productlistinputimpl.RelationCustom)get_store().add_element_user(RELATIONCUSTOM$4);
            }
            target.set(relationCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "RelationCustom" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistinputimpl.RelationCustom addNewRelationCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinputimpl.RelationCustom target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinputimpl.RelationCustom)get_store().add_element_user(RELATIONCUSTOM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "RelationCustom" element
     */
    public void unsetRelationCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONCUSTOM$4, 0);
        }
    }
    
    /**
     * Gets the "RelationTypes" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistinput.RelationTypes getRelationTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinput.RelationTypes target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinput.RelationTypes)get_store().find_element_user(RELATIONTYPES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RelationTypes" element
     */
    public void setRelationTypes(amdocs.iam.pd.webservices.productrelations.productlistinput.RelationTypes relationTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinput.RelationTypes target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinput.RelationTypes)get_store().find_element_user(RELATIONTYPES$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productrelations.productlistinput.RelationTypes)get_store().add_element_user(RELATIONTYPES$6);
            }
            target.set(relationTypes);
        }
    }
    
    /**
     * Appends and returns a new empty "RelationTypes" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistinput.RelationTypes addNewRelationTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistinput.RelationTypes target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistinput.RelationTypes)get_store().add_element_user(RELATIONTYPES$6);
            return target;
        }
    }
}
