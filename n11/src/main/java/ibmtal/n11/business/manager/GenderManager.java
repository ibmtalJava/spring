package ibmtal.n11.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ibmtal.n11.business.services.GenderService;
import ibmtal.n11.core.result.Result;
import ibmtal.n11.database.GenderDao;
import ibmtal.n11.entities.Gender;
@Service
public class GenderManager implements GenderService {
	private GenderDao genderDao;
	private Result<Gender> result;
	
	@Autowired
	public GenderManager(GenderDao genderDao) {
		super();
		this.genderDao = genderDao;
		result=new Result<Gender>();
	}
	@Override
	public Result<Gender> getAll() {
		// TODO Auto-generated method stub
		ArrayList<Gender> genders=(ArrayList<Gender>)this.genderDao.findAll();
		result.setData(genders);
		return result;
	}
	
}
