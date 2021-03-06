import com.junlanli.search.onemile.config.starter.Application;
import com.junlanli.search.onemile.service.TeacherWriteService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 16/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class Test {

    @Autowired
    private TeacherWriteService teacherWriteService;

    @org.junit.Test
    public void test() {
        teacherWriteService.refreshAll();
    }

    @org.junit.Test
    public void createIndex() {
        teacherWriteService.createIndex();
    }
}
