package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduTerminalStep;

public interface EduTerminalStepMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduTerminalStep record);

    EduTerminalStep selectByPrimaryKey(Long id);

    List<EduTerminalStep> selectAll();

    int updateByPrimaryKey(EduTerminalStep record);
}