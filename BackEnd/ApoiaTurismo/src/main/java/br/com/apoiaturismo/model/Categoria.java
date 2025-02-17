package br.com.apoiaturismo.ApoiaTurismo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_categoria;
	
	@NotNull
	@Size(min = 5, max = 20, message = "O tipo deve conter no mínimo 5 e no máximo 20 caracteres")
	private String tipo;
	
	@NotNull
	@Size(min = 5, max = 150, message = "A descrição deve conter no mínimo 5 e no máximo 150 caracteres")
	private String descricao;
	
	@NotNull
	@Size(min = 3, max = 20, message = "A região deve conter no mínimo 5 e no máximo 20 caracteres")
	private String regiao;

	public long getId() {
		return id_categoria;
	}

	public void setId(long id) {
		this.id_categoria = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
}
