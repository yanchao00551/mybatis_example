package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduCourse;

public interface EduCourseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduCourse record);

    EduCourse selectByPrimaryKey(Long id);

    List<EduCourse> selectAll();

    int updateByPrimaryKey(EduCourse record);
}