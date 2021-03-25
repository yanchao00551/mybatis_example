package demo;

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
            // 1、 获取mybatis-config.xml的输入流
            InputStream is = Resources.getResourceAsStream(resource);
            // 2、 创建SqlSessionFactory对象，完成队配置文件的读取
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            // 3、 创建sqlSession
            sqlSession = factory.openSession();
            // 4、 调用mapper文件来对数据库进行操作，必须先把mapper文件引入到mybatis-config.xml中
            count = sqlSession.selectOne("demo.dao.user.UserMapper.count");
            log.info("UserMapper的count方法的返回结果：{}",count);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
