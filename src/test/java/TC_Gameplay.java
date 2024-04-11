import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;

import framework.model.GameSession;
import framework.model.Player;
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
	                        .post_withAuth(body.toJSONString());
	        if (!isNegativeTest) {
	            responsePayload = restInstance.responseToPojo(new TypeReference<List<GameSession>>() {});
	        } else {
	            responsePayload = restInstance.responseToPojo(ValidationError.class);
	        }
	        
	        responsePayload = restInstance.responseToPojo(new TypeReference<List<GameSession>>() {});
	        // Assuming the responsePayload contains the created GameSession object
	        GameSession gs = ((List<GameSession>) responsePayload).get(0); // Assuming the first item in the list is the created game session
	        System.out.println(gs.getId());
//	        return gs.getId();

	     }
	    
	    @Test(invocationCount = 5)
	    public void TC002_PostSpinInGameSession() throws AutomationException {

        ExtentTestManager.startTest("Spin game session", "To verify that player is able to spin game session in system through API");
    	JSONObject body = new JSONObject();
    	body.put("betToken", "12.5");
    	body.put("gameSessionId", ((List<GameSession>) responsePayload).get(0).getId());
	        RestUtil restInstance =
	                RestUtil.init()
	                        .path(APIEndPoint.GAME_SPIN)
	                        .expectedStatusCode(httpStatus)
	                        .expectedResponseContentType(this.responseContentType)
	                        .post_withAuth(body.toJSONString());
	       

	     }
	
}
