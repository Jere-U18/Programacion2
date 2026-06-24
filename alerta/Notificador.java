package com.uce.alerta;

public class Notificador {

    private final int MAX_ITEMS=3;
    private int contadorMensajes=0;
    Notificacion[]alertas;

 

    public Notificador(){

        alertas=new Notificacion[MAX_ITEMS];

    }

    public void agregarNotificacion(Notificacion notificacion){

       if (contadorMensajes < MAX_ITEMS) {
        
           alertas[contadorMensajes]=notificacion;
           contadorMensajes++;
       } else {
          
           System.err.println("¡Alerta! No puede agregar mas mensajes ");
       }
   }

   public void enviarMensaje(String destino,String mensaje){

    for(int i=0;i<alertas.length;i++){
        alertas[i].alerta(destino,mensaje);
    }

   }
        

    }
    

