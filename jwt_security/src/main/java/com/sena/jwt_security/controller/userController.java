package com.sena.jwt_security.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.jwt_security.interfaceService.IuserService;
import com.sena.jwt_security.model.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/v1/user")
public class userController {

	@Autowired
	private IuserService userService;

    // @GetMapping("/")
    // public String home() {
    //     return "Este es un END point privado del User";
    // }
    @PostMapping("/")
	public ResponseEntity<Object> save(
			@ModelAttribute("user") user user
			){
				// condicion para cuando ya exista el  registro 
			// 	List<user> listaPacienteActivo=userService.filtroEstado(user.getPaciente().getId_paciente());
			// if(listaPacienteActivo.size()!=0){
			// 	//ya tiene un registro activo
			// 	return new ResponseEntity<>("el paciente ya tiene un user activo",HttpStatus.BAD_REQUEST);		
			// }

			// List <user> listaCamausers=userService.filtroCama(user.getCama(), user.getHabitacion());
			// if(listaCamausers.size()!=0){
			// 	//ya tiene un registro activo
			// 	return new ResponseEntity<>("la cama y la habitación ya se encuentran ocupada",HttpStatus.BAD_REQUEST);		
			// }

			if (user.getRol().equals("")) {
				return new ResponseEntity<>("el rol es obligatorio", HttpStatus.BAD_REQUEST);
			}

			if (user.getPrimer_Nombre().equals("")) {
				return new ResponseEntity<>("el nombre es obligatorios", HttpStatus.BAD_REQUEST);
			}
			// if (user.getSegundo_Nombre().equals("")) {
			// 	return new ResponseEntity<>("la habitación es obligatoria", HttpStatus.BAD_REQUEST);
			// }
			if (user.getPrimer_Apellido().equals("")) {
				return new ResponseEntity<>("el apellido es obligatorio", HttpStatus.BAD_REQUEST);
			}
			// if (user.getSegundo_Apellido().equals("")) {
			// 	return new ResponseEntity<>("la fecha de salida es obligatoria", HttpStatus.BAD_REQUEST);
			// }
			if (user.getEmail().equals("")) {
				return new ResponseEntity<>("EL email es obligatorio", HttpStatus.BAD_REQUEST);
			}
			if (user.getClave().equals("")) {
				return new ResponseEntity<>("la clave es obligatoria", HttpStatus.BAD_REQUEST);
			}
			if (user.getConfirmacion_clave().equals("")) {
				return new ResponseEntity<>("la confirmacion de clave  es obligatoria", HttpStatus.BAD_REQUEST);
			}
			if (user.getTelefono().equals("")) {
				return new ResponseEntity<>("El telefono es obligatorio", HttpStatus.BAD_REQUEST);
			}
			userService.save(user);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	@GetMapping("/")
	public ResponseEntity<Object> findAll(){
		var listauser=userService.findAll();
		return new ResponseEntity<>(listauser, HttpStatus.OK);
	}
}
