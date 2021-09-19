package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduLanguage;

public interface EduLanguageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduLanguage record);

    EduLanguage selectByPrimaryKey(Long id);

    List<EduLanguage> selectAll();

    int updateByPrimaryKey(EduLanguage record);
}