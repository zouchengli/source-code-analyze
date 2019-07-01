package site.clzblog.source.code.analyze.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import site.clzblog.source.code.analyze.mybatis.entity.UserEntity;
import site.clzblog.source.code.analyze.mybatis.mapper.UserMapper;

import java.io.IOException;

public class MybatisSourceCodeTests {
    public static void main(String[] args) {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            UserEntity userEntity = userMapper.selectById(1L);
            System.out.println(userEntity.getName());
            UserEntity one = sqlSession.selectOne("site.clzblog.source.code.analyze.mybatis.mapper.UserMapper.selectById", 1L);
            System.out.println(one.getName());
            System.out.println(Integer.MAX_VALUE);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
