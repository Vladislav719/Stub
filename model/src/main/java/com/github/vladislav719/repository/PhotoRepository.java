package com.github.vladislav719.repository;

import com.github.vladislav719.model.Photo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vladislav on 06.04.2015.
 */
@Repository
public interface PhotoRepository extends CrudRepository<Photo, Long> {
}
