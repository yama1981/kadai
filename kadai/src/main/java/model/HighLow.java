package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HighLow implements Serializable {
	private int correctAns;
	private int userAns;
	private String msg;
	private List<Integer> list;
	public HighLow() {
		this.correctAns = new Random().nextInt(9) + 1;
		list = new ArrayList<Integer>();
	}
	
	public int getCorrectAns() {
		return correctAns;
	}
	public void setCorrectAns(int CorrectAns, int correctAns) {
		this.correctAns = correctAns;
		
	}
		
	public int getUserAns() {
		return userAns;
	}
	public void setUserAns(int userAns) {
		this.userAns = userAns;
	}
	public String getMsg() {
		return msg;
		
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	

}
