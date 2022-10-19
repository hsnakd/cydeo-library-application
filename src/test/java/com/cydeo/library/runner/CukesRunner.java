package com.cydeo.library.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target.rerun.txt",
                "json:target/cucumber.json",
                "junit:target/junit/junit-report.xml",
                "me.jvt.cucumber.report.PrettyReports:target.cucumber"
        },

        features="src/test/recources/features",
        glue="com/cydeo/library/step_definations",
        dryRun=true,
        tags=""

)

public class CukesRunner {


}
