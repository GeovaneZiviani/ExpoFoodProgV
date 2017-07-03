package expofood.expo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Livro implements Bean {

	public Livro() {
		super();
		
	}
	

	public Livro(Long id) {
		this();
		this.id = id;
	}

	public Livro(String titulo, String autor, String dataEdicao, String valor, Genero genero, User users) {
		this();
		this.titulo = titulo;
		this.autor = autor;
		this.dataEdicao = dataEdicao;
		Valor = valor;
		this.genero = genero;
		this.users = users;
	}

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String titulo;

	@NotNull
	private String autor;

	@NotNull
	private String dataEdicao;

	@NotNull
	private String Valor;

	@NotNull
	private Genero genero;

	
	@ManyToOne
	private User users;

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDataEdicao() {
		return dataEdicao;
	}

	public void setDataEdicao(String dataEdicao) {
		this.dataEdicao = dataEdicao;
	}

	public String getValor() {
		return Valor;
	}

	public void setValor(String valor) {
		Valor = valor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;

	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Livro)) {
			return false;
		}
		Livro other = (Livro) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;

	}

}