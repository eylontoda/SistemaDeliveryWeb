package br.ufpa.facomp.jsf.web.conversor;

import br.ufpa.facomp.jsf.model.Entidade;

import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

@Named
@RequestScoped
@FacesConverter(forClass = Entidade.class, value = "entidadeConversor")
public class EntidadeConversor implements Converter {

	@Override
	public Object getAsObject(FacesContext ctx, UIComponent component, String value) {
		if (value != null) {
			return this.getAttributesFrom(component).get(value);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext ctx, UIComponent component, Object value) {
		if (value != null && !"".equals(value)) {
			@SuppressWarnings("rawtypes")
			Entidade entity = (Entidade) value;
			if (entity.getId() != null) {
				this.addAttribute(component, entity);
				if (entity.getId() != null) {
					return entity.toString();
				}
				return (String) value;
			}
		}
		return "";
	}

	private void addAttribute(UIComponent component, @SuppressWarnings("rawtypes") Entidade o) {
		this.getAttributesFrom(component).put(o.getId().toString(), o);
	}

	private Map<String, Object> getAttributesFrom(UIComponent component) {
		return component.getAttributes();
	}

}
