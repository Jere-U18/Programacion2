package com.uce;

import com.uce.funciones.CalculadoraIMC;
import com.uce.funciones.ClaseEstatica;
import com.uce.funciones.Implementacion;
import com.uce.objetos.Alumno;
import com.uce.objetos.Book;
import com.uce.objetos.Persona;

public class Main {
    public static void main(String[] args) {
        
        //Implementacion classImplementacion = new Implementacion();
        //classImplementacion.stop = 10;
        //classImplementacion.factorial();        
        //System.out.println("El factorial es " + classImplementacion.factorial);
        
        /*
        Persona juan = new Persona();
        juan.setNombre( "Juan");
        juan.apellido = "Perez";
        juan.edad = 30;
        juan.dinero = 40;
        //juan.hablar();
        
        juan.dinero = 30;
        juan.setNombre( "Carlos");
        //juan.hablar();
                
        Persona pedro = new Persona();
        pedro.setNombre("Pedro");
        pedro.apellido = "Gomez";
        pedro.edad = 25;
        pedro.dinero = 30;
        //pedro.hablar();
        
        pedro = juan;
        pedro.hablar();
        
        Persona mario = pedro;
        mario.hablar();
        mario.setNombre("Mario");
        pedro.hablar();
        
        System.out.println(mario.equals(juan));
         */
        
        /*
        Alumno alumno1 = new Alumno();
        System.out.println(alumno1.getNombre());
        
        
        Alumno alumno2 = new Alumno(1701456342, "Ana", 20, 170, 154);
        
        CalculadoraIMC imc = new CalculadoraIMC();
        double resultado = imc.calcularIMC(alumno2.getPeso(), alumno2.getEstatura());
        double resultado2 = imc.calcularIMC(alumno2.pesoEnKg(), alumno2.estaturaEnMetros());
        
        System.out.println("El IMC de " + alumno2.getNombre() + " con el primer método es " + resultado);   
        System.out.println("El IMC de " + alumno2.getNombre() + " con el segundo método es " + resultado2);    
         */
        
        
        System.out.println(ClaseEstatica.atributoEstatico);
        ClaseEstatica claseEstatica = new ClaseEstatica();
        claseEstatica.metodoEstatico();
        
        Book libro1 = new Book();
        
        System.out.println(ClaseEstatica.atributoEstatico);
        
    } 
}
