package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduUserCourseSubscribe;

public interface EduUserCourseSubscribeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduUserCourseSubscribe record);

    EduUserCourseSubscribe selectByPrimaryKey(Long id);

    List<EduUserCourseSubscribe> selectAll();

    int updateByPrimaryKey(EduUserCourseSubscribe record);
}