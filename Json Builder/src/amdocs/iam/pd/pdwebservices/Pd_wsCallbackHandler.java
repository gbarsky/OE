
/**
 * Pd_wsCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package amdocs.iam.pd.pdwebservices;

    /**
     *  Pd_wsCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class Pd_wsCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public Pd_wsCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public Pd_wsCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getOfferList method
            * override this method for handling normal response from getOfferList operation
            */
           public void receiveResultgetOfferList(
                    amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOfferList operation
           */
            public void receiveErrorgetOfferList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQuote method
            * override this method for handling normal response from getQuote operation
            */
           public void receiveResultgetQuote(
                    amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQuote operation
           */
            public void receiveErrorgetQuote(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFullProductList method
            * override this method for handling normal response from getFullProductList operation
            */
           public void receiveResultgetFullProductList(
                    amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFullProductList operation
           */
            public void receiveErrorgetFullProductList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProductList method
            * override this method for handling normal response from getProductList operation
            */
           public void receiveResultgetProductList(
                    amdocs.iam.pd.pdwebservices.GetProductListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProductList operation
           */
            public void receiveErrorgetProductList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProductSetList method
            * override this method for handling normal response from getProductSetList operation
            */
           public void receiveResultgetProductSetList(
                    amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProductSetList operation
           */
            public void receiveErrorgetProductSetList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOfferDetails method
            * override this method for handling normal response from getOfferDetails operation
            */
           public void receiveResultgetOfferDetails(
                    amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOfferDetails operation
           */
            public void receiveErrorgetOfferDetails(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBillDiscountList method
            * override this method for handling normal response from getBillDiscountList operation
            */
           public void receiveResultgetBillDiscountList(
                    amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBillDiscountList operation
           */
            public void receiveErrorgetBillDiscountList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProductTypeList method
            * override this method for handling normal response from getProductTypeList operation
            */
           public void receiveResultgetProductTypeList(
                    amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProductTypeList operation
           */
            public void receiveErrorgetProductTypeList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBrandList method
            * override this method for handling normal response from getBrandList operation
            */
           public void receiveResultgetBrandList(
                    amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBrandList operation
           */
            public void receiveErrorgetBrandList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBundleDetails method
            * override this method for handling normal response from getBundleDetails operation
            */
           public void receiveResultgetBundleDetails(
                    amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBundleDetails operation
           */
            public void receiveErrorgetBundleDetails(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBundleList method
            * override this method for handling normal response from getBundleList operation
            */
           public void receiveResultgetBundleList(
                    amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBundleList operation
           */
            public void receiveErrorgetBundleList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for bundleValidation method
            * override this method for handling normal response from bundleValidation operation
            */
           public void receiveResultbundleValidation(
                    amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from bundleValidation operation
           */
            public void receiveErrorbundleValidation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getVoucherList method
            * override this method for handling normal response from getVoucherList operation
            */
           public void receiveResultgetVoucherList(
                    amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getVoucherList operation
           */
            public void receiveErrorgetVoucherList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkOfferEligibility method
            * override this method for handling normal response from checkOfferEligibility operation
            */
           public void receiveResultcheckOfferEligibility(
                    amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkOfferEligibility operation
           */
            public void receiveErrorcheckOfferEligibility(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkProductEligibility method
            * override this method for handling normal response from checkProductEligibility operation
            */
           public void receiveResultcheckProductEligibility(
                    amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkProductEligibility operation
           */
            public void receiveErrorcheckProductEligibility(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFullOfferList method
            * override this method for handling normal response from getFullOfferList operation
            */
           public void receiveResultgetFullOfferList(
                    amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFullOfferList operation
           */
            public void receiveErrorgetFullOfferList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProductDetails method
            * override this method for handling normal response from getProductDetails operation
            */
           public void receiveResultgetProductDetails(
                    amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProductDetails operation
           */
            public void receiveErrorgetProductDetails(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBrandHierarchy method
            * override this method for handling normal response from getBrandHierarchy operation
            */
           public void receiveResultgetBrandHierarchy(
                    amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBrandHierarchy operation
           */
            public void receiveErrorgetBrandHierarchy(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMediaTypeList method
            * override this method for handling normal response from getMediaTypeList operation
            */
           public void receiveResultgetMediaTypeList(
                    amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMediaTypeList operation
           */
            public void receiveErrorgetMediaTypeList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getReferenceAttributeValues method
            * override this method for handling normal response from getReferenceAttributeValues operation
            */
           public void receiveResultgetReferenceAttributeValues(
                    amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getReferenceAttributeValues operation
           */
            public void receiveErrorgetReferenceAttributeValues(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDiscountList method
            * override this method for handling normal response from getDiscountList operation
            */
           public void receiveResultgetDiscountList(
                    amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDiscountList operation
           */
            public void receiveErrorgetDiscountList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHeadingList method
            * override this method for handling normal response from getHeadingList operation
            */
           public void receiveResultgetHeadingList(
                    amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHeadingList operation
           */
            public void receiveErrorgetHeadingList(java.lang.Exception e) {
            }
                


    }
    