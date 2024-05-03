package framework.utils.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import framework.utils.exceptions.AutomationException;
import framework.utils.globalConstants.HttpStatus;
import framework.utils.logManagement.APIResponseFilter;
import framework.utils.propertiesManagement.TestProperties;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

/* -----------------------------------------------------------------------
   - ** Rest API Testing Framework using RestAssured **
 
   ----------------------------------------------------------------------- */
public class RestUtil {

    private RequestSpecBuilder requestSpecBuilder;
    private RequestSpecification requestSpecification;
    private Response apiResponse;
    public String accessToken="";

    private HttpStatus expectedStatusCode = HttpStatus.OK;
    private String expectedResponseContentType;

    /**
     * Returns a new object of RestUtil class
     *
     * @return this
     * @throws AutomationException
     */
    public static RestUtil init() throws AutomationException {
        return new RestUtil();
    }

    /**
     * RestUtil Default Constructor
     *
     * @throws AutomationException
     */
    public RestUtil() throws AutomationException {
        initializeRequestSpec();
    }

    /**
     * Initializes Request Specifications including the Base URI Path from test.properties
     *
     * @throws AutomationException
     */
    private void initializeRequestSpec() throws AutomationException {

        EncoderConfig encoderconfig = new EncoderConfig();
        requestSpecBuilder = new RequestSpecBuilder();

        /* ----- H E A D E R S ----- */
        requestSpecBuilder.setBaseUri(TestProperties.init().getProperty("app.url"));
        requestSpecBuilder.setConfig(RestAssured.config().encoderConfig(encoderconfig.appendDefaultContentCharsetToContentTypeIfUndefined(false)));

    }

    /**
     * Defines API Endpoint Path to Request Specification
     *
     * @param path
     * @return this
     */
    public RestUtil path(String path) {
        requestSpecBuilder.setBasePath(path);
        return this;
    }

    /**
     * Defines Path Parameters to Request Specification
     *
     * @param key
     * @param value
     * @return this
     */
    public RestUtil pathParam(String key, String value) {
        requestSpecBuilder.addPathParam(key, value);
        return this;
    }

    /**
     * Defines Query Parameters to Request Specification
     *
     * @param key
     * @param value
     * @return this
     */
    public RestUtil queryParam(String key, String value) {
        requestSpecBuilder.addQueryParam(key, value);
        return this;
    }

    /**
     * Defines Content Type Header to Request Specification
     *
     * @param contentType
     * @return this
     */
    public RestUtil contentType(ContentType contentType) {
        requestSpecBuilder.setContentType(contentType);
        return this;
    }

    /**
     * Defines Headers to Request Specification
     *
     * @param headers
     * @return this
     */
    public RestUtil headers(Map<String, String> headers) {
        requestSpecBuilder.addHeaders(headers);
        return this;
    }
    /**
     * Defines Headers to Request Specification
     *
     * @param headers
     * @return this
     */
    public RestUtil headers(String key, String value) {
        requestSpecBuilder.addHeader(key,value);
        return this;
    }

    /**
     * Defines Cookies to Request Specification
     *
     * @param cookies
     * @return this
     */
    public RestUtil cookies(Map<String, String> cookies) {
        requestSpecBuilder.addCookies(cookies);
        return this;
    }

    /**
     * Defines Cookies to Request Specification
     *
     * @param cookies
     * @return this
     */
    public RestUtil cookies(Cookies cookies) {
        requestSpecBuilder.addCookies(cookies);
        return this;
    }

    /**
     * Defines Cookie to Request Specification
     *
     * @param cookie
     * @return this
     */
    public RestUtil cookie(Cookie cookie) {
        requestSpecBuilder.addCookie(cookie);
        return this;
    }

    /**
     * Defines Body to Request Specification
     *
     * @param body
     * @return this
     */
    public RestUtil body(Object body) {
        requestSpecBuilder.setBody(body);
        return this;
    }
    
    /**
     * Defines Body to Request Specification
     *
     * @param body
     * @return this
     */
    public RestUtil body(JSONObject body) {
        requestSpecBuilder.setBody(body);
        return this;
    }
    

    /**
     * Defines the Expected Status Code following successful api execution for validation
     *
     * @param expectedStatusCode
     * @return this
     */
    public RestUtil expectedStatusCode(HttpStatus expectedStatusCode) {
        this.expectedStatusCode = expectedStatusCode;
        return this;
    }

    /**
     * Defines the Expected Response Content Type following successful api execution for validation
     *
     * @param contentType
     * @return this
     */
    public RestUtil expectedResponseContentType(ContentType contentType) {
        this.expectedResponseContentType = contentType.toString();
        return this;
    }

    /**
     * Defines the Expected Response Content Type following successful api execution for validation
     *
     * @param contentType
     * @return this
     */
    public RestUtil expectedResponseContentType(String contentType) {
        this.expectedResponseContentType = contentType;
        return this;
    }

    /**
     * Hits the Pre-Defined Request Specification as PUT Request
     * <p>
     * On successful response, method validates:
     * -   Status Code against the Status Code provided in Request Specification
     * -   Content Type against the Content Type provided in Request Specification
     *
     * @return this
     */
    public RestUtil put() {
        requestSpecification = requestSpecBuilder.build();
        apiResponse =
                given()
                        .log().all()
                        .filter(new APIResponseFilter())
                        .spec(requestSpecification)
                 .when()
                        .put()
                 .then()
                        .assertThat()
                        .statusCode(expectedStatusCode.getCode())
                        .contentType(expectedResponseContentType)
                 .and()
                        .extract()
                        .response();

        return this;
    }

    /**
     * Hits the Pre-Defined Request Specification as DELETE Request
     * <p>
     * On successful response, method validates:
     * -   Status Code against the Status Code provided in Request Specification
     * -   Content Type against the Content Type provided in Request Specification
     *
     * @return this
     */
    public RestUtil delete() {
        requestSpecification = requestSpecBuilder.build();
        apiResponse =
                given()
                        .log().all()
                        .filter(new APIResponseFilter())
                        .spec(requestSpecification)
                 .when()
                        .delete()
                 .then()
                        .assertThat()
                        .statusCode(expectedStatusCode.getCode())
                        .contentType(expectedResponseContentType)
                 .and()
                        .extract()
                        .response();

        return this;
    }

    /**
     * Hits the Pre-Defined Request Specification as POST Request
     * <p>
     * On successful response, method validates:
     * -   Status Code against the Status Code provided in Request Specification
     * -   Content Type against the Content Type provided in Request Specification
     *
     * @return this
     */
    public RestUtil post() {
        requestSpecification = requestSpecBuilder.build();
        apiResponse =
                given()
                        .log().all()
                        .filter(new APIResponseFilter())
                        .spec(requestSpecification)
                .when()
                        .post()
                .then()
                        .assertThat()
                        .statusCode(expectedStatusCode.getCode())
                        .contentType(expectedResponseContentType)
                .and()
                        .extract()
                        .response();

        return this;
    }
    
    public RestUtil post(String requestBody) {
        requestSpecification = requestSpecBuilder.build();
        apiResponse =
                given()
                        .log().all()
                        //.header("Content-Type", "application/json") // Example of adding a header
                        .filter(new APIResponseFilter())
                        .spec(requestSpecification)
                        .body(requestBody) // Include the request body here
                .when()
                        .post() // Change this to post()
                .then()
                        .assertThat()
                        .statusCode(expectedStatusCode.getCode())
                        .contentType(expectedResponseContentType)
                .and()
                        .extract()
                        .response();
//       //  accessToken = apiResponse.jsonPath().getString("authorization.accessToken.token");
//     // Extract the access token from the response
//        try {
//            JsonPath jsonPath = apiResponse.jsonPath();
//            accessToken = jsonPath.getString("authorization.accessToken.token");
//            System.out.println(accessToken);
//        } catch (Exception e) {
//            // Handle any exception occurred during token extraction
//            System.err.println("Error extracting access token: " + e.getMessage());
//        }

        return this;
    }
    
         
    public RestUtil post_withAuth(String requestBody) {
        requestSpecification = requestSpecBuilder.build();
        apiResponse =
                given()
                        .log().all()
                        .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJDUy0xNDAwIiwidXNlcl9JZCI6IjYzZGI4YzYzMzdmMmI1NmFjZDQ0YzYyNyIsInVzZXJfbmFtZSI6IkNTLTE0MDAiLCJmaXJzdF9uYW1lIjoic2hyaWtydXNobmEiLCJsYXN0X25hbWUiOiJzb25rYXIiLCJyb2xlX2NvZGUiOiJwbGF5ZXIiLCJ0b2tlbl90eXBlIjoicGxheWVyIiwibG9iYnlDb2RlcyI6WyJDUyJdLCJyYW5kb20iOiI0MTlmYmUzNC1mZmFhLTRkMzYtYWM0Ny1mOGZkMTlkZTcxNGIiLCJpYXQiOjE3MTI5MTc1NTIsImV4cCI6MTcxMzAwMzk1Mn0.J1lSfeaNHi86I_7xgfNmQlL5Q8Tq9UATdq8KondOgBc")
                        .header("Content-Type", "application/json") // Example of adding a header
                        .filter(new APIResponseFilter())
                        .spec(requestSpecification)
                        .body(requestBody) // Include the request body here
                .when()
                        .post() // Change this to post()
                .then()
                        .assertThat()
                        .statusCode(expectedStatusCode.getCode())
                        .contentType(expectedResponseContentType)
                .and()
                        .extract()
                        .response();
        

        return this;
    }
    
    public RestUtil post_withAuth(String requestBody,String token) {
        requestSpecification = requestSpecBuilder.build();
        apiResponse =
                given()
                        .log().all()
                        .header("Authorization", "Bearer "+token)
                        .header("Content-Type", "application/json") // Example of adding a header
                        .filter(new APIResponseFilter())
                        .spec(requestSpecification)
                        .body(requestBody) // Include the request body here
                .when()
                        .post() // Change this to post()
                .then()
                        .assertThat()
                        .statusCode(expectedStatusCode.getCode())
                        .contentType(expectedResponseContentType)
                .and()
                        .extract()
                        .response();
        

        return this;
    }
    
    /**
     * Hits the Pre-Defined Request Specification as GET Request
     * <p>
     * On successful response, method validates:
     * -   Status Code against the Status Code provided in Request Specification
     * -   Content Type against the Content Type provided in Request Specification
     *
     * @return this
     */
    public RestUtil get() {
        requestSpecification = requestSpecBuilder.build();
        apiResponse =
                given()
                        .log().all()
                        .filter(new APIResponseFilter())
                        .spec(requestSpecification)
                 .when()
                        .get()
                 .then()
                        .assertThat()
                        .statusCode(expectedStatusCode.getCode())
                        .contentType(expectedResponseContentType)
                  .and()
                        .extract()
                        .response();

        return this;
    }

    public RestUtil get_withAuth() {
        requestSpecification = requestSpecBuilder.build();
        apiResponse =
                given()
                        .log().all()
                        .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzeXN0ZW1hZG1pbiIsInVzZXJfSWQiOiI2MmVlMmI4MzQ1MGIwNzJiNTBjMDgzOGIiLCJ1c2VyX25hbWUiOiJzeXN0ZW1hZG1pbiIsImZpcnN0X25hbWUiOiJTeXN0ZW0iLCJsYXN0X25hbWUiOiJBZG1pbiIsInJvbGVfY29kZSI6IlNVUEVSX0FETUlOIiwidXNlcl90eXBlIjoiU1VQRVJfQURNSU4iLCJ0b2tlbl90eXBlIjoicG9ydGFsIiwiZW1haWwiOiJTeXN0ZW1fMUB5b3BtYWlsLmNvbSIsInJlYWRVc2VyIjpmYWxzZSwiaWF0IjoxNzExOTQ5MDU3LCJleHAiOjE3NDM0ODUwNTd9.Y0ofUTkUB8d8_lAWM0KQvblV97NX6wWSGaarVDkYtn8") // Example of adding a header
                        .filter(new APIResponseFilter())
                        .spec(requestSpecification)
                        .when()
                        .get()
                        .then()
                        .assertThat()
                        .statusCode(expectedStatusCode.getCode())
                        .contentType(expectedResponseContentType)
                        .and()
                        .extract()
                        .response();

        return this;
    }
    
    public RestUtil post_withMultiPart() {
        requestSpecification = requestSpecBuilder.build();
        apiResponse =
                given()
                        .log().all()
                        .multiPart("file", new File("D://OneDrive - Om BPM LLP//Pictures//Screenshots//Screenshot 2024-04-23 113227.png"))
                        .filter(new APIResponseFilter())
                        .spec(requestSpecification)
                  .when()
                        .post()
                  .then()
                        .assertThat()
                        .statusCode(expectedStatusCode.getCode())
                        .contentType(expectedResponseContentType)
                  .and()
                        .extract()
                        .response();

        return this;
    }
  
    /**
     * Returns the apiResponse Object
     *
     * @return apiResponse
     */
    public Response response() {
        return apiResponse;
    }

    /**
     * Returns the apiResponse Object as String
     *
     * @return apiResponse
     */
    public String getApiResponseAsString() {
        return apiResponse.asString();
    }
    /**
    * Returns the apiResponse Object as String
    *
    * @return apiResponse
    */
   public String getApiResponseAsJsonPath() {
       return apiResponse.jsonPath().prettyPeek().toString();
   }

    /**
     * Converts the Response Object into the provided Class Type
     *
     * @param type
     * @param <T>
     * @return
     * @throws AutomationException
     */
    public <T> T responseToPojo(Class<T> type) throws AutomationException {
        try {
            return new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY).readValue(getApiResponseAsString(), type);
        } catch (IOException ioex) {
            throw new AutomationException("Response Received did not match the expected Response Format POJO: " + type.getName() + ioex);
        }
    }

    /**
     * Converts the Response Object into the provided Class Type
     *
     * @param type
     * @param <T>
     * @return
     * @throws AutomationException
     */
    public <T> T responseToPojo(TypeReference type) throws AutomationException {
        try {
            return (T) new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY).readValue(getApiResponseAsString(), type);
        } catch (IOException ioex) {
            throw new AutomationException(ioex);
        }
    }

    public Response sendPutRequestWithAuthorization(JSONObject requestBody, String ids) {
		RestAssured.baseURI = "https://qaautomation-api.cosmoslots.tech";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.auth().oauth2(accessToken); // Set the authorization header
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestBody.toJSONString());
		return httpRequest.request(Method.PUT, "auth/v1/user/change-password/"+ids);
	}
		
	public Response sendPostRequestWithAuthorization(String path, JSONObject requestBody, String authToken) {
		RestAssured.baseURI = "https://qaautomation-api.cosmoslots.tech/";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.auth().oauth2(authToken); // Set the authorization header
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestBody.toJSONString());
		return httpRequest.request(Method.POST, path);
	}

	public Response sendPostRequestWithAuthorization(String path, JSONObject requestBody) {
		RestAssured.baseURI = "https://qaautomation-api.cosmoslots.tech/";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestBody.toJSONString());
		return httpRequest.request(Method.POST, path);
	}
}
