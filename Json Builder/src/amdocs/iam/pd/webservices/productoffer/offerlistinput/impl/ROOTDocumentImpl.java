/*
 * An XML document type.
 * Localname: ROOT
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/OfferListInput
 * Java type: amdocs.iam.pd.webservices.productoffer.offerlistinput.ROOTDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.offerlistinput.impl;
/**
 * A document containing one ROOT(@http://amdocs/iam/pd/webservices/productOffer/OfferListInput) element.
 *
 * This is a complex type.
 */
public class ROOTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.offerlistinput.ROOTDocument
{
    
    public ROOTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOT$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productOffer/OfferListInput", "ROOT");
    
    
    /**
     * Gets the "ROOT" element
     */
    public amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput getROOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput target = null;
            target = (amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput)get_store().find_element_user(ROOT$0, 0);
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
    public void setROOT(amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput target = null;
            target = (amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput)get_store().find_element_user(ROOT$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput)get_store().add_element_user(ROOT$0);
            }
            target.set(root);
        }
    }
    
    /**
     * Appends and returns a new empty "ROOT" element
     */
    public amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput addNewROOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput target = null;
            target = (amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput)get_store().add_element_user(ROOT$0);
            return target;
        }
    }
}
