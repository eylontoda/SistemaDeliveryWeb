package br.ufpa.facomp.jsf.domain;

import br.ufpa.facomp.jsf.domain.enumeration.Estado;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Endereco{ 
    private String rua;
    private int numero;
    @Id
    private String CEP;
    private String bairro;
    @Enumerated
    private Estado estado;
    private String complemento;

    
     
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }



  
}

