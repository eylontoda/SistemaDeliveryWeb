package br.ufpa.facomp.jsf.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;
import javax.persistence.OneToMany;

@Entity
public class Estabelecimento {

    @Id @GeneratedValue
    private Long id;
    private String CEP;
    private String nome;
    
@OneToMany(mappedBy = "estabelecimento")
    private List<Pedido> pedido;
@OneToMany(mappedBy = "estabelecimento")
    private List<Contato> contato;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCnpj(String CEP) {
        this.CEP = CEP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
