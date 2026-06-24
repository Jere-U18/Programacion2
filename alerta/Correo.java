package com.uce.alerta;

public class Correo implements Notificacion{

    @Override
    public void verificarConexion(){
        System.out.println("Verificando conexion del canal Correo...");
    }

    @Override
    public void alerta(String destino, String mensaje) {
        verificarConexion();
        System.out.println("Correo: "+destino+"este es un mensaje que, ");

    }

    
}
