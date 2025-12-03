package ibmtal.hepsiburada.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.hepsiburada.business.services.CityService;
import ibmtal.hepsiburada.database.CityDao;
import ibmtal.hepsiburada.entities.City;
@Service
public class CityManager implements CityService {
	private CityDao cityDao;
	
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}



	@Override
	public City add(City city) {	
		City newCity=this.cityDao.save(city);
		return newCity;
	}



	@Override
	public ArrayList<City> getAll() {
		// TODO Auto-generated method stub
		return (ArrayList<City>) this.cityDao.findAll();
	}

}
