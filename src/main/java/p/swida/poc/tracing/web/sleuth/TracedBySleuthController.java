package p.swida.poc.tracing.web.sleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TracedBySleuthController {

    final Logger logger = LoggerFactory.getLogger(TracedBySleuthController.class);

    @GetMapping("/sleuth/ok")
    public ResponseEntity<String> ok() {
        logger.info("Sleuth Ok tracing");

        return ResponseEntity.ok("Hello TUI Tracing");
    }


}
