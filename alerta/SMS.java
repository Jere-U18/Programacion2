package com.uce.alerta;

public class SMS implements Notificacion{

    @Override
    public void verificarConexion(){
        System.out.println("Verificando conexion del canal SMS...");
    }

    @Override
    public void alerta(String destino, String mensaje) {
        verificarConexion();
     System.out.println("SMS: "+destino+"este es un mensaje que, ");
    }

    

    

    
    
}
