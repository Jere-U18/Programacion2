package com.lincango.PruebaP;

public class Miembro extends Persona{

    
    public int id;
    public static int contadorId=0;
    int[][]minutosPorEjercicio;

    

    static{
        System.out.println("[Sistema] Cargando extension especifica para Miembros...");
    }
    {
        contadorId++;
        this.id=contadorId;

        System.out.println("[Miembro] Registro deportivo detectado. Asignando ID correlativo: "+id);
    }

    public Miembro(String nombre) {
        super(nombre);
        
    }

    public void definirPlanSemanal(int[] ejerciciosPorDia){

        for(int j=0; j<ejerciciosPorDia.length;j++){
            int j1= ejerciciosPorDia[j];
            for(int i=0; i<minutosPorEjercicio.length;i++){     
            minutosPorEjercicio[i]= minutosPorEjercicio[j1];
        }
        }
        //profe me sale null, creo que es en definir plan o no se... :c
        //le intento de todas formas y no da :c

    }

    public int calcularTotalMinutos(){

        if(minutosPorEjercicio!=null){
            int cal=0;
            for(int j=0; j<minutosPorEjercicio.length;j++){
               int j1=minutosPorEjercicio[j].length;
               for(int k=0;k<j1; k++){
                 cal =minutosPorEjercicio[j][k];
               }
            }
            return cal;
        }else{
            System.out.println("No hay minutos");
            return 0;
        }

    }

    public int calcularTotalMinutos(int dia){
        int cal2=0;
        for(int i=0;i<minutosPorEjercicio.length; i++){
            cal2=minutosPorEjercicio[i][dia];
        }

        return cal2;

    }

    public int[][] getMinutosPorEjercicio(){
        return minutosPorEjercicio;
    }

    public int getId(){
        return id;

    }

}
