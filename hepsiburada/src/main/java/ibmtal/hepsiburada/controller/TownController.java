package ibmtal.hepsiburada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.hepsiburada.business.services.TownService;
import ibmtal.hepsiburada.core.result.Result;
import ibmtal.hepsiburada.entities.Town;

@RestController
@RequestMapping("/api/town")
public class TownController {
	private TownService townService;
	@Autowired
	public TownController(TownService townService) {
		super();
		this.townService = townService;
	}
	@GetMapping("/getAll")
	public Result<Town> getAll(){
		return this.townService.getAll();
	}
	

}
