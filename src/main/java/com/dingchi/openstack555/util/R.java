package com.dingchi.openstack555.util;

import lombok.Data;

@Data
public class R<T> {
    private String code = "0";
    private String msg;
    private T data;

    public R(T data) {
        this.data = data;
    }

    public R() {
    }
}