package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduCourseInstance;

public interface EduCourseInstanceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduCourseInstance record);

    EduCourseInstance selectByPrimaryKey(Long id);

    List<EduCourseInstance> selectAll();

    int updateByPrimaryKey(EduCourseInstance record);
}