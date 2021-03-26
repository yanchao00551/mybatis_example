package demo.dao.user;

import demo.entity.SkeyeduUser;

import java.util.List;

public interface UserMapper {
    /**
     * @Author 悟空
     * @Description //TODO :查询用户记录表数
     * @Date 10:13 2021/3/26
     * @Param []
     * @return int
     **/
    int count();

    /**
     * @Author 悟空
     * @Description //TODO :查询用户列表
     * @Date 10:14 2021/3/26
     * @Param []
     * @return java.util.List<demo.entity.SkeyeduUser>
     **/

    List<SkeyeduUser> getUserList();
}
