package org.example.petspringdemo.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.entity.UserInfo;

import java.util.List;

@Mapper
public interface UserMapper {

    void insertUser(UserInfo userInfo);

    boolean checkAccount(String account);

    int verify(String account,String password);

    List<UserInfo> getUserInformation(String account,String password);

    List<PetInfo> getAdoptedPetInformation(String account,String password);
}
