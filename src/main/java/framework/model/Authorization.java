/**
 * 
 */
package framework.model;

/**
 * 
 */
public class Authorization {

	private RefreshToken refreshToken;
	private AccessToken accessToken;

	public RefreshToken getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(RefreshToken refreshToken) {
		this.refreshToken = refreshToken;
	}

	public AccessToken getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(AccessToken accessToken) {
		this.accessToken = accessToken;
	}

	public static class RefreshToken {
		private String token;
		private String tokenType;
		private long expiredIn;
		private long createdAt;

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getTokenType() {
			return tokenType;
		}

		public void setTokenType(String tokenType) {
			this.tokenType = tokenType;
		}

		public long getExpiredIn() {
			return expiredIn;
		}

		public void setExpiredIn(long expiredIn) {
			this.expiredIn = expiredIn;
		}

		public long getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(long createdAt) {
			this.createdAt = createdAt;
		}
	}

	public static class AccessToken {
		private String token;
		private String tokenType;
		private long expiredIn;
		private long createdAt;

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getTokenType() {
			return tokenType;
		}

		public void setTokenType(String tokenType) {
			this.tokenType = tokenType;
		}

		public long getExpiredIn() {
			return expiredIn;
		}

		public void setExpiredIn(long expiredIn) {
			this.expiredIn = expiredIn;
		}

		public long getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(long createdAt) {
			this.createdAt = createdAt;
		}
	}

}
