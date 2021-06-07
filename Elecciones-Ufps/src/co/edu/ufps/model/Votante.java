package co.edu.ufps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipoDocumento")

public class Votante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nombre;
	@Column
	private String email;
	@Column
	private String documento;
	@Column
	private int tipoDocumento;
	@Column
	private int eleccion;
	public Votante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Votante( Integer id, String nombre, String email, String documento, int tipoDocumento,
			int eleccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.documento = documento;
		this.tipoDocumento = tipoDocumento;
		this.eleccion = eleccion;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public int getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public int getEleccion() {
		return eleccion;
	}
	public void setEleccion(int eleccion) {
		this.eleccion = eleccion;
	}
	@Override
	public String toString() {
		return "Votante [id=" + id + ", nombre=" + nombre + ", email=" + email + ", documento=" + documento
				+ ", tipoDocumento=" + tipoDocumento + ", eleccion=" + eleccion + "]";
	}
	
	

}
