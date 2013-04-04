/*
 * An XML document type.
 * Localname: GetHeadingList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetHeadingListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetHeadingList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetHeadingListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetHeadingListDocument
{
    
    public GetHeadingListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETHEADINGLIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetHeadingList");
    
    
    /**
     * Gets the "GetHeadingList" element
     */
    public amdocs.iam.pd.pdwebservices.GetHeadingListDocument.GetHeadingList getGetHeadingList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetHeadingListDocument.GetHeadingList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetHeadingListDocument.GetHeadingList)get_store().find_element_user(GETHEADINGLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetHeadingList" element
     */
    public void setGetHeadingList(amdocs.iam.pd.pdwebservices.GetHeadingListDocument.GetHeadingList getHeadingList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetHeadingListDocument.GetHeadingList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetHeadingListDocument.GetHeadingList)get_store().find_element_user(GETHEADINGLIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetHeadingListDocument.GetHeadingList)get_store().add_element_user(GETHEADINGLIST$0);
            }
            target.set(getHeadingList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetHeadingList" element
     */
    public amdocs.iam.pd.pdwebservices.GetHeadingListDocument.GetHeadingList addNewGetHeadingList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetHeadingListDocument.GetHeadingList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetHeadingListDocument.GetHeadingList)get_store().add_element_user(GETHEADINGLIST$0);
            return target;
        }
    }
    /**
     * An XML GetHeadingList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetHeadingListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetHeadingListDocument.GetHeadingList
    {
        
        public GetHeadingListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/heading/HeadingListInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.heading.headinglistinput.HeadingListInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.heading.headinglistinput.HeadingListInput target = null;
                target = (amdocs.iam.pd.webservices.heading.headinglistinput.HeadingListInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.heading.headinglistinput.HeadingListInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.heading.headinglistinput.HeadingListInput target = null;
                target = (amdocs.iam.pd.webservices.heading.headinglistinput.HeadingListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.heading.headinglistinput.HeadingListInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.heading.headinglistinput.HeadingListInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.heading.headinglistinput.HeadingListInput target = null;
                target = (amdocs.iam.pd.webservices.heading.headinglistinput.HeadingListInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
