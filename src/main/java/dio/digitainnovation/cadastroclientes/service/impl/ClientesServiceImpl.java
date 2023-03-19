package dio.digitainnovation.cadastroclientes.service.impl;

import dio.digitainnovation.cadastroclientes.entity.Cliente;
import dio.digitainnovation.cadastroclientes.repository.ClienteRepository;
import dio.digitainnovation.cadastroclientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientesServiceImpl implements ClienteService {


    @Autowired
    private ClienteRepository clienteRepository;




    @Override
    public Cliente create(Cliente cliente) {
        Cliente clientes = new Cliente();
        clientes.setNome(clientes.getNome());
        clientes.setCpf(clientes.getCpf());
        clientes.setBairro(clientes.getBairro());
        clientes.setDataDeNascimento(clientes.getDataDeNascimento());
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente getById(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public Cliente get(Long id) {

        return null;
    }

    @Override
    public Iterable<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente update(Long id, Cliente cliente) {
        Optional<Cliente> clientes = clienteRepository.findById(id);
        if(clientes.isPresent()){
            return clienteRepository.save(cliente);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }
}
