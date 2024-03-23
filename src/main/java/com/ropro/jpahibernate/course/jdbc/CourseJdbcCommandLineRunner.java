package com.ropro.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ropro.jpahibernate.course.Course;

// runs at startup
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CoureJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn Aws Now", "Joel"));
        repository.deleteById(1);
    }

}
