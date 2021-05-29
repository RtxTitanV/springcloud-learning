package com.rtxtitanv.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.controller.ConfigClientController
 * @description ConfigClientController
 * @date 2021/5/5 18:15
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${user.name:Unknown}")
    private String userName;
    @Value("${user.age:Unknown}")
    private String userAge;
    @Value("${common.host:Unknown}")
    private String commonHost;
    @Value("${common.port:Unknown}")
    private String commonPort;
    @Value("${common.username:Unknown}")
    private String commonUsername;
    @Value("${common.password:Unknown}")
    private String commonPassword;
    @Value("${share.username:Unknown}")
    private String shareUsername;
    @Value("${share.password:Unknown}")
    private String sharePassword;
    @Value("${share.hostname:Unknown}")
    private String shareHostname;
    @Value("${log.level:Unknown}")
    private String logLevel;
    @Value("${user.pwd:Unknown}")
    private String userPwd;

    @GetMapping("/user")
    public String getUser() {
        return "user(userName=" + userName + ", userAge=" + userAge + ")";
    }

    @GetMapping("/ext-config")
    public String getExtConfig() {
        return "common.host: " + commonHost + ", common.port: " + commonPort + ", common.username: " + commonUsername
                + ", common.password: " + commonPassword;
    }

    @GetMapping("/share-config")
    public String getShareConfig() {
        return "share.username: " + shareUsername + ", share.password: " + sharePassword + ", share.hostname: "
                + shareHostname + ", log.info: " + logLevel;
    }

    @GetMapping("/priority")
    public String configPriority() {
        return "user.name: " + userName + ", user.age: " + userAge + ", user.pwd: " + userPwd + ", log.info: "
                + logLevel;
    }
}