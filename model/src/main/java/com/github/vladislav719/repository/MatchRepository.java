package com.github.vladislav719.repository;

import com.github.vladislav719.model.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vladislav on 11.04.2015.
 */
@Repository
public interface MatchRepository extends CrudRepository<Match, Long> {
}