package com.uce.alerta;

public class APP implements Notificacion{

    @Override
    public void verificarConexion(){
        System.out.println("Verificando conexion del canal APP...");
    }

    @Override
    public void alerta(String destino, String mensaje) {
        verificarConexion();
        System.out.println("APP: "+destino+"este es un mensaje que, ");

    }

    
    
}
