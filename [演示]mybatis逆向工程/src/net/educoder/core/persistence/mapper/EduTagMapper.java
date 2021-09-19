package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduTag;

public interface EduTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduTag record);

    EduTag selectByPrimaryKey(Long id);

    List<EduTag> selectAll();

    int updateByPrimaryKey(EduTag record);
}