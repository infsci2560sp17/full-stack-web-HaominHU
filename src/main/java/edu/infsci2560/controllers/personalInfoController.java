package edu.infsci2560.controllers;

import edu.infsci2560.models.personalInfo;
import edu.infsci2560.repositories.personalInfoRepository;
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
public class personalInfoController {
    @Autowired
    private personalInfoRepository repository;
    
    @RequestMapping(value = "personalInfos", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("personalInfos", "personalInfos", repository.findAll());
    }
    
    @RequestMapping(value = "personalInfos/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid personalInfo pI, BindingResult result) {
        repository.save(pI);
        return new ModelAndView("personalInfos", "personalInfos", repository.findAll());
    }
    
}