package com.plantplaces.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * handle the /start endpoint
 * *@return
 */
@Controller
public class PlantplacesController {
	
	
	
	@RequestMapping("/start")
	public String Start(){
		
		return "start";
		
	}
	
	/**
	 * @author Administrator
	 * handle the /index endpoint
	 * *@return
	 */
	@RequestMapping("/index")
	public String Index(){
		
		return "index";
		
	}

}
