package dio.digitainnovation.cadastroclientes.controller;


import dio.digitainnovation.cadastroclientes.entity.Cliente;
import dio.digitainnovation.cadastroclientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable <Cliente>> getAll(){
        return ResponseEntity.ok(clienteService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente){
            clienteService.create(cliente);
            return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.update(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> delete(@PathVariable Long id){
        clienteService.delete(id);
        return ResponseEntity.ok().build();
    }



}
