package com.stream.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "courses")
public class Courses {

    @Id
    private String id;
    private String title;

//    @OneToMany(mappedBy = "course")
//    private List<Video> list = new ArrayList<>();
}
