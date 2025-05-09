package catolica.edu.sv.pokedex.pokemonservices;

import catolica.edu.sv.pokedex.entities.entitiespokemon;
import java.util.List;

public interface ipokemon {
    List<entitiespokemon> findAll();
    entitiespokemon save(entitiespokemon pokemon);
}