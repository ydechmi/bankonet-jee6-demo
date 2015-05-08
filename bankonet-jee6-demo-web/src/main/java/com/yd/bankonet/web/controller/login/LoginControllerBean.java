/**
 * 
 */
package com.yd.bankonet.web.controller.login;

import com.yd.bankonet.service.security.SecurityService;
import com.yd.bankonet.web.controller.AbstractControllerBean;
import com.yd.bankonet.web.view.login.LoginViewBean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

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

	@EJB
	SecurityService securityService;

	/**
	 * Default Constructor
	 */
	public LoginControllerBean() {

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
		boolean authentication=securityService.checkUserLogin(view.getId(),view.getPassword());
		if(authentication){
			return "/faces/accounts/home.xhtml";
		}else {
			addError("Login or password is bad");
			return "/faces/security/login.xhtml";
		}
	}

	
}
