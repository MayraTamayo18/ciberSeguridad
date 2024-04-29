package com.sena.jwt_security.model.seguridad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get ans setter 
@Builder 
@NoArgsConstructor // constructor sin argumentos o vacio 
@AllArgsConstructor // constructor con argumenos  

public class loginRequest {
    
    /*
     * este archivo contiene la estructura de la peticion de inicio de sesion 
     */

     String userName; 
     String password; 
}
