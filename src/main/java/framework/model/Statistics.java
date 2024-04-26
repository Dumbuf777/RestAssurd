package framework.model;

public class Statistics {

	private Tokens currentTokens;
	private Tokens purchasedTokens;
	private Tokens winningTokens;
	private Tokens accumulatedTokens;
	private double withdrawableWinnings;
	private double totalPurchaseAmount;
	private double totalDailyPurchaseAmount;
	private int megaWin;
	private int bigWin;
	private double totalWithdrawAmount;
	private int spin;
	private int jackPotWin;
	private String playerId;
	private int fishGameInviteCodeCount;

	public Tokens getCurrentTokens() {
		return currentTokens;
	}

	public void setCurrentTokens(Tokens currentTokens) {
		this.currentTokens = currentTokens;
	}

	public Tokens getPurchasedTokens() {
		return purchasedTokens;
	}

	public void setPurchasedTokens(Tokens purchasedTokens) {
		this.purchasedTokens = purchasedTokens;
	}

	public Tokens getWinningTokens() {
		return winningTokens;
	}

	public void setWinningTokens(Tokens winningTokens) {
		this.winningTokens = winningTokens;
	}

	public Tokens getAccumulatedTokens() {
		return accumulatedTokens;
	}

	public void setAccumulatedTokens(Tokens accumulatedTokens) {
		this.accumulatedTokens = accumulatedTokens;
	}

	public double getWithdrawableWinnings() {
		return withdrawableWinnings;
	}

	public void setWithdrawableWinnings(double withdrawableWinnings) {
		this.withdrawableWinnings = withdrawableWinnings;
	}

	public double getTotalPurchaseAmount() {
		return totalPurchaseAmount;
	}

	public void setTotalPurchaseAmount(double totalPurchaseAmount) {
		this.totalPurchaseAmount = totalPurchaseAmount;
	}

	public double getTotalDailyPurchaseAmount() {
		return totalDailyPurchaseAmount;
	}

	public void setTotalDailyPurchaseAmount(double totalDailyPurchaseAmount) {
		this.totalDailyPurchaseAmount = totalDailyPurchaseAmount;
	}

	public int getMegaWin() {
		return megaWin;
	}

	public void setMegaWin(int megaWin) {
		this.megaWin = megaWin;
	}

	public int getBigWin() {
		return bigWin;
	}

	public void setBigWin(int bigWin) {
		this.bigWin = bigWin;
	}

	public double getTotalWithdrawAmount() {
		return totalWithdrawAmount;
	}

	public void setTotalWithdrawAmount(double totalWithdrawAmount) {
		this.totalWithdrawAmount = totalWithdrawAmount;
	}

	public int getSpin() {
		return spin;
	}

	public void setSpin(int spin) {
		this.spin = spin;
	}

	public int getJackPotWin() {
		return jackPotWin;
	}

	public void setJackPotWin(int jackPotWin) {
		this.jackPotWin = jackPotWin;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public int getFishGameInviteCodeCount() {
		return fishGameInviteCodeCount;
	}

	public void setFishGameInviteCodeCount(int fishGameInviteCodeCount) {
		this.fishGameInviteCodeCount = fishGameInviteCodeCount;
	}

	public static class Tokens {
		private double gameTokens;
		private double sweepTokens;

		public double getGameTokens() {
			return gameTokens;
		}

		public void setGameTokens(double gameTokens) {
			this.gameTokens = gameTokens;
		}

		public double getSweepTokens() {
			return sweepTokens;
		}

		public void setSweepTokens(double sweepTokens) {
			this.sweepTokens = sweepTokens;
		}
	}
}
