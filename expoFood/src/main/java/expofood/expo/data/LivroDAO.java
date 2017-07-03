package expofood.expo.data;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import expofood.expo.entity.Livro;

@Transactional
public interface LivroDAO extends CrudRepository<Livro, Long> {

}
