/**
 * 
 */

import java.util.List;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;

import framework.model.FishGameSession;
import framework.model.error.ValidationError;
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

/**
 * 
 */
public class TC_PlayerWithdrawRequests extends TestInit {


    private Object responsePayload;
    private boolean isNegativeTest = false;
    private HttpStatus httpStatus = HttpStatus.OK;
    private ContentType responseContentType = ContentType.JSON;
    public String accessToken="";
    public String playerId1="";

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
	
//        RestUtil restInstance =
//                RestUtil.init()
//                        .path(APIEndPoint.PLAYER_LOGIN)
//                        .expectedStatusCode(httpStatus)
//                        .expectedResponseContentType(this.responseContentType)
//                        //.post(body.toJSONString());
       

     }
    
    @Test
    public void TC004_PostWithdrawRequest_CASHAPP() throws AutomationException {

    ExtentTestManager.startTest("create fish game session", "To verify that player is able to create fish game session in system through API");
	JSONObject body = new JSONObject();
	body.put("amount", "1");
	body.put("tipTokens", "0");
	body.put("paymentProvider", "CASH_APP");
	body.put("playerId", playerId1);
	body.put("playerSkrillAccountEmail","");
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
    
    
    
    
    
    
    public Response sendPostRequestWithAuthorization(String path, JSONObject requestBody) {
		RestAssured.baseURI = "https://qaautomation-api.cosmoslots.tech/";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestBody.toJSONString());
		return httpRequest.request(Method.POST, path);
	}

}
