package com.petsmile.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = {"StepDefinition"})
public class Runner {

}