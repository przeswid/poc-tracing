package p.swida.poc.tracing.web;

import com.tui.architecture.tracerv2.TracerTags;
import com.tui.architecture.tracerv2.common.TagsTracerController;
import org.springframework.stereotype.Component;

@Component
class CustomTagsTracerController implements TagsTracerController {
    @Override public TracerTags requestTags(TracerTags tracerTags) {
        return tracerTags.add("application", "tracing-microservice");
    }

    @Override public TracerTags responseTags(TracerTags tracerTags) {
        return tracerTags.add("application", "tracing-microservice");
    }
}

