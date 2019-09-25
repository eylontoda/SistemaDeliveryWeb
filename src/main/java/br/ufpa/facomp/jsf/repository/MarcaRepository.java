package br.ufpa.facomp.jsf.repository;

import br.ufpa.facomp.jsf.domain.Automovel;
import br.ufpa.facomp.jsf.domain.Marca;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MarcaRepository extends CrudRepository<Marca, Long> {

    List<Marca> findAllByNomeContaining(String nome);

    @Query(value = "from Marca")
    List<Marca> listarTodas();

}
