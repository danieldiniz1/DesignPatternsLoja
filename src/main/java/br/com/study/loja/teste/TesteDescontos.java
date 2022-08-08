package br.com.study.loja.teste;

import br.com.study.loja.desconto.CalculadoraDeDescontos;
import br.com.study.loja.desconto.Desconto;
import br.com.study.loja.desconto.impl.DescontoParaOrcamentoMaiorCincoItens;
import br.com.study.loja.desconto.impl.DescontoParaOrcamentoValorMaiorQuinhentos;
import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class TesteDescontos {


    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(1000),10);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        List<Desconto> listaRegrasDesconto = new ArrayList<>();
        listaRegrasDesconto.add(new DescontoParaOrcamentoMaiorCincoItens());
        listaRegrasDesconto.add(new DescontoParaOrcamentoValorMaiorQuinhentos());

        System.out.println(calculadoraDeDescontos.calcular(orcamento,listaRegrasDesconto).setScale(2,RoundingMode.HALF_DOWN));
//        System.out.println(calculadoraDeDescontos.calcular(orcamento,listaRegrasDesconto).setScale(2,RoundingMode.HALF_DOWN).add(BigDecimal.valueOf(200)));
//        System.out.println(calculadoraDeDescontos.calcular(orcamento,listaRegrasDesconto).setScale(2,RoundingMode.HALF_DOWN).multiply(BigDecimal.valueOf(10)));
//        System.out.println(calculadoraDeDescontos.calcular(orcamento,listaRegrasDesconto).setScale(2,RoundingMode.HALF_UP));
//        System.out.println(calculadoraDeDescontos.calcular(orcamento,listaRegrasDesconto).setScale(2,RoundingMode.HALF_EVEN));
//        System.out.println(calculadoraDeDescontos.calcular(orcamento,listaRegrasDesconto));
    }
}
