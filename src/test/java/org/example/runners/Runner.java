package org.example.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "org.example.steps",
        tags = "@FeatureUno or @FeatureDos",
        snippets = SnippetType.CAMELCASE
)

public class Runner {
}

