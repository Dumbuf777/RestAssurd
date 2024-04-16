package framework.model;

public class RefreshToken {

	 private String token;
	    private String tokenType;
	    private Integer expiredIn;
	    private Integer createdAt;
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
	    public Integer getExpiredIn() {
	        return expiredIn;
	    }
	    public void setExpiredIn(Integer expiredIn) {
	        this.expiredIn = expiredIn;
	    }
	    public Integer getCreatedAt() {
	        return createdAt;
	    }
	    public void setCreatedAt(Integer createdAt) {
	        this.createdAt = createdAt;
	    }
}
