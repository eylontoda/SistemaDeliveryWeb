package br.ufpa.facomp.jsf.domain;

import java.util.List;
import javax.persistence.*;

@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contato;
   
    @ManyToOne
    @JoinColumn(name = "Cliente")
    private Contato cliente;

    
    public Long getContato() {
        return contato;
    }

    public void setContato(Long contato) {
        this.contato = contato;
    }

    public Contato getCliente() {
        return cliente;
    }

    public void setCliente(Contato cliente) {
        this.cliente = cliente;
    }

    
}
