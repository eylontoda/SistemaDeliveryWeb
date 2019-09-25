package br.ufpa.facomp.jsf.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import br.ufpa.facomp.jsf.domain.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    List<Cliente> findByLastName(String lastName);
}
