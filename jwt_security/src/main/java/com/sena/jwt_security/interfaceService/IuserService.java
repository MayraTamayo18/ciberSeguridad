package com.sena.jwt_security.interfaceService;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.sena.jwt_security.model.user;

@Repository
public interface IuserService {

    public String save (user user);
    public List<user>findAll(); 

}
