package com.example.springgrpcclient.controller.ple_controller;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tensorflow.framework.DataType;
import org.tensorflow.framework.TensorProto;
import org.tensorflow.framework.TensorShapeProto;
import tensorflow.serving.Model;
import tensorflow.serving.Predict;
import tensorflow.serving.PredictionServiceGrpc;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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

        init_feature_map();
    }

    private void init_feature_map() {
        featureMap = new HashMap<>();

        featureMap.put("feedback_num_7d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("uv_rate_15d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("ctr_7d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("uv_rate_7d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("view_num_sqrt", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("user_genres_7d", createIntTensorProto(Arrays.asList(1, 1, 1)));
        featureMap.put("user_directors_7d", createIntTensorProto(Arrays.asList(1, 1, 1)));
        featureMap.put("item_languages", createIntTensorProto(Arrays.asList(1, 1)));
        featureMap.put("user_publishers_7d", createIntTensorProto(Arrays.asList(1, 1, 1)));
        featureMap.put("view_num_square", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("uv_rate_30d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("view_num_norm", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("download_num_30d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("view_num_15d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("streaming_num_15d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("feedback_rate_1d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("download_rate_1d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("item_publisher", createIntTensorProto(Arrays.asList(1)));
        featureMap.put("ctr_30d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("item_directors", createIntTensorProto(Arrays.asList(1, 1, 1)));
        featureMap.put("user_actors_7d", createIntTensorProto(Arrays.asList(1, 1, 1)));
        featureMap.put("phone_brand", createIntTensorProto(Arrays.asList(1)));
        featureMap.put("feedback_num_1d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("ctr_15d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("user_languages_7d", createIntTensorProto(Arrays.asList(1, 1)));
        featureMap.put("item_id", createIntTensorProto(Arrays.asList(1)));
        featureMap.put("view_num_7d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("item_actors", createIntTensorProto(Arrays.asList(1, 1, 1)));
        featureMap.put("feedback_rate_7d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("release_at_log", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("category", createIntTensorProto(Arrays.asList(1)));
        featureMap.put("release_at_sqrt", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("release_at_norm", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("avg_playtime_7d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("feedback_num_15d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("view_num_log", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("ip_city", createIntTensorProto(Arrays.asList(1)));
        featureMap.put("streaming_num_7d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("download_num_7d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("item_genres", createIntTensorProto(Arrays.asList(1, 1, 1)));
        featureMap.put("download_num_1d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("user_source", createIntTensorProto(Arrays.asList(1)));
        featureMap.put("release_at_square", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("view_num_30d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("streaming_num_1d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("avg_playtime_15d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("avg_playtime_30d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("feedback_rate_30d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("phone_model", createIntTensorProto(Arrays.asList(1)));
        featureMap.put("ip_state", createIntTensorProto(Arrays.asList(1)));
        featureMap.put("entrance", createIntTensorProto(Arrays.asList(1)));
        featureMap.put("streaming_num_30d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("download_rate_30d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("download_rate_7d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("ctr_1d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("download_num_15d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("view_num_1d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("feedback_rate_15d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("feedback_num_30d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("avg_playtime_1d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("user_id", createIntTensorProto(Arrays.asList(1)));
        featureMap.put("download_rate_15d", createFloatTensorProto(Arrays.asList(0.0f)));
        featureMap.put("uv_rate_1d", createFloatTensorProto(Arrays.asList(0.0f)));


        System.out.println("step i4: init the feature map successfully");
        System.out.println(featureMap.toString());
    }

    private TensorProto createIntTensorProto(List<Integer> collections) {
        return TensorProto.newBuilder()
                .setDtype(DataType.DT_INT32)
                .addAllIntVal(collections)
                .setTensorShape(
                        TensorShapeProto.newBuilder()
                                .addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(1))
                                .addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(collections.size()))
                                .build()
                )
                .build();
    }

    private TensorProto createFloatTensorProto(List<Float> collections) {
        return TensorProto.newBuilder()
                .setDtype(DataType.DT_FLOAT)
                .addAllFloatVal(collections)
                .setTensorShape(
                        TensorShapeProto.newBuilder()
                                .addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(1))
                                .addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(collections.size()))
                                .build()
                )
                .build();
    }

    @RequestMapping("fire")
    public String fire() {
        System.out.println("step 1: init the tensor proto begin...");
        // create TensorProto with 3 floats
        TensorProto.Builder tensorProtoBuilder = TensorProto.newBuilder();
        tensorProtoBuilder.setDtype(DataType.DT_INT32);
        tensorProtoBuilder.addAllIntVal(Stream.of(1, 1, 1).collect(Collectors.toList()));
        System.out.println("step 1: init the tensor proto successfully");

        System.out.println("step 2: init the tensor shape proto begin...");
        // create TensorShapeProto
        TensorShapeProto.Builder tensorShapeBuilder = TensorShapeProto.newBuilder();
        tensorShapeBuilder.addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(1));
        tensorShapeBuilder.addDim(org.tensorflow.framework.TensorShapeProto.Dim.newBuilder().setSize(3));
        System.out.println("step 2: init the tensor shape proto successfully");


        System.out.println("step 3: set the shape for proto begin...");
        // set shape for proto
        tensorProtoBuilder.setTensorShape(tensorShapeBuilder.build());
        System.out.println("step 3: set the shape for proto successfully");

        System.out.println("step 4: build the request begin...");
        // build request
        Predict.PredictRequest request = Predict
                .PredictRequest
                .newBuilder()
                .setModelSpec(modelSpecBuilder)
                .putInputs("avg_playtime_15d", tensorProtoBuilder.build())
                .build();

        System.out.println("Printing request \n" + request.toString());
        System.out.println("step 4: build the request successfully");

        System.out.println("step 5: init the predict begin...");
        // run predict
        Predict.PredictResponse response = stub.predict(request);
        System.out.println(response.toString());
        System.out.println("step 5: fire the predict successfully");

        return "all done!";
    }

}
