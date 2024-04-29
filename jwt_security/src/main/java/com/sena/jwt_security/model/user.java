package com.sena.jwt_security.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "user")

public class user {

   	@Id
    @GeneratedValue(strategy = GenerationType.UUID)// generador de id automatico 

    //generar las columnas en la vista

	@Column(name = "id_Usuario", nullable = false, length = 36)
	private String id_Usuario;

    @Column(name = "rol", nullable = false, length = 20)
	private String rol;

    @Column(name = "primer_Nombre", nullable = false, length = 30)
	private String primer_Nombre;

    @Column(name = "segundo_Nombre", nullable = false, length = 30)
	private String segundo_Nombre;

    @Column(name = "primer_Apellido", nullable = false, length = 30)
	private String primer_Apellido;

    @Column(name = "segundo_Apellido", nullable = false, length = 30)
	private String segundo_Apellido;

    @Column(name = "email", nullable = false, length = 100)
	private String email;

    @Column(name = "clave", nullable = false, length = 15)
	private String clave;

    @Column(name = "confirmacion_clave", nullable = false, length = 15 )
	private String confirmacion_clave;

    @Column(name = "telefono", nullable = false, length = 13)
	private String telefono;


    public user() {  // un costructor publico, para instanciar o crear objetos de tipo userModel 
		super();
	}; 

    public user( String id_Usuario, String rol,String primer_Nombre, String segundo_Nombre, String primer_Apellido, 
                      String segundo_Apellido, String email, String clave, String confirmacion_clave, String telefono ){

                        super(); //

                        this.id_Usuario= id_Usuario;
                        this.rol=rol;                               // source action: para generar los set get, costructores automaticos 
                        this.primer_Nombre= primer_Nombre;
                        this.segundo_Nombre=segundo_Nombre;
                        this.primer_Apellido=primer_Apellido;
                        this.segundo_Apellido=segundo_Apellido;
                        this.email=email;
                        this.clave=clave;
                        this.confirmacion_clave=confirmacion_clave; 
                        this.telefono=telefono; 
                      }

    public String getId_Usuario() {
        return id_Usuario;
    }
    
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


    public void setId_Usuario(String id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getPrimer_Nombre() {
        return primer_Nombre;
    }

    public void setPrimer_Nombre(String primer_Nombre) {
        this.primer_Nombre = primer_Nombre;
    }

    public String getSegundo_Nombre() {
        return segundo_Nombre;
    }

    public void setSegundo_Nombre(String segundo_Nombre) {
        this.segundo_Nombre = segundo_Nombre;
    }

    public String getPrimer_Apellido() {
        return primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        this.primer_Apellido = primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return segundo_Apellido;
    }

    public void setSegundo_Apellido(String segundo_Apellido) {
        this.segundo_Apellido = segundo_Apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getConfirmacion_clave() {
        return confirmacion_clave;
    }

    public void setConfirmacion_clave(String confirmacion_clave) {            
        this.confirmacion_clave = confirmacion_clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   
}
