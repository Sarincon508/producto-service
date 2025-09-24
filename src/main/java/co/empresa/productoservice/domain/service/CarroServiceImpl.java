package co.empresa.productoservice.domain.service;

import co.empresa.productoservice.domain.model.Carro;
import co.empresa.productoservice.domain.repository.ICarroRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Clase que implementa los métodos de la interfaz ICarroService
 * para realizar las operaciones de negocio sobre la entidad Carro
 */
@Service
public class CarroServiceImpl implements ICarroService {

    private final ICarroRepository carroRepository;

    public CarroServiceImpl(ICarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    @Override
    @Transactional
    public Carro save(Carro carro) {
        return carroRepository.save(carro);
    }

    @Override
    @Transactional
    public void delete(Carro carro) {
        carroRepository.delete(carro);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Carro> findById(Long id) {
        return carroRepository.findById(id);
    }

    @Override
    @Transactional
    public Carro update(Carro carro) {
        return carroRepository.save(carro);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Carro> findAll() {
        return carroRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Carro> findAll(Pageable pageable) {
        return carroRepository.findAll(pageable);
    }
}