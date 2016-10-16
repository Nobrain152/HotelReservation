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
	
}	