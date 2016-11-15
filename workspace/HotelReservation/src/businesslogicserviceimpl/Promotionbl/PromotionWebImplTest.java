package businesslogicserviceimpl.Promotionbl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import businesslogic.util.PromotionWebType;
import po.PromotionWebPO;

public class PromotionWebImplTest {

	PromotionWebImpl web;
	PromotionWebPO web1,web2,web3;
	
	
	@Before
	public void setUp() throws Exception {
		web1 = new PromotionWebPO("七天",PromotionWebType.VIP_LEVEL_PROMOTION,"vip", null, null, "80%");
		web2 = new PromotionWebPO("七天",PromotionWebType.VIP_CIRCLE_PROMOTION,"vip", null, null, "70%");
		web3 = new PromotionWebPO("七天",PromotionWebType.WEB_CUSTOM_PROMOTION,"vip","2016/11/05", "2016/11/11", "50%");
		//web要添加增加方法
		web.addLevelCut(1, web1.getRatio());
		web.addCircleCut("xianlin", web2.getRatio());
		web.addWebCustomCut(web3.getTimeBegin(), web3.getTimeOver(), web3.getRatio());
	}

	@Test
	public void testgetwebPromotion() {
		ArrayList<PromotionWebPO> webProList1 = web.getWebPromotion(0);
		ArrayList<PromotionWebPO> webProAnsList1 = new ArrayList<PromotionWebPO>();
		webProAnsList1.add(web1);
		assertEquals(webProList1,webProAnsList1);
		
		ArrayList<PromotionWebPO> webProList2 = web.getWebPromotion(1);
		ArrayList<PromotionWebPO> webProAnsList2 = new ArrayList<PromotionWebPO>();
		webProAnsList2.add(web2);
		assertEquals(webProList2,webProAnsList2);
		
		ArrayList<PromotionWebPO> webProList3 = web.getWebPromotion(1);
		ArrayList<PromotionWebPO> webProAnsList3 = new ArrayList<PromotionWebPO>();
		webProAnsList3.add(web3);
		assertEquals(webProList3,webProAnsList3);
	}
}
