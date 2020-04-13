package co.com.entities;

import java.io.Serializable;

public class Medicamento implements Serializable{
	
	private static final long serialVersionUID = -233761564472205205L;
	
	private Long id;
	private String nombre;
	private String dosis;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDosis() {
		return dosis;
	}
	public void setDosis(String dosis) {
		this.dosis = dosis;
	}
}
