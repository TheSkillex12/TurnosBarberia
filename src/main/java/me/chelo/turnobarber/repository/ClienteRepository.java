package me.chelo.turnobarber.repository;

import me.chelo.turnobarber.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
