/*
 * XML Type:  MediaTypes
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypes
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.impl;
/**
 * An XML MediaTypes(@http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput).
 *
 * This is a complex type.
 */
public class MediaTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypes
{
    
    public MediaTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIATYPE$0 = 
        new javax.xml.namespace.QName("", "MediaType");
    private static final javax.xml.namespace.QName FULLINDICATOR$2 = 
        new javax.xml.namespace.QName("", "fullIndicator");
    
    
    /**
     * Gets array of all "MediaType" elements
     */
    public java.lang.String[] getMediaTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEDIATYPE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "MediaType" element
     */
    public java.lang.String getMediaTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "MediaType" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetMediaTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEDIATYPE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "MediaType" element
     */
    public org.apache.xmlbeans.XmlString xgetMediaTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "MediaType" element
     */
    public int sizeOfMediaTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDIATYPE$0);
        }
    }
    
    /**
     * Sets array of all "MediaType" element
     */
    public void setMediaTypeArray(java.lang.String[] mediaTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mediaTypeArray, MEDIATYPE$0);
        }
    }
    
    /**
     * Sets ith "MediaType" element
     */
    public void setMediaTypeArray(int i, java.lang.String mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(mediaType);
        }
    }
    
    /**
     * Sets (as xml) array of all "MediaType" element
     */
    public void xsetMediaTypeArray(org.apache.xmlbeans.XmlString[]mediaTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mediaTypeArray, MEDIATYPE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "MediaType" element
     */
    public void xsetMediaTypeArray(int i, org.apache.xmlbeans.XmlString mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mediaType);
        }
    }
    
    /**
     * Inserts the value as the ith "MediaType" element
     */
    public void insertMediaType(int i, java.lang.String mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MEDIATYPE$0, i);
            target.setStringValue(mediaType);
        }
    }
    
    /**
     * Appends the value as the last "MediaType" element
     */
    public void addMediaType(java.lang.String mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIATYPE$0);
            target.setStringValue(mediaType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MediaType" element
     */
    public org.apache.xmlbeans.XmlString insertNewMediaType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(MEDIATYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MediaType" element
     */
    public org.apache.xmlbeans.XmlString addNewMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIATYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MediaType" element
     */
    public void removeMediaType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDIATYPE$0, i);
        }
    }
    
    /**
     * Gets the "fullIndicator" attribute
     */
    public boolean getFullIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLINDICATOR$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullIndicator" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFullIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FULLINDICATOR$2);
            return target;
        }
    }
    
    /**
     * Sets the "fullIndicator" attribute
     */
    public void setFullIndicator(boolean fullIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLINDICATOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLINDICATOR$2);
            }
            target.setBooleanValue(fullIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "fullIndicator" attribute
     */
    public void xsetFullIndicator(org.apache.xmlbeans.XmlBoolean fullIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FULLINDICATOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FULLINDICATOR$2);
            }
            target.set(fullIndicator);
        }
    }
}
