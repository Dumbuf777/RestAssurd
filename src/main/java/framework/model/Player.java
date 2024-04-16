package framework.model;

import java.util.List;

public class Player {
    
	private long createdAt;
    private long updatedAt;
    private String createdBy;
    private String updatedBy;
    private boolean deleted;
    private String id;
    private String playerId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String displayName;
    private String email;
    private Lobby lobby;
    private String phone;
    private String dialCode;
    private String city;
    private String state;
    private String stateId;
    private String country;
    private String countryId;
    private String photoId;
    private boolean active;
    private boolean emailVerified;
    private boolean phoneVerified;
    private String zipCode;
    private String playerReputations;
    private String gender;
    private boolean deleteRequested;
    private Object accountDeletionScheduledAt;
    private Object facebookId;
    private Object twitterId;
    private Object googleId;
    private String playerRegistrationType;
    private List<String> tags;
    private String address;
    private long dob;
    private boolean isPromoted;
    private double depositLimit;
    private int depositLimitDays;
    private boolean kycVerified;
    private boolean idVerified;
    private String ipAddress;
    private Parent parent;
    private boolean photoVerified;
    private String cashAppId;
    private String skrillEmailId;
    private boolean profileVerified;
    private Object isReviewed;
    private Object reviewedBy;
    private int withdrawRequestCount;
	private int supportRequestMessageCount;
    private int chatRequestMessageCount;
    private Object currentTokens;
    private Object withdrawableTokens;
    private Object parentUser;
    private Object deletionStatus;
    private Object accountDeletionRequestedAt;
    private String inviteCode;
    private Object currentRefBonusLevel;
    private Object requiredReference;
    private Object achievedReference;
    private Object requiredRecharge;
    private Object achievedRecharge;
    private Object isRefLevelBonusExist;
    private LobbyInfo lobbyInfo;
    private boolean isAnonymousPlayer;
    private String seamlessChexId;
    public long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

    public Integer getUpdatedAt() {
        return (int) updatedAt;
    }
    public void setUpdatedAt(long  updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Object getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy =  createdBy;
    }
    public String getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public Boolean getDeleted() {
        return deleted;
    }
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPlayerId() {
        return playerId;
    }
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Lobby getLobby() {
        return lobby;
    }
    public void setLobby(Lobby lobby) {
        this.lobby = lobby;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDialCode() {
        return dialCode;
    }
    public void setDialCode(String dialCode) {
        this.dialCode = dialCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getStateId() {
        return stateId;
    }
    public void setStateId(String stateId) {
        this.stateId = stateId;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountryId() {
        return countryId;
    }
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }
    public String getPhotoId() {
        return photoId;
    }
    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }
    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
    public Boolean getEmailVerified() {
        return emailVerified;
    }
    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }
    public Boolean getPhoneVerified() {
        return phoneVerified;
    }
    public void setPhoneVerified(Boolean phoneVerified) {
        this.phoneVerified = phoneVerified;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getPlayerReputations() {
        return playerReputations;
    }
    public void setPlayerReputations(String playerReputations) {
        this.playerReputations = playerReputations;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Boolean getDeleteRequested() {
        return deleteRequested;
    }
    public void setDeleteRequested(Boolean deleteRequested) {
        this.deleteRequested = deleteRequested;
    }
    public Object getAccountDeletionScheduledAt() {
        return accountDeletionScheduledAt;
    }
    public void setAccountDeletionScheduledAt(Object accountDeletionScheduledAt) {
        this.accountDeletionScheduledAt = accountDeletionScheduledAt;
    }
    public Object getFacebookId() {
        return facebookId;
    }
    public void setFacebookId(Object facebookId) {
        this.facebookId = facebookId;
    }
    public Object getTwitterId() {
        return twitterId;
    }
    public void setTwitterId(Object twitterId) {
        this.twitterId = twitterId;
    }
    public Object getGoogleId() {
        return googleId;
    }
    public void setGoogleId(Object googleId) {
        this.googleId = googleId;
    }
    public String getPlayerRegistrationType() {
        return playerRegistrationType;
    }
    public void setPlayerRegistrationType(String playerRegistrationType) {
        this.playerRegistrationType = playerRegistrationType;
    }
    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Long getDob() {
        return (Long) dob;
    }
    public void setDob(Long dob) {
        this.dob = dob;
    }
    public Boolean getIsPromoted() {
        return isPromoted;
    }
    public void setIsPromoted(Boolean isPromoted) {
        this.isPromoted = isPromoted;
    }
    public Double getDepositLimit() {
        return depositLimit;
    }
    public void setDepositLimit(Double depositLimit) {
        this.depositLimit = depositLimit;
    }
    public Integer getDepositLimitDays() {
        return depositLimitDays;
    }
    public void setDepositLimitDays(Integer depositLimitDays) {
        this.depositLimitDays = depositLimitDays;
    }
    public Boolean getKycVerified() {
        return kycVerified;
    }
    public void setKycVerified(Boolean kycVerified) {
        this.kycVerified = kycVerified;
    }
    public Boolean getIdVerified() {
        return idVerified;
    }
    public void setIdVerified(Boolean idVerified) {
        this.idVerified = idVerified;
    }
    public String getIpAddress() {
        return ipAddress;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public Parent getParent() {
        return parent;
    }
    public void setParent(Parent parent) {
        this.parent = parent;
    }
    public Boolean getPhotoVerified() {
        return photoVerified;
    }
    public void setPhotoVerified(Boolean photoVerified) {
        this.photoVerified = photoVerified;
    }
    public String getCashAppId() {
        return cashAppId;
    }
    public void setCashAppId(String cashAppId) {
        this.cashAppId = cashAppId;
    }
    public String getSkrillEmailId() {
        return skrillEmailId;
    }
    public void setSkrillEmailId(String skrillEmailId) {
        this.skrillEmailId = skrillEmailId;
    }
    public Boolean getProfileVerified() {
        return profileVerified;
    }
    public void setProfileVerified(Boolean profileVerified) {
        this.profileVerified = profileVerified;
    }
    public Object getIsReviewed() {
        return isReviewed;
    }
    public void setIsReviewed(Object isReviewed) {
        this.isReviewed = isReviewed;
    }
    public Object getReviewedBy() {
        return reviewedBy;
    }
    public void setReviewedBy(Object reviewedBy) {
        this.reviewedBy = reviewedBy;
    }
    public Integer getSupportRequestMessageCount() {
        return supportRequestMessageCount;
    }
    public void setSupportRequestMessageCount(Integer supportRequestMessageCount) {
        this.supportRequestMessageCount = supportRequestMessageCount;
    }
    public Integer getChatRequestMessageCount() {
        return chatRequestMessageCount;
    }
    public void setChatRequestMessageCount(Integer chatRequestMessageCount) {
        this.chatRequestMessageCount = chatRequestMessageCount;
    }
    public Object getCurrentTokens() {
        return currentTokens;
    }
    public void setCurrentTokens(Object currentTokens) {
        this.currentTokens = currentTokens;
    }
    public int getWithdrawRequestCount() {
		return withdrawRequestCount;
	}
	public void setWithdrawRequestCount(int withdrawRequestCount) {
		this.withdrawRequestCount = withdrawRequestCount;
	}
	public Object getWithdrawableTokens() {
		return withdrawableTokens;
	}
	public void setWithdrawableTokens(Object withdrawableTokens) {
		this.withdrawableTokens = withdrawableTokens;
	}
    public Object getParentUser() {
        return parentUser;
    }
    public void setParentUser(Object parentUser) {
        this.parentUser = parentUser;
    }
    public Object getDeletionStatus() {
        return deletionStatus;
    }
    public void setDeletionStatus(Object deletionStatus) {
        this.deletionStatus = deletionStatus;
    }
    public Object getAccountDeletionRequestedAt() {
        return accountDeletionRequestedAt;
    }
    public void setAccountDeletionRequestedAt(Object accountDeletionRequestedAt) {
        this.accountDeletionRequestedAt = accountDeletionRequestedAt;
    }
    public String getInviteCode() {
        return inviteCode;
    }
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }
    public Object getCurrentRefBonusLevel() {
        return currentRefBonusLevel;
    }
    public void setCurrentRefBonusLevel(Object currentRefBonusLevel) {
        this.currentRefBonusLevel = currentRefBonusLevel;
    }
    public Object getRequiredReference() {
        return requiredReference;
    }
    public void setRequiredReference(Object requiredReference) {
        this.requiredReference = requiredReference;
    }
    public Object getAchievedReference() {
        return achievedReference;
    }
    public void setAchievedReference(Object achievedReference) {
        this.achievedReference = achievedReference;
    }
    public Object getRequiredRecharge() {
        return requiredRecharge;
    }
    public void setRequiredRecharge(Object requiredRecharge) {
        this.requiredRecharge = requiredRecharge;
    }
    public Object getAchievedRecharge() {
        return achievedRecharge;
    }
    public void setAchievedRecharge(Object achievedRecharge) {
        this.achievedRecharge = achievedRecharge;
    }
    public Object getIsRefLevelBonusExist() {
        return isRefLevelBonusExist;
    }
    public void setIsRefLevelBonusExist(Object isRefLevelBonusExist) {
        this.isRefLevelBonusExist = isRefLevelBonusExist;
    }
    public LobbyInfo getLobbyInfo() {
        return lobbyInfo;
    }
    public void setLobbyInfo(LobbyInfo lobbyInfo) {
        this.lobbyInfo = lobbyInfo;
    }
    public Boolean getIsAnonymousPlayer() {
        return isAnonymousPlayer;
    }
    public void setIsAnonymousPlayer(Boolean isAnonymousPlayer) {
        this.isAnonymousPlayer = isAnonymousPlayer;
    }
    public String getSeamlessChexId() {
        return seamlessChexId;
    }
    public void setSeamlessChexId(String seamlessChexId) {
        this.seamlessChexId = seamlessChexId;
    }
}
