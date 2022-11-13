package p.swida.poc.tracing.service.tui;

import com.tui.architecture.tracerv2.TracerService;
import com.tui.architecture.tracerv2.TracerTags;
import com.tui.architecture.tracerv2.enums.EMessageType;
import org.springframework.stereotype.Component;

@Component
class TracedByTuiTracingLibraryComponent {

    private final TracerService tracerService;

    public TracedByTuiTracingLibraryComponent(TracerService tracerService) {
        this.tracerService = tracerService;
    }

    void simpleTracing() {
        tracerService.trace(EMessageType.REQUEST, "Example tracing message");
    }

    void tracingWithTags() {
        TracerTags tracerTags = tracerService.getTracerTags()
                .add("booking", "xyui57sdjk")
                .add("application", "tracing-microservice");
        tracerService.trace(EMessageType.COMMAND, tracerTags, "Example tracing message with tags");
    }
}
