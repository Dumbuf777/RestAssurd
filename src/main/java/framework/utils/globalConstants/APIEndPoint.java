package framework.utils.globalConstants;

/* -----------------------------------------------------------------------
   - ** Rest API Testing Framework using RestAssured **
   - Author: Krishan Chawla (krishanchawla1467@gmail.com)
   - Git Repo: https://github.com/krishanchawla/api-testing-rest-assured-java-framework
   ----------------------------------------------------------------------- */
public class APIEndPoint {
	
	public static final String Admin_Login = "auth/v1/login";
	public static final String USER_PROFILES = "player/63db8c6337f2b56acd44c627";
	// Player services
	public static final String PLAYER_PROFILES = "player/v1/player/63db8c6337f2b56acd44c62";
	public static final String PLAYER_LOGIN = "player/v1/login";
	public static final String GAME_SESSION = "engine/v1/game/session";
	public static final String FISH_GAME_SESSION = "fish/v1/game/session";
	public static final String GAME_SPIN = "engine/v1/spin";
	public static final String FISH_GAME_FIRE = "fish/v1/gameplay/fire";

	public static final String PLAYER_WITHDRAW = "player/v1/withdraw";
	
	//Auth services 
	public static final String Upload_File = "auth/v1/file/upload";
	public static final String upload_file = "auth/v1/file/upload/";
}
