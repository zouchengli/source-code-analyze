package site.clzblog.source.code.analyze.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import site.clzblog.source.code.analyze.list.List;
import site.clzblog.source.code.analyze.list.array.ArrayList;
import site.clzblog.source.code.analyze.list.linked.LinkedList;
import site.clzblog.source.code.analyze.map.Map;
import site.clzblog.source.code.analyze.map.array.ArrayListHashMap;
import site.clzblog.source.code.analyze.map.hash.HashMap;
import site.clzblog.source.code.analyze.map.linked.LinkedListHashMap;
import site.clzblog.source.code.analyze.mybatis.entity.UserEntity;
import site.clzblog.source.code.analyze.mybatis.mapper.UserMapper;

import java.io.IOException;

public class MybatisSourceCodeTests {
    public static void main(String[] args) {
        Map<Object, String> map = new HashMap<>();
        map.put("a", "testA");
        map.put(97, "testB");
        for (int i = 0; i < 10; i++) {
            map.put(i, "test" + i);
        }
        map.put(null, "xixi");
        map.put(null, "bb");
        System.out.println(map.get(null));
    }

    public static void test000() {
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

    private static void test001() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("test" + i);
        }
        list.add("hello");
        String remove = list.remove(2);
        System.out.println("removed -> " + remove);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void test002() {
        List<String> list = new LinkedList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");
        list.remove(2);
        System.out.println(list.get(2));
    }

    private static void test003() {
        Map<String, String> map = new ArrayListHashMap<>();
        map.put("test1", "test1");
        map.put("test2", "test2");
        map.put("test3", "test3");
        System.out.println(map.get("test2"));
    }

    private static void test004() {
        Map<Object, String> map = new LinkedListHashMap<>();
        map.put("a", "test1");
        map.put(97, "test2");
        System.out.println(map.get("a"));
        System.out.println(map.get(97));
    }
}
