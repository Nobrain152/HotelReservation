package businesslogicservice.hotelblservice;

import vo.HotelEvaluateVO;
import businesslogic.util.HotelMsg;

public interface HotelEvaluateBLService {
	
	/**
	 * ��������
	 *
	 */
	public void inputEvaluate(HotelEvaluateVO evaluateInfoVO)��
	
	/**
	 * �������۸�ʽ
	 * 
	 */
    public void wrongForm(HotelEvaluateVO wrongFormVO)��
   
   /**
     * ����Ƿ�����ִ�ж�����
     * 
     */
   public void checkOrder(HotelEvaluateVO orderListVO)��
   
   /**
     * ���ڶ�����
     * 
     */
   public void hotelOutOrder(HotelEvaluateVO outOrderVO)��
   
   
   /**
     * �������
     * 
     */
   public void  completeEvaluation( HotelEvaluateVO completeEvaluationVO)��

      
}