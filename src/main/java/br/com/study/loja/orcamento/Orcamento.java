package br.com.study.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer qtdeItens;

    public Orcamento(BigDecimal valor, Integer qtdeItens) {
        this.valor = valor;
        this.qtdeItens = qtdeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getQtdeItens() {
        return qtdeItens;
    }
}
