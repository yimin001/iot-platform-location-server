package com.aision.iot.platform.location.server.service;

import com.aision.iot.platform.location.server.entity.LocationServerEntity;
import com.aision.iot.platform.location.server.repository.LocationServerRepository;
import com.aision.iot.platform.parent.jpa.BaseRepository;
import com.aision.iot.platform.parent.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yim
 * @description 定位服务器service
 * @date 2019/4/30
 */
@Service
public class LocationServerService extends BaseService<LocationServerEntity, String> {

    private static Logger logger = LoggerFactory.getLogger(LocationServerService.class);

    @Autowired
    private LocationServerRepository locationServerRepository;

    @Override
    protected BaseRepository initBaseRepository() {
        return locationServerRepository;
    }
}
