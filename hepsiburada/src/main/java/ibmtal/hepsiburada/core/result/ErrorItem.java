package ibmtal.hepsiburada.core.result;

public class ErrorItem {
	private int errorCode;
	private String name;
	private String value;
	public ErrorItem() {
		super();
	}
	public ErrorItem(int errorCode, String name, String value) {
		super();
		this.errorCode = errorCode;
		this.name = name;
		this.value = value;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
