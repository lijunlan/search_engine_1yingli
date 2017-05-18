package com.junlanli.search.onemile.mapper.custom;

import com.junlanli.search.onemile.mapper.StudyexperienceMapper;
import com.junlanli.search.onemile.model.Studyexperience;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public interface StudyexperienceCustomMapper extends StudyexperienceMapper {

    @Select({
            "SELECT * FROM studyexperience WHERE TEACHER_ID=#{teacherId,jdbcType=BIGINT}"
    })
    @ResultMap("studyexperience_whole")
    List<Studyexperience> selectByTeacherId(Long teacherId);
}
