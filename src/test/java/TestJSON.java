import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.junlanli.search.onemile.util.FastJsonUtil;
import org.junit.*;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 20/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public class TestJSON {

    @org.junit.Test
    public void test() {
//        JSONObject j = FastJsonUtil.success("test");
//        System.out.println(JSON.toJSONString(j, SerializerFeature.PrettyFormat));
        long l = 91000000000L;
        int a = (int) l;
        System.out.println(a);
    }
}
