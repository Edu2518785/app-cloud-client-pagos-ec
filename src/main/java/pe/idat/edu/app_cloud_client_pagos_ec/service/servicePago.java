package pe.idat.edu.app_cloud_client_pagos_ec.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="app-cloud-client-pedidos-ec")
public interface servicePago {

    @GetMapping("*/docente")
    String obtenerPagopedidos();
}
