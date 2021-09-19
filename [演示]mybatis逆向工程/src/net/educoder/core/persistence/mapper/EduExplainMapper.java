package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduExplain;

public interface EduExplainMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduExplain record);

    EduExplain selectByPrimaryKey(Long id);

    List<EduExplain> selectAll();

    int updateByPrimaryKey(EduExplain record);
}