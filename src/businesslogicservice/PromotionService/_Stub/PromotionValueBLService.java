package businesslogicservice.PromotionService._Stub

import java.util.ArrayList;

import businesslogic.util.*;
import vo.UserVO;
import vo.OrderVO;

public class PromotionValueBLService_Stub {
	String ratio;
	String time;
	PromotionType type;
	
	public PromotionValueBLService_Stub(){
		timeBegin = "2016/10/10";
		PromotionType type = BIRTH_PROMOTION;
	}
	


	@Override
	public OrderVO getValue(UserVO user,OrderVO order,String time,PromotionType type) {
		return OrderVO;
	}

	
}