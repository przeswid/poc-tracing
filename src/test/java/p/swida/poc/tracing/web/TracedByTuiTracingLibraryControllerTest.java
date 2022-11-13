package p.swida.poc.tracing.web;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.util.NestedServletException;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TracedByTuiTracingLibraryControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void okTracingCheck() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/tracing/ok").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void errorTracingCheck() throws Exception {
        Assertions.assertThatThrownBy(() -> mvc.perform(MockMvcRequestBuilders.get("/tracing/error").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is5xxServerError())).isInstanceOf(NestedServletException.class);
    }

}