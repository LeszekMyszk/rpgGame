package com.eclipse.ec.repository;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "wapen") // tylko gdy nazwa tabeli inna niż klasy
@Entity
public class Wapen {

	@Id
	private Integer id;
	private String name;
	@Column(name = "hit_points")

	private Integer hitPoints;
	@JoinColumn(name = "material_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private Material material;

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

	public Integer getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(Integer hitPoints) {
		this.hitPoints = hitPoints;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Wapen(Integer id, String name, Integer hitPoints, Material material) {
		super();
		this.id = id;
		this.name = name;
		this.hitPoints = hitPoints;
		this.material = material;
	}

	public Wapen() {
		super();
	}

	@Override
	public String toString() {
		return "Wapen [id=" + id + ", name=" + name + ", hitPoints=" + hitPoints + ", material=" + material + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hitPoints, id, material, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wapen other = (Wapen) obj;
		return hitPoints == other.hitPoints && id == other.id && Objects.equals(material, other.material)
				&& Objects.equals(name, other.name);
	}

}
