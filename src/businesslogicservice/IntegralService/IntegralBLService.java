package businesslogicservice.IntegralService;

import vo.IntegralVO;
/**
 * ����ҵ���߼��ӿ�
 * @author kevin
 *
 */

import vo.IntegralVO;
import vo.UserVO;

public interface IntegralBLService {
	/**
	 * �������ֵ
	 * 
	 */
	public IntegralVO getIntegral(UserVO client);
	
	/**
	 * ��������ֵ
	 */
	public IntegralVO addIntegral(UserVO client,int value)��
	
	/**
	 * ��������ֵ
	 */
	public IntegralVO subIntegral(UserVO client,int value);
	
	/**
	 * �޸�����ֵ
	 */
	public IntegralVO changeIntegral(UserVO client,int value);
	
}
