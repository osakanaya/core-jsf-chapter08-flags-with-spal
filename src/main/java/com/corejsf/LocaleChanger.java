package com.corejsf;

import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class LocaleChanger implements Serializable {

	private static final long serialVersionUID = 1L;

	private String languageCode;
	
	public String changeLocale() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(new Locale(languageCode));
		
		return null;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
}
