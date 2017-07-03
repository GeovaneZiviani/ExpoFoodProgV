package expofood.expo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Endereco implements Bean {

	public Endereco() {
		super();
		this.users = new ArrayList<User>();
	}

	public Endereco(Long id) {
		this();
		this.id = id;
	}

	public Endereco(String city, String estado, String pais, List<User> users) {
		this();
		this.city = city;
		this.estado = estado;
		this.pais = pais;
		this.users = users;
	}

	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	private String city;
	@NotNull
	private String estado;

	@NotNull
	private String pais;


	@NotNull
	@OneToMany(mappedBy = "enderecos", cascade = CascadeType.ALL)
	private List<User> users;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
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
		Endereco other = (Endereco) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

}
