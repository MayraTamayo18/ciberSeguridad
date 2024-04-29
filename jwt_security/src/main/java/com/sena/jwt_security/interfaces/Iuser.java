package com.sena.jwt_security.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sena.jwt_security.model.user;



@Repository
public interface Iuser extends CrudRepository<user,String> {
    
}
