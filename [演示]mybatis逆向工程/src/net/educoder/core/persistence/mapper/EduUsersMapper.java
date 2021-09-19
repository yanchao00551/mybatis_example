package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduUsers;

public interface EduUsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduUsers record);

    EduUsers selectByPrimaryKey(Long id);

    List<EduUsers> selectAll();

    int updateByPrimaryKey(EduUsers record);
}