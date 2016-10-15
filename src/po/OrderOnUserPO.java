
/**
 * 处理客户订单PO
 * @author txin
 * @String 2016/10/15
 */
package po;

import java.io.Serializable;
import java.util.ArrayList;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;

public class OrderOnUserPO extends OrderPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7187002330817151504L;

	/**
	 * 订单发起人
	 */
	public String initiator;
	
	/**
	 * 订单状态
	 */
	public OrderState orderState;
	
	/**
	 * 入住时间
	 */
	public String checkInTime;
	
	/**
	 * 退房时间
	 */
	public String checkOutTime;
	
	/**
	 * 最晚执行时间
	 */
	public String latestExecutionTime;
	
	/**
	 * 房间类型
	 */
	public RoomType roomType;
	
	/**
	 * 房间数量
	 */
	public int roomNumber;
	
	/**
	 * 入住人数
	 */
	public int peopleNumber;
	
	/**
	 * 是否携带儿童
	 */
	public boolean hasChild;
	
	public OrderOnUserPO(String initiator,OrderState orderState,String checkInTime,String checkOutTime,
		String latestExecutionTime,RoomType roomType,int roomNumber,int peopleNumber,boolean hasChild) {
		super();
		this.initiator = initiator;
		this.orderState = orderState;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.latestExecutionTime = latestExecutionTime;
		this.roomType = roomType;
		this.roomNumber = roomNumber;
		this.peopleNumber = peopleNumber;
		this.hasChild = hasChild;
	}
	
	@Override
	public String toString(){
		return initiator;
	}
	
    public boolean hasChild() {
        return hasChild;
    }

    public String getInitiator() {
        return initiator;
    }
	
	public OrderState getOrderState() {
		return orderState;
	}
	
	public String getCheckInTime() {
		return checkInTime;
	}
	
	public String getCheckOutTime() {
		return checkOutTime;
	}
	
	public String getLatestExecutionTime() {
		return latestExecutionTime;
	}
	
	public RoomType getRoomType() {
		return roomType;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getPeopleNumber() {
		return peopleNumber;
	}
}