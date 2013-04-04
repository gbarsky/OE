/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/offerAdvPkg/OfferDetailsOutput
 * Java type: amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/offerAdvPkg/OfferDetailsOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERENTITY$0 = 
        new javax.xml.namespace.QName("", "offerEntity");
    private static final javax.xml.namespace.QName DATACUSTOM$2 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
    /**
     * Gets the "offerEntity" element
     */
    public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity getOfferEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity)get_store().find_element_user(OFFERENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "offerEntity" element
     */
    public void setOfferEntity(amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity offerEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity)get_store().find_element_user(OFFERENTITY$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity)get_store().add_element_user(OFFERENTITY$0);
            }
            target.set(offerEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "offerEntity" element
     */
    public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity addNewOfferEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity)get_store().add_element_user(OFFERENTITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataCustom" element
     */
    public boolean isSetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACUSTOM$2) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$2);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DataCustom" element
     */
    public void unsetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACUSTOM$2, 0);
        }
    }
}
