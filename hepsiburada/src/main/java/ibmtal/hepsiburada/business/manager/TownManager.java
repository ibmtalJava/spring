package ibmtal.hepsiburada.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.hepsiburada.business.services.TownService;
import ibmtal.hepsiburada.core.result.Result;
import ibmtal.hepsiburada.database.CityDao;
import ibmtal.hepsiburada.database.TownDao;

import ibmtal.hepsiburada.entities.Town;

@Service
public class TownManager implements TownService {
	private TownDao townDao;
	private CityDao cityDao;
	private Result<Town> result;
	@Autowired
	public TownManager(TownDao townDao, CityDao cityDao) {
		super();
		this.townDao = townDao;
		this.cityDao = cityDao;
		this.result=new Result<Town>();
	}
	@Override
	public Result<Town> getAll() {
		// TODO Auto-generated method stub
		result.setData((ArrayList<Town>)this.townDao.findAll());
		return this.result;
	}
	
}
