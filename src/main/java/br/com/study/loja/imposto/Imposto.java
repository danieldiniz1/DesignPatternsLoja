package br.com.study.loja.imposto;

import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
