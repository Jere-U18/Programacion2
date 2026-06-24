package com.uce.alerta;

interface Notificacion {


    void alerta(String destino, String mensaje);

    default void verificarConexion(){
        System.out.println("Verificando la señal del canal por defecto");
    }
    
}
