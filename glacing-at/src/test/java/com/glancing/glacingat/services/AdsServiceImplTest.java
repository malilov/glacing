package com.glancing.glacingat.services;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AdsServiceImplTest {


    AdsService adsService = new AdsServiceImpl();

    @Test
    public void shouldReturnAllAds() throws Exception {
        String somt = adsService.doSomehting();
        Assert.assertEquals("",somt);
    }

}
