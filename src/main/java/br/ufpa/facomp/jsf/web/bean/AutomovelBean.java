package br.ufpa.facomp.jsf.web.bean;

import br.ufpa.facomp.jsf.domain.Automovel;
import br.ufpa.facomp.jsf.domain.enumeration.CategoriaAutomovel;
import br.ufpa.facomp.jsf.repository.AutomovelRepository;
import br.ufpa.facomp.jsf.web.util.JSFUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class AutomovelBean implements Serializable {

    private String buscaNome="";

    @Autowired
    private AutomovelRepository repositorio;

    private Automovel automovel = new Automovel();

    private List<Automovel> lista = new ArrayList<>();

    public void excluir(){
        if(automovel!=null){
            repositorio.delete(automovel);
            JSFUtil.adicionarMsgGlobalExclusaoSucesso();
            automovel = new Automovel();
        }
    }

    public void atualizar(){
        if(automovel!=null && automovel.getId()!= null && automovel.getId()>0){
            repositorio.save(automovel);
            JSFUtil.adicionarMsgGlobalAlteracaoSucesso();
            automovel = new Automovel();
        }else
            JSFUtil.setErro("Precisa selecionar um automóvel já existente para atualizar");
    }
    public void salvar() {
        repositorio.save(automovel);
        JSFUtil.adicionarMsgGlobalCadastroSucesso();
        automovel = new Automovel();
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public List<Automovel> getLista() {
        lista = repositorio.findAllByNomeContaining(buscaNome);
        return lista;
    }

    public String getBuscaNome() {
        return buscaNome;
    }

    public void setBuscaNome(String buscaNome) {
        this.buscaNome = buscaNome;
    }

    public CategoriaAutomovel[] categorias(){
        return CategoriaAutomovel.values();
    }
}
