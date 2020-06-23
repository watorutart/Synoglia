package shinomiria.boundary;

import shinomiria.NumberCard;

public interface PlayerIF {

	public abstract PlayerIF();

	public void resetChangeCard();

	public void setStartTip();

	public void setDiscard(NumberCard カード);

	public int getHandCard();

	public int getTip();

	/**
	 * 勝敗を表示
	 */
	public void showVictory(boolean 勝敗);

	public NumberCard selectCard();

	public int selectActChoice();

	public int selectAction();

	public void minusTip(int num);

	public void plusTip(int num);

	public void addHandCard(NumberCard 伏せたカード);

	public boolean selectTipSide();

}
