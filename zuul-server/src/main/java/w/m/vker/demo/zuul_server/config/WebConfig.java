package w.m.vker.demo.zuul_server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Copyright: Zhejiang Drore Technology Co., Ltd  2018 <br/>
 * @Desc: <br/>
 * @ProjectName: swagger-distributed-demo <br/>
 * @Date: 2018/6/21 16:06 <br/>
 * @Author: <a href="6492178@gmail.com">wmm</a>
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("redirect:/swagger-ui.html");
    }
}
