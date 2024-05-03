
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;

import framework.model.SystemAdmin;
import framework.model.UploadFile;
import framework.model.error.ValidationError;
import framework.utils.common.RestUtil;
import framework.utils.exceptions.AutomationException;
import framework.utils.globalConstants.APIEndPoint;
import framework.utils.globalConstants.HttpStatus;
import framework.utils.initializers.TestInit;
import framework.utils.reportManagement.extent.ExtentTestManager;
import io.restassured.http.ContentType;

public class TC_FieUploadController extends TestInit {

	private final Logger _logger = LogManager.getLogger(SystemAdmin.class);

	private Object responsePayload;
	private Object responsePayload1;
	private boolean isNegativeTest = false;
	private HttpStatus httpStatus = HttpStatus.OK;
	private ContentType responseContentType = ContentType.JSON;

	@Test
	public void TC001_PostAdminLogin() throws AutomationException {

		ExtentTestManager.startTest("Post system admin login ","To verify that system admin is able to get login in system through API");
		JSONObject body = new JSONObject();
		body.put("username", "systemadmin");
		body.put("password", "Gameium@1234");
		RestUtil restInstance = 
				RestUtil.init()
				        .path(APIEndPoint.Admin_Login)
				        .contentType(ContentType.JSON)
				        .body(body)
				        .expectedStatusCode(httpStatus)
				        .expectedResponseContentType(this.responseContentType)
				        .post();
		if (!isNegativeTest) {
			responsePayload = restInstance.responseToPojo(new TypeReference<List<SystemAdmin>>() {
			});
		} else {
			responsePayload = restInstance.responseToPojo(ValidationError.class);
		}

	}
	
	@Test
	public void TC002_PostUploadFile() throws AutomationException {

		ExtentTestManager.startTest("Post Upload file ","To verify that system admin is able to get upload file in system through API");

		RestUtil restInstance =
                RestUtil.init()
                        .path(APIEndPoint.Upload_File)
                        .contentType(ContentType.JSON)
                        .queryParam("actionType", "USER_PROFILE")
                        .headers("Authorization","Bearer "+((List<SystemAdmin>) responsePayload).get(0).getAccessToken().toString())
                        .contentType(ContentType.MULTIPART)
                        .expectedStatusCode(httpStatus)
                        .expectedResponseContentType(this.responseContentType)
                        .post_withMultiPart();
		if (!isNegativeTest) {
			responsePayload1 = restInstance.responseToPojo(new TypeReference<List<UploadFile>>() {
			});
		} else {
			responsePayload1 = restInstance.responseToPojo(ValidationError.class);
		}
//		restInstance.getApiResponseAsJsonPath();
//		System.out.println(restInstance.getApiResponseAsJsonPath());
	}
	
	@Test
	public void TC003_GetUploadFile() throws AutomationException {

		ExtentTestManager.startTest("Get Upload file ","To verify that system admin is able to get upload file in system through API");

		RestUtil restInstance =
                RestUtil.init()
                        .path(APIEndPoint.Upload_File+"/"+((List<UploadFile>) responsePayload1).get(0).getId().toString())
                        .headers("Authorization","Bearer "+((List<SystemAdmin>) responsePayload).get(0).getAccessToken().toString())
                        .expectedStatusCode(httpStatus)
                        .expectedResponseContentType("application/pdf")
		                .get();
                       // .post_withMultiPart(((List<SystemAdmin>) responsePayload).get(0).getAccessToken().toString());
        
	}
	
	@Test
	public void TC004_DeleteUploadFile() throws AutomationException {

		ExtentTestManager.startTest("Delete Upload file ","To verify that system admin is able to get upload file in system through API");
	
		RestUtil restInstance =
                RestUtil.init()
                        .path(APIEndPoint.Upload_File+"/"+((List<UploadFile>) responsePayload1).get(0).getId().toString())
                        .contentType(ContentType.JSON)
                        .headers("Authorization","Bearer "+((List<SystemAdmin>) responsePayload).get(0).getAccessToken().toString())
                        .expectedStatusCode(HttpStatus.ACCEPTED)
                        .expectedResponseContentType("")
                        .delete();
        
	}

}
