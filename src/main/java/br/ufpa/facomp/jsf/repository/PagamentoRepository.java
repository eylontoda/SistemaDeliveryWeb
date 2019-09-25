package br.ufpa.facomp.jsf.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.ufpa.facomp.jsf.domain.enumeration.Pagamento;

import java.util.List;

public interface PagamentoRepository extends CrudRepository<Pagamento, Long> {


}
