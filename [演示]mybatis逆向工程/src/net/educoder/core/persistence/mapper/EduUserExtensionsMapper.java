package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduUserExtensions;

public interface EduUserExtensionsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduUserExtensions record);

    EduUserExtensions selectByPrimaryKey(Long id);

    List<EduUserExtensions> selectAll();

    int updateByPrimaryKey(EduUserExtensions record);
}