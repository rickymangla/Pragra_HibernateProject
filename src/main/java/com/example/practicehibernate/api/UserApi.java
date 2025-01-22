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

    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users) {
        return userService.addUsers(users);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/findUserById/{id}")
    public Optional<User> findUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/findUsers")
    public List<User> findUsersByFirstName(@RequestParam String firstName) {
        return userService.findByFirstName(firstName);
    }

    @GetMapping("/findByEmail")
    public User findByEmail(@RequestParam String email) {
        return userService.findByEmail(email);
    }

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
