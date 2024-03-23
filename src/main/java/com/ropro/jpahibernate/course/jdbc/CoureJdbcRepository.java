package com.ropro.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoureJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = """
            insert into COURSE (id, name, author)
            values (1, 'learn AWS', 'Joel');

                  """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }

}
