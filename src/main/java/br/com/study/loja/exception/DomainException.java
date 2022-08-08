package br.com.study.loja.exception;

public class DomainException extends RuntimeException{

    private String mensagem;

    public DomainException(String message) {
        super(message);
        this.mensagem = mensagem;
    }
}
