package ro.project.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ro.project.project.services.UserService;

import java.util.Date;



@Controller
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/addUser" , method= RequestMethod.POST)
    public ResponseEntity<?> addUser(@RequestParam(value="userIdName") String userIdName,@RequestParam(value="userAddress") String userAddress,@RequestParam(value="userEmail") String userEmail,@RequestParam(value="userTel") Long userTel,@RequestParam(value="userBirth") Date userBirth,@RequestParam(value="userFirstName") String userFirstName,@RequestParam(value="userLastName") String userLastName,@RequestParam(value="userPerson") String userPerson){
        return ResponseEntity.ok(userService.addUser(userIdName,userAddress,userEmail,userTel,userBirth,userFirstName,userLastName,userPerson));
    }


    @RequestMapping(value="/editUser" , method= RequestMethod.PUT)
    public ResponseEntity<?> editUser(@RequestParam(value="id") Long id,@RequestParam(value="userAddress") String userAddress,@RequestParam(value="userEmail") String userEmail,@RequestParam(value="userTel") Long userTel){
        return ResponseEntity.ok(userService.editUser(id,userAddress,userEmail,userTel));
    }

    @RequestMapping(value="/updateUserAddress" , method= RequestMethod.PUT)
    public ResponseEntity<?> updateUserAddress(@RequestParam(value="id") Long id,@RequestParam(value="userAddress") String userAddress){
        return ResponseEntity.ok(userService.updateUserAddress(id,userAddress));
    }

    @RequestMapping(value="/getUser" , method= RequestMethod.GET)
    public ResponseEntity<?> getUser(@RequestParam(value="id") Long id){
        return ResponseEntity.ok(userService.getUser(id));
    }

    @RequestMapping(value="/getAllUsers" , method= RequestMethod.GET)
    public ResponseEntity<?> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }


    @RequestMapping(value="/getUserByNameAndEmail" , method= RequestMethod.GET)
    public ResponseEntity<?> getUserByNameAndEmail(@RequestParam(value="userIdName") String userIdName,@RequestParam(value="userEmail") String userEmail){
        return ResponseEntity.ok(userService.getUserByNameAndEmail(userIdName,userEmail));
    }

    @RequestMapping(value="/getUserByPerson" , method= RequestMethod.GET)
    public ResponseEntity<?> getUserByPerson(@RequestParam(value="userPerson") String userPerson){
        return ResponseEntity.ok(userService.getUserByPerson(userPerson));
    }

    @RequestMapping(value="/delUser" , method= RequestMethod.DELETE)
    public ResponseEntity<?> delUser(@RequestParam(value="id") Long id){
        return ResponseEntity.ok(userService.delUser(id));
    }



}
