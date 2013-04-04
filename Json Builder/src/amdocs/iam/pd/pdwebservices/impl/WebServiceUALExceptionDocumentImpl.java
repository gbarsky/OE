/*
 * An XML document type.
 * Localname: WebServiceUALException
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.WebServiceUALExceptionDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one WebServiceUALException(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class WebServiceUALExceptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.WebServiceUALExceptionDocument
{
    
    public WebServiceUALExceptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBSERVICEUALEXCEPTION$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "WebServiceUALException");
    
    
    /**
     * Gets the "WebServiceUALException" element
     */
    public java.lang.String getWebServiceUALException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSERVICEUALEXCEPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WebServiceUALException" element
     */
    public org.apache.xmlbeans.XmlString xgetWebServiceUALException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSERVICEUALEXCEPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "WebServiceUALException" element
     */
    public boolean isNilWebServiceUALException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSERVICEUALEXCEPTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "WebServiceUALException" element
     */
    public void setWebServiceUALException(java.lang.String webServiceUALException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSERVICEUALEXCEPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBSERVICEUALEXCEPTION$0);
            }
            target.setStringValue(webServiceUALException);
        }
    }
    
    /**
     * Sets (as xml) the "WebServiceUALException" element
     */
    public void xsetWebServiceUALException(org.apache.xmlbeans.XmlString webServiceUALException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSERVICEUALEXCEPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBSERVICEUALEXCEPTION$0);
            }
            target.set(webServiceUALException);
        }
    }
    
    /**
     * Nils the "WebServiceUALException" element
     */
    public void setNilWebServiceUALException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSERVICEUALEXCEPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBSERVICEUALEXCEPTION$0);
            }
            target.setNil();
        }
    }
}
