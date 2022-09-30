package com.co.example.walter.Users;

import lombok.AllArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
public class DataBaseFake {

    public List<Users> database;

    public void addUser(Users users){
        database.add(users);
    }

    public Users getUser(Integer id){
        for (Users users : database) {
           if(users.getId() == id){
               return users;
           }
        }

        return null;
    }
}
