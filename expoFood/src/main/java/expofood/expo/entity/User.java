package expofood.expo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
public class User implements Bean {

	public User() {
		super();
		this.mangas = new ArrayList<Manga>();
		this.livros = new ArrayList<Livro>();
		this.hqs = new ArrayList<HQ>();
	}

	public User(Long id) {
		this();
		this.id = id;
	}

	
	public User(String email, String name, Endereco enderecos, List<HQ> hqs, List<Livro> livros, List<Manga> mangas) {
		this();
		this.email = email;
		this.name = name;
		this.enderecos = enderecos;
		this.hqs = hqs;
		this.livros = livros;
		this.mangas = mangas;
	}


	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String email;

	@NotNull
	private String name;

	@ManyToOne
	private Endereco enderecos;

	@NotNull
	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
	private List<HQ> hqs;

	
	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
	private List<Livro> livros;

	@NotNull
	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
	private List<Manga> mangas;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<Manga> getMangas() {
		return mangas;
	}

	public void setMangas(List<Manga> mangas) {
		this.mangas = mangas;
	}

	public Endereco getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco enderecos) {
		this.enderecos = enderecos;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setId(Long id) {
		this.id = id;

	}

	
	public List<HQ> getHqs() {
		return hqs;
	}

	public void setHqs(List<HQ> hqs) {
		this.hqs = hqs;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof User)) {
			return false;
		}
		User other = (User) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

}
