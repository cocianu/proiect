package ro.project.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.project.project.models.User;
import java.util.ArrayList;
import java.util.Date;


import java.util.List;
import java.util.Optional;
import ro.project.project.repositories.UserRepository;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public boolean addUser(String userIdName,String userAddress,String userEmail, Long userTel, Date userBirth,String userFirstName,String userLastName,String userPerson){
        User user = new User();
        user.setUserName(userIdName);
        user.setUserAddress(userAddress);
        user.setUserEmail(userEmail);
        user.setUserTel(userTel);
        user.setUserBirth(userBirth);
        user.setUserFirstName(userFirstName);
        user.setUserLastName(userLastName);
        user.setUserPerson(userPerson);
        userRepository.save(user);
        return true;
    }

    public boolean delUser(Long id){
        userRepository.deleteById(id);
        return true;

    }


    public boolean editUser(Long id, String userAddress, String userEmail, Long userTel){
        User user = userRepository.getOne(id);
        user.setUserAddress(userAddress);
        user.setUserEmail(userEmail);
        user.setUserTel(userTel);
        userRepository.save(user);
        return true;
    }

    public boolean updateUserAddress(Long id, String userAddress){
        User user = userRepository.getOne(id);
        user.setUserAddress(userAddress);
        userRepository.save(user);
        return true;
    }



    public Optional<User> getUser(Long id){
        return userRepository.findById(id);

    }

    public List<User> getAllUsers(){
        return new ArrayList<>(userRepository.findAll());
    }

    public Optional<User> getUserByNameAndEmail(String userIdName,String userEmail){
        return userRepository.findUserByNameAndEmail(userIdName,userEmail);
    }

    public List<User> getUserByPerson(String userPerson){
        return userRepository.findUserByPerson(userPerson);
    }

}
