package ibmtal.hepsiburada.business.services;

import java.util.ArrayList;

import ibmtal.hepsiburada.entities.City;

public interface CityService {
	City add(City city);
	ArrayList<City> getAll();
}
