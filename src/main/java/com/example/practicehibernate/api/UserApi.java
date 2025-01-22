package com.example.practicehibernate.api;

import com.example.practicehibernate.entity.User;
import com.example.practicehibernate.repo.UserRepo;
import com.example.practicehibernate.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserApi {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

//    @PostMapping("/addUser")
//    public User addUser(@RequestBody User user) {
//        return userRepo.save(user);
//    }

    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users) {
        return userService.addUsers(users);
    }

//    @PostMapping("/addUsers")
//    public List<User> addUsers(@RequestBody List<User> users) {
//        return userRepo.saveAll(users);
//    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

//    @GetMapping("/getAllUsers")
//    public List<User> getAllUsers() {
//        return userRepo.findAll();
//    }

    @GetMapping("/findUserById/{id}")
    public Optional<User> findUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

//    @GetMapping("/{id}")
//    public Optional<User> findById(@PathVariable Long id) {
//        return userRepo.findById(id);
//    }

//    @GetMapping("/findByfirstName")
//    public List<User> findByName(@RequestParam String name) {
//        return userRepo.findAll()
//                .stream().filter((a) -> a.getFirstName().equalsIgnoreCase(name)).collect(Collectors.toList());
//    }

//    @GetMapping("/findByFirstName")
//    public List<User>findByFirstName(@RequestParam String firstName) {
//        return userRepo.findUsersByFirstNameEqualsIgnoreCase(firstName);
//    }

    @GetMapping("/findUsers")
    public List<User> findUsersByFirstName(@RequestParam String firstName) {
        return userService.findByFirstName(firstName);
    }

    @GetMapping("/findByEmail")
    public User findByEmail(@RequestParam String email) {
        return userService.findByEmail(email);
    }

//    @PutMapping("/updateUser")
//    public User updateUser(@RequestBody User user) {
//        return userRepo.save(user);
//    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id) {
        boolean result = userService.deleteUser(id);
        if (result) {
            return "User deleted successfully";
        } else {
            return "User could not be deleted";
        }
    }

//    @DeleteMapping("deleteUser/{id}")
//    public String deleteUser(@PathVariable Long id) {
//        boolean result = userService.deleteUser(id);
//        if (result) {
//            return "User deleted successfully";
//        } else {
//            return "User could not be deleted";
//        }
//    }
}
