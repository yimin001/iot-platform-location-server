package com.aision.iot.platform.location.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author yim
 * @description 启动类
 * @date 2019/4/26
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.aision.iot.platform.parent.**","com.aision.iot.platform.location.server.**"})
@EnableFeignClients
public class IotPlatformLocationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotPlatformLocationServerApplication.class, args);
    }

}
