package test.java.com.example.runners;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = {
    // "src/test/resources/features/aprender_cucumber.feature",
    "src/test/resources/features/alugar_filme.feature",
  },
  glue = {
    "test.java.com.example.steps",
    "test.java.com.example.config"
  },
  // glue = "src/test/java/glue",
  tags = {
    // "@tipo1",
    // "not @ignore"
  },
  plugin = "pretty",
  // plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
  monochrome = false, // ative o monochrome se as informações no console
  // aparecem com caracteres referentes à cor de exibição, dificultando o
  // entendimento.
  snippets = CAMELCASE,
  dryRun = false,
  strict = false
)
public class Runner {
}
