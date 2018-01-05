package com.springcloud.config.dao;

import com.springcloud.config.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author luoxuri
 * @create 2017-12-06 16:04
 **/
@Repository
public interface UserDao extends CrudRepository<User, Long> {

}
