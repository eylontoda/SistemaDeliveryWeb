package br.ufpa.facomp.jsf.domain;

import br.ufpa.facomp.jsf.model.Entidade;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

@Entity
public class Problema implements Entidade<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String descricao;

    private ZonedDateTime data;

    @ManyToOne
    @JoinColumn(name = "automovel_id")
    private Automovel automovel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ZonedDateTime getData() {
        return data;
    }

    public void setData(ZonedDateTime data) {
        this.data = data;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Problema problema = (Problema) o;
        return Objects.equals(id, problema.id) &&
                Objects.equals(descricao, problema.descricao) &&
                Objects.equals(data, problema.data) &&
                Objects.equals(automovel, problema.automovel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, data, automovel);
    }

    @Override
    public String toString() {
        return "Problema{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", automovel=" + automovel +
                '}';
    }
}
