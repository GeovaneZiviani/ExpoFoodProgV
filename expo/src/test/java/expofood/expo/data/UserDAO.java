package expofood.expo.data;

import org.springframework.data.repository.CrudRepository;

import expofood.expo.entity.User;

public interface UserDAO  extends CrudRepository<User, Long>{

}
