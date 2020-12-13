package com.vvcl.bootiful.features;

import com.vvcl.bootiful.controller.AdderController;
import com.vvcl.bootiful.service.AdderService;
import net.serenitybdd.jbehave.SerenityStories;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {
        AdderController.class, AdderService.class })
@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AdderIntegrationTest extends SerenityStories {}