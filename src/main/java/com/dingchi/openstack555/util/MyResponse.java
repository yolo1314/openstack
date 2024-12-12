package com.dingchi.openstack555.util;

import java.util.List;
import lombok.Data;

@Data
public class MyResponse<T> {
    private int code = 0;
    private String msg;
    private List<T> data;

    public MyResponse(List<T> data) {
        this.data = data;
    }

    public MyResponse() {
    }
}