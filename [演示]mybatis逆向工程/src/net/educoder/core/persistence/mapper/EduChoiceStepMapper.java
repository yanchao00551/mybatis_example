package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduChoiceStep;
import net.educoder.core.persistence.beans.EduChoiceStepWithBLOBs;

public interface EduChoiceStepMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduChoiceStep record);

    EduChoiceStepWithBLOBs selectByPrimaryKey(Long id);

    List<EduChoiceStep> selectAll();

    int updateByPrimaryKey(EduChoiceStep record);
}