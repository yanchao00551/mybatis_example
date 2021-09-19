package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduRichTextStep;

public interface EduRichTextStepMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduRichTextStep record);

    EduRichTextStep selectByPrimaryKey(Long id);

    List<EduRichTextStep> selectAll();

    int updateByPrimaryKey(EduRichTextStep record);
}