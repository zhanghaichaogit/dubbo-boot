package com.zhang.boot.dubbo.consume.web;

import com.zhang.boot.dubbo.api.service.ServiceTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zhanghaichao on 2017/10/17.
 */
@Controller
public class MainController {
    @Resource
    private ServiceTest serviceTest;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return serviceTest.dotest();
    }

}
