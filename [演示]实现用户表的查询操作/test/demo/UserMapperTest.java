package demo;

import demo.dao.user.UserMapper;
import demo.dao.util.MyBatisUtil;
import demo.entity.SkeyeduUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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
        String resource = "mybatis-config.xml";
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
}
