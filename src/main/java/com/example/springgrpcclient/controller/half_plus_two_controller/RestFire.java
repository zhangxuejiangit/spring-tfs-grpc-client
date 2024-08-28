package com.example.springgrpcclient.controller.half_plus_two_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/half_plus_two/rest")
public class RestFire {
    String base = "http://localhost:8501/";
    String url = "v1/models/zxj_half_plus_two:predict";

    String body = "{\"instances\": [1.0, 2.0, 5.0]}";

    @RequestMapping("fire")
    public String fire() {

        // 创建 WebClient 实例
        WebClient webClient = WebClient.create();
        // 发送 GET 请求，并获取响应
        String responseBody = webClient
                .post()
                .uri(base + url)
                .body(BodyInserters.fromValue(body))
                .retrieve()
                .bodyToMono(String.class)
                .block();
        // 处理响应
        System.out.println("\n\n\nResponse: " + responseBody + "\n\n\n");

        return responseBody;
    }

}
