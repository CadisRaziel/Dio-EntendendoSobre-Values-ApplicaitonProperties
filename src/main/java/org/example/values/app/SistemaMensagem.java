package org.example.values.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    //Pegando valores do 'application.properties' que esta dentro da pasta 'resource'
    //pra isso eu uso a anotação @Value
    //ele é tipo nosso .env

    //podemos colocar um valor padrao caso ele nao ache o "nome" por exemplo
    //@Value("${nome:NoReplay-DIO}")
    //ou seja se o valor 'nome' nao existir no application.properties, o 'NoReplay-DIO' vai assumir como nome
    //ele faz isso para nao dar erro
    @Value("${nome:NoReplay-DIO}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome
                + "\nE-mail: " + email
                + "\nCom telefones para contato: " + telefones
        );
        System.out.println("Seu cadastro foi aprovado");
    }

}
