package util;

public class WebResponse {
	private int responseCode;
	private Object response;
	private String error_message;

	public WebResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebResponse(int responseCode, Object response, String error_message) {
		super();
		this.responseCode = responseCode;
		this.response = response;
		this.error_message = error_message;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

	public String getError_message() {
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}

}
