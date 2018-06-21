package w.m.vker.demo.zuul_server.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * 浙江卓锐科技股份有限公司 版权所有 © Copyright 2017<br>
 * 说明: 配置swagger文档资源<br>
 * 项目名称: control-api <br>
 * 创建日期: 2017年09月05日 17:46 <br>
 * 作者: <a href="6492178@gmail.com">汪萌萌</a>
 */
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List resources = new ArrayList<>();
        resources.add(swaggerResource("订单系统", "/order/v2/api-docs", "2.0"));
        resources.add(swaggerResource("支付系统", "/pay/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
