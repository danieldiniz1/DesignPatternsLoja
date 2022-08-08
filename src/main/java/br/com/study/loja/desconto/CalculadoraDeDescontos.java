package br.com.study.loja.desconto;

import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.util.List;

public class CalculadoraDeDescontos {


    public BigDecimal calcular(Orcamento orcamento, List<Desconto> listaDescontos){
        double somaDescontos = 0;
        for (Desconto desconto : listaDescontos) {
            BigDecimal descontoCalculado = desconto.calcular(orcamento);
            System.out.println("valor do desconto: " + descontoCalculado.toString() + " da classe " + desconto.getClass().getName());
            somaDescontos += descontoCalculado.doubleValue();
            System.out.println("valor do somaDescontos após iteração: " + somaDescontos);
        }
        BigDecimal somaDescontoBigDecimal = BigDecimal.valueOf(somaDescontos);
        System.out.println("valor do somaDescontos fora iteração: " + somaDescontos);
        System.out.println("valor do somaDescontosBigDecimal fora iteração: " + somaDescontoBigDecimal.toString());
        return somaDescontoBigDecimal;

        //Descobrir pq os métodos de somar, multiplicar e etc da classe BigDecimal não estão funcionando aqui
    }

}
