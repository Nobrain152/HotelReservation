package businesslogicserviceimpl.Vipbl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import businesslogic.util.VipType;
import vo.VipVO;

public class VipText {
	int level;
	int integral;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testchangeLevelNeed() {
		level = 1;
		integral = 100;
		VipImpl vip = new VipImpl();
		vip.changeLevelNeed(level, integral);
		assertEquals(vip.searchLevelNeed(),new VipVO("null", new ArrayList<int[][]>(), level, VipType.COMMON_VIP));
	}

}
