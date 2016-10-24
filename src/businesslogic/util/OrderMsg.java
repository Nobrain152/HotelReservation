package businesslogic.util;

import businesslogic.util.OrderState;

/**
 * 订单信息
 * 
 * @author txin
 *
 */
public class OrderMsg extends ResultMsg{
	
	/**
	 * 订单发起人
	 */
	private String initiator;
	
	/**
	 * 订单状态
	 */
	
	public OrderMsg(String initiator,OrderState orderState) {
		super();
		this.initiator = initiator;
		this.orderState = orderState;
	}
	
	@Override
	public String toString(){
		return initiator;
	}
	
    public String getInitiator() {
        return initiator;
    }
	
	public OrderState getOrderState() {
		return orderState;
	}

}
