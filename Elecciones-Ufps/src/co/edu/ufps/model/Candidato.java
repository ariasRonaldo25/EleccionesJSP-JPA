package co.edu.ufps.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Candidato")
public class Candidato { //implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String documento;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private Integer eleccion;
	@Column
	private Integer numero;
	
	public Candidato() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Candidato(Integer id, String documento, String nombre, String apellido, Integer eleccion, Integer numero) {
		super();
		this.id = id;
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.eleccion = eleccion;
		this.numero = numero;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEleccion() {
		return eleccion;
	}

	public void setEleccion(Integer eleccion) {
		this.eleccion = eleccion;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	 @Override
	 public String toString() {
	  return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento
	    + ", numero=" + numero + ", eleccion=" + eleccion + "]";
	 }


	}
	


