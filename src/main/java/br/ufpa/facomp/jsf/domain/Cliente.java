
package br.ufpa.facomp.jsf.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nome;
    private String CPF;
    private String email;
    private String senha;
    

    protected Cliente() {}

    public Cliente(String firstName, String lastName) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.senha = senha;
    }
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedido;
    @OneToMany(mappedBy = "cliente")
    private List<Contato> contato;
    @OneToMany(mappedBy = "cliente")
    private List<Endereco> endereco;
    @OneToMany(mappedBy = "cliente")
    private List<Produto> produto;
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, nome='%s', CPF='%s',email='%s',senha='%s']",
                id, nome, CPF,email, senha);
    }

// end::sample[]

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}
	public String getEmail() {
		return email;
	}
	public String senha() {
		return senha;
	}
}

