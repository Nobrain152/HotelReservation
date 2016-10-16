package businesslogicservice.hotelblservice._Driver;

import java.util.ArrayList;

import vo.HotelEvaluateVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelEvaluateBLService;
import businesslogicservice.hotelblservice._Stub.HotelEvaluateBLService_Stub;

public class HotelEvaluateBLService_Driver {
	public static void main(String[] args){
		HotelEvaluateBLService a=new HotelEvaluateBLService_Stub();
		HotelEvaluateBLService_Driver b=new HotelEvaluateBLService_Driver();
		b.drive(a);
	
	}
	public void drive(HotelEvaluateBLService a){
		HotelEvaluateVO ev=new HotelEvaluateVO(9,"�ǳ���");
		ArrayList<HotelEvaluateVO> hotelEvaluate=new ArrayList<HotelEvaluateVO> ();
		hotelEvaluate.add(ev);
		HotelEvaluateVO	evaluate=new HotelEvaluateVO(9,hotelEvaluate);
		
		HotelMsg result=a.inputEvaluate(evaluate);
		if(result.isPass()==true)
			System.out.println("��������۸�ʽ��ȷ");
		else
			System.out.println("��������۸�ʽ����ȷ");
		HotelMsg result1=a.checkOrder(evaluate);
		if(result1.isPass()==true)
			System.out.println("�ύ�ɹ�");
		else
			System.out.println("�ύʧ��");
	}
}
