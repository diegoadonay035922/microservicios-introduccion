package com.microservicios.moto_service.repositorio;

import com.microservicios.moto_service.entidades.Moto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotoRepository extends JpaRepository<Moto, Integer> {
    List<Moto> findByUsuarioId(int usuarioId);
}
