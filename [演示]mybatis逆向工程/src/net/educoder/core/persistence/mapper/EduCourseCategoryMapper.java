package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduCourseCategory;

public interface EduCourseCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduCourseCategory record);

    EduCourseCategory selectByPrimaryKey(Long id);

    List<EduCourseCategory> selectAll();

    int updateByPrimaryKey(EduCourseCategory record);
}