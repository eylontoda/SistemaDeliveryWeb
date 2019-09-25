package br.ufpa.facomp.jsf.web.bean;

import br.ufpa.facomp.jsf.domain.Marca;
import br.ufpa.facomp.jsf.domain.Problema;
import br.ufpa.facomp.jsf.repository.MarcaRepository;
import br.ufpa.facomp.jsf.repository.ProblemaRepository;
import br.ufpa.facomp.jsf.web.util.JSFUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Named
@ViewScoped
public class ProblemaBean implements Serializable {

    private String buscaNome="";

    @Autowired
    private ProblemaRepository repositorio;

    private Problema problema = new Problema();

    private List<Problema> lista = new ArrayList<>();

    public void excluir(){
        if(problema!=null){
            repositorio.delete(problema);
            JSFUtil.adicionarMsgGlobalExclusaoSucesso();
            problema = new Problema();
        }
    }

    public void atualizar(){
        if(problema!=null && problema.getId()!= null && problema.getId()>0){
            repositorio.save(problema);
            JSFUtil.adicionarMsgGlobalAlteracaoSucesso();
            problema = new Problema();
        }else
            JSFUtil.setErro("Precisa selecionar um automóvel já existente para atualizar");
    }
    public void salvar() {
        problema.setData(ZonedDateTime.now());
        repositorio.save(problema);
        JSFUtil.adicionarMsgGlobalCadastroSucesso();
        problema = new Problema();
    }


    public List<Problema> getLista() {
        lista = repositorio.findAllByDescricaoContaining(buscaNome);
        return lista;
    }

    public String getBuscaNome() {
        return buscaNome;
    }

    public void setBuscaNome(String buscaNome) {
        this.buscaNome = buscaNome;
    }

    public Problema getProblema() {
        return problema;
    }

    public void setProblema(Problema problema) {
        this.problema = problema;
    }


}
