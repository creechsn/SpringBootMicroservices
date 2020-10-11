package com.plantplaces.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.service.ISpecimenService;
import com.plantplaces.service.SpecimenServiceStub;

/**
 * @author Administrator
 * handle the /start endpoint
 * *@return
 */
@Controller

public class PlantplacesController {
	
	@Autowired
	private ISpecimenService specimenServiceStub;
	
	
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public SpecimenDTO read(Model model){
		SpecimenDTO specimenDTO = specimenServiceStub.fetchbyId(43);
		model.addAttribute("specimenDTO", specimenDTO);
		return specimenDTO;
		
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJSON(){
		
		return "start";
		
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String addSpecimen(Model model, @RequestParam(value="latitude", required=false, defaultValue="0.0") String latitude){
		SpecimenDTO specimenDTO = specimenServiceStub.fetchbyId(43);
		specimenDTO.setLatitude(latitude);
		model.addAttribute("specimenDTO", specimenDTO);
		return "start";
		
	}
	
	
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=blue"})
	public String readBlue(){
		
		return "start";
		
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=silver"})
	public ModelAndView readSilver(){
		
		SpecimenDTO specimenDTO = specimenServiceStub.fetchbyId(43);
		specimenDTO.setSpecimenID(90);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("start");
		modelAndView.addObject("specimenDTO", specimenDTO);
		
		return modelAndView;
		
	}
	
	@PostMapping("/start")
	public String create(){
		
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
