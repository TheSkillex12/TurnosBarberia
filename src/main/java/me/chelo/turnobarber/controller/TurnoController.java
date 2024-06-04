package me.chelo.turnobarber.controller;

import java.util.List;
import me.chelo.turnobarber.entity.Turno;
import me.chelo.turnobarber.service.TurnoService;
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
@RequestMapping("/api/turnos")
public class TurnoController {
    
    @Autowired
    private TurnoService turnoServi;
    
    @PostMapping
    public Turno createTurno(@RequestBody Turno turno){
        return turnoServi.saveTurno(turno);
    }
    
    @GetMapping
    public List<Turno> getAllTurnos(){
        return turnoServi.getAllTurnos();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Turno> getTurnoById(@PathVariable Long id){
        return turnoServi.getTurnoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTurno(@PathVariable Long id){
        turnoServi.deleteTurno(id);
        return ResponseEntity.noContent().build();
    }
    
}
