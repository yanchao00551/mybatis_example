package org.skeyedu;


import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.skeyedu.dao.user.UserMapper;
import org.skeyedu.dao.util.MyBatisUtil;
import org.skeyedu.entity.SkeyeduUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @PackageName:demo
 * @ClassName:UserMapperTest
 * @Description:
 * @author: 悟空
 * @date: 2021/3/25 10:54
 * @email: 10947@163.com
 */

@Slf4j
public class UserMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = null;
        List<SkeyeduUser> users = new ArrayList<>();
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            //第一种方式：调用selectList方法执行查询操作
            //users = sqlSession.selectList("abc.getUserList");

            //第二种方式：调用getMapper(Mapper.class)执行dao接口方法来实现对数据库的查询操作
            users = sqlSession.getMapper(UserMapper.class).getUserList();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }

        //java 8新特性
        users.forEach((value) -> log.info("每行的内容：{}",value));
    }

    @Test
    public void testGetUserListByUserName(){
        SqlSession sqlSession = null;
        List<SkeyeduUser> users = new ArrayList<>();
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            //第二种方式：调用getMapper(Mapper.class)执行dao接口方法来实现对数据库的查询操作
            users = sqlSession.getMapper(UserMapper.class).getUserListByUserName("陈");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }

        //java 8新特性
        users.forEach((value) -> log.info("每行的内容：{}",value));
    }


    @Test
    public void testGetUserList(){
        SqlSession sqlSession = null;
        List<SkeyeduUser> users = new ArrayList<>();
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            //第二种方式：调用getMapper(Mapper.class)执行dao接口方法来实现对数据库的查询操作
            SkeyeduUser skeyeduUser = new SkeyeduUser();
            skeyeduUser.setUserName("光");
            skeyeduUser.setType(1);
            //javabean传参
            users = sqlSession.getMapper(UserMapper.class).queryUserList(skeyeduUser);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }

        //java 8新特性
        users.forEach((value) -> log.info("每行的内容：{}",value));
    }


    @Test
    public void testGetUserListByMap(){
        SqlSession sqlSession = null;
        List<SkeyeduUser> users = new ArrayList<>();
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            //第二种方式：调用getMapper(Mapper.class)执行dao接口方法来实现对数据库的查询操作
            Map<String,String> userMap = new HashMap<String,String>();
            userMap.put("lName","g");
            userMap.put("sex","1");
            //javabean传参
            users = sqlSession.getMapper(UserMapper.class).getUserListByMap(userMap);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }

        //java 8新特性
        users.forEach((value) -> log.info("每行的内容：{}",value));
    }


    @Test
    public void testGetUserListByMap1(){
        SqlSession sqlSession = null;
        List<SkeyeduUser> users = new ArrayList<>();
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            //第二种方式：调用getMapper(Mapper.class)执行dao接口方法来实现对数据库的查询操作
            Map<String,String> userMap = new HashMap<String,String>();
            userMap.put("lName","g");
            userMap.put("sex","1");
            //javabean传参
            users = sqlSession.getMapper(UserMapper.class).queryUserListByMap(userMap);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }

        //java 8新特性
        users.forEach((value) -> log.info("每行的内容：{}",value));
    }


}
