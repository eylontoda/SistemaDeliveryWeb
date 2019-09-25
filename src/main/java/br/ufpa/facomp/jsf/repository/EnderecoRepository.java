/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpa.facomp.jsf.repository;

import org.springframework.data.repository.CrudRepository;
import br.ufpa.facomp.jsf.domain.Endereco;

/**
 *
 * @author Felipe
 */
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
 
    
}

