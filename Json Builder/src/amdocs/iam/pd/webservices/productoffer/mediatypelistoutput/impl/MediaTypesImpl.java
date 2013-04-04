/*
 * XML Type:  MediaTypes
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/MediaTypeListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypes
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.impl;
/**
 * An XML MediaTypes(@http://amdocs/iam/pd/webservices/productOffer/MediaTypeListOutput).
 *
 * This is a complex type.
 */
public class MediaTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypes
{
    
    public MediaTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIATYPE$0 = 
        new javax.xml.namespace.QName("", "mediaType");
    
    
    /**
     * Gets array of all "mediaType" elements
     */
    public amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType[] getMediaTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEDIATYPE$0, targetList);
            amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType[] result = new amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mediaType" element
     */
    public amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType getMediaTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType target = null;
            target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType)get_store().find_element_user(MEDIATYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mediaType" element
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
     * Sets array of all "mediaType" element
     */
    public void setMediaTypeArray(amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType[] mediaTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mediaTypeArray, MEDIATYPE$0);
        }
    }
    
    /**
     * Sets ith "mediaType" element
     */
    public void setMediaTypeArray(int i, amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType target = null;
            target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType)get_store().find_element_user(MEDIATYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mediaType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mediaType" element
     */
    public amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType insertNewMediaType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType target = null;
            target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType)get_store().insert_element_user(MEDIATYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mediaType" element
     */
    public amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType addNewMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType target = null;
            target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType)get_store().add_element_user(MEDIATYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "mediaType" element
     */
    public void removeMediaType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDIATYPE$0, i);
        }
    }
}
