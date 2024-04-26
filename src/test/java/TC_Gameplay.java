import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;

import framework.model.FishGameSession;
import framework.model.GameSession;
import framework.model.PlayerData;
import framework.model.error.ValidationError;
import framework.service.PlayerService;
import framework.utils.common.RestUtil;
import framework.utils.exceptions.AutomationException;
import framework.utils.globalConstants.APIEndPoint;
import framework.utils.globalConstants.HttpStatus;
import framework.utils.initializers.TestInit;
import framework.utils.reportManagement.extent.ExtentTestManager;
import io.restassured.http.ContentType;


public class TC_Gameplay  extends TestInit {
	 private final Logger _logger = LogManager.getLogger(PlayerService.class);

	    private Object responsePayload;
	    private Object responsePayload1;
	    private boolean isNegativeTest = false;
	    private HttpStatus httpStatus = HttpStatus.OK;
	    private ContentType responseContentType = ContentType.JSON;

	    @Test
	    public void TC001_PostPlayerLogin() throws AutomationException {

        ExtentTestManager.startTest("Get player login ", "To verify that player is able to get login in system through API");
    	JSONObject body = new JSONObject();
    	body.put("email", "CS-1400");
    	body.put("password", "Gameium@1234");
	        RestUtil restInstance =
	                RestUtil.init()
	                        .path(APIEndPoint.PLAYER_LOGIN)
	                        .expectedStatusCode(httpStatus)
	                        .expectedResponseContentType(this.responseContentType)
	                        .post(body.toJSONString());
	        if (!isNegativeTest) {
	            responsePayload = restInstance.responseToPojo(new TypeReference<List<PlayerData>>() {});
	        } else {
	            responsePayload = restInstance.responseToPojo(ValidationError.class);
	        }
	        
	       
	     }
	    
	    @Test
	    public void TC002_PostGameSession() throws AutomationException {

        ExtentTestManager.startTest("create game session", "To verify that player is able to create game session in system through API");
   		JSONObject body = new JSONObject();
    	body.put("gameId", "62da952487a883647b781977");
    	body.put("gameTokenType", "GAME_TOKEN");
			RestUtil restInstance =
	                RestUtil.init()
	                        .path(APIEndPoint.GAME_SESSION)
	                        .expectedStatusCode(httpStatus)
	                        .expectedResponseContentType(this.responseContentType)
	                        .post_withAuth(body.toJSONString(),((List<PlayerData>) responsePayload).get(0).getAuthorization().getAccessToken().getToken().toString());
	        if (!isNegativeTest) {
	            responsePayload1 = restInstance.responseToPojo(new TypeReference<List<GameSession>>() {});
	        } else {
	            responsePayload1 = restInstance.responseToPojo(ValidationError.class);
	        }
	        
//	        responsePayload = restInstance.responseToPojo(new TypeReference<List<GameSession>>() {});
//	        GameSession gs = ((List<GameSession>) responsePayload).get(0); // Assuming the first item in the list is the created game session
//	        System.out.println(gs.getId());

	     }
	    
	    @Test(invocationCount = 10)
	    public void TC003_PostSpinInGameSession() throws AutomationException {

        ExtentTestManager.startTest("Spin game session", "To verify that player is able to spin game session in system through API");
    	JSONObject body = new JSONObject();
    	body.put("betToken", "12.5");
    	body.put("gameSessionId", ((List<GameSession>) responsePayload1).get(0).getId());
	        RestUtil restInstance =
	                RestUtil.init()
	                        .path(APIEndPoint.GAME_SPIN)
	                        .expectedStatusCode(httpStatus)
	                        .expectedResponseContentType(this.responseContentType)
	                        .post_withAuth(body.toJSONString(),((List<PlayerData>) responsePayload).get(0).getAuthorization().getAccessToken().getToken().toString());
	       

	     }
	    
//	    @Test
	    public void TC004_PostFishGameSession() throws AutomationException {

        ExtentTestManager.startTest("create fish game session", "To verify that player is able to create fish game session in system through API");
    	JSONObject body = new JSONObject();
    	body.put("betGroupId", "64252c3601868603508ddb97");
    	body.put("fishGameId", "64252a3401868603508ddb8a");
    	body.put("deviceType", "MOBILE");
    	body.put("gameTokenType", "GAME_TOKEN");
	        RestUtil restInstance =
	                RestUtil.init()
	                        .path(APIEndPoint.FISH_GAME_SESSION)
	                        .expectedStatusCode(httpStatus)
	                        .expectedResponseContentType(this.responseContentType)
	                        .post_withAuth(body.toJSONString());
	        if (!isNegativeTest) {
	            responsePayload = restInstance.responseToPojo(new TypeReference<List<FishGameSession>>() {});
	        } else {
	            responsePayload = restInstance.responseToPojo(ValidationError.class);
	        }
	        
	        responsePayload = restInstance.responseToPojo(new TypeReference<List<FishGameSession>>() {});
	        // Assuming the responsePayload contains the created GameSession object
	        FishGameSession gs = ((List<FishGameSession>) responsePayload).get(0); // Assuming the first item in the list is the created game session
	        System.out.println(gs.getId());

	     }
	    
//	    @Test()
	    public void TC005_PostSpinInFishGameSession() throws AutomationException {

        ExtentTestManager.startTest("Fire in fish game session", "To verify that player is able to fire in fish game session in system through API");
    	JSONObject body = new JSONObject();
    	body.put("betToken", "45.0");
    	body.put("fishGameId", "64252a3401868603508ddb8a");
    	body.put("symbolCode", "M5");
    	body.put("gunProperty", "NORMAL_GUN");
    	body.put("freeBullet", false);
    	body.put("fishGameSessionId", ((List<FishGameSession>) responsePayload).get(0).getId());
	        RestUtil restInstance =
	                RestUtil.init()
	                        .path(APIEndPoint.FISH_GAME_FIRE)
	                        .expectedStatusCode(httpStatus)
	                        .expectedResponseContentType(this.responseContentType)
	                        .post_withAuth(body.toJSONString());
	       

	     }
	
}
