/*
 * XML Type:  Attribute
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.impl;
/**
 * An XML Attribute(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput).
 *
 * This is a complex type.
 */
public class AttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute
{
    
    public AttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTECODE$0 = 
        new javax.xml.namespace.QName("", "attributeCode");
    private static final javax.xml.namespace.QName ATTRIBUTENAME$2 = 
        new javax.xml.namespace.QName("", "attributeName");
    private static final javax.xml.namespace.QName ATTRIBUTETYPE$4 = 
        new javax.xml.namespace.QName("", "attributeType");
    private static final javax.xml.namespace.QName ATTRIBUTEDESCRIPTION$6 = 
        new javax.xml.namespace.QName("", "attributeDescription");
    private static final javax.xml.namespace.QName RELATIONTYPE$8 = 
        new javax.xml.namespace.QName("", "relationType");
    private static final javax.xml.namespace.QName FINALIND$10 = 
        new javax.xml.namespace.QName("", "finalInd");
    private static final javax.xml.namespace.QName PREVIEWIND$12 = 
        new javax.xml.namespace.QName("", "previewInd");
    private static final javax.xml.namespace.QName APPEARONBILLIND$14 = 
        new javax.xml.namespace.QName("", "appearOnBillInd");
    private static final javax.xml.namespace.QName SHOWALLVALUES$16 = 
        new javax.xml.namespace.QName("", "showAllValues");
    private static final javax.xml.namespace.QName DEFINITIONTYPE$18 = 
        new javax.xml.namespace.QName("", "definitionType");
    private static final javax.xml.namespace.QName FIELDTYPE$20 = 
        new javax.xml.namespace.QName("", "fieldType");
    private static final javax.xml.namespace.QName CONTENTTYPE$22 = 
        new javax.xml.namespace.QName("", "contentType");
    private static final javax.xml.namespace.QName DEFAULTVALUE$24 = 
        new javax.xml.namespace.QName("", "defaultValue");
    private static final javax.xml.namespace.QName MAXLENGTH$26 = 
        new javax.xml.namespace.QName("", "maxLength");
    private static final javax.xml.namespace.QName PRODUCTCATALOGPARAMETER$28 = 
        new javax.xml.namespace.QName("", "productCatalogParameter");
    private static final javax.xml.namespace.QName ARRAYSIZE$30 = 
        new javax.xml.namespace.QName("", "arraySize");
    private static final javax.xml.namespace.QName REFERENCEQUERYID$32 = 
        new javax.xml.namespace.QName("", "referenceQueryId");
    private static final javax.xml.namespace.QName QUERYNAME$34 = 
        new javax.xml.namespace.QName("", "queryName");
    private static final javax.xml.namespace.QName QUERYSQL$36 = 
        new javax.xml.namespace.QName("", "querySql");
    private static final javax.xml.namespace.QName ATTRIBUTECUSTOM$38 = 
        new javax.xml.namespace.QName("", "AttributeCustom");
    private static final javax.xml.namespace.QName VALUES$40 = 
        new javax.xml.namespace.QName("", "values");
    
    
    /**
     * Gets the "attributeCode" element
     */
    public java.lang.String getAttributeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attributeCode" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "attributeCode" element
     */
    public void setAttributeCode(java.lang.String attributeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTECODE$0);
            }
            target.setStringValue(attributeCode);
        }
    }
    
    /**
     * Sets (as xml) the "attributeCode" element
     */
    public void xsetAttributeCode(org.apache.xmlbeans.XmlString attributeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTECODE$0);
            }
            target.set(attributeCode);
        }
    }
    
    /**
     * Gets the "attributeName" element
     */
    public java.lang.String getAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attributeName" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTENAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "attributeName" element
     */
    public void setAttributeName(java.lang.String attributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTENAME$2);
            }
            target.setStringValue(attributeName);
        }
    }
    
    /**
     * Sets (as xml) the "attributeName" element
     */
    public void xsetAttributeName(org.apache.xmlbeans.XmlString attributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTENAME$2);
            }
            target.set(attributeName);
        }
    }
    
    /**
     * Gets the "attributeType" element
     */
    public java.lang.String getAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTETYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attributeType" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTETYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "attributeType" element
     */
    public void setAttributeType(java.lang.String attributeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTETYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTETYPE$4);
            }
            target.setStringValue(attributeType);
        }
    }
    
    /**
     * Sets (as xml) the "attributeType" element
     */
    public void xsetAttributeType(org.apache.xmlbeans.XmlString attributeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTETYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTETYPE$4);
            }
            target.set(attributeType);
        }
    }
    
    /**
     * Gets the "attributeDescription" element
     */
    public java.lang.String getAttributeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEDESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attributeDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEDESCRIPTION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "attributeDescription" element
     */
    public void setAttributeDescription(java.lang.String attributeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEDESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEDESCRIPTION$6);
            }
            target.setStringValue(attributeDescription);
        }
    }
    
    /**
     * Sets (as xml) the "attributeDescription" element
     */
    public void xsetAttributeDescription(org.apache.xmlbeans.XmlString attributeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEDESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEDESCRIPTION$6);
            }
            target.set(attributeDescription);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONTYPE$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONTYPE$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONTYPE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONTYPE$8);
            }
            target.set(relationType);
        }
    }
    
    /**
     * Gets the "finalInd" element
     */
    public java.lang.String getFinalInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINALIND$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "finalInd" element
     */
    public org.apache.xmlbeans.XmlString xgetFinalInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINALIND$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "finalInd" element
     */
    public void setFinalInd(java.lang.String finalInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINALIND$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINALIND$10);
            }
            target.setStringValue(finalInd);
        }
    }
    
    /**
     * Sets (as xml) the "finalInd" element
     */
    public void xsetFinalInd(org.apache.xmlbeans.XmlString finalInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINALIND$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FINALIND$10);
            }
            target.set(finalInd);
        }
    }
    
    /**
     * Gets the "previewInd" element
     */
    public java.lang.String getPreviewInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIEWIND$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "previewInd" element
     */
    public org.apache.xmlbeans.XmlString xgetPreviewInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREVIEWIND$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "previewInd" element
     */
    public void setPreviewInd(java.lang.String previewInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIEWIND$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREVIEWIND$12);
            }
            target.setStringValue(previewInd);
        }
    }
    
    /**
     * Sets (as xml) the "previewInd" element
     */
    public void xsetPreviewInd(org.apache.xmlbeans.XmlString previewInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREVIEWIND$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREVIEWIND$12);
            }
            target.set(previewInd);
        }
    }
    
    /**
     * Gets the "appearOnBillInd" element
     */
    public java.lang.String getAppearOnBillInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPEARONBILLIND$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "appearOnBillInd" element
     */
    public org.apache.xmlbeans.XmlString xgetAppearOnBillInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPEARONBILLIND$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "appearOnBillInd" element
     */
    public void setAppearOnBillInd(java.lang.String appearOnBillInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPEARONBILLIND$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPEARONBILLIND$14);
            }
            target.setStringValue(appearOnBillInd);
        }
    }
    
    /**
     * Sets (as xml) the "appearOnBillInd" element
     */
    public void xsetAppearOnBillInd(org.apache.xmlbeans.XmlString appearOnBillInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPEARONBILLIND$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPEARONBILLIND$14);
            }
            target.set(appearOnBillInd);
        }
    }
    
    /**
     * Gets the "showAllValues" element
     */
    public java.lang.String getShowAllValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOWALLVALUES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "showAllValues" element
     */
    public org.apache.xmlbeans.XmlString xgetShowAllValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHOWALLVALUES$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "showAllValues" element
     */
    public void setShowAllValues(java.lang.String showAllValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOWALLVALUES$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHOWALLVALUES$16);
            }
            target.setStringValue(showAllValues);
        }
    }
    
    /**
     * Sets (as xml) the "showAllValues" element
     */
    public void xsetShowAllValues(org.apache.xmlbeans.XmlString showAllValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHOWALLVALUES$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHOWALLVALUES$16);
            }
            target.set(showAllValues);
        }
    }
    
    /**
     * Gets the "definitionType" element
     */
    public java.lang.String getDefinitionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFINITIONTYPE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "definitionType" element
     */
    public org.apache.xmlbeans.XmlString xgetDefinitionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFINITIONTYPE$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "definitionType" element
     */
    public void setDefinitionType(java.lang.String definitionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFINITIONTYPE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFINITIONTYPE$18);
            }
            target.setStringValue(definitionType);
        }
    }
    
    /**
     * Sets (as xml) the "definitionType" element
     */
    public void xsetDefinitionType(org.apache.xmlbeans.XmlString definitionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFINITIONTYPE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFINITIONTYPE$18);
            }
            target.set(definitionType);
        }
    }
    
    /**
     * Gets the "fieldType" element
     */
    public java.lang.String getFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDTYPE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fieldType" element
     */
    public org.apache.xmlbeans.XmlString xgetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDTYPE$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fieldType" element
     */
    public void setFieldType(java.lang.String fieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDTYPE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDTYPE$20);
            }
            target.setStringValue(fieldType);
        }
    }
    
    /**
     * Sets (as xml) the "fieldType" element
     */
    public void xsetFieldType(org.apache.xmlbeans.XmlString fieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDTYPE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELDTYPE$20);
            }
            target.set(fieldType);
        }
    }
    
    /**
     * Gets the "contentType" element
     */
    public java.lang.String getContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTTYPE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contentType" element
     */
    public org.apache.xmlbeans.XmlString xgetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTTYPE$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "contentType" element
     */
    public boolean isSetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTTYPE$22) != 0;
        }
    }
    
    /**
     * Sets the "contentType" element
     */
    public void setContentType(java.lang.String contentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTTYPE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENTTYPE$22);
            }
            target.setStringValue(contentType);
        }
    }
    
    /**
     * Sets (as xml) the "contentType" element
     */
    public void xsetContentType(org.apache.xmlbeans.XmlString contentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTTYPE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENTTYPE$22);
            }
            target.set(contentType);
        }
    }
    
    /**
     * Unsets the "contentType" element
     */
    public void unsetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTTYPE$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$24, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$24, 0);
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
            return get_store().count_elements(DEFAULTVALUE$24) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTVALUE$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTVALUE$24);
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
            get_store().remove_element(DEFAULTVALUE$24, 0);
        }
    }
    
    /**
     * Gets the "maxLength" element
     */
    public java.lang.String getMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLENGTH$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxLength" element
     */
    public amdocs.iam.pd.general.common.Long xgetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(MAXLENGTH$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "maxLength" element
     */
    public boolean isSetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXLENGTH$26) != 0;
        }
    }
    
    /**
     * Sets the "maxLength" element
     */
    public void setMaxLength(java.lang.String maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLENGTH$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXLENGTH$26);
            }
            target.setStringValue(maxLength);
        }
    }
    
    /**
     * Sets (as xml) the "maxLength" element
     */
    public void xsetMaxLength(amdocs.iam.pd.general.common.Long maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(MAXLENGTH$26, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(MAXLENGTH$26);
            }
            target.set(maxLength);
        }
    }
    
    /**
     * Unsets the "maxLength" element
     */
    public void unsetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXLENGTH$26, 0);
        }
    }
    
    /**
     * Gets the "productCatalogParameter" element
     */
    public java.lang.String getProductCatalogParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATALOGPARAMETER$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productCatalogParameter" element
     */
    public org.apache.xmlbeans.XmlString xgetProductCatalogParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATALOGPARAMETER$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "productCatalogParameter" element
     */
    public boolean isSetProductCatalogParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCATALOGPARAMETER$28) != 0;
        }
    }
    
    /**
     * Sets the "productCatalogParameter" element
     */
    public void setProductCatalogParameter(java.lang.String productCatalogParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATALOGPARAMETER$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCATALOGPARAMETER$28);
            }
            target.setStringValue(productCatalogParameter);
        }
    }
    
    /**
     * Sets (as xml) the "productCatalogParameter" element
     */
    public void xsetProductCatalogParameter(org.apache.xmlbeans.XmlString productCatalogParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATALOGPARAMETER$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCATALOGPARAMETER$28);
            }
            target.set(productCatalogParameter);
        }
    }
    
    /**
     * Unsets the "productCatalogParameter" element
     */
    public void unsetProductCatalogParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCATALOGPARAMETER$28, 0);
        }
    }
    
    /**
     * Gets the "arraySize" element
     */
    public java.lang.String getArraySize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRAYSIZE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "arraySize" element
     */
    public amdocs.iam.pd.general.common.Long xgetArraySize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(ARRAYSIZE$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "arraySize" element
     */
    public boolean isSetArraySize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYSIZE$30) != 0;
        }
    }
    
    /**
     * Sets the "arraySize" element
     */
    public void setArraySize(java.lang.String arraySize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRAYSIZE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARRAYSIZE$30);
            }
            target.setStringValue(arraySize);
        }
    }
    
    /**
     * Sets (as xml) the "arraySize" element
     */
    public void xsetArraySize(amdocs.iam.pd.general.common.Long arraySize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(ARRAYSIZE$30, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(ARRAYSIZE$30);
            }
            target.set(arraySize);
        }
    }
    
    /**
     * Unsets the "arraySize" element
     */
    public void unsetArraySize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYSIZE$30, 0);
        }
    }
    
    /**
     * Gets the "referenceQueryId" element
     */
    public java.lang.String getReferenceQueryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEQUERYID$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "referenceQueryId" element
     */
    public amdocs.iam.pd.general.common.Long xgetReferenceQueryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(REFERENCEQUERYID$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "referenceQueryId" element
     */
    public boolean isSetReferenceQueryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEQUERYID$32) != 0;
        }
    }
    
    /**
     * Sets the "referenceQueryId" element
     */
    public void setReferenceQueryId(java.lang.String referenceQueryId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEQUERYID$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCEQUERYID$32);
            }
            target.setStringValue(referenceQueryId);
        }
    }
    
    /**
     * Sets (as xml) the "referenceQueryId" element
     */
    public void xsetReferenceQueryId(amdocs.iam.pd.general.common.Long referenceQueryId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(REFERENCEQUERYID$32, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(REFERENCEQUERYID$32);
            }
            target.set(referenceQueryId);
        }
    }
    
    /**
     * Unsets the "referenceQueryId" element
     */
    public void unsetReferenceQueryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEQUERYID$32, 0);
        }
    }
    
    /**
     * Gets the "queryName" element
     */
    public java.lang.String getQueryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYNAME$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "queryName" element
     */
    public org.apache.xmlbeans.XmlString xgetQueryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYNAME$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "queryName" element
     */
    public boolean isSetQueryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYNAME$34) != 0;
        }
    }
    
    /**
     * Sets the "queryName" element
     */
    public void setQueryName(java.lang.String queryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYNAME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYNAME$34);
            }
            target.setStringValue(queryName);
        }
    }
    
    /**
     * Sets (as xml) the "queryName" element
     */
    public void xsetQueryName(org.apache.xmlbeans.XmlString queryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYNAME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYNAME$34);
            }
            target.set(queryName);
        }
    }
    
    /**
     * Unsets the "queryName" element
     */
    public void unsetQueryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYNAME$34, 0);
        }
    }
    
    /**
     * Gets the "querySql" element
     */
    public java.lang.String getQuerySql()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYSQL$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "querySql" element
     */
    public org.apache.xmlbeans.XmlString xgetQuerySql()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYSQL$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "querySql" element
     */
    public boolean isSetQuerySql()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYSQL$36) != 0;
        }
    }
    
    /**
     * Sets the "querySql" element
     */
    public void setQuerySql(java.lang.String querySql)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYSQL$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYSQL$36);
            }
            target.setStringValue(querySql);
        }
    }
    
    /**
     * Sets (as xml) the "querySql" element
     */
    public void xsetQuerySql(org.apache.xmlbeans.XmlString querySql)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYSQL$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYSQL$36);
            }
            target.set(querySql);
        }
    }
    
    /**
     * Unsets the "querySql" element
     */
    public void unsetQuerySql()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYSQL$36, 0);
        }
    }
    
    /**
     * Gets the "AttributeCustom" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.AttributeCustom getAttributeCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.AttributeCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.AttributeCustom)get_store().find_element_user(ATTRIBUTECUSTOM$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AttributeCustom" element
     */
    public boolean isSetAttributeCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTECUSTOM$38) != 0;
        }
    }
    
    /**
     * Sets the "AttributeCustom" element
     */
    public void setAttributeCustom(amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.AttributeCustom attributeCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.AttributeCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.AttributeCustom)get_store().find_element_user(ATTRIBUTECUSTOM$38, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.AttributeCustom)get_store().add_element_user(ATTRIBUTECUSTOM$38);
            }
            target.set(attributeCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "AttributeCustom" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.AttributeCustom addNewAttributeCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.AttributeCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.AttributeCustom)get_store().add_element_user(ATTRIBUTECUSTOM$38);
            return target;
        }
    }
    
    /**
     * Unsets the "AttributeCustom" element
     */
    public void unsetAttributeCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTECUSTOM$38, 0);
        }
    }
    
    /**
     * Gets the "values" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Values getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Values target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Values)get_store().find_element_user(VALUES$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "values" element
     */
    public boolean isSetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUES$40) != 0;
        }
    }
    
    /**
     * Sets the "values" element
     */
    public void setValues(amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Values values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Values target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Values)get_store().find_element_user(VALUES$40, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Values)get_store().add_element_user(VALUES$40);
            }
            target.set(values);
        }
    }
    
    /**
     * Appends and returns a new empty "values" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Values addNewValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Values target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Values)get_store().add_element_user(VALUES$40);
            return target;
        }
    }
    
    /**
     * Unsets the "values" element
     */
    public void unsetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUES$40, 0);
        }
    }
}
