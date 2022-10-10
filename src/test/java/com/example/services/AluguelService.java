package test.java.com.example.services;

import test.java.com.example.entities.Filme;
import test.java.com.example.entities.NotaAluguel;
import test.java.com.example.utils.DateUtils;

public class AluguelService {

  public NotaAluguel alugar(Filme filme) {
    if (filme.getEstoque() == 0) throw new RuntimeException("Filme sem estoque");
    NotaAluguel nota = new NotaAluguel();
    nota.setPreco(filme.getAluguel());
    nota.setDataEntrega(DateUtils.obterDataDiferencaDias(1));
    filme.setEstoque(filme.getEstoque() - 1);
    return nota;
  }
}
