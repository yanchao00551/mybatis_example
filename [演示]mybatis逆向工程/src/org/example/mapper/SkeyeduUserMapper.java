package org.example.mapper;

import java.util.List;
import org.example.bean.SkeyeduUser;

public interface SkeyeduUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SkeyeduUser record);

    SkeyeduUser selectByPrimaryKey(Integer id);

    List<SkeyeduUser> selectAll();

    int updateByPrimaryKey(SkeyeduUser record);
}