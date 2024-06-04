package me.chelo.turnobarber.controller;

import java.util.List;
import me.chelo.turnobarber.entity.Barbero;
import me.chelo.turnobarber.service.BarberoService;
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
@RequestMapping("/api/barberos")
public class BarberoController {
    
    @Autowired
    private BarberoService barberServi;
    
    @PostMapping
    public Barbero createBarbero(@RequestBody Barbero barbero){
        return barberServi.saveBarbero(barbero);
    }
    
    @GetMapping
    public List<Barbero> getAllBarberos(){
        return barberServi.getAllBarberos();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Barbero> getBarberoById(@PathVariable Long id){
        return barberServi.getBarberoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBarbero(@PathVariable Long id){
        barberServi.deleteBarbero(id);
        return ResponseEntity.noContent().build();
    }
    
}
