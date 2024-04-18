package com.api.crud.repositories;

import com.api.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepositorio extends JpaRepository<UserModel, Long>{

    //public UserModel save;
    
    
    
}
