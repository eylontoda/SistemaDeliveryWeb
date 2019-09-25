package br.ufpa.facomp.jsf.web.bean;

import br.ufpa.facomp.jsf.domain.Automovel;
import br.ufpa.facomp.jsf.domain.Marca;
import br.ufpa.facomp.jsf.repository.AutomovelRepository;
import br.ufpa.facomp.jsf.repository.MarcaRepository;
import br.ufpa.facomp.jsf.web.util.JSFUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class MarcaBean implements Serializable {

    private String buscaNome="";

    @Autowired
    private MarcaRepository repositorio;

    private Marca marca = new Marca();

    private List<Marca> lista = new ArrayList<>();

    public void excluir(){
        if(marca!=null){
            repositorio.delete(marca);
            JSFUtil.adicionarMsgGlobalExclusaoSucesso();
            marca = new Marca();
        }
    }

    public void atualizar(){
        if(marca!=null && marca.getId()!= null && marca.getId()>0){
            repositorio.save(marca);
            JSFUtil.adicionarMsgGlobalAlteracaoSucesso();
            marca = new Marca();
        }else
            JSFUtil.setErro("Precisa selecionar um automóvel já existente para atualizar");
    }
    public void salvar() {
        repositorio.save(marca);
        JSFUtil.adicionarMsgGlobalCadastroSucesso();
        marca = new Marca();
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Marca> getLista() {
        lista = repositorio.findAllByNomeContaining(buscaNome);
        return lista;
    }

    public String getBuscaNome() {
        return buscaNome;
    }

    public void setBuscaNome(String buscaNome) {
        this.buscaNome = buscaNome;
    }

    public List<Marca> listarTodas(){
        return repositorio.listarTodas();
    }
}
