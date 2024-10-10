package com.example.springgrpcclient.controller.ple_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/ple/rest")
public class PLERestFire {
    String base = "http://localhost:8501/";
    String url = "v1/models/ple:predict";

    String body = "{\"inputs\": {\"feedback_num_7d\": [[0.0]], \"uv_rate_15d\": [[0.0]], \"ctr_7d\": [[0.0]], \"uv_rate_7d\": [[0.0]], \"view_num_sqrt\": [[0.0]], \"user_genres_7d\": [[1, 1, 1]], \"user_directors_7d\": [[1, 1, 1]], \"item_languages\": [[1, 1]], \"user_publishers_7d\": [[1, 1, 1]], \"view_num_square\": [[0.0]], \"uv_rate_30d\": [[0.0]], \"view_num_norm\": [[0.0]], \"download_num_30d\": [[0.0]], \"view_num_15d\": [[0.0]], \"streaming_num_15d\": [[0.0]], \"feedback_rate_1d\": [[0.0]], \"download_rate_1d\": [[0.0]], \"item_publisher\": [[1]], \"ctr_30d\": [[0.0]], \"item_directors\": [[1, 1, 1]], \"user_actors_7d\": [[1, 1, 1]], \"phone_brand\": [[1]], \"feedback_num_1d\": [[0.0]], \"ctr_15d\": [[0.0]], \"user_languages_7d\": [[1, 1]], \"item_id\": [[1]], \"view_num_7d\": [[0.0]], \"item_actors\": [[1, 1, 1]], \"feedback_rate_7d\": [[0.0]], \"release_at_log\": [[0.0]], \"category\": [[1]], \"release_at_sqrt\": [[0.0]], \"release_at_norm\": [[0.0]], \"avg_playtime_7d\": [[0.0]], \"feedback_num_15d\": [[0.0]], \"view_num_log\": [[0.0]], \"ip_city\": [[1]], \"streaming_num_7d\": [[0.0]], \"download_num_7d\": [[0.0]], \"item_genres\": [[1, 1, 1]], \"download_num_1d\": [[0.0]], \"user_source\": [[1]], \"release_at_square\": [[0.0]], \"view_num_30d\": [[0.0]], \"streaming_num_1d\": [[0.0]], \"avg_playtime_15d\": [[0.0]], \"avg_playtime_30d\": [[0.0]], \"feedback_rate_30d\": [[0.0]], \"phone_model\": [[1]], \"ip_state\": [[1]], \"entrance\": [[1]], \"streaming_num_30d\": [[0.0]], \"download_rate_30d\": [[0.0]], \"download_rate_7d\": [[0.0]], \"ctr_1d\": [[0.0]], \"download_num_15d\": [[0.0]], \"view_num_1d\": [[0.0]], \"feedback_rate_15d\": [[0.0]], \"feedback_num_30d\": [[0.0]], \"avg_playtime_1d\": [[0.0]], \"user_id\": [[1]], \"download_rate_15d\": [[0.0]], \"uv_rate_1d\": [[0.0]]}}";

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
