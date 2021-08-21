package br.com.spring.apirestdemo.models;

import lombok.Data;

import javax.persistence.*;

@Data //getter and setters lombock
@Entity //table
@Table(name = "objectors")

public class ObjColor {

    @Id //primary key table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // increment ID
    private long id;
    private String word;

}
