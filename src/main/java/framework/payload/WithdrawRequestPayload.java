package framework.payload;

public class WithdrawRequestPayload {

	public int amount;
	public BankAccountDetails bankAccountDetails;
	public String cashAppId;
	public DeviceInfo deviceInfo;
	public String gameFleetId;
	public String paymentProvider;
	public String playerId;
	public String playerSkrillAccountEmail;
	public SeamlessChexAccountDetails seamlessChexAccountDetails;
	public String seamlessChexEmailId;
	public int tipTokens;
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public BankAccountDetails getBankAccountDetails() {
		return bankAccountDetails;
	}

	public void setBankAccountDetails(BankAccountDetails bankAccountDetails) {
		this.bankAccountDetails = bankAccountDetails;
	}

	public String getCashAppId() {
		return cashAppId;
	}

	public void setCashAppId(String cashAppId) {
		this.cashAppId = cashAppId;
	}

	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getGameFleetId() {
		return gameFleetId;
	}

	public void setGameFleetId(String gameFleetId) {
		this.gameFleetId = gameFleetId;
	}

	public String getPaymentProvider() {
		return paymentProvider;
	}

	public void setPaymentProvider(String paymentProvider) {
		this.paymentProvider = paymentProvider;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerSkrillAccountEmail() {
		return playerSkrillAccountEmail;
	}

	public void setPlayerSkrillAccountEmail(String playerSkrillAccountEmail) {
		this.playerSkrillAccountEmail = playerSkrillAccountEmail;
	}

	public SeamlessChexAccountDetails getSeamlessChexAccountDetails() {
		return seamlessChexAccountDetails;
	}

	public void setSeamlessChexAccountDetails(SeamlessChexAccountDetails seamlessChexAccountDetails) {
		this.seamlessChexAccountDetails = seamlessChexAccountDetails;
	}

	public String getSeamlessChexEmailId() {
		return seamlessChexEmailId;
	}

	public void setSeamlessChexEmailId(String seamlessChexEmailId) {
		this.seamlessChexEmailId = seamlessChexEmailId;
	}

	public int getTipTokens() {
		return tipTokens;
	}

	public void setTipTokens(int tipTokens) {
		this.tipTokens = tipTokens;
	}

	public static class BankAccountDetails {
		public String accountHolderName;
		public String accountNumber;
		public String bankName;
		public String routingNumber;

		public String getAccountHolderName() {
			return accountHolderName;
		}

		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getBankName() {
			return bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		public String getRoutingNumber() {
			return routingNumber;
		}

		public void setRoutingNumber(String routingNumber) {
			this.routingNumber = routingNumber;
		}

	}

	public static class DeviceInfo {
		public String device;
		public String deviceId;
		public String deviceType;
		public String ip;

		public String getDevice() {
			return device;
		}

		public void setDevice(String device) {
			this.device = device;
		}

		public String getDeviceId() {
			return deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getDeviceType() {
			return deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

	}

	public static class SeamlessChexAccountDetails {
		public String accountNumber;
		public String routingNumber;

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getRoutingNumber() {
			return routingNumber;
		}

		public void setRoutingNumber(String routingNumber) {
			this.routingNumber = routingNumber;
		}

	}
}
