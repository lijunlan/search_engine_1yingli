import com.junlanli.search.onemile.util.NamePinyinUtil;
import org.junit.Test;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 20/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public class TestPinyin {

    @org.junit.Test
    public void testName() {
        System.out.println(NamePinyinUtil.transferName("曾三日"));
    }

    @Test
    public void test() {
//        String path = MultiPinyinConfig.multiPinyinPath;
//        if (path != null) {
//            File userMultiPinyinFile = new File(path);
//            System.out.println(userMultiPinyinFile.getAbsolutePath());
//            if (userMultiPinyinFile.exists()) {
//                loadMultiPinyin(new FileInputStream(userMultiPinyinFile));
//            }
//        }
    }
}
