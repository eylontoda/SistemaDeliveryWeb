package br.ufpa.facomp.jsf.repository;

import org.springframework.data.repository.CrudRepository;
import br.ufpa.facomp.jsf.domain.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
}
