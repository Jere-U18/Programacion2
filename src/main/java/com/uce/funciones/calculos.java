package com.uce.funciones;

public class calculos {

    

    

    public static void suma(int a,int b) {

        int result=a+b;

        System.out.println("la suma es: "+result);
    }

    public static void resta(int a,int b) {

        int result=a-b;

        System.out.println("la resta es: "+result);
    }

    public static void multiplicacion(int a,int b) {

        int result=a*b;

        System.out.println("la multiplicacion es: "+result);
    }

    public static double division(double a,double b) {
        
        double result=a/b;

        if(b==0){
            System.out.println("no existe division para ceroooo");
            return 0;
        }
        System.out.println("la divison es: "+result);
        return result;
    }

    public static int factorial(int a) {
        
        
        int factorial=1;

        for(int i=1; i<a;i++){
             factorial*=i;
        }
        
        //System.out.println("el factorial de "+a+" es: "+factorial);
        return factorial;
            


        
        
    }

    public static void piE(){

        final double pi=3.1415;
    final double eurler=2.7182;

        System.out.println("el valor de pi es: "+pi);
        System.out.println("el valor de eurler es: "+eurler);
    }

    

     

    

    
    
}
