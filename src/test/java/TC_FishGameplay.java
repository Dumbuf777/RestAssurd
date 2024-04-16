import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;

import framework.model.FishGameSession;
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
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC_FishGameplay  extends TestInit {
	 private final Logger _logger = LogManager.getLogger(PlayerService.class);

	    private Object responsePayload;
	    private boolean isNegativeTest = false;
	    private HttpStatus httpStatus = HttpStatus.OK;
	    private ContentType responseContentType = ContentType.JSON;
	    public String accessToken="";

	    @Test
	    public void TC001_PostPlayerLogin() throws AutomationException {

        ExtentTestManager.startTest("Get player login ", "To verify that player is able to get login in system through API");
    	JSONObject body = new JSONObject();
    	body.put("email", "CS-1400");
    	body.put("password", "Gameium@1234");
    	Response response = sendPostRequestWithAuthorization(APIEndPoint.PLAYER_LOGIN, body);
    	
		JsonPath jsonpath = response.jsonPath().prettyPeek();
		accessToken = jsonpath.getString("authorization.accessToken.token");
		System.out.println("player accessToken = "+accessToken);
		// Status code verification
		int statusResponseCode = response.getStatusCode();
		System.out.println("Status code is " + statusResponseCode);
    	
//	        RestUtil restInstance =
//	                RestUtil.init()
//	                        .path(APIEndPoint.PLAYER_LOGIN)
//	                        .expectedStatusCode(httpStatus)
//	                        .expectedResponseContentType(this.responseContentType)
//	                        //.post(body.toJSONString());
	       

	     }
	    	  
	    @Test
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
	                        .post_withAuth(body.toJSONString(),accessToken);
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
	    
	    @Test
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
	                        .post_withAuth(body.toJSONString(),accessToken);
	       

	     }
	    
		public Response sendPostRequestWithAuthorization(String path, JSONObject requestBody) {
			RestAssured.baseURI = "https://qaautomation-api.cosmoslots.tech/";
			RequestSpecification httpRequest = RestAssured.given();
			httpRequest.header("Content-Type", "application/json");
			httpRequest.body(requestBody.toJSONString());
			return httpRequest.request(Method.POST, path);
		}
	
}
