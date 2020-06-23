package shinomiria.boundary;

import shinomiria.NumberCard;
import shinomiria.Tip;

public class Player implements PlayerIF {

	/**
	 * 表ならtrue
	 * 裏ならfalse
	 * 
	 */
	private boolean changeCard = true;

	private int color;

	/**
	 * 先攻ならtrue
	 * 後攻ならfalse
	 * 
	 */
	private boolean firstPlayer;

	private NumberCard[] handCard;

	private NumberCard[] discard;

	private Tip[] playerTip;

	public Player(int color) {

	}

	public void resetChangeCard() {

	}

	public void setTip() {

	}

	public void setDiscard(NumberCard カード) {

	}

	public int getHandCard() {
		return 0;
	}

	public int getTip() {
		return 0;
	}

	/**
	 * 勝敗を表示
	 */
	public void showVictory(boolean 勝敗) {

	}

	public NumberCard selectCard() {
		return null;
	}

	public int selectActChoice() {
		return 0;
	}

	public int selectAction() {
		return 0;
	}

	public void minusTip(int num) {

	}

	public void plusTip(int num) {

	}

	public void addHandCard() {

	}

	public boolean selectTipSide() {
		return false;
	}


	/**
	 * @see 03_設計.boundary.PlayerIF#PlayerIF()
	 */
	public PlayerIF() {

	}


	/**
	 * @see 03_設計.boundary.PlayerIF#setStartTip()
	 */
	public void setStartTip() {

	}


	/**
	 * @see 03_設計.boundary.PlayerIF#addHandCard(03_設計.NumberCard)
	 */
	public void addHandCard(NumberCard 伏せたカード) {

	}

}
