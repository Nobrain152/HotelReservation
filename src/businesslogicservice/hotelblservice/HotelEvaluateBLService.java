package businesslogicservice.hotelblservice;

import vo.HotelEvaluateVO;
import businesslogic.util.HotelMsg;

public interface HotelEvaluateBLService {
	
	/**
	 * 输入评价
	 *
	 */
	public void inputEvaluate(HotelEvaluateVO evaluateInfoVO)；
	
	/**
	 * 错误评论格式
	 * 
	 */
    public void wrongForm(HotelEvaluateVO wrongFormVO)；
   
   /**
     * 检查是否在已执行订单中
     * 
     */
   public void checkOrder(HotelEvaluateVO orderListVO)；
   
   /**
     * 不在订单中
     * 
     */
   public void hotelOutOrder(HotelEvaluateVO outOrderVO)；
   
   
   /**
     * 完成评价
     * 
     */
   public void  completeEvaluation( HotelEvaluateVO completeEvaluationVO)；

      
}