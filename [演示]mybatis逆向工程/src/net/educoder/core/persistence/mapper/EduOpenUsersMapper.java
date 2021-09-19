package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduOpenUsers;

public interface EduOpenUsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduOpenUsers record);

    EduOpenUsers selectByPrimaryKey(Long id);

    List<EduOpenUsers> selectAll();

    int updateByPrimaryKey(EduOpenUsers record);
}