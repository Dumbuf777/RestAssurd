/**
 * 
 */
package framework.model;

/**
 * 
 */
public class FishGameSession {
	private String id;
	private String expiryAt;
    private String playerSessionId;
    private String gameTokenType;
    private String gameSessionConnectionInfo;

	/**
	 * 
	 */
	public FishGameSession() {
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

	public String getPlayerSessionId() {
		return playerSessionId;
	}

	public void setPlayerSessionId(String playerSessionId) {
		this.playerSessionId = playerSessionId;
	}

	public String getGameSessionConnectionInfo() {
		return gameSessionConnectionInfo;
	}

	public void setGameSessionConnectionInfo(String gameSessionConnectionInfo) {
		this.gameSessionConnectionInfo = gameSessionConnectionInfo;
	}
	
	public String getGameTokenType() {
		return gameTokenType;
	}

	public void setGameTokenType(String gameTokenType) {
		this.gameTokenType = gameTokenType;
	}

	
	
	

}
