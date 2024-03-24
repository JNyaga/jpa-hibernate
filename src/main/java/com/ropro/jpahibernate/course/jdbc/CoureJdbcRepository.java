package com.ropro.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ropro.jpahibernate.course.Course;

@Repository
public class CoureJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = """
            insert into COURSE (id, name, author)
            values (?, ? , ?);

                  """;

    private static String DELETE_QUERY = """
            delete from COURSE where id = ?;

                  """;

    private static String SELECT_QUERY = """
            select * from COURSE where id = ?;

                  """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(long id) {
        // ResulSet -> Bean => Row Mapper=>
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }

}
