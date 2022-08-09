package br.com.study.loja.orcamento;

import br.com.study.loja.orcamento.situacao.EmAnalise;
import br.com.study.loja.orcamento.situacao.Finalizado;
import br.com.study.loja.orcamento.situacao.SituacaoOrçamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer qtdeItens;
    private SituacaoOrçamento situacao;

    public Orcamento(BigDecimal valor, Integer qtdeItens) {
        this.valor = valor;
        this.qtdeItens = qtdeItens;
        setSituacao(new EmAnalise());
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

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calculaValorDescontoExtra(this);
        this.valor = this.valor.subtract(valor.multiply(valorDescontoExtra));
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizado(this);
    }

    public SituacaoOrçamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrçamento situacao) {
        this.situacao = situacao;
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }
}
