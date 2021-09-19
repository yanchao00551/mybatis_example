package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduLearningStep;

public interface EduLearningStepMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduLearningStep record);

    EduLearningStep selectByPrimaryKey(Long id);

    List<EduLearningStep> selectAll();

    int updateByPrimaryKey(EduLearningStep record);
}