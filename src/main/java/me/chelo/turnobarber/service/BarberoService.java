package me.chelo.turnobarber.service;

import java.util.List;
import java.util.Optional;
import me.chelo.turnobarber.entity.Barbero;
import me.chelo.turnobarber.repository.BarberoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BarberoService {
    
    @Autowired
    private BarberoRepository barberRepo;
    
    public Barbero saveBarbero(Barbero barbero){
        return barberRepo.save(barbero);
    }
    
    public List<Barbero> getAllBarberos(){
        return (List<Barbero>) barberRepo.findAll();
    }
    
    public Optional<Barbero> getBarberoById(Long id){
        return barberRepo.findById(id);
    }
    
    public void deleteBarbero(Long id){
        barberRepo.deleteById(id);
    }
}
