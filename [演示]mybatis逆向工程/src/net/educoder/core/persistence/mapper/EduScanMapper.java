package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduScan;

public interface EduScanMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduScan record);

    EduScan selectByPrimaryKey(Long id);

    List<EduScan> selectAll();

    int updateByPrimaryKey(EduScan record);
}