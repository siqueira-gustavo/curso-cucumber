package test.java.com.example.entities;

public class Filme {

  private Integer estoque;
  private Integer aluguel;

  public void setEstoque(Integer int1) {
    this.estoque = int1;
  }

  public void setAluguel(Integer int1) {
    this.aluguel = int1;
  }

  public Integer getAluguel() {
    return aluguel;
  }

  public Integer getEstoque() {
    return estoque;
  }
}
