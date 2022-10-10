package test.java.com.example.steps;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import test.java.com.example.entities.Filme;
import test.java.com.example.entities.NotaAluguel;
import test.java.com.example.services.AluguelService;

public class AlugarFilmeSteps {

  private Filme filme;
  private AluguelService aluguel = new AluguelService();
  private NotaAluguel nota;
  private String erro;
  
  @Dado("um filme com estoque de {int} unidades")
  public void umFilmeComEstoqueDeUnidades(Integer int1) {
    filme = new Filme();
    filme.setEstoque(int1);
  }

  @Dado("que o preço do aluguel seja R$ {int}")
  public void queOPreçoDoAluguelSejaR$(Integer int1) {
    filme.setAluguel(int1);
  }

  @Quando("alugar")
  public void alugar() {
    try {
      nota = aluguel.alugar(filme);
    } catch (RuntimeException e) {
      erro = e.getMessage();
    }
  }

  @Então("o preço do aluguel será R$ {int}")
  public void oPreçoDoAluguelSeráR$(Integer int1) {
    Assert.assertEquals(int1, nota.getPreco());
  }

  @Então("a data de entrega será no dia seguinte")
  public void aDataDeEntregaSeráNoDiaSeguinte() {
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DAY_OF_MONTH, 1);
    Date dataRetorno = nota.getDataEntrega();
    Calendar calRetorno = Calendar.getInstance();
    calRetorno.setTime(dataRetorno);
    Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
    Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
    Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));
  }

  @Então("o estoque do filme será {int} unidade")
  public void oEstoqueDoFilmeSeráUnidade(Integer int1) {
    Assert.assertEquals(int1, filme.getEstoque());
  }

  @Então("^não será possível por falta de estoque$")
  public void nãoSeráPossívelPorFaltaDeEstoque() throws Throwable {
    Assert.assertEquals("Filme sem estoque", erro);
  }
}
