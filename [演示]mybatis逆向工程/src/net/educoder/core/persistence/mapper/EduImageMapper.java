package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduImage;

public interface EduImageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduImage record);

    EduImage selectByPrimaryKey(Long id);

    List<EduImage> selectAll();

    int updateByPrimaryKey(EduImage record);
}