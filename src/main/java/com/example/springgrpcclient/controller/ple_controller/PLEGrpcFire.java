package com.example.springgrpcclient.controller.ple_controller;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tensorflow.framework.DataType;
import org.tensorflow.framework.TensorProto;
import org.tensorflow.framework.TensorShapeProto;
import tensorflow.serving.Model;
import tensorflow.serving.Predict;
import tensorflow.serving.PredictionServiceGrpc;

import java.util.*;

@RestController
@RequestMapping("/ple/grpc")
public class PLEGrpcFire {
    String host = "localhost";
    int port = 8500;

    String modelName = "ple";
    //long modelVersion = 123;

    private ManagedChannel channel;

    private PredictionServiceGrpc.PredictionServiceBlockingStub stub;

    private Model.ModelSpec.Builder modelSpecBuilder;

    private Map<String, TensorProto> featureMap;

    public PLEGrpcFire() {
        System.out.println("step i1: init the channel begin...");
        channel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext()
                .build();
        System.out.println("step i1: init the channel successfully");

        System.out.println("step i2: init the stub begin...");
        stub = PredictionServiceGrpc.newBlockingStub(channel);
        System.out.println("step i2: init the stub successfully");

        System.out.println("step i3: init the model begin...");
        // create ModelSpec
        modelSpecBuilder = Model.ModelSpec.newBuilder();
        modelSpecBuilder.setName(modelName);
        //modelSpecBuilder.setVersion(Int64Value.of(modelVersion));
        modelSpecBuilder.setSignatureName("serving_default");
        System.out.println("step i3: init the model successfully");

        init_feature_map(100);
    }

    private void init_feature_map(int n) {
        featureMap = new HashMap<>();

        featureMap.put("feedback_num_7d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("uv_rate_15d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("ctr_7d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("uv_rate_7d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("view_num_sqrt", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("user_genres_7d", createIntTensorProto(Arrays.asList(1, 1, 1), n));
        featureMap.put("user_directors_7d", createIntTensorProto(Arrays.asList(1, 1, 1), n));
        featureMap.put("item_languages", createIntTensorProto(Arrays.asList(1, 1), n));
        featureMap.put("user_publishers_7d", createIntTensorProto(Arrays.asList(1, 1, 1), n));
        featureMap.put("view_num_square", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("uv_rate_30d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("view_num_norm", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("download_num_30d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("view_num_15d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("streaming_num_15d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("feedback_rate_1d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("download_rate_1d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("item_publisher", createIntTensorProto(Arrays.asList(1), n));
        featureMap.put("ctr_30d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("item_directors", createIntTensorProto(Arrays.asList(1, 1, 1), n));
        featureMap.put("user_actors_7d", createIntTensorProto(Arrays.asList(1, 1, 1), n));
        featureMap.put("phone_brand", createIntTensorProto(Arrays.asList(1), n));
        featureMap.put("feedback_num_1d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("ctr_15d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("user_languages_7d", createIntTensorProto(Arrays.asList(1, 1), n));
        featureMap.put("item_id", createIntTensorProto(Arrays.asList(1), n));
        featureMap.put("view_num_7d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("item_actors", createIntTensorProto(Arrays.asList(1, 1, 1), n));
        featureMap.put("feedback_rate_7d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("release_at_log", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("category", createIntTensorProto(Arrays.asList(1), n));
        featureMap.put("release_at_sqrt", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("release_at_norm", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("avg_playtime_7d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("feedback_num_15d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("view_num_log", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("ip_city", createIntTensorProto(Arrays.asList(1), n));
        featureMap.put("streaming_num_7d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("download_num_7d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("item_genres", createIntTensorProto(Arrays.asList(1, 1, 1), n));
        featureMap.put("download_num_1d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("user_source", createIntTensorProto(Arrays.asList(1), n));
        featureMap.put("release_at_square", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("view_num_30d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("streaming_num_1d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("avg_playtime_15d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("avg_playtime_30d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("feedback_rate_30d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("phone_model", createIntTensorProto(Arrays.asList(1), n));
        featureMap.put("ip_state", createIntTensorProto(Arrays.asList(1), n));
        featureMap.put("entrance", createIntTensorProto(Arrays.asList(1), n));
        featureMap.put("streaming_num_30d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("download_rate_30d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("download_rate_7d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("ctr_1d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("download_num_15d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("view_num_1d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("feedback_rate_15d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("feedback_num_30d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("avg_playtime_1d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("user_id", createIntTensorProto(Arrays.asList(1), n));
        featureMap.put("download_rate_15d", createFloatTensorProto(Arrays.asList(0.0f), n));
        featureMap.put("uv_rate_1d", createFloatTensorProto(Arrays.asList(0.0f), n));


        System.out.println("step i4: init the feature map successfully");
        System.out.println(featureMap.toString());
    }

    private TensorProto createIntTensorProto(List<Integer> collections, int n) {
        TensorProto.Builder builder = TensorProto.newBuilder()
                .setDtype(DataType.DT_INT32)
                .setTensorShape(
                        TensorShapeProto.newBuilder()
                                .addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(1))
                                .addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(collections.size()))
                                .build()
                );
        for (int i = 0; i < n; i++) {
            builder
                    .addAllIntVal(collections);
        }
        return builder.build();
    }

    private TensorProto createFloatTensorProto(List<Float> collections, int n) {
        TensorProto.Builder builder = TensorProto.newBuilder()
                .setDtype(DataType.DT_FLOAT)
                .setTensorShape(
                        TensorShapeProto.newBuilder()
                                .addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(1))
                                .addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(collections.size()))
                                .build()
                );
        for (int i = 0; i < n; i++) {
            builder
                    .addAllFloatVal(collections);
        }
        return builder.build();
    }

    @RequestMapping("fire")
    public String fire() {

        int times = 1000;

        StopWatch stopWatch = new StopWatch();
        stopWatch.start(String.format("%s times requests", times));

        System.out.println("step 1: build the request begin...");
        // build request
        Predict.PredictRequest request = Predict
                .PredictRequest
                .newBuilder()
                .setModelSpec(modelSpecBuilder)
                .putAllInputs(featureMap)
                .build();


        System.out.println("Printing request \n" + request.toString());
        System.out.println("step 1: build the request successfully");

        System.out.println("step 2: init the predict begin...");
        // run predict
        Predict.PredictResponse response = Predict.PredictResponse.newBuilder().build();
        for (int i = 0; i < times; i++) {
             response = stub.predict(request);
        }

        System.out.println(response.toString());
        System.out.println("step 2: fire the predict successfully");

        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
        return "all done!";

    }

}
