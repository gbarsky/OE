package client;

public class SlvInfo {
	
	protected String codeColumnDisplayedName = "";
	protected String decodeColumnDisplayedName = "";
	protected String populatedFieldAttribute ="";
	protected String populatedColumnDisplayedName ="";
	protected ColumnValue[] columnValues;
	
	
	public ColumnValue[] getColumnValues() {
		return columnValues;
	}
	public void setColumnValues(ColumnValue[] columnValues) {
		this.columnValues = columnValues;
	}
	public String getCodeColumnDisplayedName() {
		return codeColumnDisplayedName;
	}
	public void setCodeColumnDisplayedName(String codeColumnDisplayedName) {
		this.codeColumnDisplayedName = codeColumnDisplayedName;
	}
	public String getDecodeColumnDisplayedName() {
		return decodeColumnDisplayedName;
	}
	public void setDecodeColumnDisplayedName(String decodeColumnDisplayedName) {
		this.decodeColumnDisplayedName = decodeColumnDisplayedName;
	}
	public String getPopulatedFieldAttribute() {
		return populatedFieldAttribute;
	}
	public void setPopulatedFieldAttribute(String populatedFieldAttribute) {
		this.populatedFieldAttribute = populatedFieldAttribute;
	}
	public String getPopulatedColumnDisplayedName() {
		return populatedColumnDisplayedName;
	}
	public void setPopulatedColumnDisplayedName(String populatedColumnDisplayedName) {
		this.populatedColumnDisplayedName = populatedColumnDisplayedName;
	}
	

	
	

}
