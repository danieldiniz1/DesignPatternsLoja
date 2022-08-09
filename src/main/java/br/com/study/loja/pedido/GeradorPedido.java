package br.com.study.loja.pedido;

import br.com.study.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeradorPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private Integer qtdeItens;

    public GeradorPedido(String cliente, BigDecimal valorOrcamento, Integer qtdeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdeItens = qtdeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public Integer getQtdeItens() {
        return qtdeItens;
    }

    public void setQtdeItens(Integer qtdeItens) {
        this.qtdeItens = qtdeItens;
    }
}
