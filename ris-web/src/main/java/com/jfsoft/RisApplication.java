package com.jfsoft;


import groovy.util.logging.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by JFYT002 on 2017/7/25.
 */
@Slf4j
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@MapperScan("com.jfsoft.mapper")
public class RisApplication  {
//    @Bean
//    public HttpMessageConverters fastJsonHttpMessageConverters()
//    {
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastJsonConfig =new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        HttpMessageConverter<?> converter = fastConverter;
//        return new HttpMessageConverters(converter);
//
//    }


    public static void main(String[] args) {
   //     SpringApplication application=new SpringApplication(RisApplication.class);
        SpringApplication.run(RisApplication.class, args);
        //Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println( e ) );
        //List list = new ArrayList();
        //list.add("1");
        //list.add("2");
        //list.add("3");
        //list.add("4");
        //list.add("5");
        //list.add("6");
        //List<Integer> list1 = new ArrayList<Integer>();
        //list1.add(1);
        //list1.add(3);
        //list.forEach( e -> {
        //    if(Integer.parseInt(String.valueOf(e))>3) {
        //        System.out.println(e);
        //    }
        //    });
        //list1.forEach(e -> {
        //    if(e>1){
        //        System.out.println(e);
        //    }
        //});
//        list.forEach(System.out::println);
//        System.out.print("hello1");
//        System.out.print("hello2");
//        System.out.println("hello3");
    }
    @RestController
    public static class HelloWorld{
        @RequestMapping("/hello")
        public String helloWorld(){
            System.out.println("Hello World!");
            return "Hello World!";
        }
    }
}
