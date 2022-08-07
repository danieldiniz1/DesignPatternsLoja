package br.com.study.loja.imposto.impl;

import br.com.study.loja.imposto.Imposto;
import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS  implements Imposto {

    private BigDecimal percentualImposto;

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        percentualImposto = new BigDecimal(0.15);
        return orcamento.getValor().multiply(percentualImposto);
    }
}
