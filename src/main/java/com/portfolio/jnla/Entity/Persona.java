package com.portfolio.jnla.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity 
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
   private int id;
    
    @NotNull 
    @Size(min = 1, max = 50, message = "no cumple con longitud")
   private String nombre;
    
    @NotNull 
    @Size(min = 1, max = 50, message = "no cumple con longitud")
   private String apellido;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con longitud")
    private String sobremi;
    
    @Size(min = 1, max = 250, message = "no cumple con longitud")
   private String img;

    //CONSTRUCTORES
    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String sobremi, String img) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobremi = sobremi;
        this.img = img;
    }

    //GETTER Y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSobremi() {
        return sobremi;
    }

    public void setSobremi(String sobremi) {
        this.sobremi = sobremi;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}
