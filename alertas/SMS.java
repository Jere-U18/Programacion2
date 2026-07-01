package com.uce.alertas;

public final class SMS implements Alerta{

    @Override
    public void enviarAlerta(String mensaje) {
        verificarConexion();
       System.out.println("Envando una alerta por SMS: "+mensaje);
    }

    
    
}
