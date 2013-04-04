/*
 * XML Type:  DataType
 * Namespace: http://amdocs/iam/pd/webservices/heading/HeadingListOutput
 * Java type: amdocs.iam.pd.webservices.heading.headinglistoutput.DataType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.heading.headinglistoutput.impl;
/**
 * An XML DataType(@http://amdocs/iam/pd/webservices/heading/HeadingListOutput).
 *
 * This is a complex type.
 */
public class DataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.heading.headinglistoutput.DataType
{
    
    public DataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADINGS$0 = 
        new javax.xml.namespace.QName("", "headings");
    
    
    /**
     * Gets the "headings" element
     */
    public amdocs.iam.pd.webservices.heading.headinglistoutput.Headings getHeadings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.heading.headinglistoutput.Headings target = null;
            target = (amdocs.iam.pd.webservices.heading.headinglistoutput.Headings)get_store().find_element_user(HEADINGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "headings" element
     */
    public void setHeadings(amdocs.iam.pd.webservices.heading.headinglistoutput.Headings headings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.heading.headinglistoutput.Headings target = null;
            target = (amdocs.iam.pd.webservices.heading.headinglistoutput.Headings)get_store().find_element_user(HEADINGS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.heading.headinglistoutput.Headings)get_store().add_element_user(HEADINGS$0);
            }
            target.set(headings);
        }
    }
    
    /**
     * Appends and returns a new empty "headings" element
     */
    public amdocs.iam.pd.webservices.heading.headinglistoutput.Headings addNewHeadings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.heading.headinglistoutput.Headings target = null;
            target = (amdocs.iam.pd.webservices.heading.headinglistoutput.Headings)get_store().add_element_user(HEADINGS$0);
            return target;
        }
    }
}
