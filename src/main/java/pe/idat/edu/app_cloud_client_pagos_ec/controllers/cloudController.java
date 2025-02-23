package pe.idat.edu.app_cloud_client_pagos_ec.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cloudController {

    @Value("${mensaje:Default mensaje}")
    private String mensaje;

    @GetMapping("/mensaje")
    public String verMensajeCloud() {
        return mensaje;
    }
    @GetMapping("/realizar-pago/{idPedido}")
    public String procesarPago(@PathVariable Long idPedido) {
        return "Pago realizado de: " +idPedido;
}
}
