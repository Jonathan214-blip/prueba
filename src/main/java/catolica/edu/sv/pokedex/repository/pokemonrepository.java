package catolica.edu.sv.pokedex.repository;

import catolica.edu.sv.pokedex.entities.entitiespokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface pokemonrepository extends JpaRepository<entitiespokemon, Long> {
}