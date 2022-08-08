package br.com.study.loja.desconto;

import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Desconto {

    BigDecimal calcular(Orcamento orcamento);

    Boolean deveAplicar(Orcamento orcamento);
}
