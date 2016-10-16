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
		comment="非常好";
	}
	
	public HotelEvaluateBLService_Stub(int score,String comment){
		this.score = score;
		this.comment=comment;
	}

//输入评价
	@Override
	public void inputEvaluate(HotelEvaluateVO evaluateInfoVO){
		if(HotelEvaluateVo.getComment().equals("非常好")&&HotelEvaluateVO.getScore()==9)
			return new HotelMsg(true,"评价格式正确");
		
	}
//评价格式错误
	@Override
    public void wrongForm(HotelEvaluateVO wrongFormVO){
		return new HotelMsg(false,"评价格式错误");
	}

//判断是否已执行
	@Override
    public void checkOrder(HotelEvaluateVO orderListVO){
		if(HotelEvaluateVO.isReserved()==true){
			return new HotelMsg(true,"订单已执行");
		}
	}
	
//不在执行订单中
	@Override
    public void hotelOutOrder(HotelEvaluateVO outOrderVO){
		if(HotelEvaluateVO.isReserved()==false){
			return new HotelMsg(false,"订单未执行");
		}
	}
	
//完成评价
	@Override
	public void  completeEvaluation( HotelEvaluateVO completeEvaluationVO){
		if(HotelEvaluateVO.isReserved()==true){
			return new HotelMsg(true,"评价完成");
		}
	}
	
}
