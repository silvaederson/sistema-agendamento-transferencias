package io.github.silvaederson.service;

import io.github.silvaederson.model.entity.TranferenciasContas;
import io.github.silvaederson.model.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class Servico {
    @Autowired
    private TransferenciaRepository repository;

    public TranferenciasContas agendarTransferencia(TranferenciasContas transferencia) {
        transferencia.setDataAgendamento(LocalDate.now());
        transferencia.setTaxa(calcularTaxa(transferencia.getValor(), transferencia.getDataTransferencia()));
        return repository.save(transferencia);
    }

    public List<TranferenciasContas> listarTransferencias() {
        return repository.findAll();
    }

    private double calcularTaxa(double valor, LocalDate dataTransferencia) {
        long dias = ChronoUnit.DAYS.between(LocalDate.now(), dataTransferencia);

        if (dias == 0) {
            return 3.00 + valor * 0.025;
        } else if (dias >= 1 && dias <= 10) {
            return 12.00;
        } else if (dias >= 11 && dias <= 20) {
            return valor * 0.082;
        } else if (dias >= 21 && dias <= 30) {
            return valor * 0.069;
        } else if (dias >= 31 && dias <= 40) {
            return valor * 0.047;
        } else if (dias >= 41 && dias <= 50) {
            return valor * 0.017;
        }

        throw new IllegalArgumentException("A data de transferência não está dentro do intervalo válido.");
    }

}
