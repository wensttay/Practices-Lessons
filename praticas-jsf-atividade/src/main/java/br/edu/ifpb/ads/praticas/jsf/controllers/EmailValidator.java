/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.jsf.controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author vmvini
 */
@FacesValidator("emailValidator")
public class EmailValidator implements Validator {

    private final String emailPattern = "^[_A-Za-z0-9-]+(\\." +
			"[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +
			"(\\.[A-Za-z]{2,})$";
            
    private Pattern pattern;
    private Matcher matcher;
    
    public EmailValidator(){
        pattern = Pattern.compile(emailPattern);
    }
    
    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
       
        matcher = pattern.matcher(o.toString());
        
		if(!matcher.matches()){

			FacesMessage msg =
				new FacesMessage("Email inválido!",
						"Email inválido");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);

		}
    
    
    }
    
}
