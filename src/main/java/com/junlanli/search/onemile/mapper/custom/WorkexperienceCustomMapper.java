package com.junlanli.search.onemile.mapper.custom;

import com.junlanli.search.onemile.mapper.WorkexperienceMapper;
import com.junlanli.search.onemile.model.Workexperience;
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
public interface WorkexperienceCustomMapper extends WorkexperienceMapper {


    @Select({
            "SELECT * FROM workexperience WHERE TEACHER_ID=#{teacherId,jdbcType=BIGINT}"
    })
    @ResultMap("workexperience_whole")
    List<Workexperience> selectByTeacherId(Long teacherId);
}
