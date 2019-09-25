package br.ufpa.facomp.jsf.repository;

import br.ufpa.facomp.jsf.domain.Automovel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AutomovelRepository extends CrudRepository<Automovel, Long> {
    // listagem de todos os automoveis da marca x
    List<Automovel> findAllByMarcaId(Long id);

    List<Automovel> findAllByNomeContaining(String nome);

    //Listagem de automoveis com "Fiesta" no nome e que a marca
    //    tenha o nome igual a "Ford"
    List<Automovel> findAllByNomeContainingAndMarcaNomeContaining(String nomeAuto, String nomeMarca);

}
