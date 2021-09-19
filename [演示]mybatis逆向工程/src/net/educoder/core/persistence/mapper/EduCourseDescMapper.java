package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduCourseDesc;

public interface EduCourseDescMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduCourseDesc record);

    EduCourseDesc selectByPrimaryKey(Long id);

    List<EduCourseDesc> selectAll();

    int updateByPrimaryKey(EduCourseDesc record);
}