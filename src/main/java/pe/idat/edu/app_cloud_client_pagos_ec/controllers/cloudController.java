package pe.idat.edu.app_cloud_client_pagos_ec.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.edu.app_cloud_client_pagos_ec.service.servicePago;

@RestController
public class cloudController {

    @Value("${mensaje:Default mensaje}")
    private String mensaje;

    @GetMapping("/mensaje")
    public String verMensajeCloud() {
        return mensaje;
    }
}
