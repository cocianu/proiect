package ro.project.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ro.project.project.services.CarService;

@Controller
@CrossOrigin
public class CarController {
    
    @Autowired
    CarService carService;
    
    @RequestMapping(value="/addCar" , method= RequestMethod.POST)
    public ResponseEntity<?> addCar(@RequestParam(value ="carName") String carName,@RequestParam(value="id") Long id){
        return ResponseEntity.ok(carService.addCar(carName,id));
    }



}
