/*
 * XML Type:  ValidValues
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.impl;
/**
 * An XML ValidValues(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput).
 *
 * This is a complex type.
 */
public class ValidValuesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues
{
    
    public ValidValuesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODECOLUMN$0 = 
        new javax.xml.namespace.QName("", "codeColumn");
    private static final javax.xml.namespace.QName DECODECOLUMN$2 = 
        new javax.xml.namespace.QName("", "decodeColumn");
    private static final javax.xml.namespace.QName POPULATEDFIELDS$4 = 
        new javax.xml.namespace.QName("", "populatedFields");
    private static final javax.xml.namespace.QName MOREVALUESIND$6 = 
        new javax.xml.namespace.QName("", "moreValuesInd");
    private static final javax.xml.namespace.QName VALIDVALUESCUSTOM$8 = 
        new javax.xml.namespace.QName("", "ValidValuesCustom");
    
    
    /**
     * Gets the "codeColumn" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column getCodeColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column)get_store().find_element_user(CODECOLUMN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "codeColumn" element
     */
    public void setCodeColumn(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column codeColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column)get_store().find_element_user(CODECOLUMN$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column)get_store().add_element_user(CODECOLUMN$0);
            }
            target.set(codeColumn);
        }
    }
    
    /**
     * Appends and returns a new empty "codeColumn" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column addNewCodeColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column)get_store().add_element_user(CODECOLUMN$0);
            return target;
        }
    }
    
    /**
     * Gets the "decodeColumn" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column getDecodeColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column)get_store().find_element_user(DECODECOLUMN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "decodeColumn" element
     */
    public boolean isSetDecodeColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECODECOLUMN$2) != 0;
        }
    }
    
    /**
     * Sets the "decodeColumn" element
     */
    public void setDecodeColumn(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column decodeColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column)get_store().find_element_user(DECODECOLUMN$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column)get_store().add_element_user(DECODECOLUMN$2);
            }
            target.set(decodeColumn);
        }
    }
    
    /**
     * Appends and returns a new empty "decodeColumn" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column addNewDecodeColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column)get_store().add_element_user(DECODECOLUMN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "decodeColumn" element
     */
    public void unsetDecodeColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECODECOLUMN$2, 0);
        }
    }
    
    /**
     * Gets the "populatedFields" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields getPopulatedFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields)get_store().find_element_user(POPULATEDFIELDS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "populatedFields" element
     */
    public boolean isSetPopulatedFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POPULATEDFIELDS$4) != 0;
        }
    }
    
    /**
     * Sets the "populatedFields" element
     */
    public void setPopulatedFields(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields populatedFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields)get_store().find_element_user(POPULATEDFIELDS$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields)get_store().add_element_user(POPULATEDFIELDS$4);
            }
            target.set(populatedFields);
        }
    }
    
    /**
     * Appends and returns a new empty "populatedFields" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields addNewPopulatedFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedFields)get_store().add_element_user(POPULATEDFIELDS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "populatedFields" element
     */
    public void unsetPopulatedFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POPULATEDFIELDS$4, 0);
        }
    }
    
    /**
     * Gets the "moreValuesInd" element
     */
    public java.lang.String getMoreValuesInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOREVALUESIND$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "moreValuesInd" element
     */
    public org.apache.xmlbeans.XmlString xgetMoreValuesInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOREVALUESIND$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "moreValuesInd" element
     */
    public void setMoreValuesInd(java.lang.String moreValuesInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOREVALUESIND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOREVALUESIND$6);
            }
            target.setStringValue(moreValuesInd);
        }
    }
    
    /**
     * Sets (as xml) the "moreValuesInd" element
     */
    public void xsetMoreValuesInd(org.apache.xmlbeans.XmlString moreValuesInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOREVALUESIND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOREVALUESIND$6);
            }
            target.set(moreValuesInd);
        }
    }
    
    /**
     * Gets the "ValidValuesCustom" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom getValidValuesCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom)get_store().find_element_user(VALIDVALUESCUSTOM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ValidValuesCustom" element
     */
    public boolean isSetValidValuesCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDVALUESCUSTOM$8) != 0;
        }
    }
    
    /**
     * Sets the "ValidValuesCustom" element
     */
    public void setValidValuesCustom(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom validValuesCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom)get_store().find_element_user(VALIDVALUESCUSTOM$8, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom)get_store().add_element_user(VALIDVALUESCUSTOM$8);
            }
            target.set(validValuesCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidValuesCustom" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom addNewValidValuesCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ValidValuesCustom)get_store().add_element_user(VALIDVALUESCUSTOM$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ValidValuesCustom" element
     */
    public void unsetValidValuesCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDVALUESCUSTOM$8, 0);
        }
    }
}
