package com.junlanli.search.onemile.util;

import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 23/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public final class ModelTransformUtil {

    private static final Logger logger = Logger.getLogger(ModelTransformUtil.class);

    public static <T> T transform(Object oldObject, Class<T> newType) {
        try {
            Field[] fields = newType.getDeclaredFields();
            T newObject = newType.newInstance();
            for (Field newField : fields) {
                try {
                    newField.setAccessible(true);
                    Field oldField = oldObject.getClass().getDeclaredField(newField.getName());
                    oldField.setAccessible(true);
                    newField.set(newObject, oldField.get(oldObject));
                } catch (NoSuchFieldException e) {
                    //do nothing, has no same field
                }
            }
            return newObject;
        } catch (InstantiationException ine) {
            logger.error("no empty constructor existed in class [" + oldObject.getClass() + "]", ine);
            return null;
        } catch (IllegalAccessException ile) {
            logger.error("the empty constructor cannot be access in class [" + oldObject.getClass() + "]", ile);
            return null;
        }
    }

    public static <T> List<T> transformList(List oldList, Class<T> newType) {
        List<T> newList = new ArrayList<>(oldList.size());
        for (Object oldObject : oldList) {
            newList.add(transform(oldObject, newType));
        }
        return newList;
    }
}
