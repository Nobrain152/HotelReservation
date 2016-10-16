package businesslogicservice.IntegralService;

import vo.IntegralVO;
/**
 * 积分业务逻辑接口
 * @author kevin
 *
 */

import vo.IntegralVO;
import vo.UserVO;

public interface IntegralBLService {
	/**
	 * 获得信用值
	 * 
	 */
	public IntegralVO getIntegral(UserVO client);
	
	/**
	 * 增加信用值
	 */
	public IntegralVO addIntegral(UserVO client,int value)；
	
	/**
	 * 减少信用值
	 */
	public IntegralVO subIntegral(UserVO client,int value);
	
	/**
	 * 修改信用值
	 */
	public IntegralVO changeIntegral(UserVO client,int value);
	
}
