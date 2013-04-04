/*
 * XML Type:  MediaType
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/MediaTypeListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.impl;
/**
 * An XML MediaType(@http://amdocs/iam/pd/webservices/productOffer/MediaTypeListOutput).
 *
 * This is a complex type.
 */
public class MediaTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaType
{
    
    public MediaTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIATYPE$0 = 
        new javax.xml.namespace.QName("", "mediaType");
    private static final javax.xml.namespace.QName MEDIATYPENAME$2 = 
        new javax.xml.namespace.QName("", "mediaTypeName");
    private static final javax.xml.namespace.QName MEDIATYPECUSTOM$4 = 
        new javax.xml.namespace.QName("", "MediaTypeCustom");
    
    
    /**
     * Gets the "mediaType" element
     */
    public java.lang.String getMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediaType" element
     */
    public org.apache.xmlbeans.XmlString xgetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mediaType" element
     */
    public void setMediaType(java.lang.String mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIATYPE$0);
            }
            target.setStringValue(mediaType);
        }
    }
    
    /**
     * Sets (as xml) the "mediaType" element
     */
    public void xsetMediaType(org.apache.xmlbeans.XmlString mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIATYPE$0);
            }
            target.set(mediaType);
        }
    }
    
    /**
     * Gets the "mediaTypeName" element
     */
    public java.lang.String getMediaTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediaTypeName" element
     */
    public org.apache.xmlbeans.XmlString xgetMediaTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPENAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mediaTypeName" element
     */
    public void setMediaTypeName(java.lang.String mediaTypeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIATYPENAME$2);
            }
            target.setStringValue(mediaTypeName);
        }
    }
    
    /**
     * Sets (as xml) the "mediaTypeName" element
     */
    public void xsetMediaTypeName(org.apache.xmlbeans.XmlString mediaTypeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIATYPENAME$2);
            }
            target.set(mediaTypeName);
        }
    }
    
    /**
     * Gets the "MediaTypeCustom" element
     */
    public amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom getMediaTypeCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom)get_store().find_element_user(MEDIATYPECUSTOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MediaTypeCustom" element
     */
    public boolean isSetMediaTypeCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDIATYPECUSTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "MediaTypeCustom" element
     */
    public void setMediaTypeCustom(amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom mediaTypeCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom)get_store().find_element_user(MEDIATYPECUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom)get_store().add_element_user(MEDIATYPECUSTOM$4);
            }
            target.set(mediaTypeCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "MediaTypeCustom" element
     */
    public amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom addNewMediaTypeCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutputimpl.MediaTypeCustom)get_store().add_element_user(MEDIATYPECUSTOM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "MediaTypeCustom" element
     */
    public void unsetMediaTypeCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDIATYPECUSTOM$4, 0);
        }
    }
}
