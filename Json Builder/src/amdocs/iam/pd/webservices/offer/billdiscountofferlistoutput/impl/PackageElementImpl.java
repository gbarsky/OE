/*
 * XML Type:  PackageElement
 * Namespace: http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListOutput
 * Java type: amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.impl;
/**
 * An XML PackageElement(@http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListOutput).
 *
 * This is a complex type.
 */
public class PackageElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement
{
    
    public PackageElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGECODE$0 = 
        new javax.xml.namespace.QName("", "packageCode");
    private static final javax.xml.namespace.QName PACKAGENAME$2 = 
        new javax.xml.namespace.QName("", "packageName");
    private static final javax.xml.namespace.QName PACKAGEDESC$4 = 
        new javax.xml.namespace.QName("", "packageDesc");
    private static final javax.xml.namespace.QName PERCENTAGEIND$6 = 
        new javax.xml.namespace.QName("", "percentageInd");
    private static final javax.xml.namespace.QName QUANTITY$8 = 
        new javax.xml.namespace.QName("", "quantity");
    private static final javax.xml.namespace.QName MINQUANTITY$10 = 
        new javax.xml.namespace.QName("", "minQuantity");
    private static final javax.xml.namespace.QName MAXQUANTITY$12 = 
        new javax.xml.namespace.QName("", "maxQuantity");
    private static final javax.xml.namespace.QName PACKAGEELEMENTCUSTOM$14 = 
        new javax.xml.namespace.QName("", "PackageElementCustom");
    
    
    /**
     * Gets the "packageCode" element
     */
    public java.lang.String getPackageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "packageCode" element
     */
    public org.apache.xmlbeans.XmlString xgetPackageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGECODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "packageCode" element
     */
    public void setPackageCode(java.lang.String packageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PACKAGECODE$0);
            }
            target.setStringValue(packageCode);
        }
    }
    
    /**
     * Sets (as xml) the "packageCode" element
     */
    public void xsetPackageCode(org.apache.xmlbeans.XmlString packageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PACKAGECODE$0);
            }
            target.set(packageCode);
        }
    }
    
    /**
     * Gets the "packageName" element
     */
    public java.lang.String getPackageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "packageName" element
     */
    public org.apache.xmlbeans.XmlString xgetPackageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGENAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "packageName" element
     */
    public void setPackageName(java.lang.String packageName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PACKAGENAME$2);
            }
            target.setStringValue(packageName);
        }
    }
    
    /**
     * Sets (as xml) the "packageName" element
     */
    public void xsetPackageName(org.apache.xmlbeans.XmlString packageName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PACKAGENAME$2);
            }
            target.set(packageName);
        }
    }
    
    /**
     * Gets the "packageDesc" element
     */
    public java.lang.String getPackageDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGEDESC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "packageDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetPackageDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGEDESC$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "packageDesc" element
     */
    public void setPackageDesc(java.lang.String packageDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGEDESC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PACKAGEDESC$4);
            }
            target.setStringValue(packageDesc);
        }
    }
    
    /**
     * Sets (as xml) the "packageDesc" element
     */
    public void xsetPackageDesc(org.apache.xmlbeans.XmlString packageDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGEDESC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PACKAGEDESC$4);
            }
            target.set(packageDesc);
        }
    }
    
    /**
     * Gets the "percentageInd" element
     */
    public java.lang.String getPercentageInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTAGEIND$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "percentageInd" element
     */
    public org.apache.xmlbeans.XmlString xgetPercentageInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERCENTAGEIND$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "percentageInd" element
     */
    public void setPercentageInd(java.lang.String percentageInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTAGEIND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERCENTAGEIND$6);
            }
            target.setStringValue(percentageInd);
        }
    }
    
    /**
     * Sets (as xml) the "percentageInd" element
     */
    public void xsetPercentageInd(org.apache.xmlbeans.XmlString percentageInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERCENTAGEIND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERCENTAGEIND$6);
            }
            target.set(percentageInd);
        }
    }
    
    /**
     * Gets the "quantity" element
     */
    public double getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$8, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "quantity" element
     */
    public org.apache.xmlbeans.XmlDouble xgetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(QUANTITY$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(double quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITY$8);
            }
            target.setDoubleValue(quantity);
        }
    }
    
    /**
     * Sets (as xml) the "quantity" element
     */
    public void xsetQuantity(org.apache.xmlbeans.XmlDouble quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(QUANTITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(QUANTITY$8);
            }
            target.set(quantity);
        }
    }
    
    /**
     * Gets the "minQuantity" element
     */
    public double getMinQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINQUANTITY$10, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "minQuantity" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMinQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINQUANTITY$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minQuantity" element
     */
    public void setMinQuantity(double minQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINQUANTITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINQUANTITY$10);
            }
            target.setDoubleValue(minQuantity);
        }
    }
    
    /**
     * Sets (as xml) the "minQuantity" element
     */
    public void xsetMinQuantity(org.apache.xmlbeans.XmlDouble minQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINQUANTITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MINQUANTITY$10);
            }
            target.set(minQuantity);
        }
    }
    
    /**
     * Gets the "maxQuantity" element
     */
    public double getMaxQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXQUANTITY$12, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxQuantity" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMaxQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXQUANTITY$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxQuantity" element
     */
    public void setMaxQuantity(double maxQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXQUANTITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXQUANTITY$12);
            }
            target.setDoubleValue(maxQuantity);
        }
    }
    
    /**
     * Sets (as xml) the "maxQuantity" element
     */
    public void xsetMaxQuantity(org.apache.xmlbeans.XmlDouble maxQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXQUANTITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MAXQUANTITY$12);
            }
            target.set(maxQuantity);
        }
    }
    
    /**
     * Gets the "PackageElementCustom" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom getPackageElementCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom)get_store().find_element_user(PACKAGEELEMENTCUSTOM$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PackageElementCustom" element
     */
    public boolean isSetPackageElementCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PACKAGEELEMENTCUSTOM$14) != 0;
        }
    }
    
    /**
     * Sets the "PackageElementCustom" element
     */
    public void setPackageElementCustom(amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom packageElementCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom)get_store().find_element_user(PACKAGEELEMENTCUSTOM$14, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom)get_store().add_element_user(PACKAGEELEMENTCUSTOM$14);
            }
            target.set(packageElementCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "PackageElementCustom" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom addNewPackageElementCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.PackageElementCustom)get_store().add_element_user(PACKAGEELEMENTCUSTOM$14);
            return target;
        }
    }
    
    /**
     * Unsets the "PackageElementCustom" element
     */
    public void unsetPackageElementCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PACKAGEELEMENTCUSTOM$14, 0);
        }
    }
}
