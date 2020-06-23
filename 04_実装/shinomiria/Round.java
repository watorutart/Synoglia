package shinomiria;

import shinomiria.boundary.PlayerIF;
import shinomiria.boundary.FieldIF;

public class Round {

	private boolean lastAction;

	private boolean firstPass;

	private boolean tipReverse;

	private boolean pass;

	private NumberCard firstPlayerCard;

	private NumberCard secondPlayerCard;

	private Tip[] piledTip;

	private PlayerIF firstPlayer;

	private PlayerIF secondPlayer;

	private FieldIF field;

	public Round(PlayerIF firstPlayer, PlayerIF secondPlayer, NumberCard firstPLsCard, NumberCard secondPLsCard) {

	}

	public boolean judgeRoundWinner() {
		return false;
	}

	public void payOffTip() {

	}

	public void updateDiscard() {

	}

	public void startRound() {

	}

	private int selectAction() {
		return 0;
	}

	private void changeNumCard() {

	}

	private boolean pileUpTip() {
		return false;
	}

	private boolean pass() {
		return false;
	}

	private PlayerIF changePlayer(PlayerIF 現在のプレイヤー) {
		return null;
	}

}
