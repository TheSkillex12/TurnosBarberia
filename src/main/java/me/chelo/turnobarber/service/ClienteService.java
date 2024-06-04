package me.chelo.turnobarber.service;

import java.util.List;
import java.util.Optional;
import me.chelo.turnobarber.entity.Cliente;
import me.chelo.turnobarber.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepo;
    
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }
    
    public List<Cliente> getAllClientes(){
        return (List<Cliente>) clienteRepo.findAll();
    }
    
    public Optional<Cliente> getClienteById(Long id){
        return clienteRepo.findById(id);
    }
    
    public void deleteCliente(Long id){
        clienteRepo.deleteById(id);
    }
    
}
