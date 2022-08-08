package br.com.study.loja.orcamento.situacao;

import br.com.study.loja.exception.DomainException;
import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrçamento {

    public BigDecimal calculaValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser aprovado");
    }

    public void finalizado(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser finalizado");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser finalizado");
    }
}
