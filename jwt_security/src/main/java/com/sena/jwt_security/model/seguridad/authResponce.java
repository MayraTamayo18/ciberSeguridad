package com.sena.jwt_security.model.seguridad;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // get ans setter 
@Builder 
@NoArgsConstructor// constructor sin argumentos o vacio 
@AllArgsConstructor // constructor con argumenos  


public class authResponce {
  /*este archivo contien las respuestas, cuando el usuario se 
  autentica cuando se inicia sesion se debe retornar el token 
   */  

   String status; 
   String message;
   String token; 
}
