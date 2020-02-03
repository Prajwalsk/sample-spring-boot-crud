package com.springBoot.SpringCRUD.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="external_id_accountsearch")
public class externalIdAccountSearch {
	
	@Id
	@Column(name="external_id_type")
	private int external_id_type;

	@Column(name="source")
	private String source;
	
	@Column(name="short_display")
	private String short_display;
	
	@Column(name="display_value")
	private String display_value;
	
	public int getExternal_id_type() {
		return external_id_type;
	}

	public void setExternal_id_type(int external_id_type) {
		this.external_id_type = external_id_type;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getShort_display() {
		return short_display;
	}

	public void setShort_display(String short_display) {
		this.short_display = short_display;
	}

	public String getDisplay_value() {
		return display_value;
	}

	public void setDisplay_value(String display_value) {
		this.display_value = display_value;
	}

}
