package expofood.expo.data;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import expofood.expo.entity.Manga;

@Transactional
public interface MangaDAO  extends CrudRepository<Manga, Long>{

}
