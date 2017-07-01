package expofood.expo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;
@Entity
public class Livro implements Bean{
	  @Id
	    @GeneratedValue
	    @Column(name = "livro_id")
	    private Long id;
	    private String titulo;	   
	    private String autor;	
	    private int anoEdicao;
	    private String Valor;

	    @ManyToOne
	    private Genero genero;

	    public Livro() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
		public Livro(Long id, String titulo, String autor, int anoEdicao, String valor, Genero genero) {
			super();
			this.id = id;
			this.titulo = titulo;
			this.autor = autor;
			this.anoEdicao = anoEdicao;
			Valor = valor;
			this.genero = genero;
		}

		public Genero getGenero() {
	        return genero;
	    }

	    public void setGenero(Genero genero) {
	        this.genero = genero;
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

	    public int getAnoEdicao() {
	        return anoEdicao;
	    }

	    public void setAnoEdicao(int anoEdicao) {
	        this.anoEdicao = anoEdicao;
	    }

	    public String getValor() {
	        return Valor;
	    }

	    public void setValor(String Valor) {
	        this.Valor = Valor;
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
