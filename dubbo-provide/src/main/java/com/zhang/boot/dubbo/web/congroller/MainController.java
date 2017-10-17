package com.zhang.boot.weixin.web.congroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhanghaichao on 2017/10/17.
 */
@Controller
public class MainController {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "Hello World!";
  }

}
