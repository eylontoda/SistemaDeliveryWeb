package br.ufpa.facomp.jsf.web.conversor;

import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;
import java.time.*;
import java.time.format.DateTimeFormatter;

@Named
@RequestScoped
@FacesConverter(value = "localDateConversor")
public class LocalDateConversor implements Converter {

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		LocalDate dateValue = (LocalDate) value;
		return dateValue.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return LocalDate.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
