/*
 * XML Type:  Column
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.impl;
/**
 * An XML Column(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput).
 *
 * This is a complex type.
 */
public class ColumnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column
{
    
    public ColumnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNNAME$0 = 
        new javax.xml.namespace.QName("", "columnName");
    private static final javax.xml.namespace.QName COLUMNDISPLAYEDNAME$2 = 
        new javax.xml.namespace.QName("", "columnDisplayedName");
    private static final javax.xml.namespace.QName COLUMNVALUES$4 = 
        new javax.xml.namespace.QName("", "columnValues");
    private static final javax.xml.namespace.QName COLUMNCUSTOM$6 = 
        new javax.xml.namespace.QName("", "ColumnCustom");
    
    
    /**
     * Gets the "columnName" element
     */
    public java.lang.String getColumnName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "columnName" element
     */
    public org.apache.xmlbeans.XmlString xgetColumnName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "columnName" element
     */
    public void setColumnName(java.lang.String columnName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNNAME$0);
            }
            target.setStringValue(columnName);
        }
    }
    
    /**
     * Sets (as xml) the "columnName" element
     */
    public void xsetColumnName(org.apache.xmlbeans.XmlString columnName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLUMNNAME$0);
            }
            target.set(columnName);
        }
    }
    
    /**
     * Gets the "columnDisplayedName" element
     */
    public java.lang.String getColumnDisplayedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNDISPLAYEDNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "columnDisplayedName" element
     */
    public org.apache.xmlbeans.XmlString xgetColumnDisplayedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNDISPLAYEDNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "columnDisplayedName" element
     */
    public void setColumnDisplayedName(java.lang.String columnDisplayedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNDISPLAYEDNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNDISPLAYEDNAME$2);
            }
            target.setStringValue(columnDisplayedName);
        }
    }
    
    /**
     * Sets (as xml) the "columnDisplayedName" element
     */
    public void xsetColumnDisplayedName(org.apache.xmlbeans.XmlString columnDisplayedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNDISPLAYEDNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLUMNDISPLAYEDNAME$2);
            }
            target.set(columnDisplayedName);
        }
    }
    
    /**
     * Gets the "columnValues" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues getColumnValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues)get_store().find_element_user(COLUMNVALUES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "columnValues" element
     */
    public boolean isSetColumnValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNVALUES$4) != 0;
        }
    }
    
    /**
     * Sets the "columnValues" element
     */
    public void setColumnValues(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues columnValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues)get_store().find_element_user(COLUMNVALUES$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues)get_store().add_element_user(COLUMNVALUES$4);
            }
            target.set(columnValues);
        }
    }
    
    /**
     * Appends and returns a new empty "columnValues" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues addNewColumnValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ColumnValues)get_store().add_element_user(COLUMNVALUES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "columnValues" element
     */
    public void unsetColumnValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNVALUES$4, 0);
        }
    }
    
    /**
     * Gets the "ColumnCustom" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ColumnCustom getColumnCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ColumnCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ColumnCustom)get_store().find_element_user(COLUMNCUSTOM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ColumnCustom" element
     */
    public boolean isSetColumnCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNCUSTOM$6) != 0;
        }
    }
    
    /**
     * Sets the "ColumnCustom" element
     */
    public void setColumnCustom(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ColumnCustom columnCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ColumnCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ColumnCustom)get_store().find_element_user(COLUMNCUSTOM$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ColumnCustom)get_store().add_element_user(COLUMNCUSTOM$6);
            }
            target.set(columnCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "ColumnCustom" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ColumnCustom addNewColumnCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ColumnCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.ColumnCustom)get_store().add_element_user(COLUMNCUSTOM$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ColumnCustom" element
     */
    public void unsetColumnCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNCUSTOM$6, 0);
        }
    }
}
