package com.example.Mission3.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "patient")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PatientDetails {
    //tell that ID is the primary key
    @Id
    //tell the field is auto generated by database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

    //name="" if not same in the table name
 //   @Column(name = "name", nullable = false)
    public String name;

  //  @Column(name = "number",nullable = false)
    public Integer number;

}