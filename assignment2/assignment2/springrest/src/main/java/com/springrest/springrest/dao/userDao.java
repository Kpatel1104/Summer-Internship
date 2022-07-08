package com.springrest.springrest.dao;

import com.springrest.springrest.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userDao extends JpaRepository<user, Long> {


}
