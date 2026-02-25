package ibmtal.hepsiburada.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.hepsiburada.business.services.CountryService;
import ibmtal.hepsiburada.core.result.Result;
import ibmtal.hepsiburada.database.CountryDao;
import ibmtal.hepsiburada.entities.Country;

@Service
public class CountryManager implements CountryService {
	private CountryDao countryDao;
	private Result<Country> result;
	
	@Autowired
	public CountryManager(CountryDao countryDao) {
		super();
		this.countryDao = countryDao;
		this.result=new Result<Country>();
	}


	@Override
	public Country add(Country country) {
		Country newCountry=this.countryDao.save(country);
		return newCountry;
	}


	@Override
	public ArrayList<Country> getAll() {
		return null;  
	}


	@Override
	public Result<Country> getCountry() {
       this.result.setData((ArrayList<Country>)this.countryDao.findAll());
		return null; 
	}

}
