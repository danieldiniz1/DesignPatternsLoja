package br.com.study.loja.teste;

import br.com.study.loja.orcamento.Orcamento;
import br.com.study.loja.pedido.GeradorDePedidosHandler;
import br.com.study.loja.pedido.GeradorPedido;
import br.com.study.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestePedido {

    public static void main(String[] args) {


        GeradorPedido geradorPedido = new GeradorPedido("jose",BigDecimal.valueOf(100),15);
        GeradorDePedidosHandler geradorDePedidosHandler = new GeradorDePedidosHandler();
        geradorDePedidosHandler.executa(geradorPedido);

    }
}
