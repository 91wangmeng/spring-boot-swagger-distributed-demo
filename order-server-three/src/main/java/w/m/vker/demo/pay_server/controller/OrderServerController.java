package w.m.vker.demo.pay_server.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 浙江卓锐科技股份有限公司 版权所有 © Copyright 2017<br>
 * 说明: <br>
 * 项目名称: spring-boot-swagger-distributed-demo <br>
 * 创建日期: 2017年12月20日 20:38 <br>
 * 作者: <a href="6492178@gmail.com">汪萌萌</a>
 */
@RestController
@Api(tags = "订单系统接口", description = "订单系统模块相关接口")
public class OrderServerController {
    @PostMapping("/orderSomething")
    @ApiOperation(value = "下单")
    public String pay() {
        return "订单接口demo";
    }
}
