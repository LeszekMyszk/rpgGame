package com.eclipse.ec.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Material {
	@Id
	private Integer id;
	private String name;
	private Integer intiative;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIntiative() {
		return intiative;
	}

	public void setIntiative(Integer intiative) {
		this.intiative = intiative;
	}

	public Material(Integer id, String name, Integer intiative) {
		super();
		this.id = id;
		this.name = name;
		this.intiative = intiative;
	}

	public Material() {
		super();
	}

}
