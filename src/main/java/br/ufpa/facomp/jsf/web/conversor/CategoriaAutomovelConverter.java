package br.ufpa.facomp.jsf.web.conversor;

import br.ufpa.facomp.jsf.domain.enumeration.CategoriaAutomovel;

import javax.enterprise.context.RequestScoped;
import javax.faces.convert.EnumConverter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;


@Named
@RequestScoped
@FacesConverter(forClass = CategoriaAutomovel.class, value = "categoriaAutomovelConverter")
public class CategoriaAutomovelConverter extends EnumConverter {

    public CategoriaAutomovelConverter() {
        super(CategoriaAutomovel.class);
    }

}