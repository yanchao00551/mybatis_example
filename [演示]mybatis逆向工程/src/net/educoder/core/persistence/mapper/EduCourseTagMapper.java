package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduCourseTag;

public interface EduCourseTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduCourseTag record);

    EduCourseTag selectByPrimaryKey(Long id);

    List<EduCourseTag> selectAll();

    int updateByPrimaryKey(EduCourseTag record);
}