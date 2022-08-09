package br.com.study.loja.teste;

import br.com.study.loja.orcamento.Orcamento;
import br.com.study.loja.pedido.GeradorDePedidosHandler;
import br.com.study.loja.pedido.GeradorPedido;
import br.com.study.loja.pedido.Pedido;
import br.com.study.loja.pedido.acao.EnviarEmailPedido;
import br.com.study.loja.pedido.acao.SalvarPedidoBancoDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestePedido {

    public static void main(String[] args) {
        GeradorPedido geradorPedido = new GeradorPedido("jose",BigDecimal.valueOf(100),15);
        GeradorDePedidosHandler geradorDePedidosHandler = new GeradorDePedidosHandler(Arrays.asList(new SalvarPedidoBancoDados(),new EnviarEmailPedido()));
        geradorDePedidosHandler.executa(geradorPedido);

    }
}
