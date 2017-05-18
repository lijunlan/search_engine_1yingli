import com.junlanli.search.onemile.mapper.TeacherMapper;
import org.junit.*;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public class TestReflect {

    @org.junit.Test
    public void test() {
        Method[] methods = TeacherMapper.class.getMethods();
        for (Method method : methods) {
            Parameter[] parameters = method.getParameters();
            System.out.println(method.getName());
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
            }
            System.out.println("-----------------------------------------------");
        }

    }
}
