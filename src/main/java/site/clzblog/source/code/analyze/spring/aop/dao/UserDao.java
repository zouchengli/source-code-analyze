package site.clzblog.source.code.analyze.spring.aop.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private final JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addUser() {
        jdbcTemplate.execute("insert into test.user values (2, 'test2', 19)");
    }
}
