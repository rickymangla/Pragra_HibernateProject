package com.example.practicehibernate.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @Column(name = "EMPLOYEE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer employeeId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_department")
    private Department department;

    @OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_employee")
    private List<Orders> orders;

//    @ManyToOne
//    private Book book;

//    @ManyToMany
//    @JoinTable(name="empjotab",
//    joinColumns = @JoinColumn(name="empfk"),
//    inverseJoinColumns = @JoinColumn(name="jofk"))
//    private Set<Course> course;


    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

//    public Set<Course> getCourse() {
//        return course;
//    }
//
//    public void setCourse(Set<Course> course) {
//        this.course = course;
//    }

//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", department=" + department +
                ", orders=" + orders +
                '}';
    }
}
