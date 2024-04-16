package framework.model;

public class LobbyInfo {

    private String lobbyId;
    private String code;
    private String name;
    private String lobbyType;
    private Object primary;
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
