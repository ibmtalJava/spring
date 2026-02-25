package ibmtal.hepsiburada.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.hepsiburada.entities.Town;

public interface TownDao extends JpaRepository<Town, Integer> {

}
