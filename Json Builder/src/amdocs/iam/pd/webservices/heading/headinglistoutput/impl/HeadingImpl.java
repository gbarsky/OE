/*
 * XML Type:  Heading
 * Namespace: http://amdocs/iam/pd/webservices/heading/HeadingListOutput
 * Java type: amdocs.iam.pd.webservices.heading.headinglistoutput.Heading
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.heading.headinglistoutput.impl;
/**
 * An XML Heading(@http://amdocs/iam/pd/webservices/heading/HeadingListOutput).
 *
 * This is a complex type.
 */
public class HeadingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.heading.headinglistoutput.Heading
{
    
    public HeadingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADINGCODE$0 = 
        new javax.xml.namespace.QName("", "headingCode");
    private static final javax.xml.namespace.QName HEADINGNAME$2 = 
        new javax.xml.namespace.QName("", "headingName");
    
    
    /**
     * Gets the "headingCode" element
     */
    public java.lang.String getHeadingCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADINGCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "headingCode" element
     */
    public org.apache.xmlbeans.XmlString xgetHeadingCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADINGCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "headingCode" element
     */
    public void setHeadingCode(java.lang.String headingCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADINGCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADINGCODE$0);
            }
            target.setStringValue(headingCode);
        }
    }
    
    /**
     * Sets (as xml) the "headingCode" element
     */
    public void xsetHeadingCode(org.apache.xmlbeans.XmlString headingCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADINGCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEADINGCODE$0);
            }
            target.set(headingCode);
        }
    }
    
    /**
     * Gets the "headingName" element
     */
    public java.lang.String getHeadingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADINGNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "headingName" element
     */
    public org.apache.xmlbeans.XmlString xgetHeadingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADINGNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "headingName" element
     */
    public void setHeadingName(java.lang.String headingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADINGNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADINGNAME$2);
            }
            target.setStringValue(headingName);
        }
    }
    
    /**
     * Sets (as xml) the "headingName" element
     */
    public void xsetHeadingName(org.apache.xmlbeans.XmlString headingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADINGNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEADINGNAME$2);
            }
            target.set(headingName);
        }
    }
}
