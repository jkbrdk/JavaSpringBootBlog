package cz.itnetwork.springblog.data.repositories;

import cz.itnetwork.springblog.data.entities.ArticleEntity;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<ArticleEntity, Long> {
}
