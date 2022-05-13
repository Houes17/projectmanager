package com.mycompany.projectmanager.web.controller;


import com.mycompany.projectmanager.repo.UserRepo;
import com.mycompany.projectmanager.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController implements Serializable {

    private final UserRepo userRepo;

    @Autowired
    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    
    @PostMapping("/login")
    public ResponseEntity<?>loginUser(@RequestBody User userData){
            System.out.println(userData);
        User user = userRepo.findByEmail(userData.getEmail());
        if(user.getPassword().equals(userData.getPassword()))
            return ResponseEntity.ok(user);
        
        return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }


    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutUser(HttpServletRequest request, HttpServletRequest response){
        return "redirect:/login";
    }
    
//    @PostMapping("/userSave")
//    public ResponseEntity<User>registerUser(@RequestBody User user){
//        return ResponseEntity.ok(userRepo.saveUser(user));
//    }
    
//    public User save (@PathVariable User user){
//            return userRepo.saveUser(user);
//        }
//    
    /*@GetMapping("/user")
    public List<User> findUser(){
        return userRepo.findAll();
    }*/
//    @CrossOrigin(origins = "*")
    @GetMapping("/usersList")
    public ResponseEntity<List<User>>findUser(){
        List<User> users = userRepo.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    
    
    

//    @PostMapping("/login")
//    public ResponseEntity<?>loginUser(@RequestBody User userData){
//            System.out.println(userData);
//        User user = userRepo.findByUsername(userData.getUsername());
//        if(user.getPassword().equals(userData.getPassword()))
//            return ResponseEntity.ok(user);
//        
//        return (ResponseEntity<?>) ResponseEntity.internalServerError();
//    }


}
