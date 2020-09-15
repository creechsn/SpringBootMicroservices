package com.plantplaces.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantplacesController {
	
	@RequestMapping("/start")
	public String Start(){
		
		return "start";
		
	}

}
