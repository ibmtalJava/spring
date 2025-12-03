package ibmtal.hepsiburada.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.hepsiburada.entities.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
