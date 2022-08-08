package br.com.study.loja.orcamento.situacao;

import br.com.study.loja.exception.DomainException;
import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrçamento {

    public BigDecimal calculaValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.02));
    }

    public void finalizado(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
