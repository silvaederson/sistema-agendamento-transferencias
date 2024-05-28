package io.github.silvaederson.controller;

import io.github.silvaederson.model.entity.TranferenciasContas;
import io.github.silvaederson.service.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transferencias")
public class TransferenciaController {
    @Autowired
    private Servico service;

    @PostMapping
    public TranferenciasContas agendarTransferencia(@RequestBody TranferenciasContas transferencia) {
        return service.agendarTransferencia(transferencia);
    }

    @GetMapping
    public List<TranferenciasContas> listarTransferencias() {
        return service.listarTransferencias();
    }
}
