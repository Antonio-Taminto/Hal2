package com.example.Hal2.entites;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table
@Entity
public class ProgrammingLanguage {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    private LocalDate firstAppereance;
    private String inventor;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(Long id, String name, LocalDate firstAppereance, String inventor) {
        this.id = id;
        this.name = name;
        this.firstAppereance = firstAppereance;
        this.inventor = inventor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFirstAppereance() {
        return firstAppereance;
    }

    public void setFirstAppereance(LocalDate firstAppereance) {
        this.firstAppereance = firstAppereance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
