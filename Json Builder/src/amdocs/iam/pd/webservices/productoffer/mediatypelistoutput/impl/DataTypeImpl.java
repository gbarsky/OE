/*
 * XML Type:  DataType
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/MediaTypeListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.DataType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.impl;
/**
 * An XML DataType(@http://amdocs/iam/pd/webservices/productOffer/MediaTypeListOutput).
 *
 * This is a complex type.
 */
public class DataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.DataType
{
    
    public DataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIATYPES$0 = 
        new javax.xml.namespace.QName("", "mediaTypes");
    
    
    /**
     * Gets the "mediaTypes" element
     */
    public amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypes getMediaTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypes target = null;
            target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypes)get_store().find_element_user(MEDIATYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mediaTypes" element
     */
    public void setMediaTypes(amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypes mediaTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypes target = null;
            target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypes)get_store().find_element_user(MEDIATYPES$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypes)get_store().add_element_user(MEDIATYPES$0);
            }
            target.set(mediaTypes);
        }
    }
    
    /**
     * Appends and returns a new empty "mediaTypes" element
     */
    public amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypes addNewMediaTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypes target = null;
            target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypes)get_store().add_element_user(MEDIATYPES$0);
            return target;
        }
    }
}
