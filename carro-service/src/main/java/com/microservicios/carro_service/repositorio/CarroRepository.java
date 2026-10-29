package com.microservicios.carro_service.repositorio;

import com.microservicios.carro_service.entidades.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {
    List<Carro> findByUsuarioId(int usuarioId);
}
