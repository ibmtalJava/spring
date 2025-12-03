package ibmtal.hepsiburada.database;

import org.springframework.data.jpa.repository.JpaRepository;


import ibmtal.hepsiburada.entities.Country;

public interface CountryDao extends JpaRepository<Country, Integer> {

}
