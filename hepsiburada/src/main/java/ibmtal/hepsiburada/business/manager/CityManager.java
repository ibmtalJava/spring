package ibmtal.hepsiburada.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.hepsiburada.business.services.CityService;
import ibmtal.hepsiburada.core.result.ErrorItem;
import ibmtal.hepsiburada.core.result.Result;
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



	@Override
	public Result<City> newCity(City city) {
		Result result=new Result<City>();
		//city name i boş mu
		if(city.getName().isEmpty()) {
			result.addError(10, "name", "Boş geçilemez");
		}
		if(city.getName().length()>40) {
			result.addError(12, "name", "en fazla 40 karakter");
			
		}
		return result;
	}

}
