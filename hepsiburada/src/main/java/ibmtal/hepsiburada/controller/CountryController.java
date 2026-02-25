package ibmtal.hepsiburada.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.hepsiburada.business.services.CountryService;
import ibmtal.hepsiburada.core.result.Result;
import ibmtal.hepsiburada.entities.City;
import ibmtal.hepsiburada.entities.Country;

@RestController
@RequestMapping("/api/country")
public class CountryController<Conuntry> {
	private CountryService countryService;
	@Autowired
	public CountryController(CountryService countryService) {
		super();
		this.countryService = countryService;
	}
	@PostMapping("addCountry")
	@GetMapping
	public Country addCountry(@RequestBody Country country) {
		
		return this.countryService.add(country);
       			
   }
	@GetMapping("/getAll")
	public ArrayList<Country> getAll(){	
	return this.countryService.getAll();
	}
	@GetMapping("/getCountry")
	public Result<Country> getCountry(){
		return this.countryService.getCountry();
	}

}
