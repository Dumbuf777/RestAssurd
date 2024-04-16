import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;

import framework.model.Player;
import framework.model.User;
import framework.model.error.ValidationError;
import framework.service.PlayerService;
import framework.utils.common.RestUtil;
import framework.utils.exceptions.AutomationException;
import framework.utils.globalConstants.APIEndPoint;
import framework.utils.globalConstants.HttpStatus;
import framework.utils.initializers.TestInit;
import framework.utils.reportManagement.extent.ExtentTestManager;
import io.restassured.http.ContentType;

public class TC_GetPlayer extends TestInit {
	 private final Logger _logger = LogManager.getLogger(PlayerService.class);

	    private User requestPayload;
	    private Object responsePayload;
	    private boolean isNegativeTest = false;
	    private HttpStatus httpStatus = HttpStatus.OK;
	    private ContentType responseContentType = ContentType.JSON;


	   @Test
	    public void TC001_GetPlayerLogin() throws AutomationException {

        ExtentTestManager.startTest("Get player login details", "To verify that player is able to get login in system through API");

	        RestUtil restInstance =
	                RestUtil.init()
	                        .path(APIEndPoint.PLAYER_PROFILES)
	                        .expectedStatusCode(httpStatus)
	                        .expectedResponseContentType(responseContentType)
	                        .get_withAuth();

//	        if (!isNegativeTest) {
//	            responsePayload = restInstance.responseToPojo(new TypeReference<List<Player>>() {});
//	        } else {
//	            responsePayload = restInstance.responseToPojo(ValidationError.class);
//	        }

    }
	

	
	
}