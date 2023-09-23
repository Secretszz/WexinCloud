package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CloudResponse implements Serializable {
    private Integer errcode;
    private String errmsg;
    private String resp_data;
}
