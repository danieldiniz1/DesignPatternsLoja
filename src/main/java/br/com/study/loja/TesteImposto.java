package br.com.study.loja;

import br.com.study.loja.imposto.CalculadoraDeImposto;
import br.com.study.loja.imposto.impl.ICMS;
import br.com.study.loja.imposto.impl.ISS;
import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TesteImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(100));
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();

        BigDecimal impostoTotal = calculadoraDeImposto.calcular(orcamento, new ICMS());

        System.out.println(calculadoraDeImposto.getCalculaImposto().getClass().getName());
        System.out.println(impostoTotal.setScale(2, RoundingMode.HALF_UP));
    }
}
