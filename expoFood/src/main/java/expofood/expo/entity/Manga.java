package expofood.expo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Manga implements Bean {

	public Manga() {
		super();

	}

	public Manga(Long id) {
		this();
		this.id = id;
	}


	public Manga(String titulo, String descricao, String valor, GeneroManga generoManga, User users) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.valor = valor;
		this.generoManga = generoManga;
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
	private GeneroManga generoManga;

	@NotNull
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

	public GeneroManga getGeneroManga() {
		return generoManga;
	}

	public void setGeneroManga(GeneroManga generoManga) {
		this.generoManga = generoManga;
	}

	@Override
	public Long getId() {

		return id;
	}

	@Override
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
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Manga)) {
			return false;
		}
		Manga other = (Manga) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

}
