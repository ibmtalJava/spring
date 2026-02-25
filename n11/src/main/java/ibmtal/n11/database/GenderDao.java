package ibmtal.n11.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.n11.entities.Gender;

public interface GenderDao extends JpaRepository<Gender, Integer> {

}
