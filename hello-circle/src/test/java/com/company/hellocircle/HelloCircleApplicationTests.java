package com.company.hellocircle;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class HelloCircleApplicationTests {

	@Mock
	private MockMvc mockMvc;
	@Test
	void contextLoads() {
	}

	@Test
	public void shouldReturnAnswer() throws Exception {
		// arrange and act
		mockMvc.perform(get("/answer"))
				.andDo(print())
				.andExpect(status().isOk())
				// assert
				.andExpect((ResultMatcher) content().string("The answer is 42!"));
	}



}
