package br.com.study.loja.teste;

import br.com.study.loja.http.impl.JavaHttpCliente;
import br.com.study.loja.orcamento.Orcamento;
import br.com.study.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TesteAdpater {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(1000),99);
        System.out.println(orcamento.getSituacao().toString());
        orcamento.aprovar();
        System.out.println(orcamento.getSituacao().toString());
        orcamento.finalizar();
        System.out.println(orcamento.getSituacao().toString());

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpCliente());
        registroDeOrcamento.registar(orcamento);
    }
}
