package com.example.practicehibernate.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer stdId;

    @Column
    private String stName;

    @Column
    private Integer stAge;

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public Integer getStAge() {
        return stAge;
    }

    public void setStAge(Integer stAge) {
        this.stAge = stAge;
    }
}
