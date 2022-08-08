package br.com.study.loja.desconto.impl;

import br.com.study.loja.desconto.Desconto;
import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoValorMaiorQuinhentos implements Desconto {

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(BigDecimal.valueOf(500)) > 0;
    }
}
