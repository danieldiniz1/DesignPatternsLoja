package br.com.study.loja.orcamento;

import br.com.study.loja.exception.DomainException;
import br.com.study.loja.http.HttpAdapter;

import java.util.HashMap;
import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registar(Orcamento orcamento){
        //chamada HTTP para a API externa
        //URL connection
        //Http Client
        //lib Rest
        if (!orcamento.isFinalizado()){
            throw new DomainException("Orçamento ainda não foi finalizado");
        }
        String url = "https://api.externa/orcamento/salvar";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "qtdeItens", orcamento.getQtdeItens()
        );
        httpAdapter.post(url,dados);
    }
}
