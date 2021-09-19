package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduSysLog;

public interface EduSysLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EduSysLog record);

    EduSysLog selectByPrimaryKey(Integer id);

    List<EduSysLog> selectAll();

    int updateByPrimaryKey(EduSysLog record);
}