package businesslogicservice.vipService;

/**
 * ��Աҵ���߼���ӿ�
 * @author kevin
 *
 */

import vo.VipVO;
import vo.UserVO;

public interface VipLevelBLService {
	/**
	 * ��û�Ա�ȼ���Ӧ����ֵ
	 */
	public VipVO searchLevelNeed() ;
	
	/**
	 * ����û���ǰ����ֵ��Ӧ�ĵȼ�
	 */
	public VipVO searchLevel(UserVO user);
	
	/**
	 * �޸��û��ȼ���Ҫ������ֵ
	 */
	public void changeLevelNeed(int level, int integral);
}
