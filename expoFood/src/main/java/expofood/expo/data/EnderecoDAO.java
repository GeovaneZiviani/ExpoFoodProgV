package expofood.expo.data;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import expofood.expo.entity.Endereco;

@Transactional
public interface EnderecoDAO extends CrudRepository<Endereco, Long>{

}
