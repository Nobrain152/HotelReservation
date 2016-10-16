package vo;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;

/**
 * 所有订单VO的父类
 * 
 * @author txin
 *
 */
public abstract class OrderVO {
	/**
	 * 订单发起人
	 */
	public String initiator;
	
	/**
	 * 价格
	 */
	public int price;
	
	/**
	 * 订单状态
	 */
	public OrderState orderState;

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

	public boolean hasChild() {
        return hasChild;
    }

    public String getInitiator() {
        return initiator;
    }
	
	public OrderState getOrderState() {
		return orderState;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getPeopleNumber() {
		return peopleNumber;
	}
	
	public int getPrice(){
		return price;
	}
	
	public boolean hasChild() {
        return hasChild;
    }

    public String setInitiator(String initiator) {
        this.initiator = initiator;
    }
	
	public OrderState setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}
	
	public RoomType setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	
	public int setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public int setPeopleNumber(int peopleNumber) {
		this.peopleNumber = peopleNumber;
	}
}
