package github.com.phyllipesa.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLogController {

    private Logger logger = LoggerFactory.getLogger(TestLogController.class.getName());

    @GetMapping("/test")
    public String testLog() {
        logger.debug("This is an DEBUG");
        logger.info("This is an INFO");
        logger.warn("This is an WARD");
        logger.error("This is an ERROR");
        return "Logs generated successfully!";
    }
}
