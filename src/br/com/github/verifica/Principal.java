package br.com.github.verifica;

import java.util.Scanner;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;

public class Principal {
    public static void main(String[] args){
        //Objeto de entrada.
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de dados do Usuário.
        System.out.println("Digite o nome do usuario do GitHub: ");
        String userName = entrada.nextLine().trim();
        
        //Endereço da API
        String url = "https://api.github.com/users/" + userName;
        
        //Criação da API
        try{
            //Criação da Conexão.
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest requisicao = HttpRequest.newBuilder().uri(URI.create(url)).build();
            
            //Envio do pedido de comunicação
            HttpResponse resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
            
            //Para erro 404
            if(resposta.statusCode() == 404){
                System.out.println("Este usuário não existe.");
            }
            
            //Saída da API
            System.out.println(resposta.body());
            
        }catch(ErroConsultaGitHubException e){
            System.out.println("Erro de consulta no GitHub: " + e.getMessage());
            
        }catch(IOException | InterruptedException e){
            System.out.println("Erro de Conexão com a API.");
            System.out.println("Erro Detectado: " + e.getMessage());
        }
    }
}