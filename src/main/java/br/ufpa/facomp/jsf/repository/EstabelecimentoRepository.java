package br.ufpa.facomp.jsf.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.ufpa.facomp.jsf.domain.Estabelecimento;

import java.util.List;

public interface EstabelecimentoRepository extends CrudRepository<Estabelecimento, Long> {


}
