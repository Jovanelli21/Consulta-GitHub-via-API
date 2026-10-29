package br.com.github.verifica;

public class ErroConsultaGitHubException extends RuntimeException {
    //Construtor do erro
    public ErroConsultaGitHubException(String mensagem){
        super(mensagem);
    }
}
