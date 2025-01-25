//package com.example.practicehibernate.entity;
//
//import jakarta.persistence.*;
//
//import java.util.Date;
//
//@Entity
//@Table(name = "FITNESS_USER")
//public class User {
//
//    @Id
//    @Column(name = "USER_ID")
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column
//    private String firstName;
//
//    @Column
//    private String lastName;
//
//    @Column(unique = true, nullable = false)
//    private String email;
//
//    @Column
//    private Date createDate = new Date();
//
//    @Column
//    private Date updateDate = new Date();
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Date getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(Date createDate) {
//        this.createDate = createDate;
//    }
//
//    public Date getUpdateDate() {
//        return updateDate;
//    }
//
//    public void setUpdateDate(Date updateDate) {
//        this.updateDate = updateDate;
//    }
//
//    public User() {
//    }
//
////    @Override
////    public String toString() {
////        return "User{" +
////                "id=" + id +
////                ", firstName='" + firstName + '\'' +
////                ", lastName='" + lastName + '\'' +
////                ", createDate=" + createDate +
////                ", updateDate=" + updateDate +
////                '}';
////    }
//}
