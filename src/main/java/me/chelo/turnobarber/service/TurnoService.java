package me.chelo.turnobarber.service;

import java.util.List;
import java.util.Optional;
import me.chelo.turnobarber.entity.Turno;
import me.chelo.turnobarber.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoService {
    
    @Autowired
    private TurnoRepository turnoRepo;
    
    public Turno saveTurno(Turno turno){
        return turnoRepo.save(turno);
    }
    
    public List<Turno> getAllTurnos(){
        return (List<Turno>) turnoRepo.findAll();
    }
    
    public Optional<Turno> getTurnoById(Long id){
        return turnoRepo.findById(id);
    }
    
    public void deleteTurno(Long id){
        turnoRepo.deleteById(id);
    }
    
}
