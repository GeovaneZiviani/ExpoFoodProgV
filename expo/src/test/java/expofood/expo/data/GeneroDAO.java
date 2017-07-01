package expofood.expo.data;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import expofood.expo.entity.Genero;

@Transactional
public interface GeneroDAO extends CrudRepository<Genero,Long> {

}
