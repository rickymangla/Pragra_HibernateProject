package com.example.practicehibernate.entity;

import jakarta.persistence.*;

@Entity
public class Journal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer journalId;

    @Column
    private String journalName;

    public Integer getJournalId() {
        return journalId;
    }

    public void setJournalId(Integer journalId) {
        this.journalId = journalId;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "journalId=" + journalId +
                ", journalName='" + journalName + '\'' +
                '}';
    }
}
