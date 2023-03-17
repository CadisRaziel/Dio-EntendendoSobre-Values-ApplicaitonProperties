package org.example.values.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

//@ConfigurationProperties(prefix = "remetente")
//fazendo isso eu posso dar um 'apelido' para minhas propriedades no 'application.properties'
@Configuration
@ConfigurationProperties(prefix = "remetente") //-> todos meus atributos estão pertinentes a esse prefix
public class Remetente {
    private String nome;

    private String email;

    private List<Long> telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }
}
