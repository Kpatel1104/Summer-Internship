package com.springrest.springrest.services;


import com.springrest.springrest.entity.user;

import java.util.List;

public interface userservice {

    public List<user> getusers();

    public user getuser(Long userId);

    public user adduser(user user);

    public user updateuser(user user);

    public void deleteuser(Long parselong);

    }

