package vo;


public class HotelEvaluateVo{

    private String hotelID;
	 
	private int mark;
	 
	public HotelEvaluateVo(String hotelID,int mark){
	    this.hotelID=hotelID;
		this.mark=mark;
	}
	
	public String getHotelID(){
	    return hotelID;
	}
	
	public int getMark(){
	    return mark;
	}
	
}