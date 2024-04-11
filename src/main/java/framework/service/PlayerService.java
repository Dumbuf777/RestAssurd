package framework.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.type.TypeReference;

import framework.model.Player;
import framework.model.User;
import framework.model.error.ValidationError;
import framework.utils.common.RestUtil;
import framework.utils.exceptions.AutomationException;
import framework.utils.globalConstants.APIEndPoint;
import framework.utils.globalConstants.HttpStatus;
import framework.utils.reportManagement.extent.ExtentTestManager;
import io.restassured.http.ContentType;

public class PlayerService {
	
    private final Logger _logger = LogManager.getLogger(PlayerService.class);

    private Object responsePayload;
    private boolean isNegativeTest = false;
    private HttpStatus httpStatus = HttpStatus.OK;
    private ContentType responseContentType = ContentType.JSON;

    public static PlayerService init() {
        return new PlayerService();
    }
    
    public PlayerService isNegativeTest(HttpStatus httpStatus) {
        this.responseContentType = ContentType.JSON;
        this.isNegativeTest = true;
        this.httpStatus = httpStatus;
        return this;
    }
    
    public PlayerService getPlayerDetails() throws AutomationException {

        ExtentTestManager.step(_logger, "Get player Details");

        RestUtil restInstance =
                RestUtil.init()
                        .path(APIEndPoint.PLAYER_PROFILES)
                        .contentType(ContentType.JSON)
                        .expectedStatusCode(httpStatus)
                        .expectedResponseContentType(responseContentType)
                        .get_withAuth();

        if (!isNegativeTest) {
            responsePayload = restInstance.responseToPojo(new TypeReference<List<Player>>() {});
        } else {
            responsePayload = restInstance.responseToPojo(ValidationError.class);
        }

        return this;
    }
    
    public PlayerService postPlayerLogin(JSONObject payload) throws AutomationException {

        ExtentTestManager.step(_logger, "post player login");

        RestUtil restInstance =
                RestUtil.init()
                        .path(APIEndPoint.PLAYER_LOGIN)
                        .contentType(ContentType.JSON)
                        .body(payload)
                        .expectedStatusCode(httpStatus)
                        .expectedResponseContentType(responseContentType)
                        .post();

        if (!isNegativeTest) {
            responsePayload = restInstance.responseToPojo(new TypeReference<List<Player>>() {});
        } else {
            responsePayload = restInstance.responseToPojo(ValidationError.class);
        }

        return this;
    }
    
   


}
