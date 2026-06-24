package com.uce.alerta;

public class Main {
    public static void main(String[] args) {
        
        Notificacion correo=new Correo();
        Notificacion sms=new SMS();
        Notificacion app=new APP();

        Notificador notificador = new Notificador();

        notificador.agregarNotificacion(correo);
        notificador.agregarNotificacion(sms);
        notificador.agregarNotificacion(app);

        notificador.enviarMensaje("usuario2342", "se realizo un retiro por $400");

        Notificacion recordatorio = new Recordatorio();
        recordatorio.alerta("", "");

        Recordatorio recordatorio2 = (Recordatorio)recordatorio;
        recordatorio2.nuevaAlerta();

        recordatorio2.verificarConexion();





    }
    
}
