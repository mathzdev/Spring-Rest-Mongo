/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mathe.spring.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Matheus Lucio <matheusluciox@gmail.com>
 */
@Document
public class Perfil implements GrantedAuthority {
    @Id
    public String id;
    
    public String nome;
    
    public Perfil() {
    }

    public Perfil(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getAuthority() {
        return nome;
    }
}
