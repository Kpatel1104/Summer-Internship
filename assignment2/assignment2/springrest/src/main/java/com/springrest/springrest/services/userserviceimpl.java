package com.springrest.springrest.services;

import com.springrest.springrest.dao.userDao;
import com.springrest.springrest.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class userserviceimpl implements userservice {

    @Autowired
    private userDao userDao;

    //List<user> list;

    public userserviceimpl() {

       // list = new ArrayList<>();
        //list.add(new user(145, "Java", "ishu@gmail.com"));
        //list.add(new user(111, "isha", "isha@gmail.com"));

    }

    @Override
    public List<user> getusers() {

        return userDao.findAll();
    }

    public user getuser(Long userId) {
        //user u = null;
        //for (user user : list) {
          //  if(user.getId() == userId){
            //u = user;
           // break;
        //}
    //}
    return userDao.getOne(userId) ;
}

    @Override
    public user adduser(user user) {
        //list.add(user);
        userDao.save(user);
        return user;
    }

    @Override
    public user updateuser(user user) {
        //list.forEach(e -> {
          //  if (e.getId() == user.getId()){
            //    e.setName(user.getName());
              //  e.setEmail(user.getEmail()) ;
            //}
       // }) ;

        userDao.save(user);
        return user;
    }

    @Override
    public void deleteuser(Long parseLong){
        // list = this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
    user entity = userDao.getOne(parseLong);
    userDao.delete(entity);

    }

}
