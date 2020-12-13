package com.vvcl.bootiful.controller;

import com.vvcl.bootiful.StaticValues;
import com.vvcl.bootiful.service.AdderService;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AdderControllerTest {

    @Test
    public void currentNum() {
        int base = 5;
        given().queryParam("base", base).when().post("/adder/current");
        when().get("/adder/current").then().body(equalTo(String.valueOf(base)));
    }

    @Test
    public void add() {
        int base = 5;
        given().queryParam("base", base).when().post("/adder/current");
        given().queryParam("num", base).when().post("/adder/add").then().body(equalTo("10"));
    }
}