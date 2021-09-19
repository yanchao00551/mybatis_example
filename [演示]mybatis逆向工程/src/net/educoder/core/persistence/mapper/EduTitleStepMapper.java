package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduTitleStep;

public interface EduTitleStepMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduTitleStep record);

    EduTitleStep selectByPrimaryKey(Long id);

    List<EduTitleStep> selectAll();

    int updateByPrimaryKey(EduTitleStep record);
}