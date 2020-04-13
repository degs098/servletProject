package co.com.entities;

import java.io.Serializable;

public class Cliente implements Serializable{

	private static final long serialVersionUID = 6494402932360003576L;

	public Cliente(Long id, Long cedula, String nombre, String segundoNombre, String apellido, String segundoApellido, String direccion, String telefono) {
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.segundoNombre = segundoNombre;
		this.apellido = apellido;
		this.segundoApellido = segundoApellido;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	private Long id;

	private Long cedula;

	private String nombre;

	private String segundoNombre;

	private String apellido;

	private String segundoApellido;

	private String direccion;

	private String telefono;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
