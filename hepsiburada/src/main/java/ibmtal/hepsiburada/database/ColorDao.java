package ibmtal.hepsiburada.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.hepsiburada.entities.Color;

public interface ColorDao extends JpaRepository<Color, Integer> {

}
