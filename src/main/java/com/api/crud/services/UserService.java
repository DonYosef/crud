package com.api.crud.services;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepositorio;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 @Service
public class UserService {
    
     @Autowired
     IUserRepositorio userRepositorio;
     
     public ArrayList<UserModel> getUsers(){
         return (ArrayList<UserModel>) userRepositorio.findAll();
     }
     
     public UserModel saveUser(UserModel user){
         return userRepositorio.save(user);
     }
     
     public Optional<UserModel> getById(Long id){
         return userRepositorio.findById(id);
     }
     
     public UserModel updateById(UserModel request, Long id){
         UserModel user = userRepositorio.findById(id).get();
         
         user.setFirstName(request.getFirstName());
         user.setLastName(request.getLastName());
         user.setEmail(request.getFirstName());
         
         userRepositorio.save(user);
         
         return user;
     }
     
     public Boolean deleteUser(Long id){
         try{
             
             userRepositorio.deleteById(id);
             return true;
             
         }catch(Exception e){
             return false;
         }
     }
     
}
