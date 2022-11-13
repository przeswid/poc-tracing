package p.swida.poc.tracing.service.sleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
class TracedBySleuthComponent {

    final Logger logger = LoggerFactory.getLogger(TracedBySleuthComponent.class);

    void simpleTracing() {
        logger.info("Simple Sleuth Tracing");
    }

}
