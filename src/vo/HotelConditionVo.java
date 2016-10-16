package vo;

import java.util.ArrayList;

import businesslogic.util.RoomType;
import businesslogic.util.Address;
import businesslogic.util.BusinessDistrict;

public class HotelConditionVO{
        
    private Address address;
		
	private BusinessDistrict businessDistrict;
		
	private String hotelName;
		
	private RoomType roomtype;
		
	int upLevel;
		
	int downLevel;
		
	int[3] checkInTime;
		
	int[3] checkOutTime;
		
	int star;
		
	int[2] mark;

    public HotelConditionVO(Address add,BusinessDistrict bus,String hot,RoomType roo,int up,int down,int[] checkIn,int[] checkOut,int sta,int[] mark){
	    this.address=add;
		this.businessDistrict=bus;
		this.hotelName=hot;
		this.roomtype=roo;
		this.uplevel=up;
		this.downLevel=down;
		this.checkInTime=checkIn;
		this.checkOutTime=checkOut;
		this.star=sta;
		this.mark=mark;
	}

    public Address getAdderss(){
		return address;	
	}

    public BusinessDistrict getBusinessDistrict(){
	    return businessDistrict;
	}	
	
    public String getHotelName(){
	    return hotelName
	}		
		
	public Roomtype getRoomeType(){
	    return roomtype;
	}
		
	public int getUpLevel(){
	    return upLevel;
	}
		
	public int getDownLevel(){
	    return downLevel;
	}
		
	public int[] getCheckInTime(){
	    return checkInTime;
	}
		
	public int[] getCheckOutTime(){
	    return checkOutTime;
	}
		
	public int getStar(){
	    return star;
	}
		
	public int[] getMark(){
		return mark;
	}		
		
}