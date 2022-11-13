package p.swida.poc.tracing.service.sleuth;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TracedBySleuthComponentTest {

    @Autowired
    TracedBySleuthComponent tracedBySleuthComponent;

    @Test
    void simpleTracingCheck() {
        tracedBySleuthComponent.simpleTracing();
    }

}