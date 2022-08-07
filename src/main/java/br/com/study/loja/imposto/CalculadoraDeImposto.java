package br.com.study.loja.imposto;

import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {

    private Imposto calculaImposto;

    public CalculadoraDeImposto() {
    }

    public CalculadoraDeImposto(Imposto calculaImposto) {
        this.calculaImposto = calculaImposto;
    }

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        setCalculaImposto(imposto);
        return calculaImposto.calcular(orcamento);
    }

    public Imposto getCalculaImposto() {
        return calculaImposto;
    }

    public void setCalculaImposto(Imposto calculaImposto) {
        this.calculaImposto = calculaImposto;
    }
}
