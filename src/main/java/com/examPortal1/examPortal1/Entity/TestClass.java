package com.examPortal1.examPortal1.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="test")
public class TestClass {
    public TestClass() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "name",unique = true,nullable = false)
    String name;
    public TestClass(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
