package framework.model;

public class Lobby {
	
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


	private String id;
    private String code;
    private String name;
    private String lobbyType;
    private String url;


	public Lobby() {
		// TODO Auto-generated constructor stub
	}

}
