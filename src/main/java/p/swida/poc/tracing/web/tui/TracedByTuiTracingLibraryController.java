package p.swida.poc.tracing.web.tui;

import com.tui.architecture.tracerv2.annotation.TraceController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TracedByTuiTracingLibraryController {

    @GetMapping("/tui/ok")
    @TraceController
    public ResponseEntity<String> ok() {
        return ResponseEntity.ok("Hello TUI Tracing");
    }

    @GetMapping("/tui/error")
    @TraceController
    public ResponseEntity<String> simpleTracingExample() {
        throw new IllegalStateException("Cannot process request");
    }

}
