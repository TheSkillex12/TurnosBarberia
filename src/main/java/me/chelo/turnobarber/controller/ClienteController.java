package me.chelo.turnobarber.controller;

import java.util.List;
import me.chelo.turnobarber.entity.Cliente;
import me.chelo.turnobarber.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteServi;
    
    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteServi.saveCliente(cliente);
    }
    
    @GetMapping
    public List<Cliente> getAllClientes(){
        return clienteServi.getAllClientes();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id){
        return clienteServi.getClienteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    } 
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id){
        clienteServi.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }
    
}
