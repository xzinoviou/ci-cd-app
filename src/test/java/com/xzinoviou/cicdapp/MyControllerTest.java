package com.xzinoviou.cicdapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @author : Xenofon Zinoviou
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = MyController.class)
class MyControllerTest {

    private static final String URI = "/app";

    @Autowired
    private MockMvc mockMvc;

    @Test
    void whenValidNameSupplied_thenReturn200WithResultMap() throws Exception {

        final MvcResult result = mockMvc.perform(get(URI + "/" + "test").contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        final String output = result.getResponse().getContentAsString();

        assertEquals("{\"name\":\"test\"}", output);

    }

    @Test
    void whenEmptyNameSupplied_thenReturn404() throws Exception {
        mockMvc.perform(get(URI).contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().isNotFound())
                .andReturn();
    }

}
