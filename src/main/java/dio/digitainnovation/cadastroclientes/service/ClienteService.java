package dio.digitainnovation.cadastroclientes.service;

import dio.digitainnovation.cadastroclientes.entity.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente create(Cliente cliente);

    Cliente getById(Long id);

    Cliente get(Long id);

    abstract Iterable<Cliente> getAll();

    Cliente update(Long id, Cliente cliente);

    void delete(Long id);


}
