package co.edu.ufps.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Estamento")

public class Estamento{ //implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private int eleccion;
	@Column
	private String descripcion;
	public Estamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Estamento(int id, int eleccion, String descripcion) {
		super();
		this.id = id;
		this.eleccion = eleccion;
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEleccion() {
		return eleccion;
	}
	public void setEleccion(int eleccion) {
		this.eleccion = eleccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Estamento [id=" + id + ", eleccion=" + eleccion + ", descripcion=" + descripcion + "]";
	}
	
	
	
}
