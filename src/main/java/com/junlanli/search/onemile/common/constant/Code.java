package com.junlanli.search.onemile.common.constant;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 20/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public enum Code {
    SUCCESS(200),
    INTERNAL_ERROR(500),
    METHOD_WRONG(404),
    PARAMETER_WRONG(402);

    private int number;

    private Code(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


}
