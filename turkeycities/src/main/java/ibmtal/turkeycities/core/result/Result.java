package ibmtal.turkeycities.core.result;

import java.util.ArrayList;

public class Result<T> {
	private boolean success;
	private ArrayList<T> data;
	private ArrayList<ErrorItem> error;
	public Result() {
		this.setSuccess(true);
		this.error=new ArrayList<ErrorItem>();
		this.data=new ArrayList<T>();
		
	}
	public Result(boolean success, ArrayList<T> data, ArrayList<ErrorItem> error) {
		super();
		this.success = success;
		this.data = data;
		this.error = error;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public ArrayList<T> getData() {
		return data;
	}
	public void setData(ArrayList<T> data) {
		this.data = data;
	}
	public ArrayList<ErrorItem> getError() {
		return error;
	}
	public void setError(ArrayList<ErrorItem> error) {
		this.error = error;
	}
	public void addError() {
		ErrorItem newError= new ErrorItem();
		this.setSuccess(false);
		this.error.add(newError);
	}
	public void addError(int errorCode) {
		ErrorItem newError= new ErrorItem();
		newError.setErrorCode(errorCode);
		this.error.add(newError);
	}
	public void addError(int errorCode,String name) {
		ErrorItem newError= new ErrorItem();
		newError.setErrorCode(errorCode);
		newError.setName(name);
		this.error.add(newError);
	}
	public void addError(int errorCode,String name,String value) {
		ErrorItem newError= new ErrorItem();
		newError.setErrorCode(errorCode);
		newError.setName(name);
		newError.setValue(value);
		this.error.add(newError);  
	}
	
}
