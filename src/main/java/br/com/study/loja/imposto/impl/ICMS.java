package br.com.study.loja.imposto.impl;

import br.com.study.loja.imposto.Imposto;
import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS  extends Imposto {

    private BigDecimal percentualImposto;

    public ICMS(Imposto outro){
        super(outro);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        percentualImposto = new BigDecimal(0.15);
        return orcamento.getValor().multiply(percentualImposto);
    }
}
