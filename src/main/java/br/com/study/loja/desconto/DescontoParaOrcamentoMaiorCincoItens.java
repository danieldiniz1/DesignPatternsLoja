package br.com.study.loja.desconto;

import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaiorCincoItens implements Desconto {

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQtdeItens() > 5){
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
        }
        return BigDecimal.ZERO;
    }
}
