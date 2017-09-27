/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mathe.spring.controller;

import us.mathe.spring.entity.Usuario;
import us.mathe.spring.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Matheus Lucio <matheusluciox@gmail.com>
 */
@RestController
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public List<Usuario> listarUsuario() {
        return this.usuarioService.listarUsuario();
    }

    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.salvarUsuario(usuario);
    }
    
    @RequestMapping(value = "/usuario", method = RequestMethod.PUT)
    public Usuario editarUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.salvarUsuario(usuario);
    }
    
    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE)
    public void deletarUsuario(@PathVariable String id) {
        this.usuarioService.deletarUsuario(id);
    }
    
    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
    public Usuario consultarUsuario(@PathVariable String id) {
        return this.usuarioService.consultarUsuario(id);
    }
    
    @RequestMapping(value = "/usuario/{page}/{count}", method = RequestMethod.GET)
    public Page<Usuario> listaPaginada(@PathVariable int count, @PathVariable int page) {
        return this.usuarioService.listaPaginada(count, page);
    }
    
    @RequestMapping(value = "/usuario/{nome}/nome", method = RequestMethod.GET)
    public List<Usuario> buscaPorNome(@PathVariable String nome) {
        return this.usuarioService.buscaPorNome(nome);
    }
}
