package com.ropro.jpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ropro.jpahibernate.course.jdbc.CoureJdbcRepository;
import com.ropro.jpahibernate.course.jpa.CourseJpaRepository;

// runs at startup
@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CoureJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn Aws Now", "Joel"));
        repository.insert(new Course(2, "Learn Magic Now", "Joe"));
        repository.insert(new Course(3, "Learn Laravel Now", "amey"));
        repository.deleteById(1);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
    }

}
