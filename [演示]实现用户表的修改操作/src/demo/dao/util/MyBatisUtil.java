package demo.dao.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @PackageName:demo.dao.util
 * @ClassName:MyBatisUtil
 * @Description:  //TODO: 单例模式
 * @author: 悟空
 * @date: 2021/3/26 8:47
 * @email: 10947@163.com
 */
public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory;

    static {  //在静态代码块下，factory只会被创建一次
        try{
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * @Author 悟空
     * @Description //TODO 获取sqlSession
     * @Date 9:04 2021/3/26
     * @Param []
     * @return org.apache.ibatis.session.SqlSession
     **/

    public static SqlSession createSqlSession(){
        //false手动提交事务，true自动提交事务
        return sqlSessionFactory.openSession(false);
    }

    /**
     * @Author 悟空
     * @Description //TODO 关闭sqlSession
     * @Date 9:05 2021/3/26
     * @Param [sqlSession]
     * @return void
     **/

    public static void closeSqlSession(SqlSession sqlSession){
        if(null != sqlSession){
            sqlSession.close();
        }
    }

}
