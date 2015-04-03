package com.github.vladislav719.repository;

import com.github.vladislav719.model.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Владислав on 03.04.2015.
 */
@Repository
public interface NewsRepository extends CrudRepository<News, Long> {

}
