package ibmtal.hepsiburada.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.hepsiburada.business.services.ColorService;
import ibmtal.hepsiburada.entities.Color;

@RestController
@RequestMapping("api/color")
public class ColorController {
	private ColorService colorService;
	@Autowired
	public ColorController(ColorService colorService) {
		super();
		this.colorService = colorService;
	}
	@PostMapping("addColor")
	@GetMapping
	public Color addNewColor(@RequestBody Color color) {
		return this.colorService.add(color);
	}
	
	@GetMapping("/getAll")
	public ArrayList<Color> getAll(){
		return this.colorService.getAll();
	}
}
