package edu.infsci2560.controllers;

import edu.infsci2560.models.gameStation;
import edu.infsci2560.repositories.gameStationRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpHeaders;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class gameStationController {
    @Autowired
    private gameStationRepository repository;
    
    @RequestMapping(value = "gameStations", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("gameStations", "gameStations", repository.findAll());
    }
    
    @RequestMapping(value = "gameStations/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid gameStation gS, BindingResult result) {
        repository.save(gS);
        return new ModelAndView("gameStations", "gameStations", repository.findAll());
    }
    
}