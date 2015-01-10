package com.yd.bankonet.web.controller.i18n;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.inject.Inject;

import com.yd.bankonet.web.controller.AbstractControllerBean;
import com.yd.bankonet.web.view.i18n.LanguageViewBean;

@ManagedBean(name="I18nBean")
@SessionScoped
public class I18nControllerBean extends AbstractControllerBean {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9190267637351280382L;
	@Inject
	LanguageViewBean view;
	
	public I18nControllerBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the view
	 */
	public LanguageViewBean getView() {
		return view;
	}

	/**
	 * @param view the view to set
	 */
	public void setView(LanguageViewBean view) {
		this.view = view;
	}
	
	public void languageValueChange(ValueChangeEvent event)
	        throws AbortProcessingException {
		System.out.println("event language");
		System.out.println("new value:"+event.getNewValue());
		System.out.println("old value:"+event.getOldValue());
	    if (null != event.getNewValue()) {
	       setLocale(event.getNewValue().toString());
	       SelectItem option=view.getSelectedLanguage(event.getNewValue().toString());
	       if(option!=null){
	    	   option.setNoSelectionOption(false);
	       }
	    }
	}

}
