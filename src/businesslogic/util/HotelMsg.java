package businesslogic.util;

/**
 * 酒店操作的返回信息
 * 
 */
public class HotelMsg {
	/**
	 * 是否通过该阶段的检查
	 */
	private boolean pass;
	
	/**
	 * 返回的信息
	 */
	private String message;
	
	public HotelMsg(boolean pass, String message) {
		super();
		this.pass = pass;
		this.message = message;
	}
	
	@Override
	public String toString(){
		return message;
	}
	
    public boolean isPass() {
        return pass;
    }

    public String getMessage() {
        return message;
    }
}
