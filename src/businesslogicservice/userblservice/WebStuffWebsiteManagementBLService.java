package businesslogicservice.userblservice;

import java.until.ArrayList<>;
import vo.WebStuffWebsiteManagementVo;



//网站营销人员对网站进行操作的接口
public interface WebStuffWebsiteManagementBLService{
        
		
		
		//创建网站策略
		Public void WebsiteStrategeCreate(WebStuffWebsiteManagementVo vo);
		
		//查看异常订单
		Public ArrayList<OrderVo> AbnormalOrderScan();
		
		//修改用户信用度
		Public boolean UserCreditModification(WebStuffWebsiteManagementVo vo);
		
		
}