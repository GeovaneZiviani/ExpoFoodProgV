package expofood.expo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class HQ implements Bean {

	public HQ() {
		super();
		
	}

	public HQ(Long id) {
		this();
		this.id = id;
	}

	public HQ(String titulo, String descricao, String valor, User users) {
		this();
		this.titulo = titulo;
		this.descricao = descricao;
		this.valor = valor;
		this.users = users;
	}

	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	private String titulo;
	@NotNull
	private String descricao;
	@NotNull
	private String valor;

	@NotNull
	@ManyToOne
	private User users;

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}


	@Override
	public Long getId() {
		
		return id;
	}

	@Override
	public void setId(Long id) {
	this.id = id;

	}

}
