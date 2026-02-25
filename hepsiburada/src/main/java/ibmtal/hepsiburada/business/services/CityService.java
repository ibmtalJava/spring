package ibmtal.hepsiburada.business.services;

import java.util.ArrayList;

import ibmtal.hepsiburada.core.result.Result;
import ibmtal.hepsiburada.entities.City;

public interface CityService {
	City add(City city);
	ArrayList<City> getAll();
	Result<City> newCity(City city); 
	Result<City> getCities();
}
