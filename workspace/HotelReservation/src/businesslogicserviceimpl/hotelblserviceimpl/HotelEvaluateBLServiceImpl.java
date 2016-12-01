package businesslogicserviceimpl.hotelblserviceimpl;



import java.util.ArrayList;

import businesslogic.util.EvaluationMsg;
import businesslogic.util.ResultMsg;
import vo.HotelEvaluateVO;

public class HotelEvaluateBLServiceImpl {
	ArrayList<HotelEvaluateVO> evaluationList;
	
	public HotelEvaluateBLServiceImpl() {
		evaluationList = new ArrayList<HotelEvaluateVO>();
	}
	
	/**
	 * ��������
	 *
	 */
	public EvaluationMsg inputEvaluate(HotelEvaluateVO evaluateInfoVO){
		return new EvaluationMsg(evaluateInfoVO.getScore(),evaluateInfoVO.getComment(),
				evaluateInfoVO.isReserved());
	}
	
	
   /**
     * ����Ƿ�����ִ�ж�����
     * 
     */
   public ResultMsg checkOrder(HotelEvaluateVO evaluateInfoVO){
	   if(evaluateInfoVO.isReserved()){
		   return new ResultMsg(true,"�������");
	   }
	   else{
		   return new ResultMsg(false,"���۳���");
	   }
   }
   
   
  
	
}