/*
 * XML Type:  DataType
 * Namespace: http://amdocs/iam/pd/webservices/bundleWS/BundleValidationOutput
 * Java type: amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.DataType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.impl;
/**
 * An XML DataType(@http://amdocs/iam/pd/webservices/bundleWS/BundleValidationOutput).
 *
 * This is a complex type.
 */
public class DataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.DataType
{
    
    public DataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDIND$0 = 
        new javax.xml.namespace.QName("", "ValidInd");
    private static final javax.xml.namespace.QName ERRORMESSAGE$2 = 
        new javax.xml.namespace.QName("", "ErrorMessage");
    private static final javax.xml.namespace.QName DATACUSTOM$4 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
    /**
     * Gets the "ValidInd" element
     */
    public java.lang.String getValidInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValidInd" element
     */
    public org.apache.xmlbeans.XmlString xgetValidInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALIDIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ValidInd" element
     */
    public void setValidInd(java.lang.String validInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDIND$0);
            }
            target.setStringValue(validInd);
        }
    }
    
    /**
     * Sets (as xml) the "ValidInd" element
     */
    public void xsetValidInd(org.apache.xmlbeans.XmlString validInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALIDIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALIDIND$0);
            }
            target.set(validInd);
        }
    }
    
    /**
     * Gets the "ErrorMessage" element
     */
    public java.lang.String getErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ErrorMessage" element
     */
    public boolean isSetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORMESSAGE$2) != 0;
        }
    }
    
    /**
     * Sets the "ErrorMessage" element
     */
    public void setErrorMessage(java.lang.String errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORMESSAGE$2);
            }
            target.setStringValue(errorMessage);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorMessage" element
     */
    public void xsetErrorMessage(org.apache.xmlbeans.XmlString errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORMESSAGE$2);
            }
            target.set(errorMessage);
        }
    }
    
    /**
     * Unsets the "ErrorMessage" element
     */
    public void unsetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORMESSAGE$2, 0);
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationoutputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$4, 0);
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
            return get_store().count_elements(DATACUSTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.bundlews.bundlevalidationoutputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$4);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationoutputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$4);
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
            get_store().remove_element(DATACUSTOM$4, 0);
        }
    }
}
