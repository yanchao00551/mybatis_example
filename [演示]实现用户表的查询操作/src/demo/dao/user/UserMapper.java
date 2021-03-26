package demo.dao.user;

import demo.entity.SkeyeduUser;

import java.util.List;

/**
 * @Author 悟空
 * @Description //TODO 
 * @Date 11:34 2021/3/26
 * @Param 
 * @return 
 **/

public interface UserMapper {

    /**
     * 查询用户记录数.
     * @Author 悟空
     * @Description //TODO
     * @Date 11:36 2021/3/26
     * @Param []
     * @return int
     **/
    int count();

    /**
     * 查询用户列表.
     * @Author 悟空
     * @Description //TODO
     * @Date 10:14 2021/3/26
     * @Param []
     * @return java.util.List<demo.entity.SkeyeduUser>
     **/
    List<SkeyeduUser> getUserList();
}
