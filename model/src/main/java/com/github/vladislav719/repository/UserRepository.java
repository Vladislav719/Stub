package com.github.vladislav719.repository;

import com.github.vladislav719.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Владислав on 03.04.2015.
 */
@Repository
public interface UserRepository  extends CrudRepository<User, Long> {

    @Query("from User u where u.login=?1")
    public User findUserByLogin(String login);

    @Query("from User u where u.email =?1")
    public User findUserByEmail(String email);
}
