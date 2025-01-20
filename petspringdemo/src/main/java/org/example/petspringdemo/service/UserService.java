package org.example.petspringdemo.service;

import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.entity.UserInfo;

import java.util.List;

public interface UserService {
    void insertUser(UserInfo userInfo);

    boolean checkAccount(String account);

    int verify(String userName,String password);

    List<UserInfo> getUserInformation(String account,String password);

    List<PetInfo> getAdoptedPetInformation(String account,String password);
}
