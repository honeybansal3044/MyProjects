package hello;

public class StudentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5005585464639266565L;

	private String exceptionMsg;

	public StudentException(String exceptionMsg) {
	      this.exceptionMsg = exceptionMsg;
	   }

	public String getExceptionMsg() {
		return this.exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

}
