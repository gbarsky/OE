/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODECRITERION$0 = 
        new javax.xml.namespace.QName("", "ProductCodeCriterion");
    private static final javax.xml.namespace.QName PRODUCTTYPECRITERION$2 = 
        new javax.xml.namespace.QName("", "ProductTypeCriterion");
    private static final javax.xml.namespace.QName MEDIATYPECRITERION$4 = 
        new javax.xml.namespace.QName("", "MediaTypeCriterion");
    private static final javax.xml.namespace.QName CUSTOMERPARAMETERS$6 = 
        new javax.xml.namespace.QName("", "CustomerParameters");
    private static final javax.xml.namespace.QName DATACUSTOM$8 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
    /**
     * Gets the "ProductCodeCriterion" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion getProductCodeCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion)get_store().find_element_user(PRODUCTCODECRITERION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductCodeCriterion" element
     */
    public boolean isSetProductCodeCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCODECRITERION$0) != 0;
        }
    }
    
    /**
     * Sets the "ProductCodeCriterion" element
     */
    public void setProductCodeCriterion(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion productCodeCriterion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion)get_store().find_element_user(PRODUCTCODECRITERION$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion)get_store().add_element_user(PRODUCTCODECRITERION$0);
            }
            target.set(productCodeCriterion);
        }
    }
    
    /**
     * Appends and returns a new empty "ProductCodeCriterion" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion addNewProductCodeCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductCodeCriterion)get_store().add_element_user(PRODUCTCODECRITERION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductCodeCriterion" element
     */
    public void unsetProductCodeCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCODECRITERION$0, 0);
        }
    }
    
    /**
     * Gets the "ProductTypeCriterion" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion getProductTypeCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion)get_store().find_element_user(PRODUCTTYPECRITERION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductTypeCriterion" element
     */
    public boolean isSetProductTypeCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTTYPECRITERION$2) != 0;
        }
    }
    
    /**
     * Sets the "ProductTypeCriterion" element
     */
    public void setProductTypeCriterion(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion productTypeCriterion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion)get_store().find_element_user(PRODUCTTYPECRITERION$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion)get_store().add_element_user(PRODUCTTYPECRITERION$2);
            }
            target.set(productTypeCriterion);
        }
    }
    
    /**
     * Appends and returns a new empty "ProductTypeCriterion" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion addNewProductTypeCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.ProductTypeCriterion)get_store().add_element_user(PRODUCTTYPECRITERION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductTypeCriterion" element
     */
    public void unsetProductTypeCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTTYPECRITERION$2, 0);
        }
    }
    
    /**
     * Gets the "MediaTypeCriterion" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion getMediaTypeCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion)get_store().find_element_user(MEDIATYPECRITERION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MediaTypeCriterion" element
     */
    public boolean isSetMediaTypeCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDIATYPECRITERION$4) != 0;
        }
    }
    
    /**
     * Sets the "MediaTypeCriterion" element
     */
    public void setMediaTypeCriterion(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion mediaTypeCriterion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion)get_store().find_element_user(MEDIATYPECRITERION$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion)get_store().add_element_user(MEDIATYPECRITERION$4);
            }
            target.set(mediaTypeCriterion);
        }
    }
    
    /**
     * Appends and returns a new empty "MediaTypeCriterion" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion addNewMediaTypeCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.MediaTypeCriterion)get_store().add_element_user(MEDIATYPECRITERION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "MediaTypeCriterion" element
     */
    public void unsetMediaTypeCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDIATYPECRITERION$4, 0);
        }
    }
    
    /**
     * Gets the "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes getCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomerParameters" element
     */
    public boolean isSetCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERPARAMETERS$6) != 0;
        }
    }
    
    /**
     * Sets the "CustomerParameters" element
     */
    public void setCustomerParameters(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes customerParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$6);
            }
            target.set(customerParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes addNewCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomerParameters" element
     */
    public void unsetCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERPARAMETERS$6, 0);
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$8, 0);
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
            return get_store().count_elements(DATACUSTOM$8) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$8, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$8);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$8);
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
            get_store().remove_element(DATACUSTOM$8, 0);
        }
    }
}
