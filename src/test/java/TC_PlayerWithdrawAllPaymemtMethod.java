import java.util.List;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import framework.model.PlayerData;
import framework.model.Withdarw;
import framework.model.error.ValidationError;
import framework.payload.WithdrawRequestPayload;
import framework.utils.common.RestUtil;
import framework.utils.exceptions.AutomationException;
import framework.utils.globalConstants.APIEndPoint;
import framework.utils.globalConstants.HttpStatus;
import framework.utils.initializers.TestInit;
import framework.utils.reportManagement.extent.ExtentTestManager;
import io.restassured.http.ContentType;

public class TC_PlayerWithdrawAllPaymemtMethod extends TestInit {

	private Object playerData;
	private Object responsePayload;
	private boolean isNegativeTest = false;
	private HttpStatus httpStatus = HttpStatus.OK;
	private ContentType responseContentType = ContentType.JSON;

	@Test
	public void TC001_PostPlayerLogin() throws AutomationException {

		ExtentTestManager.startTest("Get playerlogin ","To verify that player is able to get login in system through API");
		JSONObject body = new JSONObject();
		body.put("email", "CS-1400");
		body.put("password", "Gameium@1234");
		RestUtil restInstance = 
				RestUtil.init()
				        .path(APIEndPoint.PLAYER_LOGIN)
				        .contentType(ContentType.JSON)
				        .body(body)
				        .expectedStatusCode(httpStatus)
				        .expectedResponseContentType(this.responseContentType)
				        .post();
		if (!isNegativeTest) {
			playerData = restInstance.responseToPojo(new TypeReference<List<PlayerData>>() {
			});
		} else {
			playerData = restInstance.responseToPojo(ValidationError.class);
		}

	}

	@Test
	public void TC002_PostPlayerWitdraw_SKRILL() throws AutomationException, JsonProcessingException {
		ExtentTestManager.startTest("Player Withdraw_SKRILL ",
				"To verify that player is able to get withdraw token using SKRILL in system through API");
//		JSONObject body = new JSONObject();
//		body.put("amount", "1");
//		body.put("tipTokens", "0");
//		body.put("paymentProvider", "SKRILL");
//		body.put("playerId", ((List<PlayerData>) responsePayload).get(0).getPlayer().getId());
//		body.put("playerSkrillAccountEmail", "itsupport@ombpmllp.com");
		
		WithdrawRequestPayload body = new WithdrawRequestPayload();
		body.setAmount(1);body.setTipTokens(0);body.setPaymentProvider("SKRILL");body.setPlayerId(((List<PlayerData>) playerData).get(0).getPlayer().getId());body.setPlayerSkrillAccountEmail("itsupport@ombpmllp.com");
		 ObjectMapper mapper = new ObjectMapper();String jsonString = mapper.writeValueAsString(body);
		RestUtil restInstance =
				RestUtil.init()
				.path(APIEndPoint.PLAYER_WITHDRAW)
				.expectedStatusCode(httpStatus)
				.expectedResponseContentType(this.responseContentType)
                .post_withAuth(jsonString,((List<PlayerData>) playerData).get(0).getAuthorization().getAccessToken().getToken().toString());

		if (!isNegativeTest) {
			responsePayload = restInstance.responseToPojo(new TypeReference<List<Withdarw>>() {
			});
		} else {
			responsePayload = restInstance.responseToPojo(ValidationError.class);
		}
		
	}
	
	@Test
	public void TC003_PostPlayerWitdraw_WALLET() throws AutomationException, JsonProcessingException {
		ExtentTestManager.startTest("Player Withdraw_WALLET",
				"To verify that player is able to get withdraw token using WALLET in system through API");
		JSONObject body = new JSONObject();
		body.put("amount", "1");
		body.put("tipTokens", "0");
		body.put("paymentProvider", "WALLET");
		body.put("playerId", ((List<PlayerData>) playerData).get(0).getPlayer().getId());
//		body.put("playerSkrillAccountEmail", "itsupport@ombpmllp.com");
		
	
		RestUtil restInstance =
				RestUtil.init()
				.path(APIEndPoint.PLAYER_WITHDRAW)
				.expectedStatusCode(httpStatus)
				.expectedResponseContentType(this.responseContentType)
                .post_withAuth(body.toJSONString(),((List<PlayerData>) playerData).get(0).getAuthorization().getAccessToken().getToken().toString());

		if (!isNegativeTest) {
			responsePayload = restInstance.responseToPojo(new TypeReference<List<Withdarw>>() {
			});
		} else {
			responsePayload = restInstance.responseToPojo(ValidationError.class);
		}
		
	}
		
	@Test
	public void TC004_PostPlayerWitdraw_CASH_APP() throws AutomationException, JsonProcessingException {
		ExtentTestManager.startTest("Player Withdraw_CASH_APP",
				"To verify that player is able to get withdraw token using CASH_APP in system through API");
		JSONObject body = new JSONObject();
		body.put("amount", "1");
		body.put("tipTokens", "0");
		body.put("paymentProvider", "CASH_APP");
		body.put("playerId", ((List<PlayerData>) playerData).get(0).getPlayer().getId());
		body.put("playerSkrillAccountEmail", "itsupport@ombpmllp.com");
		
	
		RestUtil restInstance =
				RestUtil.init()
				.path(APIEndPoint.PLAYER_WITHDRAW)
				.expectedStatusCode(httpStatus)
				.expectedResponseContentType(this.responseContentType)
                .post_withAuth(body.toJSONString(),((List<PlayerData>) playerData).get(0).getAuthorization().getAccessToken().getToken().toString());

		if (!isNegativeTest) {
			responsePayload = restInstance.responseToPojo(new TypeReference<List<Withdarw>>() {
			});
		} else {
			responsePayload = restInstance.responseToPojo(ValidationError.class);
		}
		
	}
	
	@Test
	public void TC005_PostPlayerWitdraw_MANUAL() throws AutomationException, JsonProcessingException {
		ExtentTestManager.startTest("Player Withdraw_MANUAL",
				"To verify that player is able to get withdraw token using MANUAL in system through API");
		JSONObject body = new JSONObject();
		body.put("amount", "1");
		body.put("tipTokens", "0");
		body.put("paymentProvider", "MANUAL");
		body.put("playerId", ((List<PlayerData>) playerData).get(0).getPlayer().getId());
		body.put("playerSkrillAccountEmail", "itsupport@ombpmllp.com");
		
	
		RestUtil restInstance =
				RestUtil.init()
				.path(APIEndPoint.PLAYER_WITHDRAW)
				.expectedStatusCode(httpStatus)
				.expectedResponseContentType(this.responseContentType)
                .post_withAuth(body.toJSONString(),((List<PlayerData>) playerData).get(0).getAuthorization().getAccessToken().getToken().toString());

		if (!isNegativeTest) {
			responsePayload = restInstance.responseToPojo(new TypeReference<List<Withdarw>>() {
			});
		} else {
			responsePayload = restInstance.responseToPojo(ValidationError.class);
		}
		
	}
	
	@Test
	public void TC006_PostPlayerWitdraw_SEAMLESS_CHEX() throws AutomationException, JsonProcessingException {
		ExtentTestManager.startTest("Player Withdraw_SEAMLESS_CHEX",
				"To verify that player is able to get withdraw token using SEAMLESS_CHEX in system through API");
		JSONObject body = new JSONObject();
		body.put("amount", "1");
		body.put("tipTokens", "0");
		body.put("paymentProvider", "SEAMLESS_CHEX");
		body.put("playerId", ((List<PlayerData>) playerData).get(0).getPlayer().getId());
		body.put("playerSkrillAccountEmail", "itsupport@ombpmllp.com");
		
	
		RestUtil restInstance =
				RestUtil.init()
				.path(APIEndPoint.PLAYER_WITHDRAW)
				.expectedStatusCode(httpStatus)
				.expectedResponseContentType(this.responseContentType)
                .post_withAuth(body.toJSONString(),((List<PlayerData>) playerData).get(0).getAuthorization().getAccessToken().getToken().toString());

		if (!isNegativeTest) {
			responsePayload = restInstance.responseToPojo(new TypeReference<List<Withdarw>>() {
			});
		} else {
			responsePayload = restInstance.responseToPojo(ValidationError.class);
		}
		
	}
	
	@Test
	public void TC007_PostPlayerWitdraw_BANK_ACCOUNT() throws AutomationException, JsonProcessingException {
		ExtentTestManager.startTest("Player Withdraw_BANK_ACCOUNT",
				"To verify that player is able to get withdraw token using BANK_ACCOUNT in system through API");
		JSONObject body = new JSONObject();
		JSONObject bankAccountDetails = new JSONObject();
		body.put("amount", "1");
		body.put("tipTokens", "0");
		body.put("paymentProvider", "BANK_ACCOUNT");
		body.put("playerId", ((List<PlayerData>) playerData).get(0).getPlayer().getId());
		body.put("playerSkrillAccountEmail", "itsupport@ombpmllp.com");
		body.put("bankAccountDetails",bankAccountDetails);
		bankAccountDetails.put("accountHolderName", "fjaafsd");
		bankAccountDetails.put("accountNumber", "52112512032");
		bankAccountDetails.put("routingNumber", "01");
		bankAccountDetails.put("bankName", "fgasd");

		
		RestUtil restInstance =
				RestUtil.init()
				.path(APIEndPoint.PLAYER_WITHDRAW)
				.expectedStatusCode(httpStatus)
				.expectedResponseContentType(this.responseContentType)
                .post_withAuth(body.toJSONString(),((List<PlayerData>) playerData).get(0).getAuthorization().getAccessToken().getToken().toString());

		if (!isNegativeTest) {
			responsePayload = restInstance.responseToPojo(new TypeReference<List<Withdarw>>() {
			});
		} else {
			responsePayload = restInstance.responseToPojo(ValidationError.class);
		}
		
	}
}
