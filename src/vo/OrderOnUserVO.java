package vo;

import java.util.ArrayList;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;

/**
 * 客户订单VO
 * 
 * @author txin
 *
 */
public class OrderOnUserVO extends OrderVO{
	
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
	public Date checkInTime;
	
	/**
	 * 退房时间
	 */
	public Date checkOutTime;
	
	/**
	 * 最晚执行时间
	 */
	public Date latestExecutionTime;
	
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
	
	public OrderOnUserVO(String initiator,OrderState orderState,Date checkInTime,Date checkOutTime,
		Date latestExecutionTime,RoomType roomType,int roomNumber,int peopleNumber,boolean hasChild) {
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
	
	public Date getCheckInTime() {
		return checkInTime;
	}
	
	public Date getCheckOutTime() {
		return checkOutTime;
	}
	
	public Date getLatestExecutionTime() {
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
