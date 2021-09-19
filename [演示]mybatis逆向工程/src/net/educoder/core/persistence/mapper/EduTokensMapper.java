package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduTokens;

public interface EduTokensMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EduTokens record);

    EduTokens selectByPrimaryKey(Integer id);

    List<EduTokens> selectAll();

    int updateByPrimaryKey(EduTokens record);
}