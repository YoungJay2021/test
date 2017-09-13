package com.etc._01oldDriverDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class OldDriver {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	private ArrayList grilfriends;

	public ArrayList getGrilfriends() {
		return grilfriends;
	}

	public void setGrilfriends(ArrayList grilfriends) {
		this.grilfriends = grilfriends;
	}

	@Override
	public String toString() {
		return "OldDriver [name=" + name + ", grilfriends=" + grilfriends + "]";
	}
	
	public void sayGoodBye(){
		this.grilfriends.remove(0);//鍒犻櫎
	}
	
	
	
	/*private Gril  grilfriends[]; //鏁扮粍澶氫釜

	public Gril[] getGrilfriends() {
		return grilfriends;
	}

	public void setGrilfriends(Gril[] grilfriends) {
		this.grilfriends = grilfriends;
	}

	@Override
	public String toString() {
		return "OldDriver [name=" + name + ", grilfriends="
				+ Arrays.toString(grilfriends) + "]";
	}*/
	
	
	
	
	
//	private Gril  grilfriend;//涓�釜
//
//	public Gril getGrilfriend() {
//		return grilfriend;
//	}
//
//	public void setGrilfriend(Gril grilfriend) {
//		this.grilfriend = grilfriend;
//	}
//
//	@Override
//	public String toString() {
//		return "OldDriver [name=" + name + ", grilfriend=" + grilfriend + "]";
//	}
	
	
	
	

}
