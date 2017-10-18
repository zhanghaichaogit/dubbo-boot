package com.zhang.boot.dubbo.web.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhang.boot.dubbo.api.service.ServiceTest;

/**
 * Created by zhanghaichao on 2017/10/17.
 */
@Service
public class DubboserviceImpl implements ServiceTest {

    @Override
    public String dotest() {
        return "hello word";
    }
}
