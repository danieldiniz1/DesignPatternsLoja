package br.com.study.loja.desconto.impl;

import br.com.study.loja.desconto.Desconto;
import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaiorCincoItens implements Desconto {

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQtdeItens() > 5;
    }
}
