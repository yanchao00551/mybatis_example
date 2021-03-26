package demo;

import demo.dao.util.MyBatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

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
        int count = 0;
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            count = sqlSession.selectOne("abc.count");
            log.info("UserMapper的count方法的返回结果：{}",count);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
    }
}
