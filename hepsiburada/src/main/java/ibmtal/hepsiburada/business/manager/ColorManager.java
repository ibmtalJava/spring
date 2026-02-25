package ibmtal.hepsiburada.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.hepsiburada.business.services.ColorService;
import ibmtal.hepsiburada.core.result.Result;
import ibmtal.hepsiburada.database.ColorDao;
import ibmtal.hepsiburada.entities.Color;
@Service
public class ColorManager implements ColorService {
	private ColorDao colorDao;
	private Result<Color> result;
	
	@Autowired
	public ColorManager(ColorDao colorDao) {
		super();
		this.colorDao = colorDao;
		this.result=new Result<Color>();
		
	}
	@Override
	public Color add(Color color) {
		Color newColor=this.colorDao.save(color);
		return newColor;
	}
	@Override
	public ArrayList<Color> getAll() {
		// TODO Auto-generated method stub
		return (ArrayList<Color>)this.colorDao.findAll();
	}
	@Override
	public Result<Color> getColors() {
		this.result.setData((ArrayList<Color>)this.colorDao.findAll());
		return this.result; 
	}
	
}
