package br.com.study.loja.orcamento.situacao;

import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrçamento {

    public BigDecimal calculaValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
    }

    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

    public void reprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }
}
