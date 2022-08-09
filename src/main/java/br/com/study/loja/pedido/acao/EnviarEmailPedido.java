package br.com.study.loja.pedido.acao;

import br.com.study.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Foi enviado um email para o cliente informando o pedido");
    }
}
