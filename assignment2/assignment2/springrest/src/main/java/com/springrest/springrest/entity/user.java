package com.springrest.springrest.entity;

public class user {

    private Long id;
    private String name;
    //private String email;

    public user(long id, String name){
        super();
        this.id = id;
        this.name = name;
       // this.email = email;
    }

    public user(){
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   // public String getEmail() {
    //   return email;
   // }

    //public void setEmail(String email) {
     //   this.email = email;
    //}

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

