package businesslogicservice.vipService;

/**
 * 会员业务逻辑层接口
 * @author kevin
 *
 */

import vo.VipVO;
import vo.UserVO;

public interface VipLevelBLService {
	/**
	 * 获得会员等级对应信用值
	 */
	public VipVO searchLevelNeed() ;
	
	/**
	 * 获得用户当前信用值对应的等级
	 */
	public VipVO searchLevel(UserVO user);
	
	/**
	 * 修改用户等级需要的信用值
	 */
	public void changeLevelNeed(int level, int integral);
}
