package br.ufpa.facomp.jsf.repository;

import org.springframework.data.repository.CrudRepository;

import br.ufpa.facomp.jsf.domain.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
