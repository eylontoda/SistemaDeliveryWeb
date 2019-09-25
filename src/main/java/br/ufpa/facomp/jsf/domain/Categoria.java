package br.ufpa.facomp.jsf.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Categoria {
    @Id
    private int id;
    private String nome;
    @OneToMany(mappedBy = "categoria")
    private List<Produto> produto;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
   
}
