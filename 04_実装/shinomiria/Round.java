package shinomiria;

import shinomiria.boundary.PlayerIF;

import shinomiria.boundary.FieldIF;

public class Round {

	private PlayerIF lastAction = null;

	private PlayerIF firstPass = null;

	private boolean tipReverse = false;

	private boolean pass = false;

	private NumberCard firstPlayerCard;

	private NumberCard secondPlayerCard;

	private Tip piledTip = new Tip(0);

	private PlayerIF firstPlayer;

	private PlayerIF secondPlayer;

	private FieldIF field;

	public Round(PlayerIF firstPlayer, PlayerIF secondPlayer, NumberCard firstPLsCard, NumberCard secondPLsCard) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
		this.firstPlayerCard = firstPLsCard;
		this.secondPlayerCard = secondPLsCard;
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

	private Action selectAction(PlayerIF player) {
		Action act = player.selectActChoice();
		
		if(act == Action.ACT) {
			if(player.getChangeCard()) {
				act = player.selectAction();
			}
			else {
				act = PILE_TIP;
			}
			return act;
		}
		else if(act == Action.PASS) {
			return act;
		}
		
		return Action.UNKNOWN;
	}
	
	private int selectWhichAction() {
		
	}

	private void changeNumCard(PlayerIF player) {
		if(player == firstPlayer) {
			player.minusTip(1);
			secondPlayer.plusTip(1);
			player.addHandCard(firstPlayerCard);
			firstPlayerCard = firstPlayer.selectCard();
		}
		else {
			player.minusTip(1);
			firstPlayer.plusTip(1);
			player.addHandCard(secondPlayerCard);
			secondPlayerCard = secondPlayer.selectCard();			
		}
		
		lastAction = player;
		
	}

	private boolean pileUpTip(PlayerIF player) {
		tipReverse = !player.selectTipSide();
		
		piledTip.plusTip(1);
		
		if(tipReverse) {
			piledTip.addBackSideTip();
		}
		
		lastAction = player;
		
		field.updateDisplay();
		
		if(piledTip.getTip() == 9) {	
			// 積まれたチップが9枚になったら
			return true;
		}
		
		return false;
	}

	private boolean pass(PlayerIF player) {
		if(pass || tipReverse) {
			// ラウンドの終了条件を満たしたら
			return true;
		}
		else {
			if(firstPass == null) {
				firstPass = player;
			}
			pass = true;
			return false;
		}
	}

	private PlayerIF changePlayer(PlayerIF player) {
		if(player == firstPlayer) {
			return secondPlayer;
		} else {
			return firstPlayer;
		}
	}

}
