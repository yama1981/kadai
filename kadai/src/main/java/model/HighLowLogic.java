package model;

public class HighLowLogic {
	
	public void execute(HighLow hl,int userAns) {
		hl.setUserAns(userAns);
		hl.getList().add(userAns);
		String msg;
		if(userAns > hl.getCorrectAns()) {
			msg= "ハズレ";
		}  else if(userAns < hl.getCorrectAns()) {
			msg = "ハズレ";
		} else {
			msg = "アタリ";
		}
		hl.setMsg(msg);
	}
}
