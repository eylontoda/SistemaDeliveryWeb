package br.ufpa.facomp.jsf.repository;

import org.springframework.data.repository.CrudRepository;
import br.ufpa.facomp.jsf.domain.Contato;

public interface ContatoRepository extends CrudRepository<Contato, Long> {


}
