package com.example.springmultipledatasource;

import com.example.springmultipledatasource.entity.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.function.Supplier;

/**
* @SpringBootApplication includes:
 * @Configuration
 * @EnableAutoConfiguration
 * @EnableWebMvc
 * @ComponentScan
* */
@SpringBootApplication
public class Application {

    /*private static final Logger log = LoggerFactory.getLogger(Application.class);*/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*public static void main(String args[]) {
        *//**
         * Defining the proxy in RestTemplate
         * *//*
        SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("192.168.100.12", 8080));
        clientHttpReq.setProxy(proxy);

        RestTemplate restTemplate = new RestTemplate(clientHttpReq);
        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }*/

    /*@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("192.168.100.12", 8080));
        clientHttpReq.setProxy(proxy);

        RestTemplate restTemplate = builder.build();
        restTemplate.setRequestFactory(clientHttpReq);
        return restTemplate;
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject(
                    "https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
            log.info(quote.toString());
        };
    }*/

}
