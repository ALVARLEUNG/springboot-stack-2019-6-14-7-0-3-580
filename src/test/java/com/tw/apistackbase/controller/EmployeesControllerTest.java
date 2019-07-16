package com.tw.apistackbase.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class EmployeesControllerTest {

   @Autowired
   private MockMvc mockMvc;

    @Test
    public void should_return_expected_employees_when_call_get_all_employees () throws Exception {
        mockMvc.perform(get("/employees"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8")).andExpect(content().json("[\n" +
                "    {\n" +
                "        \"name\": \"小明\",\n" +
                "        \"id\": \"1\",\n" +
                "        \"age\": \"20\",\n" +
                "        \"gender\": \"男\"\n" +
                "    }\n" +
                "]"));
    }

}