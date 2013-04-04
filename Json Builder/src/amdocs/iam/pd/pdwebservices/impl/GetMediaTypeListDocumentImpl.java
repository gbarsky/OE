/*
 * An XML document type.
 * Localname: GetMediaTypeList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetMediaTypeList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetMediaTypeListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument
{
    
    public GetMediaTypeListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMEDIATYPELIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetMediaTypeList");
    
    
    /**
     * Gets the "GetMediaTypeList" element
     */
    public amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument.GetMediaTypeList getGetMediaTypeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument.GetMediaTypeList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument.GetMediaTypeList)get_store().find_element_user(GETMEDIATYPELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMediaTypeList" element
     */
    public void setGetMediaTypeList(amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument.GetMediaTypeList getMediaTypeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument.GetMediaTypeList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument.GetMediaTypeList)get_store().find_element_user(GETMEDIATYPELIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument.GetMediaTypeList)get_store().add_element_user(GETMEDIATYPELIST$0);
            }
            target.set(getMediaTypeList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMediaTypeList" element
     */
    public amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument.GetMediaTypeList addNewGetMediaTypeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument.GetMediaTypeList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument.GetMediaTypeList)get_store().add_element_user(GETMEDIATYPELIST$0);
            return target;
        }
    }
    /**
     * An XML GetMediaTypeList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetMediaTypeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetMediaTypeListDocument.GetMediaTypeList
    {
        
        public GetMediaTypeListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productOffer/MediaTypeListInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.mediatypelistinput.MediaTypeListInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.mediatypelistinput.MediaTypeListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.mediatypelistinput.MediaTypeListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ROOT" element
         */
        public void setROOT(amdocs.iam.pd.webservices.productoffer.mediatypelistinput.MediaTypeListInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.mediatypelistinput.MediaTypeListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.mediatypelistinput.MediaTypeListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productoffer.mediatypelistinput.MediaTypeListInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.mediatypelistinput.MediaTypeListInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.mediatypelistinput.MediaTypeListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.mediatypelistinput.MediaTypeListInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
