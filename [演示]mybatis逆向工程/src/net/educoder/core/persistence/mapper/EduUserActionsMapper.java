package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduUserActions;

public interface EduUserActionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EduUserActions record);

    EduUserActions selectByPrimaryKey(Integer id);

    List<EduUserActions> selectAll();

    int updateByPrimaryKey(EduUserActions record);
}