package com.example.usermanagement.Userservice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.example.usermanagement.Usermodel.Usermanagementmodel;
@Service
public class Usermanagementservice {
    static List<Usermanagementmodel> users = new ArrayList<>();

    static{
        users.add(new Usermanagementmodel(01,"Arun","Arun6121143","Veraval","99999999999999"));
        users.add(new Usermanagementmodel(02,"Arun1","Arun6121144","Rajkot","9999999999999"));
        users.add(new Usermanagementmodel(03,"Arun2","Arun6121145","Banglore","999999999999"));
        users.add(new Usermanagementmodel(04,"Arun3","Arun6121146","Ahemdabad","99999999999"));
    }

    public Usermanagementmodel getUser(int userid) {
        return users.stream().filter(t -> t.getUserid() == userid).findFirst().get();
    }

    public void addUser(Usermanagementmodel user){
        users.add(user);
    }

    public List<Usermanagementmodel> getAllusers(){
        return users;

    }
    public void deleteUser(int id) {
        Predicate<? super Usermanagementmodel> predicate = todo -> todo.getUserid() == id;
        users.removeIf(predicate);
    }

    public void updateUser(int id,Usermanagementmodel newUser) {
       

        Usermanagementmodel user=getUser(id);

        user.setUserid(newUser.getUserid());
        user.setName(newUser.getName());
        user.setUsername(newUser.getUsername());
    }
}
