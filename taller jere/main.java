package com.uce.taller;

public class main {

    public static void main(String[] args) {

        Curso [][]sucursales=new Curso[3][];

        sucursales[0]=new Curso[3];
        sucursales[1]=new Curso[6];
        sucursales[2]=new Curso[4];

        sucursales[0][0]=new Curso("Matematicas", 18);
        sucursales[0][1]=new Curso("Fisica", 25);
        sucursales[0][2]=new Curso("Quimica", 20);

        sucursales[1][0]=new Curso("Matematicas", 32);
        sucursales[1][1]=new Curso("Fisica", 15);
        sucursales[1][2]=new Curso("Quimica", 28);
        sucursales[1][3]=new Curso("Biologia", 32);
        sucursales[1][4]=new Curso("Historia", 32);
        sucursales[1][5]=new Curso("Geografia", 32);

        sucursales[2][0]=new Curso("Literatura", 18);
        sucursales[2][1]=new Curso("Artes", 25);
        sucursales[2][2]=new Curso("Botanica", 20);
        sucursales[2][3]=new Curso("Programacion", 34);

        char letraSucursal='A';

        for(int i=0;i<sucursales.length;i++){
            System.out.println("Sucursal "+letraSucursal+": ");
            for(int j=0;j<sucursales[i].length;j++){
                System.out.println(" "+ sucursales[i][j]);
            }
            letraSucursal++;
        }



        //int rd =(int)(Math.random()*35-20+1)+20;
       // System.out.println(rd);
    }
    
}
