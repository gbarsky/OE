/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName PRODUCTVERSION$2 = 
        new javax.xml.namespace.QName("", "productVersion");
    private static final javax.xml.namespace.QName ATTRIBUTECODE$4 = 
        new javax.xml.namespace.QName("", "attributeCode");
    private static final javax.xml.namespace.QName ATTRIBUTEVALUE$6 = 
        new javax.xml.namespace.QName("", "attributeValue");
    private static final javax.xml.namespace.QName ATTRIBUTEVALUES$8 = 
        new javax.xml.namespace.QName("", "AttributeValues");
    private static final javax.xml.namespace.QName CRITERIAATTRIBUTES$10 = 
        new javax.xml.namespace.QName("", "criteriaAttributes");
    private static final javax.xml.namespace.QName INITIALSEARCHSTRING$12 = 
        new javax.xml.namespace.QName("", "initialSearchString");
    private static final javax.xml.namespace.QName ALLRESULTSIND$14 = 
        new javax.xml.namespace.QName("", "allResultsInd");
    private static final javax.xml.namespace.QName LANGUAGE$16 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName DATACUSTOM$18 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
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
    public org.apache.xmlbeans.XmlString xgetProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTVERSION$2, 0);
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
    public void xsetProductVersion(org.apache.xmlbeans.XmlString productVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTVERSION$2);
            }
            target.set(productVersion);
        }
    }
    
    /**
     * Gets the "attributeCode" element
     */
    public java.lang.String getAttributeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTECODE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECODE$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTECODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTECODE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTECODE$4);
            }
            target.set(attributeCode);
        }
    }
    
    /**
     * Gets the "attributeValue" element
     */
    public java.lang.String getAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEVALUE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attributeValue" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEVALUE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "attributeValue" element
     */
    public boolean isSetAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEVALUE$6) != 0;
        }
    }
    
    /**
     * Sets the "attributeValue" element
     */
    public void setAttributeValue(java.lang.String attributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEVALUE$6);
            }
            target.setStringValue(attributeValue);
        }
    }
    
    /**
     * Sets (as xml) the "attributeValue" element
     */
    public void xsetAttributeValue(org.apache.xmlbeans.XmlString attributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEVALUE$6);
            }
            target.set(attributeValue);
        }
    }
    
    /**
     * Unsets the "attributeValue" element
     */
    public void unsetAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEVALUE$6, 0);
        }
    }
    
    /**
     * Gets the "AttributeValues" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues getAttributeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues)get_store().find_element_user(ATTRIBUTEVALUES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AttributeValues" element
     */
    public boolean isSetAttributeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEVALUES$8) != 0;
        }
    }
    
    /**
     * Sets the "AttributeValues" element
     */
    public void setAttributeValues(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues attributeValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues)get_store().find_element_user(ATTRIBUTEVALUES$8, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues)get_store().add_element_user(ATTRIBUTEVALUES$8);
            }
            target.set(attributeValues);
        }
    }
    
    /**
     * Appends and returns a new empty "AttributeValues" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues addNewAttributeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.AttributeValues)get_store().add_element_user(ATTRIBUTEVALUES$8);
            return target;
        }
    }
    
    /**
     * Unsets the "AttributeValues" element
     */
    public void unsetAttributeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEVALUES$8, 0);
        }
    }
    
    /**
     * Gets the "criteriaAttributes" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes getCriteriaAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes)get_store().find_element_user(CRITERIAATTRIBUTES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "criteriaAttributes" element
     */
    public boolean isSetCriteriaAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CRITERIAATTRIBUTES$10) != 0;
        }
    }
    
    /**
     * Sets the "criteriaAttributes" element
     */
    public void setCriteriaAttributes(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes criteriaAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes)get_store().find_element_user(CRITERIAATTRIBUTES$10, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes)get_store().add_element_user(CRITERIAATTRIBUTES$10);
            }
            target.set(criteriaAttributes);
        }
    }
    
    /**
     * Appends and returns a new empty "criteriaAttributes" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes addNewCriteriaAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.CriteriaAttributes)get_store().add_element_user(CRITERIAATTRIBUTES$10);
            return target;
        }
    }
    
    /**
     * Unsets the "criteriaAttributes" element
     */
    public void unsetCriteriaAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CRITERIAATTRIBUTES$10, 0);
        }
    }
    
    /**
     * Gets the "initialSearchString" element
     */
    public java.lang.String getInitialSearchString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALSEARCHSTRING$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "initialSearchString" element
     */
    public org.apache.xmlbeans.XmlString xgetInitialSearchString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INITIALSEARCHSTRING$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "initialSearchString" element
     */
    public boolean isSetInitialSearchString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INITIALSEARCHSTRING$12) != 0;
        }
    }
    
    /**
     * Sets the "initialSearchString" element
     */
    public void setInitialSearchString(java.lang.String initialSearchString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALSEARCHSTRING$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INITIALSEARCHSTRING$12);
            }
            target.setStringValue(initialSearchString);
        }
    }
    
    /**
     * Sets (as xml) the "initialSearchString" element
     */
    public void xsetInitialSearchString(org.apache.xmlbeans.XmlString initialSearchString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INITIALSEARCHSTRING$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INITIALSEARCHSTRING$12);
            }
            target.set(initialSearchString);
        }
    }
    
    /**
     * Unsets the "initialSearchString" element
     */
    public void unsetInitialSearchString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INITIALSEARCHSTRING$12, 0);
        }
    }
    
    /**
     * Gets the "allResultsInd" element
     */
    public java.lang.String getAllResultsInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLRESULTSIND$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "allResultsInd" element
     */
    public org.apache.xmlbeans.XmlString xgetAllResultsInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALLRESULTSIND$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "allResultsInd" element
     */
    public boolean isSetAllResultsInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLRESULTSIND$14) != 0;
        }
    }
    
    /**
     * Sets the "allResultsInd" element
     */
    public void setAllResultsInd(java.lang.String allResultsInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLRESULTSIND$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLRESULTSIND$14);
            }
            target.setStringValue(allResultsInd);
        }
    }
    
    /**
     * Sets (as xml) the "allResultsInd" element
     */
    public void xsetAllResultsInd(org.apache.xmlbeans.XmlString allResultsInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALLRESULTSIND$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALLRESULTSIND$14);
            }
            target.set(allResultsInd);
        }
    }
    
    /**
     * Unsets the "allResultsInd" element
     */
    public void unsetAllResultsInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLRESULTSIND$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$16, 0);
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
            return get_store().count_elements(LANGUAGE$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGE$16);
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
            get_store().remove_element(LANGUAGE$16, 0);
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$18, 0);
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
    public void setDataCustom(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$18, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$18);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$18);
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
