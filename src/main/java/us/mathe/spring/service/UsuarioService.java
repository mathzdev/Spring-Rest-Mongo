/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mathe.spring.service;

import us.mathe.spring.entity.Usuario;
import us.mathe.spring.repository.UsuarioRepository;
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
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }
    
    public Page<Usuario> listaPaginada(int count, int page) {
        Pageable pages = new PageRequest(page, count);
        return usuarioRepository.findAll(pages);
    }
    
    public List<Usuario> buscaPorNome(String nome) {
        return usuarioRepository.findByNomeLikeIgnoreCase(nome);
    }

    public Usuario salvarUsuario(Usuario usuarioAdd) {
        return usuarioRepository.save(usuarioAdd);
    }
    
    public void deletarUsuario(String id) {
        usuarioRepository.delete(id);
    }
    
    public Usuario consultarUsuario(String id) {
        return usuarioRepository.findOne(id);
    }
}
