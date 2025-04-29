package com.infosys.thymeleafproj.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="emp")
@Data
public class Employee implements Serializable {

    @Id
    @SequenceGenerator(name = "genl",sequenceName = "emp_no_seqI",initialValue=3000,allocationSize = 1)
    @GeneratedValue(generator = "genl",strategy = GenerationType.SEQUENCE)
    private Integer empno;
    private String ename;
    private String job;
    private Float sal;
    private Integer deptno;
}
