package expofood.expo.data;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import expofood.expo.entity.HQ;

@Transactional
public interface HQDAO extends CrudRepository<HQ, Long>{

}
