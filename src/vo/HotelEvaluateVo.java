<<<<<<< HEAD
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
	
=======
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
	
>>>>>>> 727ede01d10abd2e000e306ffc37ab3c9bba25f7
}	