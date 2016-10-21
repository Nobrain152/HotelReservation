package businesslogicservice.userblservice._Stub;

import java.until.ArrayList<>;
import businesslogic.util.MemberType;
import VO.HotelConditionVO;
import VO.HotelIDVO;
import VO.OrderVO;
import VO.HotelEvaluateVO;

public class CustomerHotelOperationBLService_Stub implements CustomerHotelOperationBLService{
    
	HotelConditionVO ho;
	int[] checkIn;
	int[] checkOut;
	int[] mark;
	HotelInfoVO hot;
	ArrayList<HotelInfoVO> arr;
	
	public CustomerHotelOperationBLService_Stub(){
	    checkIn={2016,11,22};
		checkOut={2016,11,24};
		mark={60,80};
		ho=new HotelConditongVO(ADD_NANJING,BUS_XINJIEKOU,null,ROOM_BIGBED,600,200,checkIn,checkOut,3,mark);
		hot=new HotelInfoVO("电力宾馆","南京","新街口",3,"very nice","空调", false);
		arr=new ArrayList<HotelInfoVO>();
		arr.add(hot);
	}
	

//
    @Override
    Public HotelSearch ArrayList<HotelInfoVO>(HotelConditionVO VO){
	    if(VO.equalsho){
		    return arr;
		}
		else{
		    ArrayList<HotelInfoVO> a=new ArrayList<HotelInfoVO>();
			HotelInfoVO v=null;
			a.add(v);
			return a;
		}
	}
	
	Public ResultMsg OederCreat(HotelIDVO VO1,OrderVO VO2){
	    return ResultMsg(true,"预定成功");
	}
	
	Public VOid HotelEvaluate(HotelEvaluateVO VO){
	    int i=VO.getMark;
	}
	
	Public VOid MemberRegisterApply(HotelIDVO VO1,MemberVO VO2){
	    String s=VO2.getUserName;
	}
	
	Public HotelInfoVO HotelInformationInquiry(HotelIDVO VO){
	    return  hot;
	}

}
