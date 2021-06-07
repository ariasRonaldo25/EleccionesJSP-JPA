package co.edu.ufps.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Voto")

public class Voto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private Date fechacreacion;
	@Column
	private Date fechavoto;
	@Column
	private String uuid;
	@Column
	private String enlace;
	@Column
	private int estamento;
	@Column
	private int candidato;
	@Column
	private int votante;
	
	
	public Voto() {
		super();
	}

	public Voto(Date fechacreacion, Date fechavoto, String uuid, String enlace, int estamento, int candidato, int votante) {
		super();
		this.fechacreacion = fechacreacion;
		this.fechavoto = fechavoto;
		this.uuid = uuid;
		this.enlace = enlace;
		this.estamento = estamento;
		this.candidato = candidato;
		this.votante = votante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFechavoto() {
		return fechavoto;
	}

	public void setFechavoto(Date fechavoto) {
		this.fechavoto = fechavoto;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public int getEstamento() {
		return estamento;
	}

	public void setEstamento(int estamento) {
		this.estamento = estamento;
	}

	public int getCandidato() {
		return candidato;
	}

	public void setCandidato(int candidato) {
		this.candidato = candidato;
	}

	public int getVotante() {
		return votante;
	}

	public void setVotante(int votante) {
		this.votante = votante;
	}

	@Override
	public String toString() {
		return "Voto [id=" + id + ", fechacreacion=" + fechacreacion + ", fechavoto=" + fechavoto + ", uuid=" + uuid
				+ ", enlace=" + enlace + ", estamento=" + estamento + ", candidato=" + candidato + ", votante="
				+ votante + "]";
	}
	
	
	
}
