package org.example.petspringdemo.controller;


import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.entity.UserInfo;
import org.example.petspringdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/insert/*")
    public void insert(UserInfo userInfo){
        userService.insertUser(userInfo);
    }

    @RequestMapping("/check/*")
    public boolean check(String account){
        //userService.checkUserName(username);
        return userService.checkAccount(account);
    }

    @RequestMapping("/verify/*")
    public int verify(String account,String password){
        return userService.verify(account,password);
    }

    @RequestMapping("/getUserInformation/*")
    public List<UserInfo> getUserInformation(String account, String password) {
        return userService.getUserInformation(account, password);
    }

    @RequestMapping("/getAdoptedPetInformation/*")
    public List<PetInfo> getAdoptedPetInformation(String account, String password) {
        return userService.getAdoptedPetInformation(account, password);
    }
}
