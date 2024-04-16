package framework.model;

public class PlayerData {

	private Player player;
	private Statistics statistics;
	private Authorization authorization;
	private Lobby lobby;
	private LobbyInfo lobbyInfo;
	private Parent parent;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Statistics getStatistics() {
		return statistics;
	}

	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}

	public Authorization getAuthorization() {
		return authorization;
	}

	public void setAuthorization(Authorization authorization) {
		this.authorization = authorization;
	}

	public Lobby getLobby() {
		return lobby;
	}

	public void setLobby(Lobby lobby) {
		this.lobby = lobby;
	}

	public LobbyInfo getLobbyInfo() {
		return lobbyInfo;
	}

	public void setLobbyInfo(LobbyInfo lobbyInfo) {
		this.lobbyInfo = lobbyInfo;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

}
