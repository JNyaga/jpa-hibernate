package com.ropro.jpahibernate.course.springdatajpa;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ropro.jpahibernate.course.Course;

/**
 * This interface represents a Spring Data JPA repository for the Course entity.
 * It provides methods to perform CRUD operations and custom queries on the
 * Course entity.
 */
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    /**
     * Finds courses by author.
     *
     * @param author the author of the courses
     * @return a list of courses matching the author
     */
    List<Course> findByAuthor(String author);

    /**
     * Finds courses by name.
     *
     * @param name the name of the courses
     * @return a list of courses matching the name
     */
    List<Course> findByName(String name);
}
