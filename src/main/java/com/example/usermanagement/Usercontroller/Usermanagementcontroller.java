package com.example.usermanagement.Usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usermanagement.Usermodel.Usermanagementmodel;
import com.example.usermanagement.Userservice.Usermanagementservice;

@RestController
@RequestMapping("/api/usermanagement")
public class Usermanagementcontroller {
   
    @Autowired
    private Usermanagementservice service;
     @GetMapping("/userid/{userid}")
     public Usermanagementmodel getUser(@PathVariable int userid){
        return service.getUser(userid);
     }
    
     @GetMapping("/findalluser")
     public List<Usermanagementmodel> getAllusers(){
        return service.getAllusers();
     }
     @PostMapping("/addusers")
     public void addUser(@RequestBody Usermanagementmodel user){
        service.addUser(user);

     }

     @PutMapping("/update-user/userid/{id}")
     public void updateuser(@PathVariable int id,@RequestBody Usermanagementmodel userput) {
         service.updateUser(id,userput);
     }
 
     
     @DeleteMapping("/delete-user/userid/{id}")
     public void deleteuser(@PathVariable int id) {
         service.deleteUser(id);
     }
}
