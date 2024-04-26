package framework.model;

public class Withdarw {

	public long createdAt;
	public long updatedAt;
	public String createdBy;
	public String updatedBy;
	public boolean deleted;
	public String id;
	public String requestId;
	public Object skrillAccountEmail;
	public Object bankAccountDetails;
	public String paymentProvider;
	public double amount;
	public double sweepTokens;
	public String withdrawStatus;
	public String paymentStatus;
	public Object paymentResponse;
	public String notes;
	public Object attachmentId;
	public Object approvedDate;
	public Object approvedBy;
	public PlayerInfo playerInfo;
	public PlayerLobbyInfo playerLobbyInfo;
	public Object payPerPaymentUrl;
	public Object currencyCode;
	public Object currencyRate;
	public Object convertedRate;
	public Object nuveiSessionId;
	public Object gamefleetTransactionId;
	public Object gamefleetMachineCode;

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	public long getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(long updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Object getSkrillAccountEmail() {
		return skrillAccountEmail;
	}

	public void setSkrillAccountEmail(Object skrillAccountEmail) {
		this.skrillAccountEmail = skrillAccountEmail;
	}

	public Object getBankAccountDetails() {
		return bankAccountDetails;
	}

	public void setBankAccountDetails(Object bankAccountDetails) {
		this.bankAccountDetails = bankAccountDetails;
	}

	public String getPaymentProvider() {
		return paymentProvider;
	}

	public void setPaymentProvider(String paymentProvider) {
		this.paymentProvider = paymentProvider;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getSweepTokens() {
		return sweepTokens;
	}

	public void setSweepTokens(double sweepTokens) {
		this.sweepTokens = sweepTokens;
	}

	public String getWithdrawStatus() {
		return withdrawStatus;
	}

	public void setWithdrawStatus(String withdrawStatus) {
		this.withdrawStatus = withdrawStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Object getPaymentResponse() {
		return paymentResponse;
	}

	public void setPaymentResponse(Object paymentResponse) {
		this.paymentResponse = paymentResponse;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Object getAttachmentId() {
		return attachmentId;
	}

	public void setAttachmentId(Object attachmentId) {
		this.attachmentId = attachmentId;
	}

	public Object getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Object approvedDate) {
		this.approvedDate = approvedDate;
	}

	public Object getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(Object approvedBy) {
		this.approvedBy = approvedBy;
	}

	public PlayerInfo getPlayerInfo() {
		return playerInfo;
	}

	public void setPlayerInfo(PlayerInfo playerInfo) {
		this.playerInfo = playerInfo;
	}

	public PlayerLobbyInfo getPlayerLobbyInfo() {
		return playerLobbyInfo;
	}

	public void setPlayerLobbyInfo(PlayerLobbyInfo playerLobbyInfo) {
		this.playerLobbyInfo = playerLobbyInfo;
	}

	public Object getPayPerPaymentUrl() {
		return payPerPaymentUrl;
	}

	public void setPayPerPaymentUrl(Object payPerPaymentUrl) {
		this.payPerPaymentUrl = payPerPaymentUrl;
	}

	public Object getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(Object currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Object getCurrencyRate() {
		return currencyRate;
	}

	public void setCurrencyRate(Object currencyRate) {
		this.currencyRate = currencyRate;
	}

	public Object getConvertedRate() {
		return convertedRate;
	}

	public void setConvertedRate(Object convertedRate) {
		this.convertedRate = convertedRate;
	}

	public Object getNuveiSessionId() {
		return nuveiSessionId;
	}

	public void setNuveiSessionId(Object nuveiSessionId) {
		this.nuveiSessionId = nuveiSessionId;
	}

	public Object getGamefleetTransactionId() {
		return gamefleetTransactionId;
	}

	public void setGamefleetTransactionId(Object gamefleetTransactionId) {
		this.gamefleetTransactionId = gamefleetTransactionId;
	}

	public Object getGamefleetMachineCode() {
		return gamefleetMachineCode;
	}

	public void setGamefleetMachineCode(Object gamefleetMachineCode) {
		this.gamefleetMachineCode = gamefleetMachineCode;
	}

	public static class PlayerLobbyInfo {
		
		public String lobbyId;
		public String code;
		public String name;
		public String lobbyType;
		public Object primary;
		
		public String getLobbyId() {
			return lobbyId;
		}

		public void setLobbyId(String lobbyId) {
			this.lobbyId = lobbyId;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLobbyType() {
			return lobbyType;
		}

		public void setLobbyType(String lobbyType) {
			this.lobbyType = lobbyType;
		}

		public Object getPrimary() {
			return primary;
		}

		public void setPrimary(Object primary) {
			this.primary = primary;
		}

		
	}

	public static class Parent {
		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String userId;
		public String username;
	}

	public static class PlayerInfo {
		public String primaryId;
		public String playerId;
		public String fullName;
		public String displayName;
		public Parent parent;

		public String getPrimaryId() {
			return primaryId;
		}

		public void setPrimaryId(String primaryId) {
			this.primaryId = primaryId;
		}

		public String getPlayerId() {
			return playerId;
		}

		public void setPlayerId(String playerId) {
			this.playerId = playerId;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getDisplayName() {
			return displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Parent getParent() {
			return parent;
		}

		public void setParent(Parent parent) {
			this.parent = parent;
		}
	}

}
