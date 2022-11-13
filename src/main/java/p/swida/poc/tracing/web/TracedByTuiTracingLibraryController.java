package p.swida.poc.tracing.web;

import com.tui.architecture.tracerv2.annotation.TraceController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TracedByTuiTracingLibraryController {

    @GetMapping("/tracing/ok")
    @TraceController
    public ResponseEntity<String> ok() {
        return ResponseEntity.ok("Hello TUI Tracing");
    }

    @GetMapping("/tracing/error")
    @TraceController
    public ResponseEntity<String> simpleTracingExample() {
        throw new IllegalStateException("Cannot process request");
    }

}
