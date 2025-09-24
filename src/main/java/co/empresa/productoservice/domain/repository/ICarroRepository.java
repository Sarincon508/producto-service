package co.empresa.productoservice.domain.repository;

import co.empresa.productoservice.domain.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface que hereda de JpaRepository para realizar las
 * operaciones de CRUD, paginación y ordenamiento sobre la entidad Carro
 */
public interface ICarroRepository extends JpaRepository<Carro, Long> {
}