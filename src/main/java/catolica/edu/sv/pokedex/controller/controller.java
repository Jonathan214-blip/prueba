package catolica.edu.sv.pokedex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import catolica.edu.sv.pokedex.entities.entitiespokemon;
import catolica.edu.sv.pokedex.pokemonservices.ipokemon;
import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class controller {

    @Autowired
    private ipokemon pokemonservice;

    @Transactional(readOnly = true)
    @GetMapping("/pokemons")
    public List<entitiespokemon> getAllPokemons() {
        return pokemonservice.findAll();
    }


    @Transactional(readOnly = true)
    @GetMapping("/pokemons2")
    public List<entitiespokemon> getAllPokemons2() {
        return pokemonservice.findAll();
    }

    @Transactional
    @PostMapping("/pokemon")
    public entitiespokemon savePokemon(@RequestBody entitiespokemon pokemon) {
        return pokemonservice.save(pokemon);
    }
}
