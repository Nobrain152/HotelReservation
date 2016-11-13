package businesslogic.util;

import businesslogic.util.User;
import businesslogic.util.OrderState;

/**
 * 客户订单VO
 * 
 * @author txin
 *
 */
public class OrderOnWebMsg extends OrderMsg{
	
	/**
	 * 申诉理由
	 */
	public String reason;
	
	public OrderOnWebMsg(User initiator,OrderState orderState,int price,String reason) {
		this.initiator = initiator;
		this.orderState = orderState;
		this.price = price;
		this.reason = reason;
	}

    public User getInitiator() {
        return initiator;
    }
	
	public OrderState getOrderState() {
		return orderState;
	}

	public String getReason() {
		return reason;
	}
	
}
