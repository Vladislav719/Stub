package com.github.vladislav719.repository;

import com.github.vladislav719.model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vladislav on 06.04.2015.
 */
@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
}
