package br.com.study.loja.pedido;

import br.com.study.loja.orcamento.Orcamento;
import br.com.study.loja.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeradorDePedidosHandler {

    // construtor com injeção de dependencias: repository, services...

    private List<AcaoAposGerarPedido> acoes;

    public GeradorDePedidosHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeradorPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);
        acoes.forEach(a -> a.executarAcao(pedido));

    }
}
