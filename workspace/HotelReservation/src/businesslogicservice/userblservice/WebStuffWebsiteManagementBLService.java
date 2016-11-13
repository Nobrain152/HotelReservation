package businesslogicservice.userblservice;

import java.util.ArrayList;

import vo.IntegralVO;
import vo.OrderOnWebVO;
import vo.PromotionWebVO;
import vo.UserIDVO;



//网站营销人员对网站进行操作的接口
public interface WebStuffWebsiteManagementBLService{
		
		//创建网站策略
		public void WebsiteStrategeCreate(int i,PromotionWebVO vo);
		
		//查看异常订单
		public ArrayList<OrderOnWebVO> AbnormalOrderScan();
		
		//修改用户信用度
		public IntegralVO UserCreditModification(UserIDVO vo,int n);
		
		
}