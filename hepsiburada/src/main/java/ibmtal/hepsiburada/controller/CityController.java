package ibmtal.hepsiburada.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.hepsiburada.business.services.CityService;
import ibmtal.hepsiburada.core.result.Result;
import ibmtal.hepsiburada.entities.City;

@RestController
@RequestMapping("/api/city")
public class CityController {
	private CityService cityService;
	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	
	
	@GetMapping("addCityParam")
	public String addCityParam(
			@RequestParam String name
			,@RequestParam String plateCode
			,@RequestParam Boolean capital
		) {
		return "merhaba "+name;
	}
	@PostMapping("addCity")
	@GetMapping
	public City addCity(@RequestBody City city) {
		
		return cityService.add(city); 
	}
	@PostMapping("newCity")
	@GetMapping
	public Result<City> newCity(@RequestBody City city){
		return this.cityService.newCity(city);
	}
	
	@GetMapping("/getAll")
	public ArrayList<City> getAll(){
		return cityService.getAll();
	}

}
