package ibmtal.n11.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.n11.business.services.GenderService;
import ibmtal.n11.core.result.Result;
import ibmtal.n11.entities.Gender;
@RestController
@RequestMapping("/api/gender")
public class GenderController {
	private GenderService genderService;
	@Autowired
	public GenderController(GenderService genderService) {
		super();
		this.genderService = genderService;
	}
	@GetMapping("/getAll")
	public Result<Gender> getAll(){
		return this.genderService.getAll();
	}
}
