package br.com.easycond.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="registro_visita")
public class RegistroVisita implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="id_ingresso")
	private Integer id;
	
	private Integer idVisitante;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_inicio_visita")
	private Date dataInicioVisita;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_fim_visita")
	private Date dataFimVisita;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataInicioVisita() {
		return dataInicioVisita;
	}

	public void setDataInicioVisita(Date dataInicioVisita) {
		this.dataInicioVisita = dataInicioVisita;
	}

	public Date getDataFimVisita() {
		return dataFimVisita;
	}

	public void setDataFimVisita(Date dataFimVisita) {
		this.dataFimVisita = dataFimVisita;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFimVisita == null) ? 0 : dataFimVisita.hashCode());
		result = prime * result + ((dataInicioVisita == null) ? 0 : dataInicioVisita.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idVisitante == null) ? 0 : idVisitante.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroVisita other = (RegistroVisita) obj;
		if (dataFimVisita == null) {
			if (other.dataFimVisita != null)
				return false;
		} else if (!dataFimVisita.equals(other.dataFimVisita))
			return false;
		if (dataInicioVisita == null) {
			if (other.dataInicioVisita != null)
				return false;
		} else if (!dataInicioVisita.equals(other.dataInicioVisita))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idVisitante == null) {
			if (other.idVisitante != null)
				return false;
		} else if (!idVisitante.equals(other.idVisitante))
			return false;
		return true;
	}		
}