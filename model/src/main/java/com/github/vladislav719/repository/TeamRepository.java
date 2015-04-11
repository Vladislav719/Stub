package com.github.vladislav719.repository;

import com.github.vladislav719.model.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Владислав on 04.04.2015.
 */
@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

//    @Query("from Team t where t.teamName=?1 ")
    public Team findByTeamNameIgnoreCase(String teamName);
}
