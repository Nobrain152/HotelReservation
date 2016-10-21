<<<<<<< HEAD
<<<<<<< HEAD
package VO;


public class HotelEvaluateVO{

    private String hotelID;
	 
	private int mark;
	 
	public HotelEvaluateVO(String hotelID,int mark){
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
=======
=======
>>>>>>> f606802332e7b71721ecd3b8e6715285e8cb806b
package vo;


public class HotelEvaluateVO{


	/**
	 * 评分
	 */
	private int score;

	/**
	 * 评论信息
	 */
	private String comment;
	
	/**
	 * 是否订过
	 */
	private boolean reserve;
	
	
	public HotelEvaluateVO(int score, String comment, boolean reserve) {
		super();
		this.score = score;
		this.comment = comment;
		this.reserve=reserve;
	}

	public String getScore() {
		return score;
	}

	public String getComment() {
		return comment;
	}

	public boolean isReserved(){
		return reserve;
	}
	
<<<<<<< HEAD
}	
>>>>>>> 727ede01d10abd2e000e306ffc37ab3c9bba25f7
=======
}	
>>>>>>> f606802332e7b71721ecd3b8e6715285e8cb806b
