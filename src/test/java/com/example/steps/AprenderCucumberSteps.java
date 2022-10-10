package test.java.com.example.steps;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AprenderCucumberSteps {

  @Dado("^que criei o arquivo corretamente$")
  public void queCrieiOArquivoCorretamente() throws Throwable {
    System.out.println("Passei por aqui!");
  }

  @Quando("^executa-lo$")
  public void executaLo() throws Throwable {
    System.out.println("Passei por aqui também!");
  }

  @Entao("^a especificacao deve finalizar com sucesso$")
  public void aEspecificacaoDeveFinalizarComSucesso() throws Throwable {
    System.out.println("Passei por aqui, mas estou perdido!");
  }

  private Integer contador = 0;

  @Dado("^que o valor do contador é (\\d+)$")
  public void queOValorDoContadorÉ(Integer int1) throws Throwable {
    contador = int1;
  }

  @Quando("^eu incrementar em (\\d+)$")
  public void euIncrementarEm(Integer int1) throws Throwable {
    contador = contador + int1;
  }

  @Entao("^o valor do contador será (\\d+)$")
  public void oValorDoContadorSerá(Integer int1) throws Throwable {
    // System.out.println(int1);
    // System.out.println(contador);
    // System.out.println(int1 == contador);
    // Assert.assertTrue(int1 == contador);
    Assert.assertEquals(int1, contador);
  }

  Date entrega = new Date();

  @Dado("que a entrega eh dia {data}")
  public void queAEntregaEhDia(Date data) throws Throwable {
    entrega = data;
    System.out.println(entrega);
  }

  @Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
  public void aEntregaAtrasarEmDias(Integer arg, String tempo) throws Throwable {
    Calendar cal = Calendar.getInstance();
    cal.setTime(entrega);
    if (tempo.equals("dias"))
      cal.add(Calendar.DAY_OF_MONTH, arg);
    if (tempo.equals("meses"))
      cal.add(Calendar.MONTH, arg);
    entrega = cal.getTime();
  }

  @Entao("a entrega serah efetuada em {data}")
  public void aEntregaSerahEfetuadaEm(Date data) {
    // DateFormat simplDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    // String dataFormatada = simplDateFormat.format(entrega);
    // Assert.assertEquals(data, dataFormatada);
    Assert.assertEquals(data, entrega);
  }

  // Desafio REGEX

  @Dado("^que o ticket( especial)? é (A.\\d{3})$")
  public void queOTicketÉAF(String tipo, String int1) throws Throwable {

  }

  @Dado("^que o valor da passagem é R\\$ (.*)$")
  public void queOValorDaPassagemÉR$(Double numero) throws Throwable {
    System.out.println(numero);
  }

  @Dado("^que o nome do passageiro é \"(.{5,20})\"$")
  public void queONomeDoPassageiroÉ(String string) throws Throwable {

  }

  @Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
  public void queOTelefoneDoPassageiroÉ(String telefone) throws Throwable {

  }

  @Quando("^criar os steps$")
  public void criarOsSteps() throws Throwable {

  }

  @Entao("^o teste vai funcionar$")
  public void oTesteVaiFuncionar() throws Throwable {

  }
}
