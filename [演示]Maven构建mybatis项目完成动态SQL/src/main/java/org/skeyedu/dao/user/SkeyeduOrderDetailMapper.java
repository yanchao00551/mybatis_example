package org.skeyedu.dao.user;


import org.skeyedu.entity.SkeyeduOrderDetail;
import org.skeyedu.vo.SkeyduOrderDetailVO;

import java.util.List;

public interface SkeyeduOrderDetailMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SkeyeduOrderDetail record);

    SkeyeduOrderDetail selectByPrimaryKey(Integer id);

    List<SkeyeduOrderDetail> selectAll();

    int updateByPrimaryKey(SkeyeduOrderDetail record);

    /**
     * 根据多个用户id查询订单详情
     * @Author 悟空
     * @Description //TODO 
     * @Date 15:33 2021/3/30
     * @Param []
     * @return java.util.List<org.skeyedu.entity.SkeyeduOrderDetail>
     **/
    List<SkeyeduOrderDetail> getUserByUidForeachArray(SkeyduOrderDetailVO vo);
}