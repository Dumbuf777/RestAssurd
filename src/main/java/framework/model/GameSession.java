/**
 * 
 */
package framework.model;

/**
 * 
 */
public class GameSession {
	private String id;
	private String expiryAt;
    private String ipAddress;
    private String gameTokenType;

	/**
	 * 
	 */
	public GameSession() {
		// TODO Auto-generated constructor stub
	}
	
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExpiryAt() {
		return expiryAt;
	}

	public void setExpiryAt(String expiryAt) {
		this.expiryAt = expiryAt;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getGameTokenType() {
		return gameTokenType;
	}

	public void setGameTokenType(String gameTokenType) {
		this.gameTokenType = gameTokenType;
	}

	
	
	

}
