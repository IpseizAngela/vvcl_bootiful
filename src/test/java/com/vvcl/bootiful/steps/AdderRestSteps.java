package com.vvcl.bootiful.steps;

import com.vvcl.bootiful.controller.AdderController;
import com.vvcl.bootiful.service.AdderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


@ContextConfiguration(classes = AdderService.class)
public class AdderRestSteps {



    private int givenNumber;
    private int base;
    private int sum;

    public void givenBase(int base) {
        this.base = base;
        given().queryParam("base", base).when().post("/adder/current");
    }

    public void whenAdd(int adder) {
        this.givenNumber = adder;
        sum = Integer.parseInt(
                given().queryParam("num", String.valueOf(base)).when()
                        .post("/adder/add").getBody()
                        .asString()
                );
    }

    public void thenSummedUp() {
        assertEquals(base + givenNumber, sum);
    }


}
