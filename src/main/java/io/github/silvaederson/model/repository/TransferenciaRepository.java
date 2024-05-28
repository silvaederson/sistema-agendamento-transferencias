package io.github.silvaederson.model.repository;

import io.github.silvaederson.model.entity.TranferenciasContas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferenciaRepository extends JpaRepository<TranferenciasContas, Long> {
}
