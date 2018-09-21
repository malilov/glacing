package com.glancing.glacingat.controllers;

import com.glancing.glacingat.services.AdsService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(MockitoJUnitRunner.class)
public class AdControllerTest {

    private MockMvc mvc;

    @Mock
    AdsService adsService;

    @InjectMocks
    AdController adController;

    @Before
    public void init() {
        mvc = MockMvcBuilders.standaloneSetup(adController).dispatchOptions(true).build();
    }

    @Test
    public void shouldReturnAllAds() throws Exception{
        when(adsService.doSomehting()).thenReturn("Mico");
        int h=0;
        MvcResult result = mvc.perform(get("/ads/all"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        final String responseBody = result.getResponse().getContentAsString();
        int hf=0;
        Assert.assertEquals("Mico",adController.getAllAds());
    }
}
