/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mathe.spring.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import us.mathe.spring.entity.Perfil;

/**
 *
 * @author Matheus Lucio <matheusluciox@gmail.com>
 */
public interface PerfilRepository extends MongoRepository<Perfil, String> {
    public List<Perfil> findByNomeLikeIgnoreCase(String nome);
    public Perfil findByNome(String nome);
}
