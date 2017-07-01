package expofood.expo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;
@Entity
public class Genero implements Bean {

	@Id
    @GeneratedValue
    private Long id;
    private String Nome;

    @OneToMany(mappedBy = "genero")
    private List<Livro> livros;

    @OneToMany(mappedBy = "genero")
    private List<Manga> mangas;
   
    public Genero() {
		super();
		// TODO Auto-generated constructor stub
	}
    
 

	public Genero(Long id, String nome, List<Livro> livros, List<Manga> mangas) {
		super();
		this.id = id;
		Nome = nome;
		this.livros = livros;
		this.mangas = mangas;
	}


	public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
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
    
    @Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setId(long id) {
		// TODO Auto-generated method stub
		
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
        if (!(object instanceof Genero)) {
            return false;
        }
        Genero other = (Genero) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

	
	
	
}
