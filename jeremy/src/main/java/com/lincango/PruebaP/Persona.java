package com.lincango.PruebaP;

public class Persona {
    
    private String nombre;

    static{

        System.out.println("[Sistema]Cargando infraestructura de Persona...");
    }

    {
        System.out.println("[Persona] Inicializando datos basicos del individuo...");

    }

    public Persona(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){

        this.nombre=nombre;
        
    }
}
