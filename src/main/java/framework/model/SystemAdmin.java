package framework.model;

import java.util.ArrayList;

public class SystemAdmin {

	public String accessToken;
	public User user;
	public UserLobby userLobby;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserLobby getUserLobby() {
		return userLobby;
	}

	public void setUserLobby(UserLobby userLobby) {
		this.userLobby = userLobby;
	}

	public static class Lobby {
		public String id;
		public String code;
		public String name;
		public String description;
		public ArrayList<String> location;
		public String lobbyType;
		public String url;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
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

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public ArrayList<String> getLocation() {
			return location;
		}

		public void setLocation(ArrayList<String> location) {
			this.location = location;
		}

		public String getLobbyType() {
			return lobbyType;
		}

		public void setLobbyType(String lobbyType) {
			this.lobbyType = lobbyType;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

	}

	public static class Role {
		public long createdAt;
		public long updatedAt;
		public String createdBy;
		public String updatedBy;
		public String id;
		public String name;
		public String code;
		public Object accessControlProfile;
		public Object parentRole;
		public ArrayList<Object> parentRoleBranch;
		public String userType;
		public String displayName;

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

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Object getAccessControlProfile() {
			return accessControlProfile;
		}

		public void setAccessControlProfile(Object accessControlProfile) {
			this.accessControlProfile = accessControlProfile;
		}

		public Object getParentRole() {
			return parentRole;
		}

		public void setParentRole(Object parentRole) {
			this.parentRole = parentRole;
		}

		public ArrayList<Object> getParentRoleBranch() {
			return parentRoleBranch;
		}

		public void setParentRoleBranch(ArrayList<Object> parentRoleBranch) {
			this.parentRoleBranch = parentRoleBranch;
		}

		public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getDisplayName() {
			return displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

	}

	public static class User {
		public long createdAt;
		public long updatedAt;
		public String createdBy;
		public String updatedBy;
		public String id;
		public String username;
		public String firstName;
		public String lastName;
		public String email;
		public Role role;
		public boolean active;
		public String photoId;
		public String dialCode;
		public String phone;
		public String city;
		public String state;
		public String stateId;
		public String country;
		public String countryId;
		public Object zipCode;
		public Object gender;
		public double singleTransactionSweepTokenLimit;
		public double dailySweepTokenLimit;
		public String userType;
		public Object designation;
		public Object lobby;
		public boolean chatNotification;
		public int perPageRecord;
		public String timeZone;
		public boolean readUser;
		public Object registrationCode;
		public Object cashAppId;
		public Object qrCodeImageId;
		public Object contactDetail;
		public Object viewDetail;
		public void setCreatedAt(long createdAt) {
			this.createdAt = createdAt;
		}

		public void setUpdatedAt(long updatedAt) {
			this.updatedAt = updatedAt;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public void setUpdatedBy(String updatedBy) {
			this.updatedBy = updatedBy;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setRole(Role role) {
			this.role = role;
		}

		public void setActive(boolean active) {
			this.active = active;
		}

		public void setPhotoId(String photoId) {
			this.photoId = photoId;
		}

		public void setDialCode(String dialCode) {
			this.dialCode = dialCode;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public void setState(String state) {
			this.state = state;
		}

		public void setStateId(String stateId) {
			this.stateId = stateId;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public void setCountryId(String countryId) {
			this.countryId = countryId;
		}

		public void setZipCode(Object zipCode) {
			this.zipCode = zipCode;
		}

		public void setGender(Object gender) {
			this.gender = gender;
		}

		public void setSingleTransactionSweepTokenLimit(double singleTransactionSweepTokenLimit) {
			this.singleTransactionSweepTokenLimit = singleTransactionSweepTokenLimit;
		}

		public void setDailySweepTokenLimit(double dailySweepTokenLimit) {
			this.dailySweepTokenLimit = dailySweepTokenLimit;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public void setDesignation(Object designation) {
			this.designation = designation;
		}

		public void setLobby(Object lobby) {
			this.lobby = lobby;
		}

		public void setChatNotification(boolean chatNotification) {
			this.chatNotification = chatNotification;
		}

		public void setPerPageRecord(int perPageRecord) {
			this.perPageRecord = perPageRecord;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public void setReadUser(boolean readUser) {
			this.readUser = readUser;
		}

		public void setRegistrationCode(Object registrationCode) {
			this.registrationCode = registrationCode;
		}

		public void setCashAppId(Object cashAppId) {
			this.cashAppId = cashAppId;
		}

		public void setQrCodeImageId(Object qrCodeImageId) {
			this.qrCodeImageId = qrCodeImageId;
		}

		public void setContactDetail(Object contactDetail) {
			this.contactDetail = contactDetail;
		}

		public void setViewDetail(Object viewDetail) {
			this.viewDetail = viewDetail;
		}

		
	}

	public static class UserLobby {
		public Lobby lobby;
		public boolean primary;
		
		public void setLobby(Lobby lobby) {
			this.lobby = lobby;
		}

		public void setPrimary(boolean primary) {
			this.primary = primary;
		}

	}
}
