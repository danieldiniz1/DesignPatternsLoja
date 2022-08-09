package br.com.study.loja.pedido;

import br.com.study.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeradorDePedidosHandler {

    // construtor com injeção de dependencias: repository, services...

    public void executa(GeradorPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);
    }
}
