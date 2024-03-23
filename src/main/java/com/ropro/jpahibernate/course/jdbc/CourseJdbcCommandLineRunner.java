package com.ropro.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// runs at startup
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CoureJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert();
    }

}
