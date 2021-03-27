package org.example.mapper;

import java.util.List;
import org.example.bean.SkeyeduNews;

public interface SkeyeduNewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SkeyeduNews record);

    SkeyeduNews selectByPrimaryKey(Integer id);

    List<SkeyeduNews> selectAll();

    int updateByPrimaryKey(SkeyeduNews record);
}