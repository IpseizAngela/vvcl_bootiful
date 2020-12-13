package com.vvcl.bootiful.features;

import com.vvcl.bootiful.service.AdderService;
import com.vvcl.bootiful.steps.AdderRestSteps;

import net.serenitybdd.junit.spring.integration.SpringIntegrationSerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@RunWith(SpringIntegrationSerenityRunner.class)
public class AdderStory {

    @Steps AdderRestSteps restSteps;

    @Given("a number")
    public void given_number_five() throws Exception{
        restSteps.givenBase(5);
    }

    @When("I submit another number $num to adder")
    public void when_I_submit_to_adder_with_five(){
        int num = 5;
        restSteps.whenAdd(num);
    }

    @Then("I get a sum of the numbers")
    public void then_I_get_the_sum(){
        restSteps.thenSummedUp();
    }

}
