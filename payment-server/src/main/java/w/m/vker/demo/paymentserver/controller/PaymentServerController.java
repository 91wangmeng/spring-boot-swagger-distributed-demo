package w.m.vker.demo.paymentserver.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ResponseMessage;

/**
 * 浙江卓锐科技股份有限公司 版权所有 © Copyright 2017<br>
 * 说明: <br>
 * 项目名称: spring-boot-swagger-distributed-demo <br>
 * 创建日期: 2017年12月20日 20:38 <br>
 * 作者: <a href="6492178@gmail.com">汪萌萌</a>
 */
@RestController
@Api(tags = "支付系统接口", description = "支付系统模块相关接口")
public class PaymentServerController {
    @GetMapping("/payForSomething")
    @ApiOperation(value = "支付接口")
    public ResponseMessage pay() {
        return new ResponseMessageBuilder().code(200).message("支付成功").build();
    }
}
