package com.example.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class StudentBean {


    public Student sayHello() {
        log.info("hello ");
        Student student = new Student();
        student.setAge(12);
        student.setName("samet");
        student.setSurname("erdem");
        return student;

    }

    public Student2 helloDude(int a ) {
        Student2 student2 = new Student2();
        student2.setAge(12+a);
        return student2;

    }
}
