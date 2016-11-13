package businesslogicserviceimpl.userblserviceimpl;

import java.util.ArrayList;

import vo.IntegralVO;
import vo.OrderOnWebVO;
import vo.PromotionWebVO;
import vo.UserIDVO;
import businesslogicservice.PromotionService.PromotionWebChangeBLServiceImp;
import businesslogicservice.orderblservice.OrderOnWebBLServiceImp;
import businesslogicservice.IntegralService.IntegralBLServiceImp;
import businesslogicservice.IntegralService.UserVO;

public class WebStuffWebsiteManagementBLServiceImpl implements WebStuffWebsiteManagementBLService {

	PromotionWebChangeBLServiceImpl pro;
	OrderOnWebBLServiceImpl order;
	IntegralBLServiceImpl inte;
	
	public  WebStuffWebsiteManagementBLServiceImpl(){
		pro=new PromotionWebChangeBLServiceImpl();
		order=new OrderOnWebBLServiceImpl();
		inte=new IntegralBLServiceImpl();
	}
	
	
	public void WebsiteStrategeCreate(int i,PromotionWebVO vo){
		
	}
			
	
	public ArrayList<OrderOnWebVO> AbnormalOrderScan(){
		return order.abnormalOrderScan();
	}
			
	
	public IntegralVO UserCreditModification(UserIDVO vo,int n){
		return inte.changeIntegral(vo,n);
	}
}
