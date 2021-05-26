package ess.boot.project;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.servlet.ServletContext;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;



@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes= {BootprojecttestApplicationTests.class})
@TestPropertySource(locations = "classpath:application.properties")
class BootprojecttestApplicationTests {
	
	@Autowired
	private WebApplicationContext webCtx;
	
	@Autowired
	MockMvc mvc;


	@Test
	void contextLoads() {
		ServletContext ctx = webCtx.getServletContext();
		assertNotNull(webCtx);
	}
	
	@Test
	void checkUrl() throws Exception {
		mvc.perform(get("/get")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	void checkRepo() {
		
	}

}
