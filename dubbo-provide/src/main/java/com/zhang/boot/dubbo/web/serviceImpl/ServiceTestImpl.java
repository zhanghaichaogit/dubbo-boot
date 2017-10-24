package com.zhang.boot.dubbo.web.serviceImpl;

import com.zhang.boot.dubbo.api.service.ServiceTest;
import com.zhang.boot.dubbo.web.model.ModelTest;

import javax.annotation.Resource;

/**
 * Created by zhanghaichao on 2017/10/17.
 */
public class ServiceTestImpl implements ServiceTest {

    @Resource
    private ModelTest modelTest;

    @Override
    public String dotest() {
        return modelTest.test();
    }
}
