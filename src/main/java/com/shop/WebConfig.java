package com.shop;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//     @Override
//     public void addViewControllers(ViewControllerRegistry registry) {
//         registry.addViewController("/").setViewName("home");
//     }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/media/**")
                .addResourceLocations("/Users/enesgunay/Desktop/ShopSmart/src/main/resources/static/media");
    }

    public void feature2(){
        System.out.println("todo");
    }

    public void feature3(){
        System.out.println("todo");
    }

    public void bugfix(String todo){
        System.out.println("todo");
    }
}
