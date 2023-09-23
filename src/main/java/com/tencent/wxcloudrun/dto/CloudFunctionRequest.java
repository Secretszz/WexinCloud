package com.tencent.wxcloudrun.dto;

import lombok.Data;

@Data
public class CloudFunctionRequest {

    private String env;

    private String name;

    private String req_data;
}
