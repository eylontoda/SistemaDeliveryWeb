package br.ufpa.facomp.jsf.model;

import java.io.Serializable;

/**
 * Entidade padrão do sistema, todas as entidades que serão persistidas em banco
 * de dados deverão implementá-la
 * 
 * @param <T>
 */
public interface Entidade<T> extends Serializable {

	T getId();

	void setId(T id);

	default boolean preenchido(String valor) {
		return !(valor == null || valor.isEmpty());
	}

	default boolean emMemoria() {
		return getId() == null;
	}
}
