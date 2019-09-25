package br.ufpa.facomp.jsf.repository;

import br.ufpa.facomp.jsf.domain.Problema;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProblemaRepository extends CrudRepository<Problema, Long> {

    @Query(value = "select * from problema where data BETWEEN :busca AND :buscafim ", nativeQuery = true)
    List<Problema> buscarProblemasHoje(@Param("busca") String dataInicio, @Param("buscafim") String dataFim);

    List<Problema> findAllByAutomovelId(Long idAutomovel);

    Long countAllByDescricaoContaining(String descricao);

    List<Problema> findAllByDescricaoContaining(String descricao);
}
