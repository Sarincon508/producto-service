package co.empresa.productoservice.domain.service;

import co.empresa.productoservice.domain.model.Carro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

/**
 * Interface que define los métodos que se pueden realizar sobre la entidad Carro
 */
public interface ICarroService {
    Carro save(Carro carro);
    void delete(Carro carro);
    Optional<Carro> findById(Long id);
    Carro update(Carro carro);
    List<Carro> findAll();
    Page<Carro> findAll(Pageable pageable);
}
