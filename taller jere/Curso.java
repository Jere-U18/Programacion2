package com.uce.taller;

import java.util.Random;

public final class Curso {

    private final String nombreCurso; 
    private final int cantMax;
    private final int cantInscritos;

    public Curso(String nombreCurso,int cantInscritos){
        this.nombreCurso=nombreCurso;
        Random random=new Random();
        int rd =random.nextInt(35-20+1)+20;
       //int rd =(int)(Math.random()*35-20 + 1) +20;
       this.cantMax=rd;

       if (cantInscritos>rd){
        System.out.println("El numero de alumnos no puede exceder a ["+rd+"]");
        this.cantInscritos=rd;
       }else{
        this.cantInscritos=cantInscritos;
       }
    }

    public String getNombreCurso(){
        return nombreCurso;
    }

    public int getCantMax(){
        return cantMax;
    }

    public int getCantInscitos(){
        return cantInscritos;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Curso: [ "+nombreCurso+" ],  Inscritos: [ "+cantInscritos+" ],  Capacidad Maxima: [ "+cantMax+" ]";
    }
    
}
