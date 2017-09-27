/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mathe.spring.service;

import us.mathe.spring.entity.Perfil;
import us.mathe.spring.repository.PerfilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author Matheus Lucio <matheusluciox@gmail.com>
 */
@Service
public class PerfilService {
    @Autowired
    PerfilRepository perfilRepository;
    
    public List<Perfil> listarPerfil() {
        return perfilRepository.findAll();
    }
    
    public Page<Perfil> listaPaginada(int count, int page) {
        Pageable pages = new PageRequest(page, count);
        return perfilRepository.findAll(pages);
    }
    
    public List<Perfil> buscaPorNome(String nome) {
        return perfilRepository.findByNomeLikeIgnoreCase(nome);
    }

    public Perfil salvarPerfil(Perfil perfilAdd) {
        return perfilRepository.save(perfilAdd);
    }
    
    public void deletarPerfil(String id) {
        perfilRepository.delete(id);
    }
    
    public Perfil consultarPerfil(String id) {
        return perfilRepository.findOne(id);
    }
    
    public Perfil getById(String id) {
        return perfilRepository.findOne(id);
    }
}
