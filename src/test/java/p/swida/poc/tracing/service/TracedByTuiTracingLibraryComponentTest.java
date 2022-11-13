package p.swida.poc.tracing.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TracedByTuiTracingLibraryComponentTest {

    @Autowired
    private TracedByTuiTracingLibraryComponent tracedByTuiTracingLibraryComponent;

    @Test
    void simpleTracingCheck() {
        tracedByTuiTracingLibraryComponent.simpleTracing();
    }

    @Test
    void tracingWithTagsCheck() {
        tracedByTuiTracingLibraryComponent.tracingWithTags();
    }

}