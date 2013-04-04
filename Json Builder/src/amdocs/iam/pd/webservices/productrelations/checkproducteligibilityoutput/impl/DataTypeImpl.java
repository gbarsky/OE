/*
 * XML Type:  DataType
 * Namespace: http://amdocs/iam/pd/webservices/productRelations/CheckProductEligibilityOutput
 * Java type: amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.DataType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.impl;
/**
 * An XML DataType(@http://amdocs/iam/pd/webservices/productRelations/CheckProductEligibilityOutput).
 *
 * This is a complex type.
 */
public class DataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.DataType
{
    
    public DataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDIND$0 = 
        new javax.xml.namespace.QName("", "validInd");
    private static final javax.xml.namespace.QName ERRORMESSAGE$2 = 
        new javax.xml.namespace.QName("", "errorMessage");
    
    
    /**
     * Gets the "validInd" element
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
     * Gets (as xml) the "validInd" element
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
     * Sets the "validInd" element
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
     * Sets (as xml) the "validInd" element
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
     * Gets the "errorMessage" element
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
     * Gets (as xml) the "errorMessage" element
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
     * True if has "errorMessage" element
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
     * Sets the "errorMessage" element
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
     * Sets (as xml) the "errorMessage" element
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
     * Unsets the "errorMessage" element
     */
    public void unsetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORMESSAGE$2, 0);
        }
    }
}
