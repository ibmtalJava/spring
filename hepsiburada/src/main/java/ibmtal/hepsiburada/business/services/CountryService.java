package ibmtal.hepsiburada.business.services;


import java.util.ArrayList;

import ibmtal.hepsiburada.core.result.Result;
import ibmtal.hepsiburada.entities.Country;

public interface CountryService {
	Country add(Country country);
	ArrayList<Country> getAll();
	Result<Country> getCountry();
	
	
	
}
