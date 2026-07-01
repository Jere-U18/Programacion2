package com.lincango.PruebaP;

public class PagoTransferencia implements MetodoPago{

    @Override
    public void procesarPago(double monto) {

        System.out.println("Procesando transferencia bancaria por un total de $"+monto);

    }
    
}
