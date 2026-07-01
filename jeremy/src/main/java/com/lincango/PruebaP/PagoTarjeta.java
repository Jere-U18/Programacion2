package com.lincango.PruebaP;

public class PagoTarjeta implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
      
        System.out.println("Cobrando $"+monto+" a la tarjeta de credito del miembro.");
    }


    
}
