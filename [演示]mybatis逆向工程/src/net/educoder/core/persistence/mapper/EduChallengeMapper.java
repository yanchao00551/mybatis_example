package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduChallenge;

public interface EduChallengeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduChallenge record);

    EduChallenge selectByPrimaryKey(Long id);

    List<EduChallenge> selectAll();

    int updateByPrimaryKey(EduChallenge record);
}