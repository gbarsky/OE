/*
 * XML Type:  Headings
 * Namespace: http://amdocs/iam/pd/webservices/heading/HeadingListOutput
 * Java type: amdocs.iam.pd.webservices.heading.headinglistoutput.Headings
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.heading.headinglistoutput.impl;
/**
 * An XML Headings(@http://amdocs/iam/pd/webservices/heading/HeadingListOutput).
 *
 * This is a complex type.
 */
public class HeadingsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.heading.headinglistoutput.Headings
{
    
    public HeadingsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADING$0 = 
        new javax.xml.namespace.QName("", "heading");
    
    
    /**
     * Gets array of all "heading" elements
     */
    public amdocs.iam.pd.webservices.heading.headinglistoutput.Heading[] getHeadingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HEADING$0, targetList);
            amdocs.iam.pd.webservices.heading.headinglistoutput.Heading[] result = new amdocs.iam.pd.webservices.heading.headinglistoutput.Heading[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "heading" element
     */
    public amdocs.iam.pd.webservices.heading.headinglistoutput.Heading getHeadingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.heading.headinglistoutput.Heading target = null;
            target = (amdocs.iam.pd.webservices.heading.headinglistoutput.Heading)get_store().find_element_user(HEADING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "heading" element
     */
    public int sizeOfHeadingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADING$0);
        }
    }
    
    /**
     * Sets array of all "heading" element
     */
    public void setHeadingArray(amdocs.iam.pd.webservices.heading.headinglistoutput.Heading[] headingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(headingArray, HEADING$0);
        }
    }
    
    /**
     * Sets ith "heading" element
     */
    public void setHeadingArray(int i, amdocs.iam.pd.webservices.heading.headinglistoutput.Heading heading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.heading.headinglistoutput.Heading target = null;
            target = (amdocs.iam.pd.webservices.heading.headinglistoutput.Heading)get_store().find_element_user(HEADING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(heading);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "heading" element
     */
    public amdocs.iam.pd.webservices.heading.headinglistoutput.Heading insertNewHeading(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.heading.headinglistoutput.Heading target = null;
            target = (amdocs.iam.pd.webservices.heading.headinglistoutput.Heading)get_store().insert_element_user(HEADING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "heading" element
     */
    public amdocs.iam.pd.webservices.heading.headinglistoutput.Heading addNewHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.heading.headinglistoutput.Heading target = null;
            target = (amdocs.iam.pd.webservices.heading.headinglistoutput.Heading)get_store().add_element_user(HEADING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "heading" element
     */
    public void removeHeading(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADING$0, i);
        }
    }
}
