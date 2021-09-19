package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduChapter;

public interface EduChapterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduChapter record);

    EduChapter selectByPrimaryKey(Long id);

    List<EduChapter> selectAll();

    int updateByPrimaryKey(EduChapter record);
}