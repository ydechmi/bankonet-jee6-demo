/**
 * 
 */
package com.yd.bankonet.web.controller.login;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import com.yd.bankonet.web.controller.AbstractControllerBean;
import com.yd.bankonet.web.view.login.LoginViewBean;

/**
 * @author ydechmi
 *
 */
@ManagedBean(name="loginBean")
public class LoginControllerBean extends AbstractControllerBean{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4522810932002450789L;
	@Inject
	private LoginViewBean view;

	/**
	 * 
	 */
	public LoginControllerBean() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the view
	 */
	public LoginViewBean getView() {
		return view;
	}

	/**
	 * @param view the view to set
	 */
	public void setView(LoginViewBean view) {
		this.view = view;
	}


	public String login(){
		//FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("fr"));
		System.out.println("OK");
		String out="/faces/home/home";
		System.out.println(out);
		return "success";
	}

	
}
