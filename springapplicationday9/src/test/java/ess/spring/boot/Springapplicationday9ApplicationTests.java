package ess.spring.boot;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.http.MediaType;
import java.util.List;

import javax.servlet.ServletContext;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import ess.spring.boot.entity.Coin;
import ess.spring.boot.repository.CoinRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes= {Springapplicationday9ApplicationTests.class})
@TestPropertySource(locations = "classpath:application.properties")

class Springapplicationday9ApplicationTests {

	@Autowired
	private WebApplicationContext webCtx;
	
	@Autowired
	MockMvc mockmvc;

	@Autowired
	@Qualifier("CoinRepository") private CoinRepository repo;
	 
	@Test
	void contextLoads() {
		ServletContext ctx = webCtx.getServletContext();
		assertNotNull(ctx);
	}
	
	@Test
	void checkUrl() throws Exception {
		/*
		 * mvc.perform(post("/form.html").contentType(MediaType.
		 * APPLICATION_FORM_URLENCODED).param("key", "value")
		 * .accept(MediaType.APPLICATION_FORM_URLENCODED));
		 */
		mockmvc.perform(get("/coin/coindata")).andDo(print()).andExpect(status().isOk());
		/*
		 * mvc.perform(get("/coin/minting")).andDo(print()).andExpect(status().isOk());
		 */
	}
	
	/*
	 * @Test void checkRepo() { List<String> result =
	 * repo.findAllByCountry("india"); assertNotNull(result); assertEquals(1,
	 * result.size());
	 * 
	 * }
	 */

}
