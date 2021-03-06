package com.glancing.glacingat.controllers;

import com.glancing.glacingat.services.AdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ads")
public class AdController {

    @Autowired
    private AdsService adsService;

    @RequestMapping(value = "all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getAllAds() {
        int h = 7;
        h = 6 + 6;
        return adsService.doSomehting();
    }
}
