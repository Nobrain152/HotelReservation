package businesslogicservice.PromotionService;

/**
 * ������ֵ�߼���ӿ�
 * @author T5-SK
 *
 */

import vo.UserVO;
import vo.OrderVO;
import businesslogic.util.*;

public interface PromotionValueBLService {
	public OrderVO getValue(UserVO user,OrderVO order,String time,PromotionType type);
}
