/*
 * XML Type:  Relation
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.impl;
/**
 * An XML Relation(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput).
 *
 * This is a complex type.
 */
public class RelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation
{
    
    public RelationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETPRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "targetProductCode");
    private static final javax.xml.namespace.QName RELATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "relationType");
    private static final javax.xml.namespace.QName RELATIONLEVEL$4 = 
        new javax.xml.namespace.QName("", "relationLevel");
    private static final javax.xml.namespace.QName MANDATORYRELATION$6 = 
        new javax.xml.namespace.QName("", "mandatoryRelation");
    private static final javax.xml.namespace.QName RELATIONCUSTOM$8 = 
        new javax.xml.namespace.QName("", "relationCustom");
    
    
    /**
     * Gets the "targetProductCode" element
     */
    public java.lang.String getTargetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETPRODUCTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetProductCode" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETPRODUCTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "targetProductCode" element
     */
    public void setTargetProductCode(java.lang.String targetProductCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETPRODUCTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETPRODUCTCODE$0);
            }
            target.setStringValue(targetProductCode);
        }
    }
    
    /**
     * Sets (as xml) the "targetProductCode" element
     */
    public void xsetTargetProductCode(org.apache.xmlbeans.XmlString targetProductCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETPRODUCTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETPRODUCTCODE$0);
            }
            target.set(targetProductCode);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONTYPE$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONTYPE$2, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONTYPE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONTYPE$2);
            }
            target.set(relationType);
        }
    }
    
    /**
     * Gets the "relationLevel" element
     */
    public java.lang.String getRelationLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONLEVEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relationLevel" element
     */
    public org.apache.xmlbeans.XmlString xgetRelationLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONLEVEL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "relationLevel" element
     */
    public void setRelationLevel(java.lang.String relationLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONLEVEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONLEVEL$4);
            }
            target.setStringValue(relationLevel);
        }
    }
    
    /**
     * Sets (as xml) the "relationLevel" element
     */
    public void xsetRelationLevel(org.apache.xmlbeans.XmlString relationLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONLEVEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONLEVEL$4);
            }
            target.set(relationLevel);
        }
    }
    
    /**
     * Gets the "mandatoryRelation" element
     */
    public java.lang.String getMandatoryRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANDATORYRELATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mandatoryRelation" element
     */
    public org.apache.xmlbeans.XmlString xgetMandatoryRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANDATORYRELATION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mandatoryRelation" element
     */
    public void setMandatoryRelation(java.lang.String mandatoryRelation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANDATORYRELATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANDATORYRELATION$6);
            }
            target.setStringValue(mandatoryRelation);
        }
    }
    
    /**
     * Sets (as xml) the "mandatoryRelation" element
     */
    public void xsetMandatoryRelation(org.apache.xmlbeans.XmlString mandatoryRelation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANDATORYRELATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANDATORYRELATION$6);
            }
            target.set(mandatoryRelation);
        }
    }
    
    /**
     * Gets the "relationCustom" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.RelationCustom getRelationCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.RelationCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.RelationCustom)get_store().find_element_user(RELATIONCUSTOM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "relationCustom" element
     */
    public boolean isSetRelationCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONCUSTOM$8) != 0;
        }
    }
    
    /**
     * Sets the "relationCustom" element
     */
    public void setRelationCustom(amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.RelationCustom relationCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.RelationCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.RelationCustom)get_store().find_element_user(RELATIONCUSTOM$8, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.RelationCustom)get_store().add_element_user(RELATIONCUSTOM$8);
            }
            target.set(relationCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "relationCustom" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.RelationCustom addNewRelationCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.RelationCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.RelationCustom)get_store().add_element_user(RELATIONCUSTOM$8);
            return target;
        }
    }
    
    /**
     * Unsets the "relationCustom" element
     */
    public void unsetRelationCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONCUSTOM$8, 0);
        }
    }
}
