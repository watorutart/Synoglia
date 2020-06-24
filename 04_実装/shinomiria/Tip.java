package shinomiria;

public class Tip {

	/**
	 * 表ならtrue
	 * 裏ならfalse
	 * 
	 */
	private boolean tipSide = true;
	private int num = 0;
	private int backSideNum = 0;

	public Tip(int num) {
		this.num = num;
	}

	public boolean getTipSide() {
		return tipSide;
	}
	
	public int getTip() {
		return num;
	}
	
	public int getBackSideTip() {
		return backSideNum;
	}
	
	public void addTip(int n) {
		this.num += num;
	}
	
	public void minusTip(int n) {
		this.num -= num;
	}
	
	public void addBackSideTip() {
		backSideNum++;
	}
	
}
