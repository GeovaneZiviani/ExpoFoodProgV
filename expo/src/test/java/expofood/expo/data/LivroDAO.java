package expofood.expo.data;

import org.springframework.data.repository.CrudRepository;

import expofood.expo.entity.Livro;

public interface LivroDAO extends CrudRepository<Livro, Long> {

}
