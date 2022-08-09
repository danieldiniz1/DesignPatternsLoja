package br.com.study.loja.pedido.acao;

import br.com.study.loja.pedido.Pedido;

public class SalvarPedidoBancoDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Foi salvo o pedido no banco de dados");
    }
}
