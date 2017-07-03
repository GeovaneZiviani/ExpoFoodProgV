package expofood.expo.data;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import expofood.expo.entity.User;
@Transactional
public interface UserDAO  extends CrudRepository<User, Long>{

	public User findByEmail(String email);
}
