package demo.dao.user;

import demo.entity.SkeyeduUser;

import java.util.List;
import java.util.Map;

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

    /**
     * 根据用户名称查询用户列表（模糊查询）
     * @Author 悟空
     * @Description //TODO
     * @Date 9:52 2021/3/29
     * @Param [userName]
     * @return java.util.List<demo.entity.SkeyeduUser>
     **/
    List<SkeyeduUser> getUserListByUserName(String userName);

    /**
     * 查询用户列表（参数，对象入参）
     * @Author 悟空
     * @Description //TODO
     * @Date 10:14 2021/3/29
     * @Param [skeyeduUser]
     * @return java.util.List<demo.entity.SkeyeduUser>
     **/
    List<SkeyeduUser> queryUserList(SkeyeduUser skeyeduUser);

    /**
     * 查询用户列表(map入参）
     * @Author 悟空
     * @Description //TODO
     * @Date 10:15 2021/3/29
     * @Param [userMap]
     * @return java.util.List<demo.entity.SkeyeduUser>
     **/
    List<SkeyeduUser> getUserListByMap(Map<String,String> userMap);

}
