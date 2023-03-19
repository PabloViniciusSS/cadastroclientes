package dio.digitainnovation.cadastroclientes.repository;

import dio.digitainnovation.cadastroclientes.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}

