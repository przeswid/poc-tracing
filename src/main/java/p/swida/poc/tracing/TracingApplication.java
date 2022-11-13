package p.swida.poc.tracing;

import com.tui.architecture.tracerv2.annotation.EnableTracer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTracer
public class TracingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TracingApplication.class, args);
	}

}
