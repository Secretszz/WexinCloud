package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.CloudResponse;
import com.tencent.wxcloudrun.dto.CloudFunctionRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CloudFunctionController {

    final Logger logger;
    public CloudFunctionController() {
        this.logger = LoggerFactory.getLogger(CounterController.class);
    }

    @PostMapping(value = "/api/invokeCloudFunction")
    ApiResponse invokeCloudFunction(CloudFunctionRequest request){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CloudResponse> responseEntity = restTemplate.postForEntity("https://api.weixin.qq.com/tcb/invokecloudfunction", request,CloudResponse.class);
        return ApiResponse.ok(responseEntity.getBody());
    }
}
