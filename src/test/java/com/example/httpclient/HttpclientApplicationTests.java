package com.example.httpclient;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class HttpclientApplicationTests {
    @Autowired
    RestTemplate restTemplate;
    public static final String WEATHER_URI="http://wthrcdn.etouch.cn/weather_mini?city=南京";
    @Test
    void contextLoads() {
        ResponseEntity<String> respString = restTemplate.getForEntity(WEATHER_URI, String.class);
        String strBody = null;
        if(respString.getStatusCodeValue()==200){    //判断返回的状态码
            strBody=respString.getBody();
        }


    }

}
