package expofood.expo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;


@Entity
public class Manga implements Bean{
	    @Id
	    @GeneratedValue
	    private Long id;

	 
	    private String titulo;
	   
	    private String descricao;
	    
	    private String valor;
	    
	    @ManyToOne
	    private Genero genero;

		
		
		@Override
		public long getId() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setId(long id) {
			// TODO Auto-generated method stub
			
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

	    public Genero getGenero() {
	        return genero;
	    }

	    public void setGenero(Genero genero) {
	        this.genero = genero;
	    }
	    
	    

	    public Manga() {
			super();
			// TODO Auto-generated constructor stub
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
