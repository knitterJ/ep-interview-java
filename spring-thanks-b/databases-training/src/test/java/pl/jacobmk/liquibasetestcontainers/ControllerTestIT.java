package pl.jacobmk.liquibasetestcontainers;

import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@Testcontainers
@ActiveProfiles("test")

class ControllerTestIT {

    @Autowired
    private MockMvc mockMvc;

    @ClassRule
    public static PostgreSQLContainer postgreSQLContainer = BaeldungPostgresqlContainer.getInstance();


    @Test
    void getPeople() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(3)));
    }
}