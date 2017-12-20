package w.m.vker.demo.zuulserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * 浙江卓锐科技股份有限公司 版权所有 © Copyright 2017<br/>
 * 说明: <br/>
 * 项目名称: control-api <br/>
 * 创建日期: 2017年09月04日 15:11 <br/>
 * 作者: <a href="6492178@gmail.com">汪萌萌</a>
 */
@RestController
public class ControlErrorController implements ErrorController {
    private static Logger LOGGER = LoggerFactory.getLogger(ControlErrorController.class);
    @Value("${error.path:/error}")
    private String errorPath;

    @Override
    public String getErrorPath() {
        return null;
    }

    @GetMapping(value = "${error.path:/error}", produces = "application/json")
    public @ResponseBody
    String error() {
        return "发生异常啦";
    }


}
