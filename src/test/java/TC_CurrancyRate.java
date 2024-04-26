import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import framework.service.PlayerService;
import framework.utils.globalConstants.HttpStatus;
import framework.utils.initializers.TestInit;
import io.restassured.http.ContentType;

public class TC_CurrancyRate extends TestInit {
	
	private final Logger _logger = LogManager.getLogger(PlayerService.class);

    private Object responsePayload;
    private Object responsePayload1;
    private boolean isNegativeTest = false;
    private HttpStatus httpStatus = HttpStatus.OK;
    private ContentType responseContentType = ContentType.JSON;

	
}
