package br.ufpa.facomp.jsf.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import br.ufpa.facomp.jsf.domain.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {

}
