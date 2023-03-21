package com.company.hellocircle.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloCircleController.class)
public class HelloCircleControllerTest {

   @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnAnswer() throws Exception {
        // arrange and act
       mockMvc.perform(get("/answer"))
                .andDo(print())
                .andExpect(status().isOk());
                // assert
//                .andExpect( content().string("The answer is 42!"));
    }


}