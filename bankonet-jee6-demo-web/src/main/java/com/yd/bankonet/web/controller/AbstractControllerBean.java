/**
 * 
 */
package com.yd.bankonet.web.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Locale;




/**
 * @author ydechmi
 *
 */
public abstract class AbstractControllerBean implements Serializable{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6827925116322999388L;

	public void addMessage(String message){
		FacesMessage facesMessage=new FacesMessage(message);
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}
	
	public void addError(String message){
		FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR,message,"");
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}
	
	public void addWarning(String message){
		FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_WARN,message,"");
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}
	
	public void addInfo(String message){
		FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,message,"");
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}
	
	public void setLocale(String locale){
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(locale));
	}
	

	
	
	
	
	
	

}
