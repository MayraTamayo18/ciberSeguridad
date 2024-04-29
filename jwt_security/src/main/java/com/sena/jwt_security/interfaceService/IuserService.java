package com.sena.jwt_security.interfaceService;

import java.util.List;

import com.sena.jwt_security.model.user;

public interface IuserService {

    public String save (user user);
    public List<user>findAll(); 

}
