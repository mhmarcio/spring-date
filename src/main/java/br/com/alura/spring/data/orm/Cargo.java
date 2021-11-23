package br.com.alura.spring.data.orm;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="cargos")
@SequenceGenerator(name= "cargo_seq_id", initialValue=1, allocationSize = 1)
public class Cargo implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cargo_seq_id")
   	private Integer id;
	private String descricao;
	@OneToMany
	private List<Funcionario> funcionario;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Cargo [id=" + id + ", descricao=" + descricao + "]";
	}
		
}
