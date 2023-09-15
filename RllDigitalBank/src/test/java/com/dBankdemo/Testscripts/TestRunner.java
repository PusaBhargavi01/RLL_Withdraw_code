package com.dBankdemo.Testscripts;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "Feature/withdraw_money_from_account.feature",
    glue = "com.dBankdemo.Testscripts"
)
public class TestRunner extends AbstractTestNGCucumberTests{
	
}

