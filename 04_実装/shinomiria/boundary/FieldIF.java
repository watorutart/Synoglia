package shinomiria.boundary;

public interface FieldIF {

	public abstract FieldIF();

	public void showNumCard();

	public boolean judgeRoundWinner();

	public void updateDisplay();

	public void showDraw();

	public void showGameWinner();

	public void showFirstPlayer(PlayerIF 先攻プレイヤー);

	public void showRoundEnd();

}
