package businesslogicservice.PromotionService;

/**
 * 订单价值逻辑层接口
 * @author T5-SK
 *
 */

import vo.UserVO;
import vo.OrderVO;
import businesslogic.util.*;

public interface PromotionValueBLService {
	public OrderVO getValue(UserVO user,OrderVO order,String time,PromotionType type);
}
