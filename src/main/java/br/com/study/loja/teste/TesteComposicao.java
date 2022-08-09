package br.com.study.loja.teste;

import br.com.study.loja.orcamento.ItemOrcamento;
import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteComposicao {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(BigDecimal.valueOf(200)));
        antigo.reprovar();

        System.out.println(antigo.getValor());

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(BigDecimal.valueOf(500)));
        novo.adicionarItem(antigo);

        System.out.println(novo.getValor());
    }
}
