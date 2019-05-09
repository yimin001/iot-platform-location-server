package com.aision.iot.platform.location.server.controller;

import com.aision.iot.platform.location.server.feign.WebSocketFeign;
import com.aision.iot.platform.location.server.service.LocationServerService;
import com.aision.iot.platform.location.server.entity.LocationServerEntity;
import com.aision.iot.platform.parent.core.redis.utils.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yim
 * @description 定位服务器controller层
 * @date 2019/4/26
 */
@Api(tags = "定位服务器controller")
@RestController
@RequestMapping("/locationServer")
public class LocationServerController {

    private static Logger logger = LoggerFactory.getLogger(LocationServerController.class);

    @Autowired
    private LocationServerService serverService;

    @Resource
    private WebSocketFeign webSocketFeign;

    @Resource
    private RedisService service;

    @ApiOperation(value = "增加定位服务器")
    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody LocationServerEntity entity){
        logger.info("增加的定位服务器实体为：{}", entity);
        serverService.save(entity);
        service.put("test", "testValue");
        webSocketFeign.sendMessage("增加成功", null);
        return new ResponseEntity(HttpStatus.OK);
    }
}
