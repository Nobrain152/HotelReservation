package businesslogicservice.hotelblservice._Stub;

import vo.HotelEvaluateVO;
import businesslogic.util.HotelMsg;
import businesslogicservice.hotelblservice.HotelEvaluateBLService;

public class HotelEvaluateBLService_Stub implements HotelEvaluateBLService{
	int score;
	String comment;
	String name;
	public HotelEvaluateBLService_Stub(){
		score=9;
		comment="�ǳ���";
	}
	
	public HotelEvaluateBLService_Stub(int score,String comment){
		this.score = score;
		this.comment=comment;
	}

//��������
	@Override
	public void inputEvaluate(HotelEvaluateVO evaluateInfoVO){
		if(HotelEvaluateVo.getComment().equals("�ǳ���")&&HotelEvaluateVO.getScore()==9)
			return new HotelMsg(true,"���۸�ʽ��ȷ");
		
	}
//���۸�ʽ����
	@Override
    public void wrongForm(HotelEvaluateVO wrongFormVO){
		return new HotelMsg(false,"���۸�ʽ����");
	}

//�ж��Ƿ���ִ��
	@Override
    public void checkOrder(HotelEvaluateVO orderListVO){
		if(HotelEvaluateVO.isReserved()==true){
			return new HotelMsg(true,"������ִ��");
		}
	}
	
//����ִ�ж�����
	@Override
    public void hotelOutOrder(HotelEvaluateVO outOrderVO){
		if(HotelEvaluateVO.isReserved()==false){
			return new HotelMsg(false,"����δִ��");
		}
	}
	
//�������
	@Override
	public void  completeEvaluation( HotelEvaluateVO completeEvaluationVO){
		if(HotelEvaluateVO.isReserved()==true){
			return new HotelMsg(true,"�������");
		}
	}
	
}
