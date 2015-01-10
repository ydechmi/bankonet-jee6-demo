package com.yd.bankonet.web.view.i18n;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.faces.model.SelectItem;

public class LanguageViewBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 95249716400640853L;

	private String country;
	
	private List<SelectItem> countryList=new ArrayList<>();

	public LanguageViewBean() {
		countryList.add(0, new SelectItem(Locale.ENGLISH, "English"));
		countryList.add(1, new SelectItem(Locale.FRENCH, "French"));
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the countryList
	 */
	public List<SelectItem> getCountryList() {
		return countryList;
	}

	/**
	 * @param countryList the countryList to set
	 */
	public void setCountryList(List<SelectItem> countryList) {
		this.countryList = countryList;
	}
	
	public SelectItem getSelectedLanguage(String locale){
		
		for(SelectItem option: this.countryList){
			if(locale.equals(option.getValue().toString())){
				return option;
			}
		}
		return null;
	}
	

}
