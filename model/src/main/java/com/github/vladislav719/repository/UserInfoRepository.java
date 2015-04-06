package com.github.vladislav719.repository;

import com.github.vladislav719.model.Photo;
import com.github.vladislav719.model.User;
import com.github.vladislav719.model.UserInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vladislav on 06.04.2015.
 */
@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {

    @Query("select userInfo from UserInfo userInfo where userInfo.user.userId=?1")
    public UserInfo getUserInfo(Long userId);

    @Query("select user.userPhoto from UserInfo user where user.id=?1")
    public Photo getUserPhoto(Long id);



}
