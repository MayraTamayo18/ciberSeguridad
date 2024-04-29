package com.sena.jwt_security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.jwt_security.interfaceService.IuserService;
import com.sena.jwt_security.interfaces.Iuser;
import com.sena.jwt_security.model.user;

@Service
public class userService implements IuserService {

    @Autowired //proporciona control a la hora de querer inyectar nuestras dependencias o instancias 
    private Iuser data;


    @Override
    public String save(user user) {
        data.save(user); 
        return user.getId_Usuario();
    }

    @Override
    public List<user> findAll(){
       List<user> ListaUser=
       (List<user>)data.findAll(); 
       return ListaUser; 
    }

   
}
