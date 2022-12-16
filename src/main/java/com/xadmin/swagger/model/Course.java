package com.xadmin.swagger.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="course")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {

    //private static final SerialVersionUID=1L;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private int courseId;

    private String courseName;

    private double price;

}
