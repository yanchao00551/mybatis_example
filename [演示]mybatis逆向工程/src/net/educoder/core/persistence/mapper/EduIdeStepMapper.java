package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduIdeStep;
import net.educoder.core.persistence.beans.EduIdeStepWithBLOBs;

public interface EduIdeStepMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduIdeStep record);

    EduIdeStepWithBLOBs selectByPrimaryKey(Long id);

    List<EduIdeStep> selectAll();

    int updateByPrimaryKey(EduIdeStep record);
}