package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduChallengePrcaticeLink;
import net.educoder.core.persistence.beans.EduChallengePrcaticeLinkWithBLOBs;

public interface EduChallengePrcaticeLinkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduChallengePrcaticeLink record);

    EduChallengePrcaticeLinkWithBLOBs selectByPrimaryKey(Long id);

    List<EduChallengePrcaticeLink> selectAll();

    int updateByPrimaryKey(EduChallengePrcaticeLink record);
}