package br.ufpa.facomp.jsf.domain;

import br.ufpa.facomp.jsf.domain.enumeration.CategoriaAutomovel;
import br.ufpa.facomp.jsf.model.Entidade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Automovel implements Entidade<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @Enumerated
    private CategoriaAutomovel categoria;

    private String placa;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void  setPlaca(String placa) {
        this.placa = placa;
    }

    public CategoriaAutomovel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaAutomovel categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automovel automovel = (Automovel) o;
        return Objects.equals(id, automovel.id) &&
                Objects.equals(nome, automovel.nome) &&
                categoria == automovel.categoria &&
                Objects.equals(placa, automovel.placa) &&
                Objects.equals(marca, automovel.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, categoria, placa, marca);
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria=" + categoria +
                ", placa='" + placa + '\'' +
                ", marca=" + marca +
                '}';
    }
}


