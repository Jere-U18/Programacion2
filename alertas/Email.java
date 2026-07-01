package com.uce.alertas;

public non-sealed class Email implements Alerta {

    @Override
    public void enviarAlerta(String mensaje) {

        verificarConexion();
        System.out.println("Envando una alerta por correo: "+mensaje);
      
    }

    
    
    
}
