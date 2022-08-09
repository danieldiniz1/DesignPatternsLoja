package br.com.study.loja.http.impl;

import br.com.study.loja.http.HttpAdapter;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpCliente implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApi = new URL(url);
            URLConnection connection = urlDaApi.openConnection();
            connection.connect();
            // restante do código de implementação de infra
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisição HTTP",e);
        }
    }
}
