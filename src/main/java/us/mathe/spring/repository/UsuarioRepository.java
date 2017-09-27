/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mathe.spring.repository;

import java.util.List;
import us.mathe.spring.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Matheus Lucio <matheusluciox@gmail.com>
 */
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    public List<Usuario> findByNomeLikeIgnoreCase(String nome);
    
    public Usuario findByEmail(String email);
}
