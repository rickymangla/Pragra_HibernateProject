//package com.example.practicehibernate.service;
//
//import com.example.practicehibernate.entity.User;
//import com.example.practicehibernate.repo.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepo repo;
//
//    public User addUser(User user) {
//        return repo.save(user);
//    }
//
//    public List<User> addUsers(List<User> users) {
//        return repo.saveAll(users);
//    }
//
//    public List<User> getAllUsers() {
//        return repo.findAll();
//    }
//
//    public Optional<User> findById(Long id) {
//        return repo.findById(id);
//    }
//
//    public List<User> findByFirstName(String firstName) {
//        return repo.findUsersByFirstNameEqualsIgnoreCase(firstName);
//    }
//
//    public User findByEmail(String email) {
//        return repo.findUserByEmail(email);
//    }
//
//    public User updateUser(User user) {
//        return repo.save(user);
//    }
//
//    public boolean deleteUser(Long id) {
//        if (repo.findById(id).isPresent()) {
//            repo.deleteById(id);
//            return true;
//        } else {
//            return false;
//        }
//    }
//}
