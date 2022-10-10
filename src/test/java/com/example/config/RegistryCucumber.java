package test.java.com.example.config;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;

public class RegistryCucumber implements TypeRegistryConfigurer {

  @Override
  public void configureTypeRegistry(TypeRegistry registry) {
    registry.defineParameterType(
        new ParameterType<>("data", ".*", Date.class, (String s) -> {
          try {
            DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date dataFormatada = simpleDateFormat.parse(s);
            return dataFormatada;
          } catch (ParseException e) {
            e.printStackTrace();
            return null;
          }
        }));
  }

  @Override
  public Locale locale() {
    return Locale.ENGLISH;
  }
}
