package client;

public class ProductDetails {
	
	String productName = "";
	String productDesc = "";
	String daysForFulfillment ="";
	String agreementReqInd = "";
	String effectiveDate = "";
	String 	expirationDate ="";
	String 	limitInventoryType = ""; 
	String 	maxAppearances = "";
	String 	mediaType = ""; 
	String 	productCode ="";
	String 	productionDate = "";
	String 	productStatus ="" ;
	String 	productType ="" ;
	String 	productVersion ="";
	String 	showAppearAttrList = "";
	Heading[] headings;
	ProductAttribute[] attributes;
	
	public Heading[] getHeadings() {
		return headings;
	}
	public void setHeadings(Heading[] headings) {
		this.headings = headings;
	}
	
	public ProductAttribute[] getAttributes() {
		return attributes;
	}
	public void setAttributes(ProductAttribute[] attributes) {
		this.attributes = attributes;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getDaysForFulfillment() {
		return daysForFulfillment;
	}
	public void setDaysForFulfillment(String daysForFulfillment) {
		this.daysForFulfillment = daysForFulfillment;
	}
	public String getAgreementReqInd() {
		return agreementReqInd;
	}
	public void setAgreementReqInd(String agreementReqInd) {
		this.agreementReqInd = agreementReqInd;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getLimitInventoryType() {
		return limitInventoryType;
	}
	public void setLimitInventoryType(String limitInventoryType) {
		this.limitInventoryType = limitInventoryType;
	}
	public String getMaxAppearances() {
		return maxAppearances;
	}
	public void setMaxAppearances(String maxAppearances) {
		this.maxAppearances = maxAppearances;
	}
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductVersion() {
		return productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}
	public String getShowAppearAttrList() {
		return showAppearAttrList;
	}
	public void setShowAppearAttrList(String showAppearAttrList) {
		this.showAppearAttrList = showAppearAttrList;
	}
 
}


